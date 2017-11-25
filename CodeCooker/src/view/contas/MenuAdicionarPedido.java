/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.contas;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

/**
 *
 * @author Rafael
 */
public class MenuAdicionarPedido extends javax.swing.JFrame {

    /**
     * Creates new form MenuAdicionarPedido
     */
    public MenuAdicionarPedido() {
        setLookAndFeel();
        initComponents();
        CenteredFrame(this);
        btnPrato.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnPrato.setHorizontalTextPosition(SwingConstants.CENTER);
        btnPrato.setText("Prato");
        btnPorcao.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnPorcao.setHorizontalTextPosition(SwingConstants.CENTER);
        btnPorcao.setText("Porção");
        btnBebida.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnBebida.setHorizontalTextPosition(SwingConstants.CENTER);
        btnBebida.setText("Bebida");
        btnSobremesa.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnSobremesa.setHorizontalTextPosition(SwingConstants.CENTER);
        btnSobremesa.setText("Sobremesa");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPrato = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnPorcao = new javax.swing.JButton();
        btnBebida = new javax.swing.JButton();
        btnSobremesa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(473, 173));
        setMinimumSize(new java.awt.Dimension(473, 173));

        jPanel1.setMaximumSize(new java.awt.Dimension(473, 173));
        jPanel1.setMinimumSize(new java.awt.Dimension(473, 173));
        jPanel1.setPreferredSize(new java.awt.Dimension(473, 173));

        btnPrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/food.png"))); // NOI18N

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnPorcao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fries.png"))); // NOI18N

        btnBebida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/drink.png"))); // NOI18N

        btnSobremesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dessert.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancelar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPrato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPorcao, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSobremesa, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrato, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSobremesa, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPorcao, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnCancelar)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public void addPratoListener(ActionListener listener){
        this.btnPrato.addActionListener(listener);
    }
    
    public void addPorcaoListener(ActionListener listener){
        this.btnPorcao.addActionListener(listener);
    }
    
    public void addBebidaListener(ActionListener listener){
        this.btnBebida.addActionListener(listener);
    }
    
    public void addSobremesaListener(ActionListener listener){
        this.btnSobremesa.addActionListener(listener);
    }
    
    public static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Error setting native LAF: " + e);
        }
    }
    
    public void CenteredFrame(javax.swing.JFrame objFrame) {
        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
        int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
        int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
        objFrame.setLocation(iCoordX, iCoordY);
    } 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBebida;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnPorcao;
    private javax.swing.JButton btnPrato;
    private javax.swing.JButton btnSobremesa;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
