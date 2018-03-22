package UI ;
import java.util.Arrays;
import BANK.* ;
import BasicOP.* ;
import java.util.Random ;

public class Frame extends javax.swing.JFrame {
    
    //You can set text anywhere i.e. in any method.
    //get text after the frame is set to visible and under the method of 'OK'/'SUBMIT' button after info is entered.
    
    public String FName  ;
    public String MName ;
    public String LName ;
    public String L1 ;
    public String Dis ;
    public String state ; 
    public String Dob1 ;
    public String MID;   
    public long Number ;
    public int PIN ;
    public String city ;
    public int var;
    public int Account_Balance ;
    public int Account_No ;
    public int Pin1 ;
    public int wamount;
    public int damount;
    public long Debit_No ;
    public String Address1 ;
    public int LAmt;
    public int LTime;
    public int var1 ;
//    public String acu = Integer.toString(Account_Balance);
    
    public Frame() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BANK = new javax.swing.JFrame();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        CBI = new javax.swing.JButton();
        ISISI = new javax.swing.JButton();
        KANARA = new javax.swing.JButton();
        ACCOUNT = new javax.swing.JFrame();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        Register = new javax.swing.JButton();
        Login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FORM = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        FN = new javax.swing.JTextField();
        MN = new javax.swing.JTextField();
        LN = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        DOB = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        MOBILENO = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Line1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        MAIL = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Line2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        City = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        District = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Pin = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        DetailsOk = new javax.swing.JButton();
        State = new javax.swing.JComboBox<>();
        CONIFRM = new javax.swing.JFrame();
        jDesktopPane5 = new javax.swing.JDesktopPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        ConfirmOk = new javax.swing.JButton();
        NOTIFBACK = new javax.swing.JButton();
        SUCCESS = new javax.swing.JFrame();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        Accno = new javax.swing.JTextField();
        Cardno = new javax.swing.JTextField();
        PinArea = new javax.swing.JTextField();
        CongoCont = new javax.swing.JButton();
        LOGINPAGE = new javax.swing.JFrame();
        jDesktopPane4 = new javax.swing.JDesktopPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        ACCNO = new javax.swing.JTextField();
        PSWD = new javax.swing.JPasswordField();
        LoginOk = new javax.swing.JButton();
        eRROR = new javax.swing.JDialog();
        jPanel12 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        OPS = new javax.swing.JFrame();
        jDesktopPane6 = new javax.swing.JDesktopPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        Withdraw = new javax.swing.JButton();
        Deposit = new javax.swing.JButton();
        BalEnq = new javax.swing.JButton();
        backmenu = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        Loan = new javax.swing.JButton();
        WD = new javax.swing.JFrame();
        jDesktopPane7 = new javax.swing.JDesktopPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        WDCBal = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        WAmt = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        DEP = new javax.swing.JFrame();
        jDesktopPane9 = new javax.swing.JDesktopPane();
        jPanel10 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        DepOk = new javax.swing.JButton();
        DCBal = new javax.swing.JTextField();
        DepAmt = new javax.swing.JTextField();
        SubDep = new javax.swing.JButton();
        ACCENQ = new javax.swing.JFrame();
        jDesktopPane8 = new javax.swing.JDesktopPane();
        jPanel11 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        AcEnqOk = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        OPTIONS = new javax.swing.JFrame();
        jDesktopPane10 = new javax.swing.JDesktopPane();
        jPanel13 = new javax.swing.JPanel();
        Home = new javax.swing.JButton();
        Education = new javax.swing.JButton();
        Vehicle = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        LoanBack = new javax.swing.JButton();
        LOAN = new javax.swing.JFrame();
        jDesktopPane11 = new javax.swing.JDesktopPane();
        jPanel14 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        LoanAmt = new javax.swing.JTextField();
        Time = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        FinalAmt = new javax.swing.JTextField();
        SubmitLoan = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        LOANBack = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        Continue = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();

        BANK.setAlwaysOnTop(true);
        BANK.setBounds(new java.awt.Rectangle(0, 350, 0, 0));
        BANK.setLocation(new java.awt.Point(400, 300));

        jDesktopPane1.setMinimumSize(new java.awt.Dimension(900, 400));

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel6.setText("SELECT THE BANK ");

