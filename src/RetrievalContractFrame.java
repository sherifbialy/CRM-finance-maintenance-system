import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.time.LocalDate;



public class RetrievalContractFrame extends JFrame implements ActionListener {
    private JLabel Project;
    private Container c;
    private JLabel title;
    private JLabel StartDate;
    private JLabel EndDate;
    private JLabel UnitNo;
    private JTextField ProjectSearch;
    private JTextField unitNoSearch;
    private JComboBox Sdate;
    private JComboBox Smonth;
    private JComboBox Syear;
    private JComboBox Edate;
    private JComboBox Emonth;
    private JComboBox Eyear;
    private JTextArea Resulttxt;
    private JLabel Result;
    private JButton Find;
    private String Sdates[]
            = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private String Smonths[]
            = { "1", "2", "3", "4",
            "5", "6", "7", "8",
            "9", "10", "11", "12" };
    private String Syears[]
            = {"2021", "2022", "2023", "2024",
            "2025", "2026", "2027", "2028",
            "2029", "2030", "2031", "2032",
            "2033", "2034", "2035", "2036",
            "2037", "2038", "2039", "2040" };

    public RetrievalContractFrame() {
        setTitle("Contract Registration Form");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Contract Search");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(500, 30);
        title.setLocation(300, 30);
        c.add(title);

//        CustomerID = new JLabel("CustomerID");
//        CustomerID.setFont(new Font("Arial", Font.PLAIN, 20));
//        CustomerID.setSize(200, 20);
//        CustomerID.setLocation(100, 100);
//        c.add(CustomerID);

        ProjectSearch = new JTextField();
        ProjectSearch.setFont(new Font("Arial", Font.PLAIN, 15));
        ProjectSearch.setSize(190, 20);
        ProjectSearch.setLocation(0, 150);
        //ProjectSearch.setEditable(false);
        //ProjectSearch.setVisible(false);
        c.add(ProjectSearch);

        Project = new JLabel("Project Name");
        Project.setFont(new Font("Arial", Font.PLAIN, 20));
        Project.setSize(200, 20);
        Project.setLocation(0, 100);
        c.add(Project);


        UnitNo = new JLabel("UnitNo");
        UnitNo.setFont(new Font("Arial", Font.PLAIN, 20));
        UnitNo.setSize(200, 20);
        UnitNo.setLocation(600, 100);
        c.add(UnitNo);

        unitNoSearch = new JTextField();
        unitNoSearch.setFont(new Font("Arial", Font.PLAIN, 15));
        unitNoSearch.setSize(150, 20);
        unitNoSearch.setLocation(600, 150);
        //unitNoSearch.setEditable(false);
        ///unitNoSearch.setVisible(false);
        c.add(unitNoSearch);

        Result = new JLabel("Contract Result");
        Result.setFont(new Font("Arial", Font.PLAIN, 20));
        Result.setSize(200, 20);
        Result.setLocation(0, 300);
        c.add(Result);

        Resulttxt = new JTextArea();
        Resulttxt.setFont(new Font("Arial", Font.PLAIN, 15));
        Resulttxt.setSize(600, 200);
        Resulttxt.setLocation(100, 350);
        Resulttxt.setLineWrap(true);
        c.add(Resulttxt);


        StartDate = new JLabel("Contract Start Date");
        StartDate.setFont(new Font("Arial", Font.PLAIN, 20));
        StartDate.setSize(200, 20);
        StartDate.setLocation(0, 200);
        c.add(StartDate);

        Sdate = new JComboBox(Sdates);
        Sdate.setFont(new Font("Arial", Font.PLAIN, 15));
        Sdate.setSize(50, 20);
        Sdate.setLocation(0, 250);
        c.add(Sdate);

        Smonth = new JComboBox(Smonths);
        Smonth.setFont(new Font("Arial", Font.PLAIN, 15));
        Smonth.setSize(60, 20);
        Smonth.setLocation(50, 250);

        c.add(Smonth);

        Syear = new JComboBox(Syears);
        Syear.setFont(new Font("Arial", Font.PLAIN, 15));
        Syear.setSize(60, 20);
        Syear.setLocation(130, 250);
        c.add(Syear);

        EndDate = new JLabel("Contract End Date");
        EndDate.setFont(new Font("Arial", Font.PLAIN, 20));
        EndDate.setSize(200, 20);
        EndDate.setLocation(300, 200);
        c.add(EndDate);

        Edate = new JComboBox(Sdates);
        Edate.setFont(new Font("Arial", Font.PLAIN, 15));
        Edate.setSize(50, 20);
        Edate.setLocation(300, 250);
        c.add(Edate);

        Emonth = new JComboBox(Smonths);
        Emonth.setFont(new Font("Arial", Font.PLAIN, 15));
        Emonth.setSize(60, 20);
        Emonth.setLocation(350, 250);
        c.add(Emonth);

        Eyear = new JComboBox(Syears);
        Eyear.setFont(new Font("Arial", Font.PLAIN, 15));
        Eyear.setSize(60, 20);
        Eyear.setLocation(430, 250);
        c.add(Eyear);
        Find = new JButton("Find");
        Find.setFont(new Font("Arial", Font.PLAIN, 15));
        Find.setSize(100, 20);
        Find.setLocation(750, 500);
        Find.addActionListener(this);
        c.add(Find);

        setVisible(true);
    }

