/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.itens;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import javax.swing.UIManager;

/**
 *
 * @author rafael
 */
public class EditarItem extends javax.swing.JFrame {

    /**
     * Creates new form EditarItem
     */
    public EditarItem() {
        setLookAndFeel();
        initComponents();
        CenteredFrame(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblNome1 = new javax.swing.JLabel();
        txtNome1 = new javax.swing.JTextField();
        txtIngredientes1 = new javax.swing.JTextField();
        lblIngredientes1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        radDisponivel1 = new javax.swing.JRadioButton();
        radIndisponivel1 = new javax.swing.JRadioButton();
        btnAdicionar1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblPreco1 = new javax.swing.JLabel();
        txtPreco1 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(337, 366));
        setMinimumSize(new java.awt.Dimension(337, 366));
        setPreferredSize(new java.awt.Dimension(337, 366));
        setResizable(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNome1.setText("Nome");
        jPanel2.add(lblNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 47, -1, -1));

        txtNome1.setBackground(new java.awt.Color(255, 248, 244));
        jPanel2.add(txtNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 67, 254, 30));

        txtIngredientes1.setBackground(new java.awt.Color(255, 248, 244));
        jPanel2.add(txtIngredientes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 135, 254, 30));

        lblIngredientes1.setText("Ingredientes");
        jPanel2.add(lblIngredientes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 115, -1, -1));

        jLabel2.setText("Disponibilidade");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 183, -1, -1));

        radDisponivel1.setText("Disponível");
        jPanel2.add(radDisponivel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 204, -1, -1));

        radIndisponivel1.setText("Indisponível");
        jPanel2.add(radIndisponivel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 204, -1, -1));

        btnAdicionar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Salvar/Grande/button_salvar.png"))); // NOI18N
        btnAdicionar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Salvar/Grande/button_salvar_clicked.png"))); // NOI18N
        btnAdicionar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Salvar/Grande/button_salvar_swap.png"))); // NOI18N
        btnAdicionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdicionar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 245, 142, 59));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Cancelar/button_cancelar.png"))); // NOI18N
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Cancelar/button_cancelar_clicked.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Cancelar/button_cancelar_swap.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 322, 75, 23));

        lblPreco1.setText("Preço");
        jPanel2.add(lblPreco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 245, -1, -1));

        txtPreco1.setBackground(new java.awt.Color(255, 248, 244));
        txtPreco1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        jPanel2.add(txtPreco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 265, 94, 38));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Redimensionadas/pexels-photo-349610RE.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAdicionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionar1ActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnAdicionar1ActionPerformed

    public String getNome() {
        return this.txtNome1.getText();
    }

    public String getIngredientes() {
        return this.txtIngredientes1.getText();
    }

    public Float getPreco() {
        return Float.parseFloat(this.txtPreco1.getText());
    }

    public boolean getDisponibilidade() {
        if (this.radDisponivel1.isSelected()) {
            return true;
        } else {
            return false;
        }
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
    private javax.swing.JButton btnAdicionar1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblIngredientes1;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblPreco1;
    private javax.swing.JRadioButton radDisponivel1;
    private javax.swing.JRadioButton radIndisponivel1;
    private javax.swing.JTextField txtIngredientes1;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JFormattedTextField txtPreco1;
    // End of variables declaration//GEN-END:variables
}