        CBI.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CBI.setText("CBI");
        CBI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBIActionPerformed(evt);
            }
        });

        ISISI.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ISISI.setText("ISISI");
        ISISI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ISISIActionPerformed(evt);
            }
        });

        KANARA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        KANARA.setText("KANARA");
        KANARA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KANARAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(CBI, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(252, 252, 252)
                        .addComponent(ISISI, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(254, 254, 254)
                        .addComponent(KANARA))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(414, 414, 414)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(315, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBI, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ISISI, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KANARA, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(124, 124, 124))
        );

        jDesktopPane1.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout BANKLayout = new javax.swing.GroupLayout(BANK.getContentPane());
        BANK.getContentPane().setLayout(BANKLayout);
        BANKLayout.setHorizontalGroup(
            BANKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BANKLayout.setVerticalGroup(
            BANKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ACCOUNT.setAlwaysOnTop(true);
        ACCOUNT.setBounds(new java.awt.Rectangle(0, 350, 0, 0));
        ACCOUNT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ACCOUNT.setMinimumSize(new java.awt.Dimension(100, 200));
        ACCOUNT.setName("SELECT"); // NOI18N

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(524, 259));
        jPanel2.setRequestFocusEnabled(false);

        Register.setBackground(new java.awt.Color(204, 204, 204));
        Register.setText("Register");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });

        Login.setBackground(new java.awt.Color(204, 255, 255));
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        jLabel4.setText("CREATE A NEW ACCOUNT");

        jLabel5.setText("ALREADY HAVE ONE ?");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Register)
                    .addComponent(Login))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jDesktopPane2.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout ACCOUNTLayout = new javax.swing.GroupLayout(ACCOUNT.getContentPane());
        ACCOUNT.getContentPane().setLayout(ACCOUNTLayout);
        ACCOUNTLayout.setHorizontalGroup(
            ACCOUNTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        ACCOUNTLayout.setVerticalGroup(
            ACCOUNTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        FORM.setAlwaysOnTop(true);
        FORM.setLocation(new java.awt.Point(550, 0));
        FORM.setPreferredSize(new java.awt.Dimension(1903, 999));

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setText("ACCOUNT REGISTRATION FORM");

        jLabel8.setText("FIRST NAME *");

        jLabel9.setText("MIDDLE NAME");

        jLabel10.setText("LAST NAME *");

        FN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNActionPerformed(evt);
            }
        });

        MN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNActionPerformed(evt);
            }
        });

        LN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LNActionPerformed(evt);
            }
        });

        jLabel11.setText("DATE OF BIRTH (dd/mm/yyyy) * ");

        DOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOBActionPerformed(evt);
            }
        });

        jLabel12.setText("MOBILE NUMBER * ");

        MOBILENO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOBILENOActionPerformed(evt);
            }
        });

        jLabel13.setText("ADDRESS *");

        Line1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Line1ActionPerformed(evt);
            }
        });

        jLabel14.setText("MAIL ID ");

        MAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAILActionPerformed(evt);
            }
        });

        jLabel15.setText("Line 1");

        jLabel16.setText("Line 2");

        jLabel17.setText("City");

        City.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityActionPerformed(evt);
            }
        });

        jLabel18.setText("District");

        District.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DistrictActionPerformed(evt);
            }
        });

        jLabel19.setText("State");

        jLabel20.setText("Pin-Code");

        Pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PinActionPerformed(evt);
            }
        });

        jLabel21.setText("AADHAR CARD NUMBER *");

        jLabel22.setText("PAN CARD NUMBER *");

        DetailsOk.setText("OK");
        DetailsOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailsOkActionPerformed(evt);
            }
        });

        State.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "KARNATAKA", "ANDHRA PRADESH", "KERALA", "TAMIL NADU", "MAHARASHTRA" }));
        State.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel14))
                                    .addGap(50, 50, 50))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel19))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22))
                                .addGap(100, 100, 100)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(DOB, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FN, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MN, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LN, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MOBILENO, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MAIL, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Line1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Line2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(City, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(State, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Pin, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(18, 18, 18)
                                        .addComponent(District))))
                            .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField9)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(857, 857, 857)
                        .addComponent(DetailsOk)))
                .addContainerGap(993, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel7)
                .addGap(76, 76, 76)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(MN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(LN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(MOBILENO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(MAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(Line2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(City, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(District, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(Pin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(State, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(DetailsOk)
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108))
        );

        State.getAccessibleContext().setAccessibleName("STATE SELECT");

        jScrollPane2.setViewportView(jPanel4);

        javax.swing.GroupLayout FORMLayout = new javax.swing.GroupLayout(FORM.getContentPane());
        FORM.getContentPane().setLayout(FORMLayout);
        FORMLayout.setHorizontalGroup(
            FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1903, Short.MAX_VALUE)
        );
        FORMLayout.setVerticalGroup(
            FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 999, Short.MAX_VALUE)
        );

        FORM.getAccessibleContext().setAccessibleName("form");

        CONIFRM.setAlwaysOnTop(true);
        CONIFRM.setLocation(new java.awt.Point(700, 300));

        jPanel7.setBackground(new java.awt.Color(51, 204, 255));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel33.setText("YOUR ACCOUNT WILL BE CREATED");

        jLabel34.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel34.setText("NOTIFICATION!");

        ConfirmOk.setText("OK");
        ConfirmOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmOkActionPerformed(evt);
            }
        });

        NOTIFBACK.setText("Back");
        NOTIFBACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOTIFBACKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel34))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(ConfirmOk)
                        .addGap(96, 96, 96)
                        .addComponent(NOTIFBACK))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel33)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addGap(49, 49, 49)
                .addComponent(jLabel33)
                .addGap(53, 53, 53)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmOk)
                    .addComponent(NOTIFBACK))
                .addGap(55, 55, 55))
        );

        jDesktopPane5.setLayer(jPanel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane5Layout = new javax.swing.GroupLayout(jDesktopPane5);
        jDesktopPane5.setLayout(jDesktopPane5Layout);
        jDesktopPane5Layout.setHorizontalGroup(
            jDesktopPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane5Layout.setVerticalGroup(
            jDesktopPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout CONIFRMLayout = new javax.swing.GroupLayout(CONIFRM.getContentPane());
        CONIFRM.getContentPane().setLayout(CONIFRMLayout);
        CONIFRMLayout.setHorizontalGroup(
            CONIFRMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane5, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        CONIFRMLayout.setVerticalGroup(
            CONIFRMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane5, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        SUCCESS.setAlwaysOnTop(true);
        SUCCESS.setLocation(new java.awt.Point(700, 300));

        jPanel6.setBackground(new java.awt.Color(0, 153, 255));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel28.setText("CONGRATULATIONS!");

        jLabel29.setText("YOUR ACCOUNT NUMBER :");

        jLabel30.setText("YOUR CARD NUMBER :");

        jLabel31.setText("YOUR PIN :");

        Accno.setEditable(false);

        Cardno.setEditable(false);

        PinArea.setEditable(false);

        CongoCont.setText("Continue");
        CongoCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CongoContActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel28))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel32)
                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Accno)
                            .addComponent(Cardno, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(PinArea, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CongoCont)
                .addGap(240, 240, 240))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel28)
                .addGap(52, 52, 52)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Accno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cardno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PinArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(CongoCont)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane3.setLayer(jPanel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout SUCCESSLayout = new javax.swing.GroupLayout(SUCCESS.getContentPane());
        SUCCESS.getContentPane().setLayout(SUCCESSLayout);
        SUCCESSLayout.setHorizontalGroup(
            SUCCESSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        SUCCESSLayout.setVerticalGroup(
            SUCCESSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        LOGINPAGE.setTitle("LOG");
        LOGINPAGE.setAlwaysOnTop(true);
        LOGINPAGE.setLocation(new java.awt.Point(700, 300));

        jPanel5.setBackground(new java.awt.Color(153, 204, 255));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("LOGIN");

        jLabel24.setText("ACCOUNT / CARD NO.");

        jLabel25.setText("PIN :");

        ACCNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACCNOActionPerformed(evt);
            }
        });

        PSWD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PSWDActionPerformed(evt);
            }
        });

        LoginOk.setText("OK");
        LoginOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PSWD, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(ACCNO, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23)
                    .addComponent(LoginOk))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel23)
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ACCNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(PSWD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(LoginOk)
                .addGap(88, 88, 88))
        );

        jDesktopPane4.setLayer(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane4Layout = new javax.swing.GroupLayout(jDesktopPane4);
        jDesktopPane4.setLayout(jDesktopPane4Layout);
        jDesktopPane4Layout.setHorizontalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane4Layout.setVerticalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout LOGINPAGELayout = new javax.swing.GroupLayout(LOGINPAGE.getContentPane());
        LOGINPAGE.getContentPane().setLayout(LOGINPAGELayout);
        LOGINPAGELayout.setHorizontalGroup(
            LOGINPAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane4, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        LOGINPAGELayout.setVerticalGroup(
            LOGINPAGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane4, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        eRROR.setTitle("Error");
        eRROR.setAlwaysOnTop(true);
        eRROR.setLocation(new java.awt.Point(650, 350));

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("OOPS...");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel26.setText("WRONG DETAILS !");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel26))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel3)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel3)
                .addGap(43, 43, 43)
                .addComponent(jLabel26)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout eRRORLayout = new javax.swing.GroupLayout(eRROR.getContentPane());
        eRROR.getContentPane().setLayout(eRRORLayout);
        eRRORLayout.setHorizontalGroup(
            eRRORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        eRRORLayout.setVerticalGroup(
            eRRORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        OPS.setAlwaysOnTop(true);
        OPS.setLocation(new java.awt.Point(550, 400));

        jPanel8.setBackground(new java.awt.Color(153, 204, 255));
        jPanel8.setAutoscrolls(true);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel35.setText("WHAT DO YOU PLAN TO DO?");

        Withdraw.setText("WITHDRAW");
        Withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawActionPerformed(evt);
            }
        });

        Deposit.setText("DEPOSIT");
        Deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositActionPerformed(evt);
            }
        });

        BalEnq.setText("ACCOUNT ENQUIRY");
        BalEnq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalEnqActionPerformed(evt);
            }
        });

        backmenu.setText("Back");
        backmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backmenuActionPerformed(evt);
            }
        });

        Logout.setBackground(new java.awt.Color(204, 204, 255));
        Logout.setText("LOGOUT");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        Loan.setText("LOAN");
        Loan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(backmenu))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(Withdraw)
                        .addGap(59, 59, 59)
                        .addComponent(Deposit)
                        .addGap(56, 56, 56)
                        .addComponent(BalEnq)
                        .addGap(48, 48, 48)
                        .addComponent(Loan, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(Logout)
                .addGap(61, 61, 61))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(Logout))
                .addGap(54, 54, 54)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Withdraw)
                    .addComponent(Deposit)
                    .addComponent(BalEnq)
                    .addComponent(Loan))
                .addGap(31, 31, 31)
                .addComponent(backmenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane6.setLayer(jPanel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane6Layout = new javax.swing.GroupLayout(jDesktopPane6);
        jDesktopPane6.setLayout(jDesktopPane6Layout);
        jDesktopPane6Layout.setHorizontalGroup(
            jDesktopPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane6Layout.setVerticalGroup(
            jDesktopPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout OPSLayout = new javax.swing.GroupLayout(OPS.getContentPane());
        OPS.getContentPane().setLayout(OPSLayout);
        OPSLayout.setHorizontalGroup(
            OPSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane6, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        OPSLayout.setVerticalGroup(
            OPSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane6, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        WD.setAlwaysOnTop(true);
        WD.setLocation(new java.awt.Point(300, 400));

        jPanel9.setBackground(new java.awt.Color(204, 255, 255));

        jLabel36.setText("CURRENT BALANCE :");

        WDCBal.setEditable(false);
        WDCBal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WDCBalActionPerformed(evt);
            }
        });

        jLabel37.setText("WITHDRAWAL AMOUNT: ");

        WAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WAmtActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel38.setText("WITHDRAW");

        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(WDCBal, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WAmt)))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(153, 153, 153))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(WDCBal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(WAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jDesktopPane7.setLayer(jPanel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane7Layout = new javax.swing.GroupLayout(jDesktopPane7);
        jDesktopPane7.setLayout(jDesktopPane7Layout);
        jDesktopPane7Layout.setHorizontalGroup(
            jDesktopPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane7Layout.setVerticalGroup(
            jDesktopPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout WDLayout = new javax.swing.GroupLayout(WD.getContentPane());
        WD.getContentPane().setLayout(WDLayout);
        WDLayout.setHorizontalGroup(
            WDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane7, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        WDLayout.setVerticalGroup(
            WDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane7, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        DEP.setAlwaysOnTop(true);
        DEP.setLocation(new java.awt.Point(400, 300));

        jPanel10.setBackground(new java.awt.Color(190, 226, 226));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel39.setText("DEPOSIT");

        jLabel40.setText("CURRENT BALANCE :");

        jLabel41.setText("DEPOSIT AMOUNT :");

        DepOk.setText("Ok");
        DepOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepOkActionPerformed(evt);
            }
        });

        DCBal.setEditable(false);
        DCBal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DCBalActionPerformed(evt);
            }
        });

        DepAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepAmtActionPerformed(evt);
            }
        });

        SubDep.setText("Submit");
        SubDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubDepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel41)
                            .addComponent(jLabel40))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DCBal)
                            .addComponent(DepAmt, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(SubDep))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(DepOk))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel39)
                .addGap(37, 37, 37)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(DCBal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(DepAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubDep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(DepOk)
                .addGap(28, 28, 28))
        );

        jDesktopPane9.setLayer(jPanel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane9Layout = new javax.swing.GroupLayout(jDesktopPane9);
        jDesktopPane9.setLayout(jDesktopPane9Layout);
        jDesktopPane9Layout.setHorizontalGroup(
            jDesktopPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane9Layout.setVerticalGroup(
            jDesktopPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout DEPLayout = new javax.swing.GroupLayout(DEP.getContentPane());
        DEP.getContentPane().setLayout(DEPLayout);
        DEPLayout.setHorizontalGroup(
            DEPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane9)
        );
        DEPLayout.setVerticalGroup(
            DEPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane9, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        ACCENQ.setAlwaysOnTop(true);

        jPanel11.setBackground(new java.awt.Color(204, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(535, 510));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel43.setText("ACCOUNT ENQUIRY");

        jLabel44.setText("CURRENT BALANCE :");

        jLabel45.setText("ACCOUNT NUMBER :");

        jLabel46.setText("FULL NAME :");

        jLabel47.setText("MOBILE NUMBER :");

        jLabel48.setText("ADDRESS :");

        jLabel49.setText("CARD NUMBER :");

        AcEnqOk.setText("Ok");
        AcEnqOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcEnqOkActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);

        jTextField2.setEditable(false);

        jTextField3.setEditable(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setEditable(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setEditable(false);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(242, 241, 241));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel43))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel11Layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel48)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel46)
                                            .addComponent(jLabel47)
                                            .addComponent(jLabel49)))
                                    .addGap(65, 65, 65))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel45)
                                    .addGap(67, 67, 67)))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel44)
                                .addGap(43, 43, 43)))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AcEnqOk)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1)
                                .addComponent(jTextField2)
                                .addComponent(jTextField3)
                                .addComponent(jTextField4)
                                .addComponent(jTextField5)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel43)
                .addGap(66, 66, 66)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(AcEnqOk)
                .addGap(33, 33, 33))
        );

        jDesktopPane8.setLayer(jPanel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane8Layout = new javax.swing.GroupLayout(jDesktopPane8);
        jDesktopPane8.setLayout(jDesktopPane8Layout);
        jDesktopPane8Layout.setHorizontalGroup(
            jDesktopPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane8Layout.setVerticalGroup(
            jDesktopPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout ACCENQLayout = new javax.swing.GroupLayout(ACCENQ.getContentPane());
        ACCENQ.getContentPane().setLayout(ACCENQLayout);
        ACCENQLayout.setHorizontalGroup(
            ACCENQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane8, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        ACCENQLayout.setVerticalGroup(
            ACCENQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane8, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        OPTIONS.setAlwaysOnTop(true);

        jPanel13.setBackground(new java.awt.Color(153, 204, 255));

        Home.setText("HOME");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        Education.setText("EDUCATION");
        Education.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EducationActionPerformed(evt);
            }
        });

        Vehicle.setText("VEHICLE");
        Vehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VehicleActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel27.setText("WHICH LOAN WOULD YOU LIKE TO TAKE ?");

        LoanBack.setText("Back");
        LoanBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoanBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(Home)
                                .addGap(122, 122, 122)
                                .addComponent(Education, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114)
                                .addComponent(Vehicle))))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(LoanBack)))
                .addGap(0, 161, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Education)
                    .addComponent(Home)
                    .addComponent(Vehicle))
                .addGap(34, 34, 34)
                .addComponent(LoanBack)
                .addGap(24, 24, 24))
        );

        jDesktopPane10.setLayer(jPanel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane10Layout = new javax.swing.GroupLayout(jDesktopPane10);
        jDesktopPane10.setLayout(jDesktopPane10Layout);
        jDesktopPane10Layout.setHorizontalGroup(
            jDesktopPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane10Layout.setVerticalGroup(
            jDesktopPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout OPTIONSLayout = new javax.swing.GroupLayout(OPTIONS.getContentPane());
        OPTIONS.getContentPane().setLayout(OPTIONSLayout);
        OPTIONSLayout.setHorizontalGroup(
            OPTIONSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane10, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        OPTIONSLayout.setVerticalGroup(
            OPTIONSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane10, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        LOAN.setAlwaysOnTop(true);

        jPanel14.setBackground(new java.awt.Color(201, 239, 239));

        jLabel51.setText("ENTER THE AMOUNT :");

        jLabel52.setText("ENTER THE TIME PERIOD :");

        Time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeActionPerformed(evt);
            }
        });

        jLabel53.setText("THE TOTAL AMOUNT TO BE PAID IN THE GIVEN TIME PERIOD ");

        FinalAmt.setEditable(false);

        SubmitLoan.setText("Submit");
        SubmitLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitLoanActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel54.setText("LOAN DETAILS");

        LOANBack.setText("Back");
        LOANBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOANBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel53))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(FinalAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Time, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoanAmt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 182, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(SubmitLoan)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(LOANBack)
                        .addGap(48, 48, 48))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(LoanAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(SubmitLoan)
                .addGap(4, 4, 4)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(jLabel53)
                .addGap(18, 18, 18)
                .addComponent(FinalAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(LOANBack)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jDesktopPane11.setLayer(jPanel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane11Layout = new javax.swing.GroupLayout(jDesktopPane11);
        jDesktopPane11.setLayout(jDesktopPane11Layout);
        jDesktopPane11Layout.setHorizontalGroup(
            jDesktopPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane11Layout.setVerticalGroup(
            jDesktopPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout LOANLayout = new javax.swing.GroupLayout(LOAN.getContentPane());
        LOAN.getContentPane().setLayout(LOANLayout);
        LOANLayout.setHorizontalGroup(
            LOANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane11, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        LOANLayout.setVerticalGroup(
            LOANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane11, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome Page");
        setBackground(new java.awt.Color(204, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setForeground(new java.awt.Color(255, 204, 204));
        setLocationByPlatform(true);
        setName("MAIN"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), new javax.swing.border.MatteBorder(null)));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.setFont(new java.awt.Font("Segoe Script", 1, 48)); // NOI18N

        jCheckBox1.setBackground(new java.awt.Color(0, 204, 255));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox1.setText("     Agree to terms and conditions");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        Continue.setBackground(new java.awt.Color(204, 204, 204));
        Continue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea1.setRows(5);
        jTextArea1.setText("\n\nLast updated: November 04, 2017\n\n   \t\t\t\t----\n\nPlease read these Terms and Conditions (\"Terms\", \"Terms and Conditions\")\ncarefully before using the app 'VIRTUAL BANK' (the \"Service\") operated\nby CODE BUSTERS (\"us\", \"we\", or \"our\").\n\nYour access to, and use of the Service is conditioned on your acceptance of, and\ncompliance with these Terms. These Terms apply to all visitors, users and\nothers who access or use the Service.\n\nBy accessing or using the Service you agree to be bound by these Terms. If you\ndisagree with any part of the terms then you may not access the Service.\n[Terms & Conditions created by TermsFeed](https://termsfeed.com/terms-\nconditions/) for 'VIRTUAL BANK'.\n\nAccounts  \n--------\n\nWhen you create an account with us, you must provide us information that is\naccurate, complete, and current at all times. Failure to do so constitutes a\nbreach of the Terms, which may result in immediate termination of your account\non our Service.\n\nYou are responsible for safeguarding the password that you use to access the\nService and for any activities or actions under your password, whether your\npassword is with our Service or a third-party service.\n\nYou agree not to disclose your password to any third party. You must notify us\nimmediately upon becoming aware of any breach of security or unauthorized use\nof your account.\n\n\t\t\t\t\t----\n\n'VIRTUAL BANK' has no control over, and assumes no responsibility for, the content,\nprivacy policies, or practices of any third party web sites or services. You\nfurther acknowledge and agree that 'VIRTUAL BANK' shall not be responsible or liable,\ndirectly or indirectly, for any damage or loss caused or alleged to be caused\nby or in connection with use of or reliance on any such content, goods or\nservices available on or through any such web sites or services.\n\nWe strongly advise you to read the terms and conditions and privacy policies\nof any third-party web sites or services that you visit.\n\nGoverning Law  \n-------------\n\nThese Terms shall be governed and construed in accordance with the laws of\nKarnataka, India, without regard to its conflict of law provisions.\n\nOur failure to enforce any right or provision of these Terms will not be\nconsidered a waiver of those rights. If any provision of these Terms is held\nto be invalid or unenforceable by a court, the remaining provisions of these\nTerms will remain in effect. These Terms constitute the entire agreement\nbetween us regarding our Service, and supersede and replace any prior\nagreements we might have between us regarding the Service.\n\nChanges  \n-------\n\nWe reserve the right, at our sole discretion, to modify or replace these Terms\nat any time. If a revision is material we will try to provide at least 30 days\nnotice prior to any new terms taking effect. What constitutes a material\nchange will be determined at our sole discretion.\n\nBy continuing to access or use our Service after those revisions become\neffective, you agree to be bound by the revised terms. If you do not agree to\nthe new terms, please stop using the Service.\n\nContact Us  \n----------\n\nIf you have any questions about these Terms, please contact us.\n\n");
        jTextArea1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("TERMS AND CONDITIONS");
        jLabel1.setAutoscrolls(true);

        jLabel2.setFont(new java.awt.Font("Mistral", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 0));
        jLabel2.setText("POCKET BANK");

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel50.setText("WELCOME TO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Continue)
                .addGap(601, 601, 601))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jLabel1)))
                .addGap(785, 785, 785))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Continue)
                        .addGap(132, 132, 132))))
        );

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 937, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBIActionPerformed
        var=1;
        ACCOUNT.setVisible(true);     
        ACCOUNT.setSize(840,300);
    }//GEN-LAST:event_CBIActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        FORM.setVisible(true); 
        FORM.setSize(1250,470);
        ACCOUNT.setVisible(false);

    }//GEN-LAST:event_RegisterActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        LOGINPAGE.setVisible(true);
        LOGINPAGE.setExtendedState(Frame.MAXIMIZED_BOTH);
        LOGINPAGE.setSize(450,400);
    }//GEN-LAST:event_LoginActionPerformed

    private void ISISIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISISIActionPerformed
        var=2;
        ACCOUNT.setVisible(true);
        ACCOUNT.setSize(840,300);
    }//GEN-LAST:event_ISISIActionPerformed

    private void KANARAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KANARAActionPerformed
            var=3;
            ACCOUNT.setVisible(true); 
            ACCOUNT.setExtendedState(Frame.MAXIMIZED_BOTH);
            ACCOUNT.setSize(840,300);
    }//GEN-LAST:event_KANARAActionPerformed

    private void FNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNActionPerformed
        this.FName=FN.getText(); 
    }//GEN-LAST:event_FNActionPerformed

    private void Line1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Line1ActionPerformed
        this.L1=Line1.getText();
    }//GEN-LAST:event_Line1ActionPerformed

    private void DistrictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DistrictActionPerformed
        this.Dis=District.getText();
    }//GEN-LAST:event_DistrictActionPerformed

    private void StateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StateActionPerformed
        this.state=State.getToolTipText();
    }//GEN-LAST:event_StateActionPerformed

    private void MNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNActionPerformed
        this.MName=MN.getText();        
    }//GEN-LAST:event_MNActionPerformed

    private void LNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LNActionPerformed
        this.LName=LN.getText();        
    }//GEN-LAST:event_LNActionPerformed

    private void DOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOBActionPerformed
        this.Dob1=DOB.getText();       
    }//GEN-LAST:event_DOBActionPerformed

    private void MOBILENOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOBILENOActionPerformed
        String temp=MOBILENO.getText();
        this.Number=Long.parseLong(temp);        
    }//GEN-LAST:event_MOBILENOActionPerformed

    private void MAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAILActionPerformed
        this.MID=MAIL.getText();        
    }//GEN-LAST:event_MAILActionPerformed

    private void CityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityActionPerformed
        this.city=City.getText();        
    }//GEN-LAST:event_CityActionPerformed

    private void PinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PinActionPerformed
        String pin=Pin.getText();
        this.PIN=Integer.parseInt(pin);        
    }//GEN-LAST:event_PinActionPerformed

    private void DetailsOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailsOkActionPerformed
        CONIFRM.setVisible(true);
        CONIFRM.setExtendedState(Frame.MAXIMIZED_BOTH);
        CONIFRM.setSize(550,325);
 
        
    }//GEN-LAST:event_DetailsOkActionPerformed

    private void ACCNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACCNOActionPerformed
        String temp=ACCNO.getText();
         int ac=Integer.parseInt(temp);
        Account_No = ac ;
        
    }//GEN-LAST:event_ACCNOActionPerformed

    private void LoginOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginOkActionPerformed
        String temp=ACCNO.getText();
        Account_No = Integer.parseInt(temp);
        char[] temp2=PSWD.getPassword();
        String temp1=new String(temp2);
        Pin1=Integer.parseInt(temp1);
        
        
        DBConnect DBobj1 = new DBConnect() ;
        
        if (var == 1){
            Account_Balance=DBobj1.CBIgetBalance(Account_No);
            if (DBobj1.CBIAccount_No(Account_No, Pin1)){
                OPS.setVisible(true);
                OPS.setExtendedState(Frame.MAXIMIZED_BOTH);
                OPS.setSize(820,300);
            }
            else{
                eRROR.setVisible(true) ;
            }
        }
        if (var == 2){
            Account_Balance=DBobj1.ISISIgetBalance(Account_No);
            if (DBobj1.ISISIAccount_No(Account_No,Pin1)){
                OPS.setVisible(true);
                OPS.setExtendedState(Frame.MAXIMIZED_BOTH);
                OPS.setSize(820,300);
            }
            else{
                eRROR.setVisible(true) ;
            }
        }if (var == 3){
            Account_Balance=DBobj1.KANARAgetBalance(Account_No);
            if (DBobj1.KANARAccount_No(Account_No,Pin1)){
                OPS.setVisible(true);
                OPS.setExtendedState(Frame.MAXIMIZED_BOTH);
                OPS.setSize(820,300);
            }
            else{
                eRROR.setVisible(true) ;
            }
        }
      

        eRROR.setSize(550,300);
    }//GEN-LAST:event_LoginOkActionPerformed

    private void PSWDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PSWDActionPerformed
        char[] temp=PSWD.getPassword();
        String temp1=Arrays.toString(temp);
        int Pswd=Integer.parseInt(temp1);
        this.Pin1 = Pswd ;
    }//GEN-LAST:event_PSWDActionPerformed

    private void ConfirmOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmOkActionPerformed
        CONIFRM.setVisible(false);  
        LName=LN.getText();
        MName=MN.getText();
        FName=FN.getText();
        L1=Line1.getText();
        Dis=District.getText();
        state=State.getToolTipText();
        Dob1=DOB.getText();
        String temp=MOBILENO.getText();
        Number=Long.parseLong(temp);
        MID=MAIL.getText();
        city=City.getText();
        String pin=Pin.getText();
        PIN=Integer.parseInt(pin);
        
        Random rand = new Random() ;
        Account_Balance = rand.nextInt(99999) ;
        
        DBConnect DBobj1 ;
        DBobj1 = new DBConnect();
        int aco;
        int pin1 ;
        if (var==1){
            //CBI
            aco=DBobj1.CBIInsert(this);
            
        }
        else if (var==2){
            //ISISI
            aco=DBobj1.ISISIInsert(this);
        }
        else{
            //KANARA
            aco=DBobj1.KANARAInsert(this);
        }
        Account_No = aco;
        SUCCESS.setVisible(true);
        DBConnect DBobj2 ;
        DBobj2 = new DBConnect() ;
        if (var == 1){
            pin1 = DBobj2.CBIReturnPin(aco) ;
        }
        else if ( var == 2 ){
            pin1 = DBobj2.ISISIReturnPin(aco) ;
        } 
        else{
            pin1 = DBobj2.KANARAReturnPin(aco) ;
        }
        String acostring = Integer.toString(aco) ;
        String pinstring = Integer.toString(pin1) ;
        Accno.setText(acostring);
        Cardno.setText("");
        PinArea.setText(pinstring) ;
       
        SUCCESS.setExtendedState(Frame.MAXIMIZED_BOTH);
        SUCCESS.setSize(550,400);
        FORM.setVisible(false);     
    }//GEN-LAST:event_ConfirmOkActionPerformed

    private void CongoContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CongoContActionPerformed
        SUCCESS.setVisible(false);
        OPS.setVisible(true);
        OPS.setExtendedState(Frame.MAXIMIZED_BOTH);
        OPS.setSize(820,300);
    }//GEN-LAST:event_CongoContActionPerformed

    private void NOTIFBACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOTIFBACKActionPerformed
        CONIFRM.setVisible(false);        
    }//GEN-LAST:event_NOTIFBACKActionPerformed

    private void WithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawActionPerformed
        WD.setVisible(true);
        WD.setExtendedState(Frame.MAXIMIZED_BOTH);
        WD.setSize(400,320);
        String Accc = Integer.toString(Account_Balance) ;
        //WDCBal set text to: balance before withdrawal.
        
        WDCBal.setText(Accc);