        @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Find){
            seeProjectOnly(ProjectSearch.getText(),unitNoSearch.getText(),LocalDate.of(Integer.parseInt(String.valueOf(Syear.getSelectedItem())),Integer.parseInt(String.valueOf(Smonth.getSelectedItem())),Integer.parseInt(String.valueOf(Sdate.getSelectedItem()))),LocalDate.of(Integer.parseInt(String.valueOf(Eyear.getSelectedItem())),Integer.parseInt(String.valueOf(Emonth.getSelectedItem())),Integer.parseInt(String.valueOf(Edate.getSelectedItem()))));
        }
    }
    private void seeProjectOnly(String ProjectName, String UnitNo, LocalDate StartDate, LocalDate EndDate) {
        //if (unitNoSearch.getText().isEmpty() && ProjectSearch.getText().length() != 0) {
        Date LOD=Date.valueOf(StartDate);
        Date EOD=Date.valueOf(EndDate);

            try {

                //Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm/fm", "root", "Mysql1234");
                // Connected to database successfully...


                Statement stmt = conn.createStatement();
                String sql = "SELECT *\n" +
                        "FROM contract c\n" +
                        "INNER join unit u on u.unitID= c.unitID\n" +
                        "WHERE \n" +
                        "(? = 1 OR u.projectName LIKE ?)\n" +
                        "AND (? = 1 OR u.unitNo LIKE ?)\n" +
                        "AND (? = 1 OR c.startDate = ?)\n" +
                        "AND (? = 1 OR c.endDate >= ?)";
                //" VALUES (?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                //preparedStatement.setString(1, Name);
                //preparedStatement.setString("@id");
                if(ProjectName.isEmpty()){
                    preparedStatement.setInt(1, 0);
                }
                else{
                    preparedStatement.setInt(1, 1);
                }

                preparedStatement.setString(2, "%" + ProjectName + "%");
                if(UnitNo.isEmpty()){
                    preparedStatement.setInt(3, 0);
                }
                else{
                    preparedStatement.setInt(3, 1);
                }
                preparedStatement.setString(4, "%" + UnitNo + "%");
                if(StartDate.toString().isEmpty()){
                    preparedStatement.setInt(5, 0);
                }
                else{
                    preparedStatement.setInt(5, 1);
                }
                preparedStatement.setDate(6, LOD);
                if(EndDate.toString().isEmpty()){
                    preparedStatement.setInt(7, 0);
                }
                else{
                    preparedStatement.setInt(7, 1);
                }
                preparedStatement.setDate(8, EOD);



                //Insert row into the table
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    System.out.println(rs);
                    // retrievedCustomers.add(rs.getString("ENName"));
                    //retrievedCustomers.add(rs.getInt("idcustomer1"));
                    // CSelect.addItem(rs.getString("ENName"));
//                CIDtxt.setText(String.valueOf(rs.getInt("idcustomer1")));
                    String Result=rs.getInt("idcontract")+" "+rs.getString("unitNo")+" "+rs.getDate("startDate")+" "+rs.getString("endDate")+" "+rs.getInt("amount")+" "+rs.getString("projectName");
                    //LocalDate startDate=rs.getDate("projectName");
//                CNametxt.setText(String.valueOf(rs.getString("ENName")));
                    Resulttxt.append(Result +"\n");

                }
                rs.close();
//            if (addedRows > 0) {
//                contract = new Contract();
//                contract.setUnitID(UID);
//
//                contract.setCustomerID(CID);
//                contract.setAmount(amount);
//
//                contract.setStartDate(StartDate);
//                contract.setEndDate(EndDate);
//
//
//
//            }

                stmt.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }}}

            //return contract;


