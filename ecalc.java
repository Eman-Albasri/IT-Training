package mycalculator;
public class ecalc extends javax.swing.JFrame {
     double num1, num2, result;
     char operation;
     String Oper;
     int ra,n1,n2;        
     private Object math;
public ecalc() {
        initComponents();
    }
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtDisplay = new javax.swing.JTextField();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnmulti = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnsub = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btnPN = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btndot = new javax.swing.JButton();
        btnequal = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnClearEntry = new javax.swing.JButton();
        btnPercent = new javax.swing.JButton();
        btndiv = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnSin = new javax.swing.JButton();
        btncsc = new javax.swing.JButton();
        btnTan = new javax.swing.JButton();
        btncot = new javax.swing.JButton();
        btncos = new javax.swing.JButton();
        btnsec = new javax.swing.JButton();
        btnlog = new javax.swing.JButton();
        btnTan2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnHex = new javax.swing.JRadioButton();
        btnDec = new javax.swing.JRadioButton();
        btnOct = new javax.swing.JRadioButton();
        btnBin = new javax.swing.JRadioButton();
        btnA = new javax.swing.JButton();
        dectxt = new javax.swing.JTextField();
        Hextxt = new javax.swing.JTextField();
        octtxt = new javax.swing.JTextField();
        bintxt = new javax.swing.JTextField();
        btnB = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnNand = new javax.swing.JButton();
        btnNor = new javax.swing.JButton();
        btnxor = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnAnd = new javax.swing.JButton();
        btnOr = new javax.swing.JButton();
        btnNot = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jtxtDisplay.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jtxtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btn7.setBackground(new java.awt.Color(255, 255, 255));
        btn7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(255, 255, 255));
        btn8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(255, 255, 255));
        btn9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnmulti.setBackground(new java.awt.Color(255, 255, 255));
        btnmulti.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnmulti.setText("x");
        btnmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(255, 255, 255));
        btn4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(255, 255, 255));
        btn5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(255, 255, 255));
        btn6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnsub.setBackground(new java.awt.Color(255, 255, 255));
        btnsub.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnsub.setText("-");
        btnsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(255, 255, 255));
        btn1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(255, 255, 255));
        btn3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnadd.setBackground(new java.awt.Color(255, 255, 255));
        btnadd.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnadd.setText("+");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnPN.setBackground(new java.awt.Color(255, 255, 255));
        btnPN.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnPN.setText("+/-");
        btnPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPNActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(255, 255, 255));
        btn0.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btndot.setBackground(new java.awt.Color(255, 255, 255));
        btndot.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btndot.setText(".");
        btndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndotActionPerformed(evt);
            }
        });

        btnequal.setBackground(new java.awt.Color(255, 255, 255));
        btnequal.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnequal.setText("=");
        btnequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnequalActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(255, 255, 255));
        btnClear.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnClear.setText("C");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnClearEntry.setBackground(new java.awt.Color(255, 255, 255));
        btnClearEntry.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnClearEntry.setText("CE");
        btnClearEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearEntryActionPerformed(evt);
            }
        });

        btnPercent.setBackground(new java.awt.Color(255, 255, 255));
        btnPercent.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnPercent.setText("%");
        btnPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPercentActionPerformed(evt);
            }
        });

        btndiv.setBackground(new java.awt.Color(255, 255, 255));
        btndiv.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btndiv.setText("/");
        btndiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivActionPerformed(evt);
            }
        });

        btnSin.setBackground(new java.awt.Color(255, 255, 255));
        btnSin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSin.setText("Sin");
        btnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinActionPerformed(evt);
            }
        });

        btncsc.setBackground(new java.awt.Color(255, 255, 255));
        btncsc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btncsc.setText("Sinh");
        btncsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncscActionPerformed(evt);
            }
        });

        btnTan.setBackground(new java.awt.Color(255, 255, 255));
        btnTan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTan.setText("Tan");
        btnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanActionPerformed(evt);
            }
        });

        btncot.setBackground(new java.awt.Color(255, 255, 255));
        btncot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btncot.setText("Tanh");
        btncot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncotActionPerformed(evt);
            }
        });

        btncos.setBackground(new java.awt.Color(255, 255, 255));
        btncos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btncos.setText("Cos");
        btncos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncosActionPerformed(evt);
            }
        });

        btnsec.setBackground(new java.awt.Color(255, 255, 255));
        btnsec.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnsec.setText("Cosh");
        btnsec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsecActionPerformed(evt);
            }
        });

        btnlog.setBackground(new java.awt.Color(255, 255, 255));
        btnlog.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnlog.setText("Log");
        btnlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogActionPerformed(evt);
            }
        });

        btnTan2.setBackground(new java.awt.Color(255, 255, 255));
        btnTan2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTan2.setText("√");
        btnTan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTan2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btncsc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btncos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnsec, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btncot, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnlog, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTan2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncsc, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsec, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncot, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlog, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTan2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Scientific", jPanel1);

        btnHex.setText("HEX");
        btnHex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHexActionPerformed(evt);
            }
        });

        btnDec.setText("DEC");
        btnDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecActionPerformed(evt);
            }
        });

        btnOct.setText("OCT");
        btnOct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOctActionPerformed(evt);
            }
        });

        btnBin.setText("BIN");
        btnBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBinActionPerformed(evt);
            }
        });

        btnA.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnA.setText("A");
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });

        bintxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bintxtActionPerformed(evt);
            }
        });

        btnB.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnB.setText("B");
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });

        btnC.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnNand.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNand.setText("NAND");
        btnNand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNandActionPerformed(evt);
            }
        });

        btnNor.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnNor.setText("NOR");
        btnNor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNorActionPerformed(evt);
            }
        });

        btnxor.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnxor.setText("XOR");
        btnxor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxorActionPerformed(evt);
            }
        });

        btnD.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnD.setText("D");
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });

        btnE.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnE.setText("E");
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });

        btnF.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnF.setText("F");
        btnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFActionPerformed(evt);
            }
        });

        btnAnd.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnAnd.setText("AND");
        btnAnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndActionPerformed(evt);
            }
        });

        btnOr.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnOr.setText("OR");
        btnOr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrActionPerformed(evt);
            }
        });

        btnNot.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnNot.setText("NOT");
        btnNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnDec)
                        .addGap(18, 18, 18)
                        .addComponent(dectxt, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnHex)
                        .addGap(18, 18, 18)
                        .addComponent(Hextxt, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnOct)
                        .addGap(18, 18, 18)
                        .addComponent(octtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBin)
                        .addGap(24, 24, 24)
                        .addComponent(bintxt, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAnd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOr, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNot, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNand, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNor, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnxor, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHex)
                    .addComponent(Hextxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dectxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(octtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOct))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bintxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBin))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnF, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOr, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNot, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNand, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNor, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxor, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Programmer", jPanel2);

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Standard");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Scientific");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Programmer");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClearEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndiv, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsub, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnmulti, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPN, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndot, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnequal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClearEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndiv, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnmulti, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsub, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPN, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndot, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnequal, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTabbedPane1))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void setOperation (char oper){
       num1=Double.parseDouble(jtxtDisplay.getText());
       jtxtDisplay.setText(" ");
       operation= oper;
    }
     
     private void setOper (String ope){
       num1=Integer.parseInt(jtxtDisplay.getText());
       jtxtDisplay.setText(" ");
       Oper= ope;
    }

    /**
     *
     */
  
     
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setResizable(true);
        this.setSize(425, 570);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
       String inum= jtxtDisplay.getText()+ btn3.getText();
        jtxtDisplay.setText(inum);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
       String inum= jtxtDisplay.getText()+ btn5.getText();
        jtxtDisplay.setText(inum);
    }//GEN-LAST:event_btn5ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setResizable(true);
        this.setSize(425, 570);
    }//GEN-LAST:event_formWindowActivated

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
         this.setResizable(true);
        this.setSize(800, 570);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        String inum= jtxtDisplay.getText()+ btn9.getText();
        jtxtDisplay.setText(inum);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPNActionPerformed
        double num= Double.parseDouble(jtxtDisplay.getText());
        num = num*(-1);
        jtxtDisplay.setText(String.valueOf(num));
    }//GEN-LAST:event_btnPNActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
      
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        String inum= jtxtDisplay.getText()+ btn7.getText();
        jtxtDisplay.setText(inum);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        String inum= jtxtDisplay.getText()+ btn8.getText();
        jtxtDisplay.setText(inum);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        String inum= jtxtDisplay.getText()+ btn6.getText();
        jtxtDisplay.setText(inum);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
       String inum= jtxtDisplay.getText()+ btn4.getText();
       jtxtDisplay.setText(inum);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        String inum= jtxtDisplay.getText()+ btn1.getText();
        jtxtDisplay.setText(inum);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        String inum= jtxtDisplay.getText()+ btn2.getText();
        jtxtDisplay.setText(inum);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
       String inum= jtxtDisplay.getText()+ btn0.getText();
        jtxtDisplay.setText(inum);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        jtxtDisplay.setText(" ");
        Hextxt.setText(" ");
        dectxt.setText(" ");
        bintxt.setText(" ");
        octtxt.setText(" ");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnClearEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearEntryActionPerformed
       String bsp=null;
       if (jtxtDisplay.getText().length()>0){
           StringBuilder strb =new StringBuilder(jtxtDisplay.getText());
           strb.deleteCharAt(jtxtDisplay.getText().length()-1);
           bsp=strb.toString();
           jtxtDisplay.setText(bsp);
       }
    }//GEN-LAST:event_btnClearEntryActionPerformed

    private void btndotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndotActionPerformed
       String inum= jtxtDisplay.getText()+ btndot.getText();
        jtxtDisplay.setText(inum);
    }//GEN-LAST:event_btndotActionPerformed

    private void btnequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnequalActionPerformed
        num2=Double.parseDouble(jtxtDisplay.getText());
        switch(operation){
            case '+':result=num1 +num2; break;
            case '-':result=num1 -num2; break;
            case '*':result=num1 *num2; break;
            case '/':result=num1 /num2; break;
            case '%':result=num1%num2; break;
            
        }
        jtxtDisplay.setText(String.valueOf(result));
        n2=Integer.parseInt(jtxtDisplay.getText());
        if(Oper=="&"){
           ra=n1&n2; 
           jtxtDisplay.setText(String.valueOf(ra));
        }
        if(Oper=="|"){
           ra=n1|n2; 
           jtxtDisplay.setText(String.valueOf(ra));
        }
        if(Oper=="^"){
           ra=n1^n2; 
           jtxtDisplay.setText(String.valueOf(ra));
        }
        if(Oper=="~"){
           ra=~n1; 
           jtxtDisplay.setText(String.valueOf(ra));
        }
        if(Oper=="M>"){
           ra=~(n1|n2); 
           jtxtDisplay.setText(String.valueOf(ra));
        }
        if(Oper=="l."){
           ra=~(n1&n2); 
           jtxtDisplay.setText(String.valueOf(ra));
        }
    }//GEN-LAST:event_btnequalActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        setOperation('+');
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubActionPerformed
       setOperation('-');
    }//GEN-LAST:event_btnsubActionPerformed

    private void btnmultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiActionPerformed
        setOperation('*');
    }//GEN-LAST:event_btnmultiActionPerformed

    private void btndivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivActionPerformed
        setOperation('/');
    }//GEN-LAST:event_btndivActionPerformed

    private void btnPercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPercentActionPerformed
       setOperation('%');
    }//GEN-LAST:event_btnPercentActionPerformed

    private void btnOctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOctActionPerformed
         String s=jtxtDisplay.getText();
       int i =Integer.parseInt(s);
       String ss =Integer.toOctalString(i);
       jtxtDisplay.setText(ss);
       
       String ms=jtxtDisplay.getText();
       int ii =Integer.parseInt(ms);
       String so =Integer.toHexString(ii);
       Hextxt.setText(so);
       
       int id= Integer.parseInt(jtxtDisplay.getText());
       dectxt.setText(String.valueOf(i));
       
       String sb = jtxtDisplay.getText();
       int ise =Integer.parseInt(s);
       String cs =Integer.toBinaryString(i);
       bintxt.setText(cs);
       
       String sw = jtxtDisplay.getText();
       int ir =Integer.parseInt(s);
       String su =Integer.toOctalString(i);
       octtxt.setText(su);
    }//GEN-LAST:event_btnOctActionPerformed

    private void btnHexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHexActionPerformed

       String ms=jtxtDisplay.getText();
       int ii =Integer.parseInt(ms);
       String so =Integer.toHexString(ii);
       Hextxt.setText(so);
       
       int id= Integer.parseInt(jtxtDisplay.getText());
       dectxt.setText(String.valueOf(id));
       
       String sb = jtxtDisplay.getText();
       int ise =Integer.parseInt(sb);
       String cs =Integer.toBinaryString(ise);
       bintxt.setText(cs);
       
       String sw = jtxtDisplay.getText();
       int ir =Integer.parseInt(sw);
       String su =Integer.toOctalString(ir);
       octtxt.setText(su);
    }//GEN-LAST:event_btnHexActionPerformed

    private void btnTan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTan2ActionPerformed
        double ops=Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops=Math.sqrt(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_btnTan2ActionPerformed

    private void btnlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogActionPerformed
        double ops=Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops=Math.log10(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_btnlogActionPerformed

    private void btnsecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsecActionPerformed
        double ops=Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops=Math.toRadians(ops);
        ops=Math.cosh(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_btnsecActionPerformed

    private void btncosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncosActionPerformed
        double ops=Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops=Math.toRadians(ops);
        ops=Math.cos(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_btncosActionPerformed

    private void btncotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncotActionPerformed
        double ops=Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops=Math.toRadians(ops);
        ops=Math.tanh(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_btncotActionPerformed

    private void btncscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncscActionPerformed
        double ops=Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops=Math.toRadians(ops);
        ops=Math.sinh(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_btncscActionPerformed

    private void btnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinActionPerformed
        double ops=Double.parseDouble(jtxtDisplay.getText());
        ops=Math.toRadians(ops);
        ops=Math.sin(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_btnSinActionPerformed

    private void btnBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBinActionPerformed
        String s=jtxtDisplay.getText();
       int i =Integer.parseInt(s);
       String ss =Integer.toBinaryString(i);
       jtxtDisplay.setText(ss);
       
       String bbbs=jtxtDisplay.getText();
       int bi =Integer.parseInt(bbbs);
       String sbs =Integer.toOctalString(bi);
       jtxtDisplay.setText(sbs);
       
       String ms=jtxtDisplay.getText();
       int ii =Integer.parseInt(ms);
       String so =Integer.toHexString(ii);
       Hextxt.setText(so);
       
       int id= Integer.parseInt(jtxtDisplay.getText());
       dectxt.setText(String.valueOf(i));
       
       String sb = jtxtDisplay.getText();
       int ise =Integer.parseInt(s);
       String cs =Integer.toBinaryString(i);
       bintxt.setText(cs);
       
       String sw = jtxtDisplay.getText();
       int ir =Integer.parseInt(s);
       String su =Integer.toOctalString(i);
       octtxt.setText(su);
       
    }//GEN-LAST:event_btnBinActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
          this.setResizable(true);
        this.setSize(800, 570);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
       String ialph= jtxtDisplay.getText();
       btnA.setText("A");
       jtxtDisplay.setText("10");
    }//GEN-LAST:event_btnAActionPerformed

    private void btnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTanActionPerformed
        double ops=Double.parseDouble(jtxtDisplay.getText());
        ops=Math.toRadians(ops);
        ops=Math.tan(ops);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_btnTanActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
       String ialph= jtxtDisplay.getText();
       btnB.setText("B");
       jtxtDisplay.setText("11");
    }//GEN-LAST:event_btnBActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
       String ialph= jtxtDisplay.getText();
       btnC.setText("C");
       jtxtDisplay.setText("12");
    }//GEN-LAST:event_btnCActionPerformed

    private void btnNandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNandActionPerformed
       setOper("l.");
    }//GEN-LAST:event_btnNandActionPerformed

    private void btnNorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNorActionPerformed
        setOper("M>");
    }//GEN-LAST:event_btnNorActionPerformed

    private void btnxorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxorActionPerformed
       setOper("^");
    }//GEN-LAST:event_btnxorActionPerformed

    private void btnOrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrActionPerformed
        setOper("|");
    }//GEN-LAST:event_btnOrActionPerformed

    private void btnAndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndActionPerformed
         setOper("&");
    }//GEN-LAST:event_btnAndActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        String ialph= jtxtDisplay.getText();
       btnD.setText("D");
       jtxtDisplay.setText("13");
    }//GEN-LAST:event_btnDActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
         String ialph= jtxtDisplay.getText();
       btnE.setText("E");
       jtxtDisplay.setText("14");
    }//GEN-LAST:event_btnEActionPerformed

    private void btnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFActionPerformed
       String ialph= jtxtDisplay.getText();
       btnF.setText("F");
       jtxtDisplay.setText("15");
    }//GEN-LAST:event_btnFActionPerformed

    private void btnNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotActionPerformed
       setOper("~");
    }//GEN-LAST:event_btnNotActionPerformed

    private void bintxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bintxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bintxtActionPerformed

    private void btnDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecActionPerformed
        String s=jtxtDisplay.getText();
       int i =Integer.parseInt(s);
       jtxtDisplay.setText(String.valueOf(i));
       
       String ds=jtxtDisplay.getText();
       int di =Integer.parseInt(ds);
       String ss =Integer.toOctalString(di);
       jtxtDisplay.setText(ss);
       
       String ms=jtxtDisplay.getText();
       int ii =Integer.parseInt(ms);
       String so =Integer.toHexString(ii);
       Hextxt.setText(so);
       
       int id= Integer.parseInt(jtxtDisplay.getText());
       dectxt.setText(String.valueOf(i));
       
       String sb = jtxtDisplay.getText();
       int ise =Integer.parseInt(s);
       String cs =Integer.toBinaryString(i);
       bintxt.setText(cs);
       
       String sw = jtxtDisplay.getText();
       int ir =Integer.parseInt(s);
       String su =Integer.toOctalString(i);
       octtxt.setText(su);
    }//GEN-LAST:event_btnDecActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ecalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Hextxt;
    private javax.swing.JTextField bintxt;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnAnd;
    private javax.swing.JButton btnB;
    private javax.swing.JRadioButton btnBin;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearEntry;
    private javax.swing.JButton btnD;
    private javax.swing.JRadioButton btnDec;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnF;
    private javax.swing.JRadioButton btnHex;
    private javax.swing.JButton btnNand;
    private javax.swing.JButton btnNor;
    private javax.swing.JButton btnNot;
    private javax.swing.JRadioButton btnOct;
    private javax.swing.JButton btnOr;
    private javax.swing.JButton btnPN;
    private javax.swing.JButton btnPercent;
    private javax.swing.JButton btnSin;
    private javax.swing.JButton btnTan;
    private javax.swing.JButton btnTan2;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btncos;
    private javax.swing.JButton btncot;
    private javax.swing.JButton btncsc;
    private javax.swing.JButton btndiv;
    private javax.swing.JButton btndot;
    private javax.swing.JButton btnequal;
    private javax.swing.JButton btnlog;
    private javax.swing.JButton btnmulti;
    private javax.swing.JButton btnsec;
    private javax.swing.JButton btnsub;
    private javax.swing.JButton btnxor;
    private javax.swing.JTextField dectxt;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jtxtDisplay;
    private javax.swing.JTextField octtxt;
    // End of variables declaration//GEN-END:variables
}
