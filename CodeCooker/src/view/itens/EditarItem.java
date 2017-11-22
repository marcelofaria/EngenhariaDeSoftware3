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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(337, 366));
        setMinimumSize(new java.awt.Dimension(337, 366));
        setPreferredSize(new java.awt.Dimension(337, 366));
        setResizable(false);

        lblNome1.setText("Nome");

        lblIngredientes1.setText("Ingredientes");

        jLabel2.setText("Disponibilidade");

        radDisponivel1.setText("Disponível");

        radIndisponivel1.setText("Indisponível");

        btnAdicionar1.setText("Salvar");
        btnAdicionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionar1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblPreco1.setText("Preço");

        txtPreco1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(lblIngredientes1)
                            .addComponent(lblNome1)
                            .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(radDisponivel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radIndisponivel1))
                            .addComponent(txtIngredientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblPreco1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtPreco1))
                        .addGap(18, 18, 18)
                        .addComponent(btnAdicionar1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblNome1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblIngredientes1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIngredientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radDisponivel1)
                    .addComponent(radIndisponivel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdicionar1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblPreco1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPreco1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

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
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAdicionar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblIngredientes;
    private javax.swing.JLabel lblIngredientes1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblPreco1;
    private javax.swing.JRadioButton radDisponivel;
    private javax.swing.JRadioButton radDisponivel1;
    private javax.swing.JRadioButton radIndisponivel;
    private javax.swing.JRadioButton radIndisponivel1;
    private javax.swing.JTextField txtIngredientes;
    private javax.swing.JTextField txtIngredientes1;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JFormattedTextField txtPreco;
    private javax.swing.JFormattedTextField txtPreco1;
    // End of variables declaration//GEN-END:variables
}
