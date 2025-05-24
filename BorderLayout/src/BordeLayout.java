public class BordeLayout extends javax.swing.JFrame {

    public BordeLayout() {
        initComponents();
        setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelDatos = new javax.swing.JPanel();
        panelEtiqueta1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        panelCuadro1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        panelEtiqueta2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        panelCuadro2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        panelEstado = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelVerificacion = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        paaanelBotonera = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ejercicio de distribucion de paneles y Layout");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelTitulo.add(jLabel1);

        jLabel2.setText("Por Fulanito Perez");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelTitulo.add(jLabel2);

        getContentPane().add(panelTitulo, java.awt.BorderLayout.PAGE_START);

        panelDatos.setLayout(new java.awt.GridLayout(2, 2));

        jLabel6.setText("Dato1:");

        javax.swing.GroupLayout panelEtiqueta1Layout = new javax.swing.GroupLayout(panelEtiqueta1);
        panelEtiqueta1.setLayout(panelEtiqueta1Layout);
        panelEtiqueta1Layout.setHorizontalGroup(
            panelEtiqueta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEtiqueta1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        panelEtiqueta1Layout.setVerticalGroup(
            panelEtiqueta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEtiqueta1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel6)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        panelDatos.add(panelEtiqueta1);

        javax.swing.GroupLayout panelCuadro1Layout = new javax.swing.GroupLayout(panelCuadro1);
        panelCuadro1.setLayout(panelCuadro1Layout);
        panelCuadro1Layout.setHorizontalGroup(
            panelCuadro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuadro1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCuadro1Layout.setVerticalGroup(
            panelCuadro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuadro1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        panelDatos.add(panelCuadro1);

        jLabel7.setText("Dato2:");

        javax.swing.GroupLayout panelEtiqueta2Layout = new javax.swing.GroupLayout(panelEtiqueta2);
        panelEtiqueta2.setLayout(panelEtiqueta2Layout);
        panelEtiqueta2Layout.setHorizontalGroup(
            panelEtiqueta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEtiqueta2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel7)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        panelEtiqueta2Layout.setVerticalGroup(
            panelEtiqueta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEtiqueta2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        panelDatos.add(panelEtiqueta2);

        javax.swing.GroupLayout panelCuadro2Layout = new javax.swing.GroupLayout(panelCuadro2);
        panelCuadro2.setLayout(panelCuadro2Layout);
        panelCuadro2Layout.setHorizontalGroup(
            panelCuadro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuadro2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCuadro2Layout.setVerticalGroup(
            panelCuadro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuadro2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelDatos.add(panelCuadro2);

        getContentPane().add(panelDatos, java.awt.BorderLayout.CENTER);

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout panelEstadoLayout = new javax.swing.GroupLayout(panelEstado);
        panelEstado.setLayout(panelEstadoLayout);
        panelEstadoLayout.setHorizontalGroup(
            panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstadoLayout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(50, 50, 50))
        );
        panelEstadoLayout.setVerticalGroup(
            panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstadoLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27))
        );

        getContentPane().add(panelEstado, java.awt.BorderLayout.PAGE_END);

        panelVerificacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox1.setText("jCheckBox1");
        panelVerificacion.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jCheckBox2.setText("jCheckBox2");
        panelVerificacion.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        jCheckBox3.setText("jCheckBox3");
        panelVerificacion.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jCheckBox4.setText("jCheckBox4");
        panelVerificacion.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, 20));

        getContentPane().add(panelVerificacion, java.awt.BorderLayout.LINE_END);

        paaanelBotonera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("jButton1");
        paaanelBotonera.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jButton2.setText("jButton2");
        paaanelBotonera.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jButton3.setText("jButton3");
        paaanelBotonera.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jButton4.setText("jButton4");
        paaanelBotonera.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        getContentPane().add(paaanelBotonera, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BordeLayout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel paaanelBotonera;
    private javax.swing.JPanel panelCuadro1;
    private javax.swing.JPanel panelCuadro2;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelEstado;
    private javax.swing.JPanel panelEtiqueta1;
    private javax.swing.JPanel panelEtiqueta2;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JPanel panelVerificacion;
    // End of variables declaration//GEN-END:variables
}
