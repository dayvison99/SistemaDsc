/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Apresentacao_Desktop;

import br.edu.ifnmg.sgubs.Aplicacao.Agendamento;
import br.edu.ifnmg.sgubs.Aplicacao.AgendamentoRepositorio;
import br.edu.ifnmg.sgubs.Aplicacao.Medico;
import br.edu.ifnmg.sgubs.Aplicacao.MedicoRepositorio;
import br.edu.ifnmg.sgubs.Aplicacao.Paciente;
import br.edu.ifnmg.sgubs.Aplicacao.PacienteRepositorio;
import br.edu.ifnmg.sgubs.Aplicacao.UnidadesDeSaude;
import br.edu.ifnmg.sgubs.Aplicacao.UnidadesDeSaudeRepositorio;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dayvison
 */
public class TelaAgendamentoEditar extends javax.swing.JInternalFrame {
    
    AgendamentoRepositorio dao = GerenciadorReferencias.getAgendamento();
    
    PacienteRepositorio daoPaciente = GerenciadorReferencias.getPaciente();
    
    
    UnidadesDeSaudeRepositorio daoUnidadesDeSaude = GerenciadorReferencias.getUnidadeDeSaude();
    
    MedicoRepositorio daoMedico = GerenciadorReferencias.getMedico();
    
    //Calendar calendario = GregorianCalendar.getInstance();
    
    //SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
    
    TelaAgendamentoListagem listagem;
    
    Agendamento entidade;
    
   

    /**
     * Creates new form TelaAgendamentoEditar
     */
    public TelaAgendamentoEditar() {
        initComponents();
        
         // Paciente = new DefaultComboBoxModel( daoPaciente.Buscar(null).toArray());
        
    //   cbxPaciente.setModel(Paciente);
       
        ComboBoxModel Unidade = new DefaultComboBoxModel( daoUnidadesDeSaude.Buscar(null).toArray());
        
        cbxUnidade.setModel(Unidade);
        
        ComboBoxModel Medico = new DefaultComboBoxModel( daoMedico.Buscar(null).toArray());
        
        cbxMedico.setModel(Medico);
        
        List<Paciente>busca = daoPaciente.Buscar(null);
        
       
        
    }

    public Agendamento getEntidade() {
        return entidade;
    }

    public void setEntidade(Agendamento entidade) {
        this.entidade = entidade;
        preencheCampos();
    }
    
    public TelaAgendamentoListagem getListagem(){
        return listagem;
    }
    
