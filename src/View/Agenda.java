/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AgendaController;

/**
 *
 * @author Allef
 */
public class Agenda extends javax.swing.JFrame {
    private final AgendaController controller;

    /**
     * Creates new form Agenda
     */
    public Agenda() {
        initComponents();
        controller = new AgendaController(this);
        iniciar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObservacoes = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButtonAgendar = new javax.swing.JButton();
        jTextFieldHora = new javax.swing.JTextField();
        jTextFieldValor = new javax.swing.JTextField();
        jTextFieldData = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();
        jComboBoxServico = new javax.swing.JComboBox();
        jComboBoxCliente = new javax.swing.JComboBox();
        jLabelObservacoes = new javax.swing.JLabel();
        jLabelAgenda = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabelServico = new javax.swing.JLabel();
        jLabelCliente = new javax.swing.JLabel();
        jLabelValor = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jLabelAgendaPainel = new javax.swing.JLabel();
        jLabelFundoAgenda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextAreaObservacoes.setColumns(20);
        jTextAreaObservacoes.setRows(5);
        jScrollPane1.setViewportView(jTextAreaObservacoes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 460, 190));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Serviço", "Valor", "Data", "Hora", "Observação"
            }
        ));
        jScrollPane2.setViewportView(jTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 910, 280));

        jButtonAgendar.setBackground(new java.awt.Color(255, 51, 51));
        jButtonAgendar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonAgendar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgendar.setText("Agendar");
        jButtonAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 460, 30));

        jTextFieldHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHoraActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 260, -1));

        jTextFieldValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 260, -1));

        jTextFieldData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldData, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 260, -1));

        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 260, -1));

        jComboBoxServico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Allef", "Ana", "Conrado" }));
        jComboBoxServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxServicoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 260, 30));

        jComboBoxCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Allef", "Ana", "Conrado" }));
        jComboBoxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 260, 30));

        jLabelObservacoes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelObservacoes.setForeground(new java.awt.Color(255, 255, 255));
        jLabelObservacoes.setText("Observação");
        jLabelObservacoes.setToolTipText("Cliente");
        getContentPane().add(jLabelObservacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 70, 20));

        jLabelAgenda.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabelAgenda.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgenda.setText("Agenda");
        getContentPane().add(jLabelAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 180, -1));

        jLabelHora.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelHora.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHora.setText("Hora");
        jLabelHora.setToolTipText("Cliente");
        getContentPane().add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 40, 20));

        jLabelData.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelData.setForeground(new java.awt.Color(255, 255, 255));
        jLabelData.setText("Data");
        jLabelData.setToolTipText("Cliente");
        getContentPane().add(jLabelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 40, 20));

        jLabelServico.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelServico.setForeground(new java.awt.Color(255, 255, 255));
        jLabelServico.setText("Serviço");
        jLabelServico.setToolTipText("Cliente");
        getContentPane().add(jLabelServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 50, 20));

        jLabelCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCliente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCliente.setText("Cliente");
        jLabelCliente.setToolTipText("Cliente");
        getContentPane().add(jLabelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 40, 20));

        jLabelValor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelValor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValor.setText("Valor R$");
        jLabelValor.setToolTipText("Cliente");
        getContentPane().add(jLabelValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 50, 20));

        jLabelId.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelId.setForeground(new java.awt.Color(255, 255, 255));
        jLabelId.setText("ID");
        getContentPane().add(jLabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 20, -1));

        jLabelAgendaPainel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(jLabelAgendaPainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 1000, 630));

        jLabelFundoAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/photo-1534778356534-d3d45b6df1da.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHoraActionPerformed

    private void jComboBoxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxClienteActionPerformed

    private void jComboBoxServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxServicoActionPerformed

    private void jTextFieldValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorActionPerformed

    private void jTextFieldDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDataActionPerformed

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void jButtonAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAgendarActionPerformed

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgendar;
    private javax.swing.JComboBox jComboBoxCliente;
    private javax.swing.JComboBox jComboBoxServico;
    private javax.swing.JLabel jLabelAgenda;
    private javax.swing.JLabel jLabelAgendaPainel;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelFundoAgenda;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelObservacoes;
    private javax.swing.JLabel jLabelServico;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTextArea jTextAreaObservacoes;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldHora;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables

    private void iniciar() 
    {
        this.controller.atualizaTabela();
    }
}