//        String m = WAmt.getText() ;
//        System.out.println(m) ;
//        wamount = Integer.parseInt(m);
//        
//        BasicOp ob = new BasicOp();
//        ob.withdraw(Account_Balance,wamount,Account_No,var) ;
       
    }//GEN-LAST:event_WithdrawActionPerformed

    private void backmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backmenuActionPerformed
        OPS.setVisible(false);
    }//GEN-LAST:event_backmenuActionPerformed

    private void DepOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepOkActionPerformed
        DEP.setVisible(false);
        String n = DepAmt.getText();
        System.out.println(n);
        damount = Integer.parseInt(n);
        BasicOp ob1 = new BasicOp();
        System.out.println("Manas :" + damount);
        ob1.deposit(Account_Balance,damount,Account_No,var) ;
        
        
        //Get text: this.damount, convert into int/float
        
    }//GEN-LAST:event_DepOkActionPerformed

    private void DCBalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DCBalActionPerformed
    }//GEN-LAST:event_DCBalActionPerformed

    private void DepAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepAmtActionPerformed

    }//GEN-LAST:event_DepAmtActionPerformed

    private void DepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositActionPerformed
        DEP.setVisible(true);
        DEP.setExtendedState(Frame.MAXIMIZED_BOTH);
        DEP.setSize(520,325);
        
        String Accc = Integer.toString(Account_Balance);
        //DCBal set text to: balance before deposit.
        DCBal.setText(Accc);
