/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.funcionarios;

import java.awt.event.ActionListener;

/**
 *
 * @author Dulcina
 */
public class CadastrarFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarFuncionario
     */
    public CadastrarFuncionario() {
        initComponents();
        setLocationRelativeTo(null);
        
    }
    
    public void addBtnCancelarListener(ActionListener btnCancelarListener){
        this.btnCancelar.addActionListener(btnCancelarListener);
    }
    
    public void addBtnCadastrarListener(ActionListener btnCadastrarListener){
        this.btnCadastrar.addActionListener(btnCadastrarListener);
    }
    
    public Integer getCargoFunc(){
        if(String.valueOf(cmbCargo.getSelectedItem()).compareTo("Caixa") == 0){
            return 1;
        }
        else if(String.valueOf(cmbCargo.getSelectedItem()).compareTo("Metre") == 0){
            return 2;
        }
        else {
            return 3;
        }
    }
    
    public String getNomeCompleto(){
        return txtNomeCompleto.getText();
    }
    
    public String getUsuario(){
        return txtUsuario.getText();
    }
    
    public String getSenha(){
        return String.valueOf(txtSenha.getPassword());
    }
    
    public String getCPF(){
        
        String cpf;
        String[] cpfTratado;
        
        cpf = txtCPF.getText();
        
        //System.out.println(CPF);
        cpfTratado = cpf.split("\\.");
        
        String digito = cpfTratado[2];
        String[] digitoE = digito.split("-");
        
        String CPFinal = cpfTratado[0] + cpfTratado[1] + digitoE[0] + digitoE[1];

        return CPFinal;
    }
    
    public String getCNPJ(){
        return txtCNPJ.getText();
    }
    
    public void setTextVoid(){
    
        txtNomeCompleto.setText("");
        txtCNPJ.setText("");
        txtCPF.setText("");
        txtSenha.setText("");
        txtUsuario.setText("");
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadastrar = new javax.swing.JButton();
        lblCargo = new javax.swing.JLabel();
        cmbCargo = new javax.swing.JComboBox<>();
        lblNomeCompleto = new javax.swing.JLabel();
        txtNomeCompleto = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnCancelar = new javax.swing.JButton();
        lblCNPJ = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JTextField();
        txtCPF = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCadastrar.setText("Cadastrar");

        lblCargo.setText("Cargo");

        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caixa", "Gerente", "Metre" }));

        lblNomeCompleto.setText("Nome Completo");

        lblUsuario.setText("Usuário");

        lblCPF.setText("CPF");

        lblSenha.setText("Senha");

        btnCancelar.setText("Cancelar");

        lblCNPJ.setText("CNPJ");

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNomeCompleto, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblSenha)))
                                        .addComponent(lblUsuario))
                                    .addGap(33, 33, 33)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblCNPJ)
                                        .addComponent(lblCPF)
                                        .addComponent(txtCNPJ)
                                        .addComponent(txtCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))))
                            .addComponent(lblCargo))))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblCargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNomeCompleto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCNPJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCNPJ, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(lblCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCPF)
                    .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JLabel lblCNPJ;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblNomeCompleto;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtCNPJ;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtNomeCompleto;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}