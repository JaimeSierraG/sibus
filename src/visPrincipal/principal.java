/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visPrincipal;

import javax.swing.JFrame;
/**
 *
 * @author leninurbina
 */
public class principal extends javax.swing.JFrame {


    /**
     * Creates new form principal
     */
    
    public principal() {

        initComponents();  
    }

    private principal(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlMenuSecundario = new javax.swing.JPanel();
        pnlMenuPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SIBUS CONSULTING");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(118, 153, 131));
        pnlPrincipal.setName("pnlFondo"); // NOI18N
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMenuSecundario.setBackground(new java.awt.Color(37, 53, 40));
        pnlMenuSecundario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMenuSecundario.setName("pnlMenuSecundario"); // NOI18N

        javax.swing.GroupLayout pnlMenuSecundarioLayout = new javax.swing.GroupLayout(pnlMenuSecundario);
        pnlMenuSecundario.setLayout(pnlMenuSecundarioLayout);
        pnlMenuSecundarioLayout.setHorizontalGroup(
            pnlMenuSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 214, Short.MAX_VALUE)
        );
        pnlMenuSecundarioLayout.setVerticalGroup(
            pnlMenuSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
        );

        pnlPrincipal.add(pnlMenuSecundario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 220, 670));

        pnlMenuPrincipal.setBackground(new java.awt.Color(1, 1, 1));
        pnlMenuPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMenuPrincipal.setName("pnlMenu"); // NOI18N

        javax.swing.GroupLayout pnlMenuPrincipalLayout = new javax.swing.GroupLayout(pnlMenuPrincipal);
        pnlMenuPrincipal.setLayout(pnlMenuPrincipalLayout);
        pnlMenuPrincipalLayout.setHorizontalGroup(
            pnlMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1226, Short.MAX_VALUE)
        );
        pnlMenuPrincipalLayout.setVerticalGroup(
            pnlMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        pnlPrincipal.add(pnlMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1224, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
           new principal().setVisible(true);
            principal dialog = new principal(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });  
            dialog.setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel pnlMenuPrincipal;
    public javax.swing.JPanel pnlMenuSecundario;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables

/*
public JButton getBtnGuardar() {
        return BtnGuardar;
    }
public void setBtnGuardar(JButton bntGuardar) {
        this.BtnGuardar = bntGuardar;
    }
**/
}