//        BasicOp ob1 = new BasicOp();
//        System.out.println("Manas :" + this.damount);
//        ob1.deposit(Account_Balance,this.damount,Account_No,var) ;
    }//GEN-LAST:event_DepositActionPerformed

    private void AcEnqOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcEnqOkActionPerformed
        ACCENQ.setVisible(false);        
    }//GEN-LAST:event_AcEnqOkActionPerformed

    private void ContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueActionPerformed
        BANK.setVisible(true);
        BANK.setSize(1200,490);
    }//GEN-LAST:event_ContinueActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

        if(jCheckBox1.isSelected()){
            Continue.setText("Continue");
        }
        else{
            Continue.setText("");

        }

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
       
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void BalEnqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalEnqActionPerformed
        ACCENQ.setVisible(true);
        ACCENQ.setExtendedState(Frame.MAXIMIZED_BOTH);
        ACCENQ.setSize(725,655);
        Frame obj3 = new Frame() ;
        DBConnect obj2 = new DBConnect() ;
        if(var == 1){
           obj3 =  obj2.CBIReturn_Details(Account_No) ;
        }
        if(var == 2){
            obj3 = obj2.ISISIReturn_Details(Account_No);
        }
        if(var == 3){
            obj3 = obj2.KANARAReturn_Details(Account_No) ;
        }
        
        String acno,mobno,dno,acbo;
        acno = Long.toString(Account_No);
        System.out.println("Mobile : " + obj3.Number);
        mobno = Long.toString(obj3.Number);
        System.out.println("Mobile : " + obj3.Debit_No);
        dno = Long.toString(obj3.Debit_No);
        acbo = Integer.toString(obj3.Account_Balance);
        String add = obj3.FName + obj3.MName + obj3.LName ;
