/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Apresentacao_Desktop;

import br.edu.ifnmg.sgubs.Aplicacao.ErroValidacao;
import br.edu.ifnmg.sgubs.Aplicacao.Medico;
import br.edu.ifnmg.sgubs.Aplicacao.MedicoRepositorio;
import javax.swing.JOptionPane;

/**
 *
 * @author dayvison
 */
public class TelaMedicoEditar extends javax.swing.JInternalFrame {

    Medico entidade;
    
    MedicoRepositorio dao;
    
    TelaMedicoListagem listagem;
    /**
     * Creates new form TelaCadastroMedico2
     */
    public TelaMedicoEditar() {
        initComponents();
        
        dao = GerenciadorReferencias.getMedico();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bntSalvar = new javax.swing.JButton();
        bntListar = new javax.swing.JButton();
        bntExcluir = new javax.swing.JButton();
        bntNovo = new javax.swing.JButton();
        TextoCod = new javax.swing.JLabel();
        TextoNome = new javax.swing.JLabel();
        TextoCrm = new javax.swing.JLabel();
        TextoRua = new javax.swing.JLabel();
        TextoBairro = new javax.swing.JLabel();
        TextoCidade = new javax.swing.JLabel();
        TextoCel = new javax.swing.JLabel();
        TextoTelefone = new javax.swing.JLabel();
        TextoEspecialista = new javax.swing.JLabel();
        TextoObservacao = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCrm = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtEspecialidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setAutoscrolls(true);

        bntSalvar.setText("Salvar");
        bntSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalvarActionPerformed(evt);
            }
        });

        bntListar.setText("Listar");
        bntListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntListarActionPerformed(evt);
            }
        });

        bntExcluir.setText("Excluir");
        bntExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntExcluirActionPerformed(evt);
            }
        });

        bntNovo.setText("Novo");
        bntNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNovoActionPerformed(evt);
            }
        });

        TextoCod.setText("CodMedico:");

        TextoNome.setText("Nome:");

        TextoCrm.setText("Crm:");

        TextoRua.setText("Rua:");

        TextoBairro.setText("Bairro:");

        TextoCidade.setText("Cidade:");

        TextoCel.setText("Cel:");

        TextoTelefone.setText("Telefone:");

        TextoEspecialista.setText("Especialidade:");

        TextoObservacao.setText("Obs:");

        txtObs.setColumns(20);
        txtObs.setRows(5);
        jScrollPane1.setViewportView(txtObs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(bntNovo)
                        .addGap(18, 18, 18)
                        .addComponent(bntSalvar)
                        .addGap(30, 30, 30)
                        .addComponent(bntListar)
                        .addGap(18, 18, 18)
                        .addComponent(bntExcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextoBairro)
                                    .addComponent(TextoCel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBairro)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextoCidade)
                                    .addComponent(TextoTelefone))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefone)
                                    .addComponent(txtCidade)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextoCod)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextoObservacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextoNome)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(TextoRua)
                                        .addComponent(TextoCrm)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtCrm)
                                            .addGap(236, 236, 236)))
                                    .addComponent(txtRua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextoEspecialista)
                                .addGap(4, 4, 4)
                                .addComponent(txtEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntSalvar)
                    .addComponent(bntListar)
                    .addComponent(bntExcluir)
                    .addComponent(bntNovo))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextoCod)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoCrm)
                    .addComponent(txtCrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoRua)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TextoCidade)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TextoBairro)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoCel)
                    .addComponent(TextoTelefone)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoEspecialista)
                    .addComponent(txtEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoObservacao)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntListarActionPerformed
        listagem.setVisible( true);
        this.setVisible(false);
    }//GEN-LAST:event_bntListarActionPerformed

    private void bntNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNovoActionPerformed
       entidade =new Medico(1,0, " ", null, null, null , null, 0, 0, null);
       preencheCampos();
    }//GEN-LAST:event_bntNovoActionPerformed

    private void bntExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExcluirActionPerformed
       if(JOptionPane.showConfirmDialog(rootPane, "Deseja salvar alterações ?") == 0){
           
           if(dao.Apagar(entidade)){
               JOptionPane.showMessageDialog(rootPane, "Dados salvos com sucesso !");
               entidade = new Medico(1,0, " ", null, null, null , null, 0, 0, null);
               preencheCampos();
           }
           else
               JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro durante o processo !");
       }
           else{
               JOptionPane.showMessageDialog(rootPane, "Operação cancelada !");
           }
         
    }//GEN-LAST:event_bntExcluirActionPerformed

    private void bntSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalvarActionPerformed
        
        try {
            
            if(JOptionPane.showConfirmDialog(rootPane, "Deseja salvar alterações ?") == 0){
                
                preencheObjeto();
                
                if(dao.Salvar(entidade))
                      JOptionPane.showMessageDialog(rootPane, "Dados salvos com sucesso !");
               
                else
                      JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro durante o processo !");
            }
           else{
               JOptionPane.showMessageDialog(rootPane, "Operação cancelada !");
             }
         
        } catch (ErroValidacao ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                    
        }
    }//GEN-LAST:event_bntSalvarActionPerformed

    public Medico getEntidade() {
        return entidade;
    }

    public void setEntidade(Medico entidade) {
        this.entidade = entidade;
        preencheCampos();
    }
    
    private void preencheCampos(){
        lblCodigo.setText( Integer.toString( entidade.getId()));
        txtNome.setText( entidade.getNome());
        txtCrm.setText( entidade.getCrm());
        txtRua.setText( entidade.getRua());
        txtBairro.setText( entidade.getBairro());
        txtCidade.setText( entidade.getCidade());
        txtCelular.setText( Integer.toString(entidade.getCelular()));
        txtTelefone.setText( Integer.toString(entidade.getTelefone()));
        txtEspecialidade.setText( Integer.toString(entidade.getIdEspecialidade()));
        txtObs.setText( entidade.getObservacoes());
                
        
    }
    
    private void preencheObjeto() throws ErroValidacao{
        entidade.setNome( txtNome.getText());
        entidade.setCrm( txtCrm.getText());
        entidade.setRua( txtRua.getText());
        entidade.setBairro( txtBairro.getText());
        entidade.setCidade( txtCidade.getText());
        entidade.setObservacoes( txtObs.getText());
    }
    
    public TelaMedicoListagem getListagem() {
        return listagem;
    }

    public void setListagem(TelaMedicoListagem listagem) {
        this.listagem = listagem;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TextoBairro;
    private javax.swing.JLabel TextoCel;
    private javax.swing.JLabel TextoCidade;
    private javax.swing.JLabel TextoCod;
    private javax.swing.JLabel TextoCrm;
    private javax.swing.JLabel TextoEspecialista;
    private javax.swing.JLabel TextoNome;
    private javax.swing.JLabel TextoObservacao;
    private javax.swing.JLabel TextoRua;
    private javax.swing.JLabel TextoTelefone;
    private javax.swing.JButton bntExcluir;
    private javax.swing.JButton bntListar;
    private javax.swing.JButton bntNovo;
    private javax.swing.JButton bntSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCrm;
    private javax.swing.JTextField txtEspecialidade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextArea txtObs;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}