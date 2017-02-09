/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Apresentacao_Desktop;

/**
 *
 * @author dayvison
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal1
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuPrincipal = new javax.swing.JMenuBar();
        MenuCadastros = new javax.swing.JMenu();
        MenuEspecialidade = new javax.swing.JMenuItem();
        MenuFuncionarios = new javax.swing.JMenuItem();
        MenuMedicos = new javax.swing.JMenuItem();
        MenuPacientes = new javax.swing.JMenuItem();
        MenuTecEnfermagem = new javax.swing.JMenuItem();
        MenuUnidadeDeSaude = new javax.swing.JMenuItem();
        MenuConsultas = new javax.swing.JMenu();
        MenuFarmacia = new javax.swing.JMenu();
        MenuSairLogoff = new javax.swing.JMenu();
        MenuLogoff = new javax.swing.JMenuItem();
        MenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SGUBS-Sistema De Gerenciamento De Unidade Basíca De Saúde");

        MenuPrincipal.setName(""); // NOI18N

        MenuCadastros.setText("Cadastros");

        MenuEspecialidade.setText("Especialidades");
        MenuEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuEspecialidadeActionPerformed(evt);
            }
        });
        MenuCadastros.add(MenuEspecialidade);

        MenuFuncionarios.setText("Funcionários");
        MenuFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFuncionariosActionPerformed(evt);
            }
        });
        MenuCadastros.add(MenuFuncionarios);

        MenuMedicos.setText("Medicos");
        MenuMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMedicosActionPerformed(evt);
            }
        });
        MenuCadastros.add(MenuMedicos);

        MenuPacientes.setText("Pacientes");
        MenuPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPacientesActionPerformed(evt);
            }
        });
        MenuCadastros.add(MenuPacientes);

        MenuTecEnfermagem.setText("Téc Enfermagem");
        MenuTecEnfermagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuTecEnfermagemActionPerformed(evt);
            }
        });
        MenuCadastros.add(MenuTecEnfermagem);

        MenuUnidadeDeSaude.setText("Unidades De Saúde");
        MenuUnidadeDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuUnidadeDeSaudeActionPerformed(evt);
            }
        });
        MenuCadastros.add(MenuUnidadeDeSaude);

        MenuPrincipal.add(MenuCadastros);

        MenuConsultas.setText("Consultas");
        MenuPrincipal.add(MenuConsultas);

        MenuFarmacia.setText("Farmacia");
        MenuPrincipal.add(MenuFarmacia);

        MenuSairLogoff.setText("Sair/Logoff");
        MenuSairLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSairLogoffActionPerformed(evt);
            }
        });

        MenuLogoff.setText("Logoff");
        MenuLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuLogoffActionPerformed(evt);
            }
        });
        MenuSairLogoff.add(MenuLogoff);

        MenuSair.setText("Sair");
        MenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSairActionPerformed(evt);
            }
        });
        MenuSairLogoff.add(MenuSair);

        MenuPrincipal.add(MenuSairLogoff);

        setJMenuBar(MenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 883, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPacientesActionPerformed
        TelaPacienteListagem tela=new TelaPacienteListagem();
        this.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_MenuPacientesActionPerformed

    private void MenuMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMedicosActionPerformed
        TelaMedicoListagem tela=new TelaMedicoListagem();
        this.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_MenuMedicosActionPerformed

    private void MenuFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFuncionariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuFuncionariosActionPerformed

    private void MenuLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuLogoffActionPerformed
        new TelaLogin().setVisible(true);

    }//GEN-LAST:event_MenuLogoffActionPerformed

    private void MenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSairActionPerformed
        System.exit(0);
        
    }//GEN-LAST:event_MenuSairActionPerformed

    private void MenuSairLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSairLogoffActionPerformed
        //System.exit(0);
               // TODO add your handling code here:
    }//GEN-LAST:event_MenuSairLogoffActionPerformed

    private void MenuEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuEspecialidadeActionPerformed
       TelaEspecialidadeListagem tela = new TelaEspecialidadeListagem();
       this.add(tela);
       tela.setVisible(true);
    }//GEN-LAST:event_MenuEspecialidadeActionPerformed

    private void MenuUnidadeDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuUnidadeDeSaudeActionPerformed
       TelaUnidadeDeSaudeListagem tela = new TelaUnidadeDeSaudeListagem();
       this.add(tela);
       tela.setVisible(true);
        
    }//GEN-LAST:event_MenuUnidadeDeSaudeActionPerformed

    private void MenuTecEnfermagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuTecEnfermagemActionPerformed
       TelaTecEnfermagemListagem tela = new TelaTecEnfermagemListagem();
       this.add(tela);
       tela.setVisible(true);
    }//GEN-LAST:event_MenuTecEnfermagemActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuCadastros;
    private javax.swing.JMenu MenuConsultas;
    private javax.swing.JMenuItem MenuEspecialidade;
    private javax.swing.JMenu MenuFarmacia;
    private javax.swing.JMenuItem MenuFuncionarios;
    private javax.swing.JMenuItem MenuLogoff;
    private javax.swing.JMenuItem MenuMedicos;
    private javax.swing.JMenuItem MenuPacientes;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JMenuItem MenuSair;
    private javax.swing.JMenu MenuSairLogoff;
    private javax.swing.JMenuItem MenuTecEnfermagem;
    private javax.swing.JMenuItem MenuUnidadeDeSaude;
    // End of variables declaration//GEN-END:variables
}