//        acu = acbo;
        jTextField1.setText(acno);
        jTextField3.setText(dno);
        jTextField4.setText(mobno) ;
        jTextField2.setText(add);
        jTextArea2.setText(obj3.Address1);
        jTextField5.setText(acbo) ;
        //set text account details.
        
        
    }//GEN-LAST:event_BalEnqActionPerformed

    private void VehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VehicleActionPerformed
        LOAN.setVisible(true);
        LOAN.setSize(870,570); 
        var1 = 1; 
    }//GEN-LAST:event_VehicleActionPerformed

    private void TimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeActionPerformed
        String temp=Time.getText();
        //convert temp into int = this.time
    }//GEN-LAST:event_TimeActionPerformed

    private void LoanBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoanBackActionPerformed
         OPTIONS.setVisible(false);
    }//GEN-LAST:event_LoanBackActionPerformed

    private void LoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoanActionPerformed
           OPTIONS.setVisible(true);
           OPTIONS.setSize(861,251);
           
    }//GEN-LAST:event_LoanActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        LOAN.setVisible(true);
        LOAN.setSize(870,570); 
        var1 = 2 ;
    }//GEN-LAST:event_HomeActionPerformed

    private void SubmitLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitLoanActionPerformed
        String temp=LoanAmt.getText();
        int LAmt=Integer.parseInt(temp);
        String temp1=Time.getText();       
        int LTime=Integer.parseInt(temp1); 
        double re =0.0;
        if (var == 1){
            CBI op = new CBI();
             re = op.decide(LAmt,LTime,var1);
        }
        if (var == 2){
            ISISI op1 = new ISISI();
             re = op1.decide(LAmt,LTime,var1);
        }
        if (var == 3){
            KANARA op2 = new KANARA();
             re = op2.decide(LAmt,LTime,var1);
            
        }
        String fl;
        fl = Double.toString(re);
        FinalAmt.setText(fl);
        
        
        //declare as global
        //calculate the loan
        //if statements, pop error; else set text FinalAmt. 
        //eRROR.setVisible(true);
        //eRROR.setSize(600,363);
        //jLabel26.setText("NOT ENOUGH BALANCE!");
    }//GEN-LAST:event_SubmitLoanActionPerformed

    private void EducationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EducationActionPerformed
        LOAN.setVisible(true);
        LOAN.setSize(870,570);
        var1 = 3 ;
    }//GEN-LAST:event_EducationActionPerformed

    private void LOANBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOANBackActionPerformed
        LOAN.setVisible(false);        
    }//GEN-LAST:event_LOANBackActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        OPS.setVisible(false);               
    }//GEN-LAST:event_LogoutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        WD.setVisible(false);
        String m = WAmt.getText() ;
        System.out.println(m) ;
        wamount = Integer.parseInt(m);
        
