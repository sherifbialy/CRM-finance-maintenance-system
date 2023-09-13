


//add driver class

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.Writer;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class ContractFrame
        extends JFrame implements ActionListener {

    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel CustomerID;//EngName
    private JTextField CIDtxt;//ENtext
    private JLabel UnitID;//ARName
    private JTextField UIDtxt;

    private JLabel CustomerName;//ARName
    private JTextField CNametxt;
    private JLabel Amount;
    private JTextField Amounttxt;
    //        private JLabel Email;
    private JTextField lookupCin;
    private JTextField lookupUin;

    private JLabel StartDate;
    private JComboBox Sdate;
    private JComboBox Smonth;
    private JComboBox Syear;

    private JLabel unitNo;
    private JTextField unitNotxt;
    private JLabel project;
    private JTextField projecttxt;
    private JLabel zone;
    private JTextField zonetxt;
    private JLabel BUA;
    private JTextField BUAtxt;
    private JLabel Garden;
    private JTextField Gardentxt;
    private JLabel EndDate;
    private JComboBox Edate;
    private JComboBox Emonth;
    private JComboBox Eyear;

    private JComboBox CSelect;
    private JComboBox USelect;
    private JLabel lookupC;
    private JTextArea lookupCout;
    private JLabel lookupU;
    private JTextArea lookupUout;

    //private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JButton lookC;

    private JButton lookU;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;

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
            = { "2021", "2022", "2023", "2024",
            "2025", "2026", "2027", "2028",
            "2029", "2030", "2031", "2032",
            "2033", "2034", "2035", "2036",
            "2037", "2038", "2039", "2040" };
    public ContractFrame() {
        setTitle("Contract Registration Form");
        setBounds(300, 90, 1350, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Contract Registration Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(500, 30);
        title.setLocation(300, 30);
        c.add(title);

//        CustomerID = new JLabel("CustomerID");
//        CustomerID.setFont(new Font("Arial", Font.PLAIN, 20));
//        CustomerID.setSize(200, 20);
//        CustomerID.setLocation(100, 100);
//        c.add(CustomerID);

        CIDtxt = new JTextField();
        CIDtxt.setFont(new Font("Arial", Font.PLAIN, 15));
        CIDtxt.setSize(190, 20);
        CIDtxt.setLocation(300, 100);
        CIDtxt.setEditable(false);
        CIDtxt.setVisible(false);
        c.add(CIDtxt);

        CustomerName = new JLabel("Customer Name");
        CustomerName.setFont(new Font("Arial", Font.PLAIN, 20));
        CustomerName.setSize(200, 20);
        CustomerName.setLocation(100, 150);
        c.add(CustomerName);

        CNametxt = new JTextField();
        CNametxt.setFont(new Font("Arial", Font.PLAIN, 15));
        CNametxt.setSize(190, 20);
        CNametxt.setLocation(325, 150);
        CNametxt.setEditable(false);
        c.add(CNametxt);



//        UnitID = new JLabel("UnitID");
//        UnitID.setFont(new Font("Arial", Font.PLAIN, 20));
//        UnitID.setSize(200, 20);
//        UnitID.setLocation(100, 200);
//        c.add(UnitID);

        UIDtxt = new JTextField();
        UIDtxt.setFont(new Font("Arial", Font.PLAIN, 15));
        UIDtxt.setSize(150, 20);
        UIDtxt.setLocation(300, 200);
        UIDtxt.setEditable(false);
        UIDtxt.setVisible(false);
        c.add(UIDtxt);

        Amount = new JLabel("Contract Amount");
        Amount.setFont(new Font("Arial", Font.PLAIN, 20));
        Amount.setSize(200, 20);
        Amount.setLocation(100, 400);
        c.add(Amount);

        Amounttxt = new JTextField();
        Amounttxt.setFont(new Font("Arial", Font.PLAIN, 15));
        Amounttxt.setSize(150, 20);
        Amounttxt.setLocation(300, 400);
        c.add(Amounttxt);




//            male = new JRadioButton("Male");
//            male.setFont(new Font("Arial", Font.PLAIN, 15));
//            male.setSelected(true);
//            male.setSize(75, 20);
//            male.setLocation(200, 200);
//            c.add(male);
//
//            female = new JRadioButton("Female");
//            female.setFont(new Font("Arial", Font.PLAIN, 15));
//            female.setSelected(false);
//            female.setSize(80, 20);
//            female.setLocation(275, 200);
//            c.add(female);

//            gengp = new ButtonGroup();
//            gengp.add(male);
//            gengp.add(female);

        StartDate = new JLabel("Contract Start Date");
        StartDate.setFont(new Font("Arial", Font.PLAIN, 20));
        StartDate.setSize(200, 20);
        StartDate.setLocation(100, 300);
        c.add(StartDate);

        Sdate = new JComboBox(Sdates);
        Sdate.setFont(new Font("Arial", Font.PLAIN, 15));
        Sdate.setSize(50, 20);
        Sdate.setLocation(300, 300);
        c.add(Sdate);

        Smonth = new JComboBox(Smonths);
        Smonth.setFont(new Font("Arial", Font.PLAIN, 15));
        Smonth.setSize(60, 20);
        Smonth.setLocation(350, 300);
        c.add(Smonth);

        Syear = new JComboBox(Syears);
        Syear.setFont(new Font("Arial", Font.PLAIN, 15));
        Syear.setSize(60, 20);
        Syear.setLocation(420, 300);
        c.add(Syear);

        EndDate = new JLabel("Contract End Date");
        EndDate.setFont(new Font("Arial", Font.PLAIN, 20));
        EndDate.setSize(200, 20);
        EndDate.setLocation(100, 350);
        c.add(EndDate);

        Edate = new JComboBox(Sdates);
        Edate.setFont(new Font("Arial", Font.PLAIN, 15));
        Edate.setSize(50, 20);
        Edate.setLocation(300, 350);
        c.add(Edate);

        Emonth = new JComboBox(Smonths);
        Emonth.setFont(new Font("Arial", Font.PLAIN, 15));
        Emonth.setSize(60, 20);
        Emonth.setLocation(350, 350);
        c.add(Emonth);

        Eyear = new JComboBox(Syears);
        Eyear.setFont(new Font("Arial", Font.PLAIN, 15));
        Eyear.setSize(60, 20);
        Eyear.setLocation(420, 350);
        c.add(Eyear);

        lookupC = new JLabel("Find Client with name");
        lookupC.setFont(new Font("Arial", Font.PLAIN, 20));
        lookupC.setSize(200, 20);
        lookupC.setLocation(100, 100);
        c.add(lookupC);

        CSelect = new JComboBox();
        CSelect.setFont(new Font("Arial", Font.PLAIN, 15));
        CSelect.setSize(200, 20);
        CSelect.setLocation(550, 100);

        CSelect.addActionListener(this);
        //CSelect.setLineWrap(true);
        c.add(CSelect);

        lookupCin = new JTextField();
        lookupCin.setFont(new Font("Arial", Font.PLAIN, 15));
        lookupCin.setSize(200, 20);
        lookupCin.setLocation(325, 100);
        //lookupCin.setLineWrap(true);
        c.add(lookupCin);

        lookupU = new JLabel("Find Unit with UnitNo.");
        lookupU.setFont(new Font("Arial", Font.PLAIN, 20));
        lookupU.setSize(200, 20);
        lookupU.setLocation(100, 200);
        c.add(lookupU);

        lookupUin = new JTextField();
        lookupUin.setFont(new Font("Arial", Font.PLAIN, 15));
        lookupUin.setSize(200, 20);
        lookupUin.setLocation(325, 200);
        //lookupCin.setLineWrap(true);
        c.add(lookupUin);

        USelect = new JComboBox();
        USelect.setFont(new Font("Arial", Font.PLAIN, 15));
        USelect.setSize(200, 20);
        USelect.setLocation(550, 200);
        USelect.addActionListener(this);
        //lookupUout.setLineWrap(true);
        c.add(USelect);

        unitNo= new JLabel("UnitNo");
        unitNo.setFont(new Font("Arial", Font.PLAIN, 20));
        unitNo.setSize(75, 20);
        unitNo.setLocation(100, 250);

        c.add(unitNo);
        unitNotxt = new JTextField();
        unitNotxt.setFont(new Font("Arial", Font.PLAIN, 15));
        unitNotxt.setSize(100, 20);
        unitNotxt.setEditable(false);
        unitNotxt.setLocation(200, 250);
        //lookupCin.setLineWrap(true);
        c.add(unitNotxt);
        project= new JLabel("Project");
        project.setFont(new Font("Arial", Font.PLAIN, 20));
        project.setSize(75, 20);
        project.setLocation(325, 250);
        c.add(project);
        projecttxt = new JTextField();
        projecttxt.setFont(new Font("Arial", Font.PLAIN, 15));
        projecttxt.setSize(100, 20);
        projecttxt.setEditable(false);
        projecttxt.setLocation(400, 250);
        c.add(projecttxt);
        zone= new JLabel("Zone");
        zone.setFont(new Font("Arial", Font.PLAIN, 20));
        zone.setSize(75, 20);
        zone.setLocation(525, 250);
        c.add(zone);
        zonetxt = new JTextField();
        zonetxt.setFont(new Font("Arial", Font.PLAIN, 15));
        zonetxt.setSize(100, 20);
        zonetxt.setEditable(false);
        zonetxt.setLocation(600, 250);
        c.add(zonetxt);
        BUA= new JLabel("BUA");
        BUA.setFont(new Font("Arial", Font.PLAIN, 20));
        BUA.setSize(75, 20);
        BUA.setLocation(725, 250);
        c.add(BUA);
        BUAtxt = new JTextField();
        BUAtxt.setFont(new Font("Arial", Font.PLAIN, 15));
        BUAtxt.setSize(100, 20);
        BUAtxt.setLocation(800, 250);
        BUAtxt.setEditable(false);
        c.add(BUAtxt);
        Garden= new JLabel("Garden Area");
        Garden.setFont(new Font("Arial", Font.PLAIN, 20));
        Garden.setSize(125, 20);
        Garden.setLocation(925, 250);
        c.add(Garden);
        Gardentxt = new JTextField();
        Gardentxt.setFont(new Font("Arial", Font.PLAIN, 15));
        Gardentxt.setSize(100, 20);
        Gardentxt.setEditable(false);
        Gardentxt.setLocation(1050, 250);
        c.add(Gardentxt);


//        term = new JCheckBox("Accept Terms And Conditions.");
//        term.setFont(new Font("Arial", Font.PLAIN, 15));
//        term.setSize(250, 20);
//        term.setLocation(150, 400);
//        c.add(term);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        c.add(sub);

        lookC = new JButton("Find");
        lookC.setFont(new Font("Arial", Font.PLAIN, 15));
        lookC.setSize(100, 20);
        lookC.setLocation(775, 100);
        lookC.addActionListener(this);
        c.add(lookC);

        lookU = new JButton("Find");
        lookU.setFont(new Font("Arial", Font.PLAIN, 15));
        lookU.setSize(100, 20);
        lookU.setLocation(775, 200);
        lookU.addActionListener(this);
        c.add(lookU);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        c.add(reset);

//        tout = new JTextArea();
//        tout.setFont(new Font("Arial", Font.PLAIN, 15));
//        tout.setSize(300, 400);
//        tout.setLocation(500, 100);
//        tout.setLineWrap(true);
//        tout.setEditable(false);
//        c.add(tout);
//
//        res = new JLabel("");
//        res.setFont(new Font("Arial", Font.PLAIN, 20));
//        res.setSize(500, 25);
//        res.setLocation(100, 500);
//        c.add(res);
//
//        resadd = new JTextArea();
//        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
//        resadd.setSize(200, 75);
//        resadd.setLocation(580, 175);
//        resadd.setLineWrap(true);
//        c.add(resadd);

        setVisible(true);}




        // method actionPerformed()
        // to get the action performed
        // by the user and act accordingly
 public Contract contract=new Contract();


 public void actionPerformed(ActionEvent e)
  {


        if (e.getSource() == sub) {

            registerContract();
//            if (term.isSelected()) {
//                String data1;
//                String data
//                        = "Name : "
//                        + CIDtxt.getText() + "\n"
//                        + "Mobile : "
//                        + UIDtxt.getText() + "\n";
//                if (male.isSelected())
//                    data1 = "Gender : Male"
//                            + "\n";
//                else
//                    data1 = "Gender : Female"
//                            + "\n";
//                String data2
//                        = "DOB : "
//                        + (String)Sdate.getSelectedItem()
//                        + "/" + (String)Smonth.getSelectedItem()
//                        + "/" + (String)Syear.getSelectedItem()
//                        + "\n";
//
//                String data3 = "Address : " + tadd.getText();
//                tout.setText(data + data1 + data2 + data3);
//                tout.setEditable(false);
//                res.setText("Registration Successfully..");
//            }
//            else {
//                tout.setText("");
//                resadd.setText("");
//                res.setText("Please accept the"
//                        + " terms & conditions..");
//            }
        }

        else if (e.getSource() == reset) {
            String def = "";
            CIDtxt.setText(def);
            CNametxt.setText(def);
            Amounttxt.setText(def);
            UIDtxt.setText(def);
            //lookupUout.setText(def);
            lookupUin.setText(def);
            //term.setSelected(false);
            Sdate.setSelectedIndex(0);
            Smonth.setSelectedIndex(0);
            Syear.setSelectedIndex(0);
            Edate.setSelectedIndex(0);
            Emonth.setSelectedIndex(0);
            Eyear.setSelectedIndex(0);
            CSelect.removeAllItems();
            USelect.removeAllItems();
            lookupCin.setText(def);
            //lookupCout.setText(def);
        }
        else if(e.getSource()==lookC){
            lookUpCustomer(lookupCin.getText());

        }
        else if (e.getSource()==lookU){
         lookUpUnit(lookupUin.getText());
        }
        else if (e.getSource()==CSelect){
            //lookUpUnit(lookupUin.getText());
            String Selected=String.valueOf(CSelect.getSelectedItem());
            CNametxt.setText(Selected);
            CIDtxt.setText(lookUpCustomerID(Selected));
            //add method to look up CID from N


                //CNametxt.setText(String.valueOf(rs.getString("ENName")));

        }
        else if (e.getSource()==USelect){
            String Selected=String.valueOf(USelect.getSelectedItem());
            UIDtxt.setText(lookUpUnitID(Selected));
            projecttxt.setText(lookUpUnitProject(Selected));
            unitNotxt.setText(Selected);
            zonetxt.setText(lookUpUnitZone(Selected));
            BUAtxt.setText(lookUpUnitBUA(Selected));
            Gardentxt.setText(lookUpUnitGA(Selected));
            //CIDtxt.setText(lookUpCustomerID(Selected));
            //lookUpUnit(lookupUin.getText());
        }
    }
    public void registerContract(){
        int UID = Integer.parseInt(UIDtxt.getText());
        int CID = Integer.parseInt(CIDtxt.getText());
        int Amount = Integer.parseInt(Amounttxt.getText());
//        String ZName = Zonenametxt.getText();
//        int BUA=Integer.parseInt(BUAtxt.getText());
//        int GA=Integer.parseInt(GAtxt.getText());

        LocalDate StartDate = LocalDate.of(Integer.parseInt((String)Syear.getSelectedItem()),Integer.parseInt((String)Smonth.getSelectedItem()),Integer.parseInt((String)Sdate.getSelectedItem()));
        LocalDate EndDate = LocalDate.of(Integer.parseInt((String)Eyear.getSelectedItem()),Integer.parseInt((String)Emonth.getSelectedItem()),Integer.parseInt((String)Edate.getSelectedItem()));
        //String password = String.valueOf(pfPassword.getPassword());
        //String confirmPassword = String.valueOf(pfConfirmPassword.getPassword());

        if (UIDtxt.getText().isEmpty() || CIDtxt.getText().isEmpty() || Amounttxt.getText().isEmpty() ||  EndDate.toString().isEmpty() || StartDate.toString().isEmpty() ) {
            JOptionPane.showMessageDialog(this,
                    "Please enter all fields",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (EndDate.isBefore(StartDate)||EndDate.isEqual(StartDate)) {
            JOptionPane.showMessageDialog(this,
                    "Please enter possible Date",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        contract = addContractToDatabase(UID, CID, Amount, StartDate,EndDate);
        if (contract != null) {
            dispose();
            //res.setText("Registration Successfully..");
        }
        else {
            JOptionPane.showMessageDialog(this,
                    "Failed to register new user",
                    "Try again",
                    JOptionPane.ERROR_MESSAGE);

        }
    }
    private Contract addContractToDatabase(int UID, int CID,int amount,LocalDate StartDate,  LocalDate EndDate) {
        final String DB_URL = "jdbc:mysql://localhost/MyStore?serverTimezone=UTC";
        final String USERNAME = "root";
        final String PASSWORD = "Mysql1234";
        Date SD = Date.valueOf(StartDate);
        Date ED = Date.valueOf(EndDate);



        //Unit unit = null;
        try {

            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm/fm", "root", "Mysql1234");
            // Connected to database successfully...

            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO contract (unitID, customerID, amount, startDate, endDate)" +
                    " VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, UID);
            preparedStatement.setInt(2, CID);
            preparedStatement.setInt(3, amount);
            preparedStatement.setDate(4, SD);
            preparedStatement.setDate(5, ED);


            //Insert row into the table
            int addedRows = preparedStatement.executeUpdate();
            if (addedRows > 0) {
                contract = new Contract();
                contract.setUnitID(UID);

                contract.setCustomerID(CID);
                contract.setAmount(amount);

                contract.setStartDate(StartDate);
                contract.setEndDate(EndDate);



            }

            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return contract;
    }
    private void lookUpCustomer(String Name){
        try {

            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm/fm", "root", "Mysql1234");
            // Connected to database successfully...

            Statement stmt = conn.createStatement();
            String sql = "SELECT idcustomer1, ENName FROM customer1 WHERE" +" ENName LIKE ?";
                    //" VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            //preparedStatement.setString(1, Name);
            preparedStatement.setString(1, "%" + Name + "%");
//            preparedStatement.setInt(2, CID);
//            preparedStatement.setInt(3, amount);
//            preparedStatement.setDate(4, SD);
//            preparedStatement.setDate(5, ED);


            //Insert row into the table
            ResultSet rs = preparedStatement.executeQuery();
            while ( rs.next() )
            {
                 // retrievedCustomers.add(rs.getString("ENName"));
                  //retrievedCustomers.add(rs.getInt("idcustomer1"));
                  CSelect.addItem(rs.getString("ENName"));
//                CIDtxt.setText(String.valueOf(rs.getInt("idcustomer1")));
//                CNametxt.setText(String.valueOf(rs.getString("ENName")));

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
        }

        //return contract;
    }
    private String lookUpCustomerID(String Name){
     String id=null;
        try {

            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm/fm", "root", "Mysql1234");
            // Connected to database successfully...

            Statement stmt = conn.createStatement();
            String sql = "SELECT idcustomer1 FROM customer1 WHERE" +" ENName=?";
            //" VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            //preparedStatement.setString(1, Name);
            preparedStatement.setString(1, Name);
//            preparedStatement.setInt(2, CID);
//            preparedStatement.setInt(3, amount);
//            preparedStatement.setDate(4, SD);
//            preparedStatement.setDate(5, ED);


            //Insert row into the table
            ResultSet rs = preparedStatement.executeQuery();
            while ( rs.next() )
            {
                //CSelect.addItem(rs.getString("ENName"));
                id=String.valueOf(rs.getInt("idcustomer1"));
                //CIDtxt.setText(
//                CNametxt.setText(String.valueOf(rs.getString("ENName")));

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
        }

        return id;
    }
    private void lookUpUnit(String UnitNumber){
        try {

            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm/fm", "root", "Mysql1234");
            // Connected to database successfully...

            Statement stmt = conn.createStatement();
            String sql = "SELECT unitID, unitNo, projectName, zoneName, BUA, gardenArea  FROM unit WHERE" +" unitNo LIKE ?";
            //" VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            //preparedStatement.setString(1, UnitNumber);
            preparedStatement.setString(1, "%" + UnitNumber + "%");
//            preparedStatement.setInt(2, CID);
//            preparedStatement.setInt(3, amount);
//            preparedStatement.setDate(4, SD);
//            preparedStatement.setDate(5, ED);


            //Insert row into the table
            ResultSet rs = preparedStatement.executeQuery();
            while ( rs.next() )
            {
                //retrievedUnits.add(rs.getString("unitNo"));
               // retrievedUnits.add(rs.getInt("unitID"));
                USelect.addItem(rs.getString("unitNo"));


                //unitNotxt.setText(String.valueOf(rs.getInt("unitID")));

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
        }

        //return contract;
    }
    private String lookUpUnitID(String Name){
        String id=null;
        try {

            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm/fm", "root", "Mysql1234");
            // Connected to database successfully...

            Statement stmt = conn.createStatement();
            String sql = "SELECT unitID FROM unit WHERE" +" unitNo=?";
            //" VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            //preparedStatement.setString(1, Name);
            preparedStatement.setString(1, Name);
//            preparedStatement.setInt(2, CID);
//            preparedStatement.setInt(3, amount);
//            preparedStatement.setDate(4, SD);
//            preparedStatement.setDate(5, ED);


            //Insert row into the table
            ResultSet rs = preparedStatement.executeQuery();
            while ( rs.next() )
            {
                //CSelect.addItem(rs.getString("ENName"));
                id=String.valueOf(rs.getInt("unitID"));
                //CIDtxt.setText(
//                CNametxt.setText(String.valueOf(rs.getString("ENName")));

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
        }

        return id;
    }
    private String lookUpUnitProject(String Name){
        String project=null;
        try {

            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm/fm", "root", "Mysql1234");
            // Connected to database successfully...

            Statement stmt = conn.createStatement();
            String sql = "SELECT projectName FROM unit WHERE" +" unitNo=?";
            //" VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            //preparedStatement.setString(1, Name);
            preparedStatement.setString(1, Name);
//            preparedStatement.setInt(2, CID);
//            preparedStatement.setInt(3, amount);
//            preparedStatement.setDate(4, SD);
//            preparedStatement.setDate(5, ED);


            //Insert row into the table
            ResultSet rs = preparedStatement.executeQuery();
            while ( rs.next() )
            {
                //CSelect.addItem(rs.getString("ENName"));
                project=String.valueOf(rs.getString("projectName"));
                //CIDtxt.setText(
//                CNametxt.setText(String.valueOf(rs.getString("ENName")));

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
        }

        return project;
    }
    private String lookUpUnitZone(String Name){
        String zone=null;
        try {

            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm/fm", "root", "Mysql1234");
            // Connected to database successfully...

            Statement stmt = conn.createStatement();
            String sql = "SELECT zoneName FROM unit WHERE" +" unitNo=?";
            //" VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            //preparedStatement.setString(1, Name);
            preparedStatement.setString(1, Name);
//            preparedStatement.setInt(2, CID);
//            preparedStatement.setInt(3, amount);
//            preparedStatement.setDate(4, SD);
//            preparedStatement.setDate(5, ED);


            //Insert row into the table
            ResultSet rs = preparedStatement.executeQuery();
            while ( rs.next() )
            {
                //CSelect.addItem(rs.getString("ENName"));
                zone=String.valueOf(rs.getString("zoneName"));
                //CIDtxt.setText(
//                CNametxt.setText(String.valueOf(rs.getString("ENName")));

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
        }

        return zone;
    }
    private String lookUpUnitBUA(String Name){
        String id=null;
        try {

            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm/fm", "root", "Mysql1234");
            // Connected to database successfully...

            Statement stmt = conn.createStatement();
            String sql = "SELECT BUA FROM unit WHERE" +" unitNo=?";
            //" VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            //preparedStatement.setString(1, Name);
            preparedStatement.setString(1, Name);
//            preparedStatement.setInt(2, CID);
//            preparedStatement.setInt(3, amount);
//            preparedStatement.setDate(4, SD);
//            preparedStatement.setDate(5, ED);


            //Insert row into the table
            ResultSet rs = preparedStatement.executeQuery();
            while ( rs.next() )
            {
                //CSelect.addItem(rs.getString("ENName"));
                id=String.valueOf(rs.getInt("BUA"));
                //CIDtxt.setText(
//                CNametxt.setText(String.valueOf(rs.getString("ENName")));

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
        }

        return id;
    }
    private String lookUpUnitGA(String Name){
        String id=null;
        try {

            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm/fm", "root", "Mysql1234");
            // Connected to database successfully...

            Statement stmt = conn.createStatement();
            String sql = "SELECT gardenArea FROM unit WHERE" +" unitNo=?";
            //" VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            //preparedStatement.setString(1, Name);
            preparedStatement.setString(1, Name);
//            preparedStatement.setInt(2, CID);
//            preparedStatement.setInt(3, amount);
//            preparedStatement.setDate(4, SD);
//            preparedStatement.setDate(5, ED);


            //Insert row into the table
            ResultSet rs = preparedStatement.executeQuery();
            while ( rs.next() )
            {
                //CSelect.addItem(rs.getString("ENName"));
                id=String.valueOf(rs.getInt("gardenArea"));
                //CIDtxt.setText(
//                CNametxt.setText(String.valueOf(rs.getString("ENName")));

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
        }

        return id;
    }

    }


//Driver Class





