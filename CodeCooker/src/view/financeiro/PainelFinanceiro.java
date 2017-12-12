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
        jLabel2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(540, 350));
        setMinimumSize(new java.awt.Dimension(540, 350));
        setPreferredSize(new java.awt.Dimension(540, 350));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNPedidos.setText("22");
        add(lblNPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, -1));

        lblPratoDoDia.setText("Stuffed Peppers");
        add(lblPratoDoDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        lblTituloFinanceiro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTituloFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Financeiro.png"))); // NOI18N
        lblTituloFinanceiro.setText("  ");
        add(lblTituloFinanceiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        btnRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Gerar Relatório/button_gerar-relatorio.png"))); // NOI18N
        btnRelatorio.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Gerar Relatório/button_gerar-relatorio_clicked.png"))); // NOI18N
        btnRelatorio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Gerar Relatório/button_gerar-relatorio_swap.png"))); // NOI18N
        add(btnRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 132, 74));

        lblReceita.setText("Receita do dia");
        add(lblReceita, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        lblTxtNPedidos.setText("Nº Pedidos");
        add(lblTxtNPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        lblTxtPratoDoDia.setText("Prato do dia");
        add(lblTxtPratoDoDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));

        lblValorReceita.setForeground(new java.awt.Color(0, 102, 0));
        lblValorReceita.setText("R$ 90,00");
        add(lblValorReceita, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Hoje:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Redimensionadas/pexels-photo-349610RE.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 350));
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblNPedidos;
    private javax.swing.JLabel lblPratoDoDia;
    private javax.swing.JLabel lblReceita;
    private javax.swing.JLabel lblTituloFinanceiro;
    private javax.swing.JLabel lblTxtNPedidos;
    private javax.swing.JLabel lblTxtPratoDoDia;
    private javax.swing.JLabel lblValorReceita;
    // End of variables declaration//GEN-END:variables
}
