/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.cardapio;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

/**
 *
 * @author Rafael
 */
public class ExcluirCardapio extends javax.swing.JFrame {

    /**
     * Creates new form ExcluirCardapio
     */
    public ExcluirCardapio() {
        initComponents();
        CenteredFrame(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        cmbDia = new javax.swing.JComboBox<>();
        lblTituloCriarCardapio = new javax.swing.JLabel();
        lblDia = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 272));
        setMinimumSize(new java.awt.Dimension(400, 272));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(400, 272));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 272));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 272));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Cancelar/button_cancelar.png"))); // NOI18N
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Cancelar/button_cancelar_clicked.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Cancelar/button_cancelar_swap.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 75, 23));

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Excluir/button_excluir.png"))); // NOI18N
        btnExcluir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Excluir/button_excluir_clicked.png"))); // NOI18N
        btnExcluir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Excluir/button_excluir_swap.png"))); // NOI18N
        jPanel1.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 112, 45));

        cmbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado" }));
        jPanel1.add(cmbDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 312, 33));

        lblTituloCriarCardapio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTituloCriarCardapio.setText("Excluir Cardápio");
        jPanel1.add(lblTituloCriarCardapio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        lblDia.setText("Dia");
        jPanel1.add(lblDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Redimensionadas/pexels-photo-349610RE.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void addBtnExcluirListener(ActionListener listener){
        this.btnExcluir.addActionListener(listener);
    }
    
    public String getDia(){
        return String.valueOf(this.cmbDia.getSelectedItem());
    }
    
    public void CenteredFrame(javax.swing.JFrame objFrame) {
        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
        int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
        int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
        objFrame.setLocation(iCoordX, iCoordY);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox<String> cmbDia;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblTituloCriarCardapio;
    // End of variables declaration//GEN-END:variables
}
