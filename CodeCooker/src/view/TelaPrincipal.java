/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.mesas.PainelMesas;
import control.CardapioController;
import view.funcionarios.PainelFuncionario;
import view.itens.PainelItens;
import control.CodeCookerController;
import control.ContasController;
import control.EstoqueController;
import control.FinanceiroController;
import control.FuncionarioController;
import control.ItensController;
import control.MesasController;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import view.cardapio.PainelCardapio;
import view.contas.PainelContas;
import view.estoque.PainelEstoque;
import view.financeiro.PainelFinanceiro;

/**
 *
 * @author Marcelo
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    /**
     * Minha cor
     * #c1a28c
     * #f4d8c2
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        setLookAndFeel();
        initComponents();
        
        CenteredFrame(this);
        lblBemVindo.setVisible(false);
        //lblImagemCozinheiro.add(lblTitulo);
        
    }
    
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

        } catch (InstantiationException ex) {

        } catch (IllegalAccessException ex) {

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {

        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPane = new javax.swing.JTabbedPane();
        pnlHome = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblBemVindo = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CodeCookers");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        tabPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tabPane.setToolTipText("");
        tabPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabPane.setMinimumSize(new java.awt.Dimension(110, 50));
        tabPane.setPreferredSize(new java.awt.Dimension(433, 230));

        pnlHome.setBackground(new java.awt.Color(255, 255, 255));
        pnlHome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnlHome.setMaximumSize(new java.awt.Dimension(25, 25));
        pnlHome.setLayout(null);

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Conectar/button_connect.png"))); // NOI18N
        btnLogin.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Conectar/button_conectar_clicked.png"))); // NOI18N
        btnLogin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Conectar/button_conectar_swap.png"))); // NOI18N
        pnlHome.add(btnLogin);
        btnLogin.setBounds(220, 300, 80, 23);

        lblTitulo.setFont(new java.awt.Font("Ubuntu", 1, 28)); // NOI18N
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/codecookers.png"))); // NOI18N
        lblTitulo.setText(" ");
        pnlHome.add(lblTitulo);
        lblTitulo.setBounds(11, 12, 450, 64);

        txtUsuario.setBackground(new java.awt.Color(255, 248, 244));
        txtUsuario.setToolTipText("");
        pnlHome.add(txtUsuario);
        txtUsuario.setBounds(170, 200, 180, 30);

        txtSenha.setBackground(new java.awt.Color(255, 248, 244));
        pnlHome.add(txtSenha);
        txtSenha.setBounds(170, 260, 180, 30);

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUsuario.setText("Usuario");
        pnlHome.add(lblUsuario);
        lblUsuario.setBounds(170, 180, 50, 14);

        lblSenha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSenha.setText("Senha");
        pnlHome.add(lblSenha);
        lblSenha.setBounds(170, 240, 40, 14);

        lblBemVindo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblBemVindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bem vindo.png"))); // NOI18N
        pnlHome.add(lblBemVindo);
        lblBemVindo.setBounds(150, 140, 214, 40);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pnlHome.add(jLayeredPane1);
        jLayeredPane1.setBounds(233, 31, 100, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Redimensionadas/pexels-photo-349610RE.jpg"))); // NOI18N
        pnlHome.add(jLabel1);
        jLabel1.setBounds(0, 1, 540, 350);

        tabPane.addTab("", new javax.swing.ImageIcon(getClass().getResource("/image/ic_store_black_24dp.png")), pnlHome, ""); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    
    public void PrepararTela(int tipo){
        
        lblUsuario.setVisible(false);
        txtUsuario.setVisible(false);
        lblSenha.setVisible(false);
        txtSenha.setVisible(false);
        btnLogin.setVisible(false);
        lblBemVindo.setVisible(true);
        
        if(tipo == 1){
            tabPane.setEnabledAt(4, true);
        }
        else if(tipo == 2){
            tabPane.setEnabledAt(1, true);
        }
        else if(tipo == 3){
            tabPane.setEnabledAt(1, true);
            tabPane.setEnabledAt(2, true);
            tabPane.setEnabledAt(3, true);
            tabPane.setEnabledAt(4, true);
            tabPane.setEnabledAt(5, true);
            tabPane.setEnabledAt(6, true);
            tabPane.setEnabledAt(7, true);
        }
        
    }
    
    public void addBtnLoginListener(ActionListener listener){
        this.btnLogin.addActionListener(listener);
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JTabbedPane tabPane;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    public String getUsuario(){
        return this.txtUsuario.getText();
    }
    
    public String getSenha(){
        return String.valueOf(this.txtSenha.getPassword());
    }
    
    public JTabbedPane getTabbedPane(){
        return this.tabPane;
    }
    
}
