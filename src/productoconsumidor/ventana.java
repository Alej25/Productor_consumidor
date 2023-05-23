/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package productoconsumidor;

import javax.swing.JLabel;

/**
 *
 * @author jorge
 */
public class ventana extends javax.swing.JFrame {

    /**
     * Creates new form ventana
     */
    public ventana() {
        initComponents();
        botella1.setVisible(false);
        botella2.setVisible (false);
        botella3. setVisible(false);
        botella4.setVisible (false);
        botella5.setVisible(false);
        botella6.setVisible(false);
        
        this.setLocationRelativeTo(null);
        this.setTitle("Productor & Consumidor" );
    }
    
    public JLabel getPrincipal(){
       return Principal;
    }
    public JLabel getBarman(){
      return Barman;
    }
    public JLabel getBarra(){
      return Barra;
    }
    public JLabel getBarril(){
      return Barril;
    }
    public JLabel getBotella1(){
     return botella1;
    } 
    public JLabel getBotella2(){
     return botella2;
    }
    public JLabel getBotella3(){
     return botella3;
    }
    public JLabel getBotella4(){
     return botella4;
    }
    public JLabel getBotella5(){
     return botella5;
    }
    public JLabel getBotella6(){
     return botella6;
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        estantevacio = new javax.swing.JLabel();
        estantelleno2 = new javax.swing.JLabel();
        botella1 = new javax.swing.JLabel();
        botella2 = new javax.swing.JLabel();
        botella3 = new javax.swing.JLabel();
        botella4 = new javax.swing.JLabel();
        botella5 = new javax.swing.JLabel();
        botella6 = new javax.swing.JLabel();
        Barril = new javax.swing.JLabel();
        barrilgrande2 = new javax.swing.JLabel();
        Principal = new javax.swing.JLabel();
        Barra = new javax.swing.JLabel();
        Barman = new javax.swing.JLabel();
        vitrinallena1 = new javax.swing.JLabel();
        hombre2 = new javax.swing.JLabel();
        mesa2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        virinallena1 = new javax.swing.JLabel();
        mesa1 = new javax.swing.JLabel();
        Mujer1 = new javax.swing.JLabel();
        barrilacostado = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("INICIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 530, 120, 40));

        estantevacio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estantevacio.png"))); // NOI18N
        estantevacio.setText(" ");
        jPanel1.add(estantevacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        estantelleno2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anaquelleno.png"))); // NOI18N
        estantelleno2.setText("jLabel1");
        jPanel1.add(estantelleno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        botella1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botella5.png"))); // NOI18N
        botella1.setText(" ");
        jPanel1.add(botella1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        botella2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botella1.png"))); // NOI18N
        botella2.setText(" ");
        jPanel1.add(botella2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        botella3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botella1.png"))); // NOI18N
        botella3.setText(" ");
        jPanel1.add(botella3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        botella4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botella5.png"))); // NOI18N
        botella4.setText(" ");
        jPanel1.add(botella4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        botella5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botella5.png"))); // NOI18N
        botella5.setText(" ");
        jPanel1.add(botella5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        botella6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botella1.png"))); // NOI18N
        botella6.setText(" ");
        jPanel1.add(botella6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        Barril.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/barrilgrande.png"))); // NOI18N
        Barril.setText(" ");
        jPanel1.add(Barril, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        barrilgrande2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/barrilgrande.png"))); // NOI18N
        barrilgrande2.setText(" ");
        jPanel1.add(barrilgrande2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, -1, -1));

        Principal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hombre1.png"))); // NOI18N
        Principal.setText(" ");
        jPanel1.add(Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        Barra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mesaprincipal.png"))); // NOI18N
        Barra.setText(" ");
        jPanel1.add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 370, -1));

        Barman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mujer1.png"))); // NOI18N
        Barman.setText(" ");
        jPanel1.add(Barman, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        vitrinallena1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anaquelleno.png"))); // NOI18N
        vitrinallena1.setText(" ");
        jPanel1.add(vitrinallena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        hombre2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hombre2.png"))); // NOI18N
        hombre2.setText(" ");
        jPanel1.add(hombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, -1, -1));

        mesa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mesagrande.png"))); // NOI18N
        mesa2.setText(" ");
        jPanel1.add(mesa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/barrilacostado.png"))); // NOI18N
        jLabel1.setText(" ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 120, -1, -1));

        virinallena1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anaquelleno.png"))); // NOI18N
        virinallena1.setText(" ");
        jPanel1.add(virinallena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        mesa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mesagrande.png"))); // NOI18N
        mesa1.setText(" ");
        jPanel1.add(mesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 180, 140));

        Mujer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mujer_2.png"))); // NOI18N
        Mujer1.setText(" ");
        jPanel1.add(Mujer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, -1, -1));

        barrilacostado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo2.png"))); // NOI18N
        barrilacostado.setText(" ");
        jPanel1.add(barrilacostado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1000, 440));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/madera.png"))); // NOI18N
        jLabel7.setText(" ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 340, 170));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/madera.png"))); // NOI18N
        jLabel8.setText(" ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 170));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo2.png"))); // NOI18N
        jLabel9.setText(" ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/madera.png"))); // NOI18N
        jLabel10.setText(" ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 340, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     // System.out.println(Barman.getLocation().x);
      //System.out.println(Barman.getLocation().y);
      
      //System.out.println(Principal.getLocation().x);
     // System.out.println(Principal.getLocation().y);
      
      //System.out.println(Barra.getLocation().x);
      //System.out.println(Barra.getLocation().y);
        
    //   System.out.println(Mujer1.getLocation().x);
    
    JLabel[] botellas = new JLabel[6];
    
    botellas[0] = this.botella1;
    botellas[1] = this.botella2;
    botellas[2] = this.botella3;
    botellas[3] = this.botella4;
    botellas[4] = this.botella5;
    botellas[5] = this.botella6;
    
    
    Principal.setLocation(Principal.getLocation().x, Principal.getLocation().y);
    
        Buffer b = new Buffer (6, botellas);
     Productor p = new Productor(b);
     Consumidor c = new Consumidor(b);
     
     p.start();
     c.start();
     
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Barman;
    private javax.swing.JLabel Barra;
    private javax.swing.JLabel Barril;
    private javax.swing.JLabel Mujer1;
    private javax.swing.JLabel Principal;
    private javax.swing.JLabel barrilacostado;
    private javax.swing.JLabel barrilgrande2;
    private javax.swing.JLabel botella1;
    private javax.swing.JLabel botella2;
    private javax.swing.JLabel botella3;
    private javax.swing.JLabel botella4;
    private javax.swing.JLabel botella5;
    private javax.swing.JLabel botella6;
    private javax.swing.JLabel estantelleno2;
    private javax.swing.JLabel estantevacio;
    private javax.swing.JLabel hombre2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mesa1;
    private javax.swing.JLabel mesa2;
    private javax.swing.JLabel virinallena1;
    private javax.swing.JLabel vitrinallena1;
    // End of variables declaration//GEN-END:variables
}
