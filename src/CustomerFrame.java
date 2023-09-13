
    // Java program to implement
// a Simple Registration Form
// using Java Swing

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

    class MyFrame
            extends JFrame
            implements ActionListener {

        // Components of the Form
        private Container c;
        private JLabel title;
        private JLabel EngName;//EngName
        private JTextField ENtext;//ENtext
        private JLabel ARName;//ARName
        private JTextField ARtxt;
        private JLabel Phone;
        private JTextField Phonetxt;
        private JLabel Email;
        private JTextField Emailtxt;
        private JLabel dob;
        private JComboBox date;
        private JComboBox month;
        private JComboBox year;
        private JLabel add;
        private JTextArea tadd;
        private JCheckBox term;
        private JButton sub;
        private JButton reset;
        private JTextArea tout;
        private JLabel res;
        private JTextArea resadd;

//        private String dates[]
//                = { "1", "2", "3", "4", "5",
//                "6", "7", "8", "9", "10",
//                "11", "12", "13", "14", "15",
//                "16", "17", "18", "19", "20",
//                "21", "22", "23", "24", "25",
//                "26", "27", "28", "29", "30",
//                "31" };
//        private String months[]
//                = { "Jan", "feb", "Mar", "Apr",
//                "May", "Jun", "July", "Aug",
//                "Sup", "Oct", "Nov", "Dec" };
//        private String years[]
//                = { "1995", "1996", "1997", "1998",
//                "1999", "2000", "2001", "2002",
//                "2003", "2004", "2005", "2006",
//                "2007", "2008", "2009", "2010",
//                "2011", "2012", "2013", "2014",
//                "2015", "2016", "2017", "2018",
//                "2019" };

        // constructor, to initialize the components
        // with default values.
        public MyFrame()
        {
            setTitle("Customer Registration Form");
            setBounds(300, 90, 900, 600);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setResizable(false);

            c = getContentPane();
            c.setLayout(null);

            title = new JLabel("Customer Registration Form");
            title.setFont(new Font("Arial", Font.PLAIN, 30));
            title.setSize(300, 30);
            title.setLocation(300, 30);
            c.add(title);

            EngName = new JLabel("Name");
            EngName.setFont(new Font("Arial", Font.PLAIN, 20));
            EngName.setSize(100, 20);
            EngName.setLocation(100, 100);
            c.add(EngName);

            ENtext = new JTextField();
            ENtext.setFont(new Font("Arial", Font.PLAIN, 15));
            ENtext.setSize(190, 20);
            ENtext.setLocation(200, 100);
            c.add(ENtext);

            ARName = new JLabel("ARName");
            ARName.setFont(new Font("Arial", Font.PLAIN, 20));
            ARName.setSize(100, 20);
            ARName.setLocation(100, 150);
            c.add(ARName);

            ARtxt = new JTextField();
            ARtxt.setFont(new Font("Arial", Font.PLAIN, 15));
            ARtxt.setSize(150, 20);
            ARtxt.setLocation(200, 150);
            c.add(ARtxt);

            Phone = new JLabel("Phone");
            Phone.setFont(new Font("Arial", Font.PLAIN, 20));
            Phone.setSize(100, 20);
            Phone.setLocation(100, 200);
            c.add(Phone);

            Phonetxt = new JTextField();
            Phonetxt.setFont(new Font("Arial", Font.PLAIN, 15));
            Phonetxt.setSize(150, 20);
            Phonetxt.setLocation(200, 200);
            c.add(Phonetxt);

            Email = new JLabel("Email");
            Email.setFont(new Font("Arial", Font.PLAIN, 20));
            Email.setSize(100, 20);
            Email.setLocation(100, 250);
            c.add(Email);

            Emailtxt = new JTextField();
            Emailtxt.setFont(new Font("Arial", Font.PLAIN, 15));
            Emailtxt.setSize(150, 20);
            Emailtxt.setLocation(200, 250);
            c.add(Emailtxt);

//            month = new JComboBox(months);
//            month.setFont(new Font("Arial", Font.PLAIN, 15));
//            month.setSize(60, 20);
//            month.setLocation(250, 250);
//            c.add(month);
//
//            year = new JComboBox(years);
//            year.setFont(new Font("Arial", Font.PLAIN, 15));
//            year.setSize(60, 20);
//            year.setLocation(320, 250);
//            c.add(year);
//
//            add = new JLabel("Address");
//            add.setFont(new Font("Arial", Font.PLAIN, 20));
//            add.setSize(100, 20);
//            add.setLocation(100, 300);
//            c.add(add);
//
//            tadd = new JTextArea();
//            tadd.setFont(new Font("Arial", Font.PLAIN, 15));
//            tadd.setSize(200, 75);
//            tadd.setLocation(200, 300);
//            tadd.setLineWrap(true);
//            c.add(tadd);
//
//            term = new JCheckBox("Accept Terms And Conditions.");
//            term.setFont(new Font("Arial", Font.PLAIN, 15));
//            term.setSize(250, 20);
//            term.setLocation(150, 400);
//            c.add(term);

            sub = new JButton("Submit");
            sub.setFont(new Font("Arial", Font.PLAIN, 15));
            sub.setSize(100, 20);
            sub.setLocation(150, 450);
            sub.addActionListener(this);
            c.add(sub);

            reset = new JButton("Reset");
            reset.setFont(new Font("Arial", Font.PLAIN, 15));
            reset.setSize(100, 20);
            reset.setLocation(270, 450);
            reset.addActionListener(this);
            c.add(reset);

//            tout = new JTextArea();
//            tout.setFont(new Font("Arial", Font.PLAIN, 15));
//            tout.setSize(300, 400);
//            tout.setLocation(500, 100);
//            tout.setLineWrap(true);
//            tout.setEditable(false);
//            c.add(tout);

            res = new JLabel("");
            res.setFont(new Font("Arial", Font.PLAIN, 20));
            res.setSize(500, 25);
            res.setLocation(100, 500);
            c.add(res);

            resadd = new JTextArea();
            resadd.setFont(new Font("Arial", Font.PLAIN, 15));
            resadd.setSize(200, 75);
            resadd.setLocation(580, 175);
            resadd.setLineWrap(true);
            c.add(resadd);

            setVisible(true);
        }

        public Customer customer;
        // method actionPerformed()
        // to get the action performed
        // by the user and act accordingly
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource() == sub) {
//                if (term.isSelected()) {
//                    String data1;
//                    String data
//                            = "Name : "
//                            + ENtext.getText() + "\n"
//                            + "Mobile : "
//                            + ARtxt.getText() + "\n";
//                    if (male.isSelected())
//                        data1 = "Gender : Male"
//                                + "\n";
//                    else
//                        data1 = "Gender : Female"
//                                + "\n";
//                    String data2
//                            = "DOB : "
//                            + (String)date.getSelectedItem()
//                            + "/" + (String)month.getSelectedItem()
//                            + "/" + (String)year.getSelectedItem()
//                            + "\n";
//
//                    String data3 = "Address : " + tadd.getText();
//                    tout.setText(data + data1 + data2 + data3);
//                    tout.setEditable(false);
//                    res.setText("Registration Successfully..");
//                }
//                else {
//                    tout.setText("");
//                    resadd.setText("");
//                    res.setText("Please accept the"
//                            + " terms & conditions..");
//                }
                registerCustomer();

            }

            else if (e.getSource() == reset) {
                String def = "";
                ENtext.setText(def);
                ARtxt.setText(def);
                Phonetxt.setText(def);
                Emailtxt.setText(def);
//                tout.setText(def);
//                term.setSelected(false);
//                date.setSelectedIndex(0);
//                month.setSelectedIndex(0);
//                year.setSelectedIndex(0);
//                resadd.setText(def);
            }
        }
        private void registerCustomer() {
            String EnglishName = ENtext.getText();
            String ArabicName = ARtxt.getText();
            String phone = Phonetxt.getText();
            String emailaddress = Emailtxt.getText();
            //String password = String.valueOf(pfPassword.getPassword());
            //String confirmPassword = String.valueOf(pfConfirmPassword.getPassword());

            if (EnglishName.isEmpty() || ArabicName.isEmpty() || phone.isEmpty() || emailaddress.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Please enter all fields",
                        "Try again",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            customer = addCustomerToDatabase(EnglishName, ArabicName, phone, emailaddress);
            if (customer != null) {
                dispose();
                res.setText("Registration Successfully..");
            }
            else {
                JOptionPane.showMessageDialog(this,
                        "Failed to register new user",
                        "Try again",
                        JOptionPane.ERROR_MESSAGE);

            }
        }
        private Customer addCustomerToDatabase(String EngName,String ARName,String Phone,String Email){
            final String DB_URL = "jdbc:mysql://localhost/MyStore?serverTimezone=UTC";
            final String USERNAME = "root";
            final String PASSWORD = "Mysql1234";


            try{

                //Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm/fm", "root", "Mysql1234");
                // Connected to database successfully...

                Statement stmt = conn.createStatement();
                String sql = "INSERT INTO customer1 (ENName, ARName, Phone, Email)" +
                        " VALUES (?, ?, ?, ?)";
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, EngName);
                preparedStatement.setString(2, ARName);
                preparedStatement.setString(3, Phone);
                preparedStatement.setString(4, Email);
                //preparedStatement.setString(5, password);

                //Insert row into the table
                int addedRows = preparedStatement.executeUpdate();
                if (addedRows > 0) {
                    customer = new Customer();
                    customer.setEngName(EngName);

                    customer.setARName(ARName);
                    customer.setPhone(Phone);;
                    customer.setEmail(Email);

                }

                stmt.close();
                conn.close();
            }catch(Exception e){
                e.printStackTrace();
            }

            return customer;
        }

    }


    // Driver Code



