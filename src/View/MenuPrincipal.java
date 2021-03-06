/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.MenuPrincipalController;

/**
 *
 * @author Allef
 */
public class MenuPrincipal extends javax.swing.JFrame {
    private final MenuPrincipalController controller;

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.controller = new MenuPrincipalController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelFundoMenu = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemServico = new javax.swing.JMenuItem();
        jMenuItemUsuario = new javax.swing.JMenuItem();
        jMenuOperacao = new javax.swing.JMenu();
        jMenuItemAgenda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelFundoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/arthur-humeau-1344247-unsplash.jpg"))); // NOI18N

        jMenuCadastro.setText("Cadastro");

        jMenuItemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/man.png"))); // NOI18N
        jMenuItemCliente.setText("Cliente");
        jMenuCadastro.add(jMenuItemCliente);

        jMenuItemServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/blade.png"))); // NOI18N
        jMenuItemServico.setText("Serviço");
        jMenuCadastro.add(jMenuItemServico);

        jMenuItemUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/shaver.png"))); // NOI18N
        jMenuItemUsuario.setText("Usuario");
        jMenuCadastro.add(jMenuItemUsuario);

        jMenuBar.add(jMenuCadastro);

        jMenuOperacao.setText("Operação");

        jMenuItemAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/barbershop.png"))); // NOI18N
        jMenuItemAgenda.setText("Agenda");
        jMenuItemAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgendaActionPerformed(evt);
            }
        });
        jMenuOperacao.add(jMenuItemAgenda);

        jMenuBar.add(jMenuOperacao);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelFundoMenu)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelFundoMenu)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgendaActionPerformed
        this.controller.navegarParaAgenda();
    }//GEN-LAST:event_jMenuItemAgendaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelFundoMenu;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItemAgenda;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemServico;
    private javax.swing.JMenuItem jMenuItemUsuario;
    private javax.swing.JMenu jMenuOperacao;
    // End of variables declaration//GEN-END:variables
}
