/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.FuncionarioController;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Usuario;
import model.UsuarioDAO;

/**
 *
 * @author Marcelo
 */
public class ConfirmaExcluirFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form ConfirmaExcluirFuncionario
     */
    public ConfirmaExcluirFuncionario() {
        initComponents();
        setLocationRelativeTo(null);
        
    }
    
    DefaultListModel modelM = new DefaultListModel();
    UsuarioDAO u = UsuarioDAO.getInstance();
    List<Usuario> usuarios;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstFuncionarios = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstFuncionariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstFuncionarios);

        jLabel1.setText("Confirme a exclusão de acordo com o CPF");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstFuncionariosMouseClicked
        // TODO add your handling code here:
        escolheExclusao();    
        
    }//GEN-LAST:event_lstFuncionariosMouseClicked

    public String getFuncionarios(String nome, String cpf){
        
        return nome + " - " + cpf;
    
    }
    
    public void setList(String nomeCpf){
        
        modelM.addElement(nomeCpf);
        lstFuncionarios.setModel(modelM);
    }
        
    public void escolheExclusao(){
        UsuarioDAO u = UsuarioDAO.getInstance();
        Usuario usu;
        String[] cpf;
        
        cpf = lstFuncionarios.getSelectedValue().split(" ");
        String CPF = cpf[2];

        usu = u.retrieveByCpf(CPF);
        System.out.println(CPF);
        u.delete(usu);
        
        JOptionPane.showMessageDialog(null, "Funcionário Excluído com Sucesso!");
        dispose();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstFuncionarios;
    // End of variables declaration//GEN-END:variables
}
