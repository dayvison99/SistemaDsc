/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Apresentacao_Desktop;

import br.edu.ifnmg.sgubs.Aplicacao.ErroValidacao;
import br.edu.ifnmg.sgubs.Aplicacao.TecEnfermagem;
import br.edu.ifnmg.sgubs.Aplicacao.TecEnfermagemRepositorio;
import javax.swing.JOptionPane;

/**
 *
 * @author dayvison
 */
public class TelaTecEnfermagemEditar extends javax.swing.JInternalFrame {
    
    TecEnfermagem entidade;
    
    TecEnfermagemRepositorio dao;
    
    TelaTecEnfermagemListagem listagem;
    /**
     * Creates new form TelaTecEnfermagemEditar
     */
    public TelaTecEnfermagemEditar() {
        initComponents();
        
        dao = GerenciadorReferencias.getTecEnfermagem();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCidade = new javax.swing.JTextField();
        TextoRua = new javax.swing.JLabel();
        TextoTelefone = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCoren = new javax.swing.JTextField();
        TextoCod = new javax.swing.JLabel();
        TextoNome = new javax.swing.JLabel();
        bntSalvar = new javax.swing.JButton();
        bntListar = new javax.swing.JButton();
        bntExcluir = new javax.swing.JButton();
        bntNovo = new javax.swing.JButton();
        TextoBairro = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        TextoCidade = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        TextoCoren = new javax.swing.JLabel();
        TextoCel = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro Téc Enfermagem");

        TextoRua.setText("Rua:");

        TextoTelefone.setText("Telefone:");

        TextoCod.setText("CodTecEnfermagem :");

        TextoNome.setText("Nome:");

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

        TextoBairro.setText("Bairro:");

        TextoCidade.setText("Cidade:");

        TextoCoren.setText("Coren :");

        TextoCel.setText("Cel:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(bntNovo)
                .addGap(18, 18, 18)
                .addComponent(bntSalvar)
                .addGap(30, 30, 30)
                .addComponent(bntListar)
                .addGap(18, 18, 18)
                .addComponent(bntExcluir)
                .addContainerGap(349, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextoCel)
                            .addComponent(TextoCidade))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtCidade)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextoBairro)
                                .addGap(34, 34, 34)
                                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextoCod)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextoNome)
                                    .addComponent(TextoCoren)
                                    .addComponent(TextoRua))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCoren, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextoTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone)))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoCod, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoCoren)
                    .addComponent(txtCoren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoRua)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(TextoCidade))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoCel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void bntListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntListarActionPerformed
        listagem.setVisible( true);
        this.setVisible(false);
    }//GEN-LAST:event_bntListarActionPerformed

    private void bntExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExcluirActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane, "Deseja Excluir Esse Téc em Enfermagem ?") == 0){

            if(dao.Apagar(entidade)){
                JOptionPane.showMessageDialog(rootPane, "Dados Excluidos com sucesso !");
                entidade = new TecEnfermagem(0, "", "", "", "", "", 0, 0);
                preencheCampos();
            }
            else
            JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro durante o processo !");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Operação cancelada !");
        }
    }//GEN-LAST:event_bntExcluirActionPerformed

    private void bntNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNovoActionPerformed
        entidade =new TecEnfermagem(0, "", "", "", "", "", 0, 0);
        preencheCampos();
    }//GEN-LAST:event_bntNovoActionPerformed

    public TecEnfermagem getEntidade() {
        return entidade;
    }

    public void setEntidade(TecEnfermagem entidade) {
        this.entidade = entidade;
        preencheCampos();
    }
    
       private void preencheCampos(){
        lblCodigo.setText( Integer.toString( entidade.getId()));
        txtNome.setText( entidade.getNome());
        txtCoren.setText( entidade.getCoren());
        txtRua.setText( entidade.getRua());
        txtBairro.setText( entidade.getBairro());
        txtCidade.setText( entidade.getCidade());
        txtCelular.setText( Integer.toString(entidade.getCelular()));
        txtTelefone.setText( Integer.toString(entidade.getTelefone()));
       
                
        
    }
      
    private void preencheObjeto() throws ErroValidacao{
        entidade.setNome(txtNome.getText());
        entidade.setCoren(txtCoren.getText());
        entidade.setRua( txtRua.getText());
        entidade.setBairro( txtBairro.getText());
        entidade.setCidade( txtCidade.getText());
        entidade.setCelular(Integer.parseInt(txtCelular.getText()));
        entidade.setTelefone( Integer.parseInt(txtTelefone.getText()));
    }              
    

    public TelaTecEnfermagemListagem getListagem(){
        return listagem;
    }
    
    public void setListagem(TelaTecEnfermagemListagem listagem){
            this.listagem = listagem;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TextoBairro;
    private javax.swing.JLabel TextoCel;
    private javax.swing.JLabel TextoCidade;
    private javax.swing.JLabel TextoCod;
    private javax.swing.JLabel TextoCoren;
    private javax.swing.JLabel TextoNome;
    private javax.swing.JLabel TextoRua;
    private javax.swing.JLabel TextoTelefone;
    private javax.swing.JButton bntExcluir;
    private javax.swing.JButton bntListar;
    private javax.swing.JButton bntNovo;
    private javax.swing.JButton bntSalvar;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCoren;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