    public void setListagem(TelaAgendamentoListagem listagem){
        this.listagem = listagem;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        lblCodAgendamento = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bntNovo = new javax.swing.JButton();
        bntSalvar = new javax.swing.JButton();
        bntListar = new javax.swing.JButton();
        bntExcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dcData = new com.toedter.calendar.JDateChooser();
        lblPaciente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbxUnidade = new javax.swing.JComboBox<>();
        lblMedico = new javax.swing.JLabel();
        cbxMedico = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbxTurno = new javax.swing.JComboBox<>();
        Motivo = new javax.swing.JLabel();
        txtMotivo = new javax.swing.JTextField();
        txtPaciente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPacientes = new javax.swing.JTable();
        btnCpf = new javax.swing.JButton();
        btnNome = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Agendamento de Consultas");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bntNovo.setText("Novo");
        bntNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNovoActionPerformed(evt);
            }
        });

        bntSalvar.setText("Salvar");
        bntSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalvarActionPerformed(evt);
            }
        });

        bntListar.setText("Voltar");
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

        jLabel2.setText("CodAgendamento:");

        jLabel3.setText("Data :");

        lblPaciente.setText("Paciente:");

        jLabel1.setText("Unidade:");

        cbxUnidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUnidadeActionPerformed(evt);
            }
        });

        lblMedico.setText("Medico:");

        cbxMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Turno da Consulta:");

        cbxTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matutino", "Vespertino", "Noturno" }));
        cbxTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTurnoActionPerformed(evt);
            }
        });

        Motivo.setText("Motivo :");

        tblPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPacientes);

        btnCpf.setText("Cpf ");
        btnCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCpfActionPerformed(evt);
            }
        });

        btnNome.setText("Nome ");
        btnNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNomeActionPerformed(evt);
            }
        });

        jLabel5.setText("Buscar por :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(162, 162, 162)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbxTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Motivo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblMedico)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxUnidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPaciente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnNome)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnCpf)
                                                .addGap(9, 9, 9))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(29, 29, 29))))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(bntNovo)
                        .addGap(30, 30, 30)
                        .addComponent(bntSalvar)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcData, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bntListar)
                                .addGap(18, 18, 18)
                                .addComponent(bntExcluir)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntSalvar)
                    .addComponent(bntListar)
                    .addComponent(bntExcluir)
                    .addComponent(bntNovo))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addComponent(dcData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNome)
                            .addComponent(btnCpf)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPaciente))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedico)
                    .addComponent(cbxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Motivo)
                    .addComponent(txtMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(lblCodAgendamento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCodAgendamento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalvarActionPerformed
        try {
        if(JOptionPane.showConfirmDialog(rootPane, "Deseja salvar alterações ?") == 0){
            
            preencheObjeto();
            
            if(dao.Salvar(entidade)){
                
                JOptionPane.showMessageDialog(rootPane, "Dados salvos com sucesso !");
                preencheCampos();
            }
            
            else
                
                JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro durante o processo !");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Operação cancelada !");
        }
        }catch (ParseException ex){
            Logger.getLogger(TelaAgendamentoEditar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_bntSalvarActionPerformed

    private void bntListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntListarActionPerformed
        listagem.setVisible( true);
        this.setVisible(false);
    }//GEN-LAST:event_bntListarActionPerformed

    private void bntExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExcluirActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane, "Deseja Excluir Esse Agendamento ?") == 0){

            if(dao.Apagar(entidade)){
                JOptionPane.showMessageDialog(rootPane, "Dados Excluidos com sucesso !");
                entidade = new Agendamento(0,null,null,null,null,new Date(),null);
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
        entidade =new Agendamento(0,null,null,null,null,new Date(),null);
        preencheCampos();
    }//GEN-LAST:event_bntNovoActionPerformed

    private void cbxUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUnidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxUnidadeActionPerformed

    private void cbxTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTurnoActionPerformed

    private void btnCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCpfActionPerformed
        if(!txtPaciente.getText().equals(""))
        buscarCpf(txtPaciente.getText() );
        else
        JOptionPane.showMessageDialog(this, "Digite o Cpf");
    }//GEN-LAST:event_btnCpfActionPerformed

    private void btnNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNomeActionPerformed
        buscar(txtPaciente.getText() );
        
    }//GEN-LAST:event_btnNomeActionPerformed

    private void tblPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPacientesMouseClicked
        int selecionada =tblPacientes.getSelectedRow();

        String id = tblPacientes.getModel().getValueAt(selecionada,1).toString() ;

       txtPaciente.setText(id);
        
    }//GEN-LAST:event_tblPacientesMouseClicked

    private void preencheCampos(){
        lblCodAgendamento.setText( Integer.toString(entidade.getId()));
        txtPaciente.setText(Paciente( entidade.getPaciente()));
        cbxUnidade.setSelectedItem( entidade.getUnidadeSaude());
        cbxMedico.setSelectedItem( entidade.getMedico());
        cbxTurno.setSelectedItem(entidade.getTurno());
        dcData.setDate((entidade.getData()));
        txtMotivo.setText( entidade.getMotivo());
        
        
    }
    
    private void preencheObjeto() throws ParseException{
        entidade.setPaciente((Paciente)txtPaciente.getText());
        entidade.setUnidadeSaude((UnidadesDeSaude)cbxUnidade.getSelectedItem());
        entidade.setMedico((Medico)cbxMedico.getSelectedItem());
        entidade.setTurno((String) cbxTurno.getSelectedItem());
        entidade.setData( dcData.getDate());
        entidade.setMotivo( txtMotivo.getText());
              
    }
    
  private void preencheTabela(List<Paciente>lista){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nome");
        modelo.addColumn("CPF");
        
        for(Paciente p : lista){
            Vector linha = new Vector();
            linha.add(p.getId());
            linha.add(p.getNome());
            linha.add(p.getCpf());
            modelo.addRow(linha);
        }
         tblPacientes.setModel(modelo);
    }
    
    
    public void buscar(String nome){
        
       
        Paciente filtro = new Paciente (0, nome, null, null,null, null, 0, 0, null, null);
        
        List<Paciente> busca = daoPaciente.Buscar(filtro);
        
        preencheTabela(busca);
        
        filtro = null;

        }
    
    public void buscarCpf(String nome){
        
       
        Paciente filtro = new Paciente (0, null, nome, null,null, null, 0, 0, null, null);
        
        List<Paciente> busca = daoPaciente.Buscar(filtro);
        
        preencheTabela(busca);
        
        filtro = null;

        }
     
    /* private void tblBuscaMouseClicked(java.awt.event.MouseEvent evt) {                                      
        int selecionada =tblPacientes.getSelectedRow();

        int id =Integer.parseInt( tblPacientes.getModel().getValueAt(selecionada,0).toString() );

        
            } */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Motivo;
    private javax.swing.JButton bntExcluir;
    private javax.swing.JButton bntListar;
    private javax.swing.JButton bntNovo;
    private javax.swing.JButton bntSalvar;
    private javax.swing.JButton btnCpf;
    private javax.swing.JButton btnNome;
    private javax.swing.JComboBox<String> cbxMedico;
    private javax.swing.JComboBox<String> cbxTurno;
    private javax.swing.JComboBox<String> cbxUnidade;
    private com.toedter.calendar.JDateChooser dcData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodAgendamento;
    private javax.swing.JLabel lblMedico;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JTable tblPacientes;
    private javax.swing.JTextField txtMotivo;
    private javax.swing.JTextField txtPaciente;
    // End of variables declaration//GEN-END:variables
}
