/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.estoque;

import java.awt.event.ActionListener;

/**
 *
 * @author Talita-csl
 */
public class PainelEstoque extends javax.swing.JPanel {

    /**
     * Creates new form PainelEstoque
     */
    public PainelEstoque() {
        initComponents();
    }
    
    public void addBtnAdicionarProdutoListener(ActionListener adicionarListener){
        this.btnAdicionarProduto.addActionListener(adicionarListener);
    }
    
    public void addBtnBuscarProdutoListener(ActionListener buscarListener){
        this.btnBuscarProduto.addActionListener(buscarListener);
    }
    
    public void addBtnAlterarProdutoListener(ActionListener alterarListener){
        this.btnAlterarProduto.addActionListener(alterarListener);
    }
    
    public void addBtnExcluirProdutoListener(ActionListener excluirListener){
        this.btnExcluirProduto.addActionListener(excluirListener);
    }
    
    public PainelAdicionarProduto getPainelAdicionar(){
        return new PainelAdicionarProduto();
    }
    
    public PainelBuscarProduto getPainelBuscar(){
        return new PainelBuscarProduto();
    }
    
    public PainelEditarProduto getPainelEditar(){
        return new PainelEditarProduto();
    }
    
    public PainelExcluirProduto getPainelExcluir(){
        return new PainelExcluirProduto();
    }
    public PainelAlterarProduto getPainelAlterar() {
        return new PainelAlterarProduto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAlterarProduto = new javax.swing.JButton();
        btnExcluirProduto = new javax.swing.JButton();
        lblTituloEstoque = new javax.swing.JLabel();
        btnBuscarProduto = new javax.swing.JButton();
        btnAdicionarProduto = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(535, 362));

        btnAlterarProduto.setText("Alterar");

        btnExcluirProduto.setBackground(new java.awt.Color(255, 102, 102));
        btnExcluirProduto.setText("Excluir");

        lblTituloEstoque.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTituloEstoque.setText("Controle de Estoque");

        btnBuscarProduto.setText("Buscar");

        btnAdicionarProduto.setText("Adicionar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(lblTituloEstoque))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBuscarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                .addGap(27, 27, 27)
                                .addComponent(btnAlterarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                .addGap(27, 27, 27)
                                .addComponent(btnExcluirProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)))))
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(lblTituloEstoque)
                .addGap(65, 65, 65)
                .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluirProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAlterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarProduto;
    private javax.swing.JButton btnAlterarProduto;
    private javax.swing.JButton btnBuscarProduto;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JLabel lblTituloEstoque;
    // End of variables declaration//GEN-END:variables
}

