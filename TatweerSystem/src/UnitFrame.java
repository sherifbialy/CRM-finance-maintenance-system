


//Zonename driver class

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.time.LocalDate;


public class UnitFrame
            extends JFrame
            implements ActionListener {

        // Components of the Form
        private Container c;
        private JLabel title;
        private JLabel UnitNumber;//EngName
        private JTextField UIDtxt1;//ENtext

        private JLabel ProjectName;
        private JTextField ProjectNametxt;
        private JLabel PhaseName;//ARName
        private JTextField PhaseNametxt;
//        private JLabel ProjectName;
//        private JTextField ProjectNametxt;
        //        private JLabel Email;
//        private JTextField Emailtxt;
        private JLabel StartDate;
        private JComboBox Sday;
        private JComboBox Smonth;
        private JComboBox Syear;

//        private JLabel EndDate;
//        private JComboBox ESday;
//        private JComboBox ESmonth;
//        private JComboBox ESyear;
        private JLabel Zonename;
        private JTextField Zonenametxt;
        private JLabel BUA;

        private JTextField BUAtxt;

        private JLabel GA;

        private JTextField GAtxt;
        private JButton sub;
        private JButton reset;
        private JTextArea tout;
        //private JLabel res;
//        private JTextArea resZonename;
        public Unit unit=new Unit();
        private String Sdays[]
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
                = { "2014","2015","2016","2017","2018","2019","2020","2021", "2022", "2023", "2024",
                "2025", "2026", "2027", "2028",
                "2029", "2030", "2031", "2032",
                "2033", "2034", "2035", "2036",
                "2037", "2038", "2039", "2040" };
        public UnitFrame()
        {
            setTitle("Unit Registration Form");
            setBounds(300, 90, 1350, 900);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setResizable(false);

            c = getContentPane();
            c.setLayout(null);

            title = new JLabel("Unit Registration Form");
            title.setFont(new Font("Arial", Font.PLAIN, 30));
            title.setSize(450, 30);
            title.setLocation(300, 30);
            c.add(title);

            UnitNumber = new JLabel("Unit Number");
            UnitNumber.setFont(new Font("Arial", Font.PLAIN, 20));
            UnitNumber.setSize(200, 20);
            UnitNumber.setLocation(100, 100);
            c.add(UnitNumber);

            UIDtxt1 = new JTextField();
            UIDtxt1.setFont(new Font("Arial", Font.PLAIN, 15));
            UIDtxt1.setSize(200, 20);
            UIDtxt1.setLocation(300, 100);
            c.add(UIDtxt1);

            PhaseName = new JLabel("Phase Name");
            PhaseName.setFont(new Font("Arial", Font.PLAIN, 20));
            PhaseName.setSize(200, 20);
            PhaseName.setLocation(100, 150);
            c.add(PhaseName);

            PhaseNametxt = new JTextField();
            PhaseNametxt.setFont(new Font("Arial", Font.PLAIN, 15));
            PhaseNametxt.setSize(200, 20);
            PhaseNametxt.setLocation(300, 150);
            c.add(PhaseNametxt);

            ProjectName = new JLabel("Project Name");
            ProjectName.setFont(new Font("Arial", Font.PLAIN, 20));
            ProjectName.setSize(200, 20);
            ProjectName.setLocation(100, 200);
            c.add(ProjectName);

            ProjectNametxt = new JTextField();
            ProjectNametxt.setFont(new Font("Arial", Font.PLAIN, 15));
            ProjectNametxt.setSize(200, 20);
            ProjectNametxt.setLocation(300, 200);
            c.add(ProjectNametxt);

//            male = new JRadioButton("Male");
//            male.setFont(new Font("Arial", Font.PLAIN, 15));
//            male.setSelected(true);
//            male.setSize(75, 20);
//            male.setLocation(200, 200);
//            c.Zonename(male);
//
//            female = new JRadioButton("Female");
//            female.setFont(new Font("Arial", Font.PLAIN, 15));
//            female.setSelected(false);
//            female.setSize(80, 20);
//            female.setLocation(275, 200);
//            c.Zonename(female);

//            gengp = new ButtonGroup();
//            gengp.Zonename(male);
//            gengp.Zonename(female);

            StartDate = new JLabel("Hand Over Date");
            StartDate.setFont(new Font("Arial", Font.PLAIN, 20));
            StartDate.setSize(200, 20);
            StartDate.setLocation(100, 250);
            c.add(StartDate);

            Sday = new JComboBox(Sdays);
            Sday.setFont(new Font("Arial", Font.PLAIN, 15));
            Sday.setSize(50, 20);
            Sday.setLocation(300, 250);
            c.add(Sday);

            Smonth = new JComboBox(Smonths);
            Smonth.setFont(new Font("Arial", Font.PLAIN, 15));
            Smonth.setSize(60, 20);
            Smonth.setLocation(350, 250);
            c.add(Smonth);

            Syear = new JComboBox(Syears);
            Syear.setFont(new Font("Arial", Font.PLAIN, 15));
            Syear.setSize(60, 20);
            Syear.setLocation(420, 250);
            c.add(Syear);

            Zonename = new JLabel("Zone Name");
            Zonename.setFont(new Font("Arial", Font.PLAIN, 20));
            Zonename.setSize(200, 20);
            Zonename.setLocation(100, 300);
            c.add(Zonename);

            Zonenametxt = new JTextField();
            Zonenametxt.setFont(new Font("Arial", Font.PLAIN, 15));
            Zonenametxt.setSize(200, 20);
            Zonenametxt.setLocation(300, 300);
            //Zonenametxt.setLineWrap(true);
            c.add(Zonenametxt);



            BUA = new JLabel("Built Up Area");
            BUA.setFont(new Font("Arial", Font.PLAIN, 15));
            BUA.setSize(200, 20);
            BUA.setLocation(100, 400);
            c.add(BUA);

            BUAtxt = new JTextField();
            BUAtxt.setFont(new Font("Arial", Font.PLAIN, 15));
            BUAtxt.setSize(200, 20);
            BUAtxt.setLocation(300, 400);
            c.add(BUAtxt);

            GA= new JLabel("Garden Area");
            GA.setFont(new Font("Arial",Font.PLAIN,15));
            GA.setSize(200,20);
            GA.setLocation(100,500);
            c.add(GA);

            GAtxt = new JTextField();
            GAtxt.setFont(new Font("Arial", Font.PLAIN, 15));
            GAtxt.setSize(200, 20);
            GAtxt.setLocation(300, 500);
            c.add(GAtxt);



            sub = new JButton("Submit");
            sub.setFont(new Font("Arial", Font.PLAIN, 15));
            sub.setSize(100, 20);
            sub.setLocation(200, 600);
            sub.addActionListener(this);
            c.add(sub);

            reset = new JButton("Reset");
            reset.setFont(new Font("Arial", Font.PLAIN, 15));
            reset.setSize(100, 20);
            reset.setLocation(320, 600);
            reset.addActionListener(this);
            c.add(reset);

//            tout = new JTextArea();
//            tout.setFont(new Font("Arial", Font.PLAIN, 15));
//            tout.setSize(300, 400);
//            tout.setLocation(500, 100);
//            tout.setLineWrap(true);
//            tout.setEditable(false);
//            c.Zonename(tout);
//
//            res = new JLabel("");
//            res.setFont(new Font("Arial", Font.PLAIN, 20));
//            res.setSize(500, 25);
//            res.setLocation(100, 500);
//            c.Zonename(res);
//
//            resZonename = new JTextArea();
//            resZonename.setFont(new Font("Arial", Font.PLAIN, 15));
//            resZonename.setSize(200, 75);
//            resZonename.setLocation(580, 175);
//            resZonename.setLineWrap(true);
//            c.Zonename(resZonename);

            setVisible(true);
        }

        // method actionPerformed()
        // to get the action performed
        // by the user and act accordingly
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource() == sub) {
                registerUnit();

//                if (BUA.isSelected()) {
//                    String data1;
//                    String data
//                            = "Name : "
//                            + UIDtxt1.getText() + "\n"
//                            + "Mobile : "
//                            + UIDtxt.getText() + "\n";
//                    if (male.isSelected())
//                        data1 = "Gender : Male"
//                                + "\n";
//                    else
//                        data1 = "Gender : Female"
//                                + "\n";
//                    String data2
//                            = "DOB : "
//                            + (String)Sday.getSelectedItem()
//                            + "/" + (String)Smonth.getSelectedItem()
//                            + "/" + (String)Syear.getSelectedItem()
//                            + "\n";
//
//                    String data3 = "Address : " + Zonenametxt.getText();
//                    tout.setText(data + data1 + data2 + data3);
//                    tout.setEditable(false);
//                    res.setText("Registration Successfully..");
//                }
//                else {
//                    tout.setText("");
//                    resZonename.setText("");
//                    res.setText("Please accept the"
//                            + " BUAs & conditions..");
//                }
            }

            else if (e.getSource() == reset) {
                String def = "";
                UIDtxt1.setText(def);
                Zonenametxt.setText(def);
                PhaseNametxt.setText(def);
                ProjectNametxt.setText(def);
                GAtxt.setText(def);
                BUAtxt.setText(def);
                Sday.setSelectedIndex(0);
                Smonth.setSelectedIndex(0);
                Syear.setSelectedIndex(0);
                //resZonename.setText(def);
            }
        }

        public void registerUnit(){
            String UID = UIDtxt1.getText();
            String PName = ProjectNametxt.getText();
            String PHName = PhaseNametxt.getText();
            String ZName = Zonenametxt.getText();
            int BUA=Integer.parseInt(BUAtxt.getText());
            int GA=Integer.parseInt(GAtxt.getText());

            LocalDate HOdate = LocalDate.of(Integer.parseInt((String)Syear.getSelectedItem()),Integer.parseInt((String)Smonth.getSelectedItem()),Integer.parseInt((String)Sday.getSelectedItem()));
            //String password = String.valueOf(pfPassword.getPassword());
            //String confirmPassword = String.valueOf(pfConfirmPassword.getPassword());

            if (UID.isEmpty() || PName.isEmpty() || PHName.isEmpty() || ZName.isEmpty() || BUAtxt.getText().isEmpty()|| GAtxt.getText().isEmpty() || HOdate.toString().isEmpty() ) {
                JOptionPane.showMessageDialog(this,
                        "Please enter all fields",
                        "Try again",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            unit = addUnitToDatabase(UID, PName, PHName, ZName,BUA,GA,HOdate);
            if (unit != null) {
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
        private Unit addUnitToDatabase(String UID,String PName,String PHName,String ZName, int BUA, int GA, LocalDate HOD) {
            final String DB_URL = "jdbc:mysql://localhost/MyStore?serverTimezone=UTC";
            final String USERNAME = "root";
            final String PASSWORD = "Mysql1234";
            Date HoD = Date.valueOf(HOD);


            //Unit unit = null;
            try {

                //Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm/fm", "root", "Mysql1234");
                // Connected to database successfully...

                Statement stmt = conn.createStatement();
                String sql = "INSERT INTO unit (unitNo, projectName, phaseName, zoneName, BUA, gardenArea, handOverDate)" +
                        " VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, UID);
                preparedStatement.setString(2, PName);
                preparedStatement.setString(3, PHName);
                preparedStatement.setString(4, ZName);
                preparedStatement.setInt(5, BUA);
                preparedStatement.setInt(6, GA);
                preparedStatement.setDate(7, HoD);

                //Insert row into the table
                int addedRows = preparedStatement.executeUpdate();
                if (addedRows > 0) {
                    unit = new Unit();
                    unit.setUnitNo(UID);

                    unit.setProjectName(PName);
                    unit.setPhaseName(PHName);
                    ;
                    unit.setZone(ZName);
                    unit.setBUA(BUA);
                    unit.setGA(GA);
                    unit.setHOD(HOD);


                }

                stmt.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

            return unit;
        }


        }








