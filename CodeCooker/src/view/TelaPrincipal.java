/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.CodeCookerController;
import java.awt.Component;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

/**
 *
 * @author Marcelo
 */
public class TelaPrincipal extends javax.swing.JFrame {

    CodeCookerController baseController;
    
    /**
     *
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        setLookAndFeel();
        baseController = new CodeCookerController();
        initComponents();
        lblImagemCozinheiro.add(lblTitulo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabMesas = new javax.swing.JTabbedPane();
        pnlHome = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblImagemCozinheiro = new javax.swing.JLabel();
        pnlMesas = new javax.swing.JPanel();
        pnlCardapio = new javax.swing.JPanel();
        pnlItens = new javax.swing.JPanel();
        pnlContas = new javax.swing.JPanel();
        pnlEstoque = new javax.swing.JPanel();
        pnlFinancas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tabMesas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabMesas.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tabMesas.setToolTipText("");
        tabMesas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabMesas.setMinimumSize(new java.awt.Dimension(110, 50));
        tabMesas.setPreferredSize(new java.awt.Dimension(433, 230));
        tabMesas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabMesasStateChanged(evt);
            }
        });

        pnlHome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnlHome.setMaximumSize(new java.awt.Dimension(25, 25));

        btnLogin.setText("Conectar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Ubuntu", 1, 28)); // NOI18N
        lblTitulo.setText("CodeCookers");

        txtUsuario.setToolTipText("");
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        lblUsuario.setText("Usuario");

        lblSenha.setText("Senha");

        lblImagemCozinheiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cozinheiro.jpg"))); // NOI18N

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHomeLayout.createSequentialGroup()
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLogin)
                            .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblUsuario)
                                .addComponent(lblSenha))))
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(lblImagemCozinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(91, 91, 91)
                        .addComponent(lblUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSenha)
                        .addGap(3, 3, 3)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLogin))
                    .addComponent(lblImagemCozinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabMesas.addTab("", new javax.swing.ImageIcon(getClass().getResource("/image/casa.png")), pnlHome, ""); // NOI18N

        pnlMesas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMesas.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout pnlMesasLayout = new javax.swing.GroupLayout(pnlMesas);
        pnlMesas.setLayout(pnlMesasLayout);
        pnlMesasLayout.setHorizontalGroup(
            pnlMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlMesasLayout.setVerticalGroup(
            pnlMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tabMesas.addTab("", new javax.swing.ImageIcon(getClass().getResource("/image/pixel_round_table_by_shi_ju-d7gxbbg.png")), pnlMesas); // NOI18N

        javax.swing.GroupLayout pnlCardapioLayout = new javax.swing.GroupLayout(pnlCardapio);
        pnlCardapio.setLayout(pnlCardapioLayout);
        pnlCardapioLayout.setHorizontalGroup(
            pnlCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlCardapioLayout.setVerticalGroup(
            pnlCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tabMesas.addTab("", new javax.swing.ImageIcon(getClass().getResource("/image/menu.png")), pnlCardapio); // NOI18N

        javax.swing.GroupLayout pnlItensLayout = new javax.swing.GroupLayout(pnlItens);
        pnlItens.setLayout(pnlItensLayout);
        pnlItensLayout.setHorizontalGroup(
            pnlItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlItensLayout.setVerticalGroup(
            pnlItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tabMesas.addTab("", new javax.swing.ImageIcon(getClass().getResource("/image/sandwich.png")), pnlItens); // NOI18N

        javax.swing.GroupLayout pnlContasLayout = new javax.swing.GroupLayout(pnlContas);
        pnlContas.setLayout(pnlContasLayout);
        pnlContasLayout.setHorizontalGroup(
            pnlContasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlContasLayout.setVerticalGroup(
            pnlContasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
        );

        tabMesas.addTab("", new javax.swing.ImageIcon(getClass().getResource("/image/conta.png")), pnlContas); // NOI18N

        javax.swing.GroupLayout pnlEstoqueLayout = new javax.swing.GroupLayout(pnlEstoque);
        pnlEstoque.setLayout(pnlEstoqueLayout);
        pnlEstoqueLayout.setHorizontalGroup(
            pnlEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlEstoqueLayout.setVerticalGroup(
            pnlEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
        );

        tabMesas.addTab("", new javax.swing.ImageIcon(getClass().getResource("/image/Cardboard_Box_Closed.png")), pnlEstoque); // NOI18N

        javax.swing.GroupLayout pnlFinancasLayout = new javax.swing.GroupLayout(pnlFinancas);
        pnlFinancas.setLayout(pnlFinancasLayout);
        pnlFinancasLayout.setHorizontalGroup(
            pnlFinancasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlFinancasLayout.setVerticalGroup(
            pnlFinancasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
        );

        tabMesas.addTab("", new javax.swing.ImageIcon(getClass().getResource("/image/money.png")), pnlFinancas); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabMesasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabMesasStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tabMesasStateChanged

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    public static void setLookAndFeel() {
    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch(Exception e) {
      System.out.println("Error setting native LAF: " + e);
    }
}
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        String u;
        String senha;
        
        u = txtUsuario.getText();
        senha = String.valueOf(txtSenha.getPassword());

        int res = baseController.autUsuario(u, senha);
        if(res != 0){
            
            if(res == 1){
                JOptionPane.showMessageDialog(null, "Voce logou! Voce é um Caixa");
                dispose();
                
            }
            else if(res == 2){
                JOptionPane.showMessageDialog(null, "Voce logou! Voce é um Metre");
                dispose();
                
            }
            else if(res == 3){
                JOptionPane.showMessageDialog(null, "Voce logou! Voce é um Gerente");
                dispose();
                Mesas m = new Mesas();
                m.setVisible(true);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Voce nao foi identificado");
        }      
        
        
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
                
            }
      
            
            
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblImagemCozinheiro;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlCardapio;
    private javax.swing.JPanel pnlContas;
    private javax.swing.JPanel pnlEstoque;
    private javax.swing.JPanel pnlFinancas;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlItens;
    private javax.swing.JPanel pnlMesas;
    private javax.swing.JTabbedPane tabMesas;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
