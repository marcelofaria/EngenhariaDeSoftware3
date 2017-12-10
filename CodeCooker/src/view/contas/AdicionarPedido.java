/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.contas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import javax.swing.JComponent;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author Rafael
 */
public class AdicionarPedido extends javax.swing.JFrame {

    /**
     * Creates new form AdicionarPedido
     */
    public AdicionarPedido() {
        initComponents();
        CenteredFrame(this);setColors(spnQtd, new Color(255,248,244));
    }
    
    private static void setColors(JSpinner spinner, Color background)
    {
        JComponent editor = spinner.getEditor();
        System.out.println("Editor "+editor);
        int n = editor.getComponentCount();
        for (int i=0; i<n; i++)
        {
            Component c = editor.getComponent(i);
            System.out.println("Component "+i+": "+c);
            if (c instanceof JTextField)
            {
                c.setBackground(background);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        spnQtd = new javax.swing.JSpinner();
        btnOk = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Quantidade");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 45, -1, -1));
        jPanel1.add(spnQtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 37, 38, 30));

        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/OK/button_ok.png"))); // NOI18N
        btnOk.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/OK/button_ok_clicked.png"))); // NOI18N
        btnOk.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/OK/button_ok_swap.png"))); // NOI18N
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        jPanel1.add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 37, 86, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Redimensionadas/pexels-photo-349610RE.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnOkActionPerformed

    public int getQtd(){
        return Integer.parseInt(String.valueOf(this.spnQtd.getValue()));
    }
    
    public void CenteredFrame(javax.swing.JFrame objFrame) {
        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
        int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
        int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
        objFrame.setLocation(iCoordX, iCoordY);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner spnQtd;
    // End of variables declaration//GEN-END:variables
}
