/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.itens;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

/**
 *
 * @author Rafael
 */
public class MenuAdicionarItens extends javax.swing.JFrame {

    /**
     * Creates new form MenuItens
     */
    public MenuAdicionarItens() {
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adicionar");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/food.png"))); // NOI18N
        jPanel1.add(btnPrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 42, -1, 62));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Cancelar/button_cancelar.png"))); // NOI18N
        btnCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Cancelar/button_cancelar_clicked.png"))); // NOI18N
        btnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Cancelar/button_cancelar_swap.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 130, 75, 23));

        btnPorcao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fries.png"))); // NOI18N
        jPanel1.add(btnPorcao, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 42, 92, 62));

        btnBebida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/drink.png"))); // NOI18N
        jPanel1.add(btnBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 42, 92, 62));

        btnSobremesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dessert.png"))); // NOI18N
        jPanel1.add(btnSobremesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 42, 95, 62));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Redimensionadas/pexels-photo-349610RE.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
