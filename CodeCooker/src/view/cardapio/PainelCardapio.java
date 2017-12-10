/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.cardapio;

import java.awt.event.ActionListener;

/**
 *
 * @author rafael
 */
public class PainelCardapio extends javax.swing.JPanel {

    /**
     * Creates new form PainelCardapio
     */
    public PainelCardapio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloCardapio = new javax.swing.JLabel();
        btnCriar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(540, 350));
        setMinimumSize(new java.awt.Dimension(540, 350));
        setPreferredSize(new java.awt.Dimension(540, 350));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloCardapio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTituloCardapio.setText("Cardápio");
        add(lblTituloCardapio, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 62, -1, 28));

        btnCriar.setBackground(new java.awt.Color(255, 255, 255));
        btnCriar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Criar/button_criar.png"))); // NOI18N
        btnCriar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Criar/button_criar_clicked.png"))); // NOI18N
        btnCriar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Criar/button_criar_swap.png"))); // NOI18N
        add(btnCriar, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 168, 169, 51));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Editar/Grande/button_editar.png"))); // NOI18N
        btnEditar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Editar/Grande/button_editar_clicked.png"))); // NOI18N
        btnEditar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Editar/Grande/button_editar_swap.png"))); // NOI18N
        add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 251, 169, 51));

        btnExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Excluir/Grande/button_excluir.png"))); // NOI18N
        btnExcluir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Excluir/Grande/button_excluir_clicked.png"))); // NOI18N
        btnExcluir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Excluir/Grande/button_excluir_swap.png"))); // NOI18N
        add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 251, 169, 51));

        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Mostrar/button_mostrar.png"))); // NOI18N
        btnMostrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Mostrar/button_mostrar_clicked.png"))); // NOI18N
        btnMostrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Mostrar/button_mostrar_swap.png"))); // NOI18N
        add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 168, 169, 51));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Redimensionadas/pexels-photo-349610RE.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 350));
    }// </editor-fold>//GEN-END:initComponents

    public void addBtnCriarListener(ActionListener listener){
        this.btnCriar.addActionListener(listener);
    }
    
    public void addBtnMostrarListener(ActionListener listener){
        this.btnMostrar.addActionListener(listener);
    }
    
    public void addBtnEditarListener(ActionListener listener){
        this.btnEditar.addActionListener(listener);
    }
    
    public void addBtnExcluirListener(ActionListener listener){
        this.btnExcluir.addActionListener(listener);
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblTituloCardapio;
    // End of variables declaration//GEN-END:variables
}
