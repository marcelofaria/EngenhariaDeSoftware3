/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.financeiro;

import java.awt.event.ActionListener;

/**
 *
 * @author Rafael
 */
public class PainelFinanceiro extends javax.swing.JPanel {

    /**
     * Creates new form PainelRelatorio
     */
    public PainelFinanceiro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNPedidos = new javax.swing.JLabel();
        lblPratoDoDia = new javax.swing.JLabel();
        lblTituloFinanceiro = new javax.swing.JLabel();
        btnRelatorio = new javax.swing.JButton();
        lblReceita = new javax.swing.JLabel();
        lblTxtNPedidos = new javax.swing.JLabel();
        lblTxtPratoDoDia = new javax.swing.JLabel();
        lblValorReceita = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(513, 351));
        setMinimumSize(new java.awt.Dimension(513, 351));
        setPreferredSize(new java.awt.Dimension(513, 351));

        lblNPedidos.setText("22");

        lblPratoDoDia.setText("Stuffed Peppers");

        lblTituloFinanceiro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTituloFinanceiro.setText("Financeiro");

        btnRelatorio.setText("Gerar relatório");

        lblReceita.setText("Receita do dia");

        lblTxtNPedidos.setText("Nº Pedidos");

        lblTxtPratoDoDia.setText("Prato do dia");

        lblValorReceita.setForeground(new java.awt.Color(0, 204, 0));
        lblValorReceita.setText("R$ 90,00");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Hoje:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(lblTituloFinanceiro))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTxtNPedidos)
                            .addComponent(lblTxtPratoDoDia)
                            .addComponent(lblReceita)
                            .addComponent(jLabel1))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValorReceita)
                            .addComponent(lblNPedidos)
                            .addComponent(lblPratoDoDia))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(lblTituloFinanceiro)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblReceita)
                            .addComponent(lblValorReceita))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTxtNPedidos)
                            .addComponent(lblNPedidos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTxtPratoDoDia)
                            .addComponent(lblPratoDoDia))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void addBtnRelatorioListener(ActionListener listener){
        this.btnRelatorio.addActionListener(listener);
    }
    
    public void setReceita(String receita){
        this.lblValorReceita.setText(receita);
    }
    
    public void setNumPedidos(int num){
        this.lblNPedidos.setText(String.valueOf(num));
    }
    
    public void setPratoDoDia(String prato){
        this.lblPratoDoDia.setText(prato);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblNPedidos;
    private javax.swing.JLabel lblPratoDoDia;
    private javax.swing.JLabel lblReceita;
    private javax.swing.JLabel lblTituloFinanceiro;
    private javax.swing.JLabel lblTxtNPedidos;
    private javax.swing.JLabel lblTxtPratoDoDia;
    private javax.swing.JLabel lblValorReceita;
    // End of variables declaration//GEN-END:variables
}