//        BasicOp ob = new BasicOp();
//        ob.withdraw(Account_Balance,wamount,Account_No,var) ;
        // Convert to int or float = this.wamount
        //Use wamount for calculating your withdraw condtions.
        //else pop error: eRROR 
        if( wamount > Account_Balance ){
        eRROR.setVisible(true);
        eRROR.setSize(600,363);
        jLabel26.setText("NOT ENOUGH BALANCE!");}
        else{
        BasicOp ob = new BasicOp();
        ob.withdraw(Account_Balance,wamount,Account_No,var) ;
    }//GEN-LAST:event_jButton1ActionPerformed   
        }

    private void WAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WAmtActionPerformed
        String t=WAmt.getText();
        // Convert to int or float = this.wamount
    }//GEN-LAST:event_WAmtActionPerformed

    private void WDCBalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WDCBalActionPerformed
        
    }//GEN-LAST:event_WDCBalActionPerformed

    private void SubDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubDepActionPerformed
          //get text from DepAmt, convert and use for conditions.
          //Display current balance: After deposit.
    }//GEN-LAST:event_SubDepActionPerformed

    
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

         Frame obj = new Frame();
        /* Create and display the form */
//        Frame n = new Frame() ;
//        DBConnect obh = new DBConnect();
//        obh.CBIInsert(n) ;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 obj.setVisible(true);
                //new Frame().setExtendedState(Frame.MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame ACCENQ;
    private javax.swing.JTextField ACCNO;
    private javax.swing.JFrame ACCOUNT;
    private javax.swing.JButton AcEnqOk;
    private javax.swing.JTextField Accno;
    private javax.swing.JFrame BANK;
    private javax.swing.JButton BalEnq;
    private javax.swing.JButton CBI;
    private javax.swing.JFrame CONIFRM;
    private javax.swing.JTextField Cardno;
    private javax.swing.JTextField City;
    private javax.swing.JButton ConfirmOk;
    private javax.swing.JButton CongoCont;
    private javax.swing.JButton Continue;
    private javax.swing.JTextField DCBal;
    private javax.swing.JFrame DEP;
    private javax.swing.JTextField DOB;
    private javax.swing.JTextField DepAmt;
    private javax.swing.JButton DepOk;
    private javax.swing.JButton Deposit;
    private javax.swing.JButton DetailsOk;
    private javax.swing.JTextField District;
    private javax.swing.JButton Education;
    private javax.swing.JTextField FN;
    private javax.swing.JFrame FORM;
    private javax.swing.JTextField FinalAmt;
    private javax.swing.JButton Home;
    private javax.swing.JButton ISISI;
    private javax.swing.JButton KANARA;
    private javax.swing.JTextField LN;
    private javax.swing.JFrame LOAN;
    private javax.swing.JButton LOANBack;
    private javax.swing.JFrame LOGINPAGE;
    private javax.swing.JTextField Line1;
    private javax.swing.JTextField Line2;
    private javax.swing.JButton Loan;
    private javax.swing.JTextField LoanAmt;
    private javax.swing.JButton LoanBack;
    private javax.swing.JButton Login;
    private javax.swing.JButton LoginOk;
    private javax.swing.JButton Logout;
    private javax.swing.JTextField MAIL;
    private javax.swing.JTextField MN;
    private javax.swing.JTextField MOBILENO;
    private javax.swing.JButton NOTIFBACK;
    private javax.swing.JFrame OPS;
    private javax.swing.JFrame OPTIONS;
    private javax.swing.JPasswordField PSWD;
    private javax.swing.JTextField Pin;
    private javax.swing.JTextField PinArea;
    private javax.swing.JButton Register;
    private javax.swing.JFrame SUCCESS;
    private javax.swing.JComboBox<String> State;
    private javax.swing.JButton SubDep;
    private javax.swing.JButton SubmitLoan;
    private javax.swing.JTextField Time;
    private javax.swing.JButton Vehicle;
    private javax.swing.JTextField WAmt;
    private javax.swing.JFrame WD;
    private javax.swing.JTextField WDCBal;
    private javax.swing.JButton Withdraw;
    private javax.swing.JButton backmenu;
    private javax.swing.JDialog eRROR;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane10;
    private javax.swing.JDesktopPane jDesktopPane11;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JDesktopPane jDesktopPane5;
    private javax.swing.JDesktopPane jDesktopPane6;
    private javax.swing.JDesktopPane jDesktopPane7;
    private javax.swing.JDesktopPane jDesktopPane8;
    private javax.swing.JDesktopPane jDesktopPane9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}