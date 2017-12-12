/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.contas;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rafael
 */
public class PainelContas extends javax.swing.JPanel {

    /**
     * Creates new form PainelContas
     */
    public PainelContas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbMesas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();
        lblTotalConta = new javax.swing.JLabel();
        txtTotal = new javax.swing.JFormattedTextField();
        btnFecharConta = new javax.swing.JButton();
        btnAdicionarPedido = new javax.swing.JButton();
        btnAlterarConta = new javax.swing.JButton();
        lblTituloContas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(540, 350));
        setMinimumSize(new java.awt.Dimension(540, 350));
        setPreferredSize(new java.awt.Dimension(540, 350));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbMesas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mesa 1", "Mesa 2", "Mesa 3", "Mesa 4", "Mesa 5", "Mesa 6" }));
        add(cmbMesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 103, 328, -1));

        tblPedidos.setBackground(new java.awt.Color(255, 248, 244));
        tblPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "itemID", "pedidoID", "Pedidos", "Qtd", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPedidos.setColumnSelectionAllowed(true);
        tblPedidos.setGridColor(new java.awt.Color(216, 201, 192));
        tblPedidos.setSelectionBackground(new java.awt.Color(244, 216, 194));
        tblPedidos.setSelectionForeground(new java.awt.Color(81, 56, 39));
        tblPedidos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblPedidos);
        tblPedidos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tblPedidos.getColumnModel().getColumnCount() > 0) {
            tblPedidos.getColumnModel().getColumn(0).setMinWidth(0);
            tblPedidos.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblPedidos.getColumnModel().getColumn(0).setMaxWidth(0);
            tblPedidos.getColumnModel().getColumn(1).setMinWidth(0);
            tblPedidos.getColumnModel().getColumn(1).setPreferredWidth(0);
            tblPedidos.getColumnModel().getColumn(1).setMaxWidth(0);
            tblPedidos.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblPedidos.getColumnModel().getColumn(3).setPreferredWidth(15);
            tblPedidos.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 134, 328, 139));

        lblTotalConta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotalConta.setText("Total");
        add(lblTotalConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 290, -1, -1));

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(102, 255, 102));
        txtTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 284, 146, 33));

        btnFecharConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Fechar Conta/button_fechar-conta.png"))); // NOI18N
        btnFecharConta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Fechar Conta/button_fechar-conta_clicked.png"))); // NOI18N
        btnFecharConta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Fechar Conta/button_fechar-conta_swap.png"))); // NOI18N
        add(btnFecharConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 134, 111, 42));

        btnAdicionarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Adicionar Pedido/button_adicionar-pedido.png"))); // NOI18N
        btnAdicionarPedido.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Adicionar Pedido/button_adicionar-pedido_clicked.png"))); // NOI18N
        btnAdicionarPedido.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Adicionar Pedido/button_adicionar-pedido_swap.png"))); // NOI18N
        add(btnAdicionarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 182, 111, 42));

        btnAlterarConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Alterar Conta/button_alterar-conta.png"))); // NOI18N
        btnAlterarConta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Alterar Conta/button_alterar-conta_clicked.png"))); // NOI18N
        btnAlterarConta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Alterar Conta/button_alterar-conta_swap.png"))); // NOI18N
        add(btnAlterarConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 230, 111, 42));

        lblTituloContas.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTituloContas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/contas.png"))); // NOI18N
        lblTituloContas.setText(" ");
        add(lblTituloContas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Redimensionadas/pexels-photo-349610RE.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 350));
    }// </editor-fold>//GEN-END:initComponents

    public void addBtnFecharContaListener(ActionListener listener){
        this.btnFecharConta.addActionListener(listener);
    }
    
    public void addBtnAlterarContaListener(ActionListener listener){
        this.btnAlterarConta.addActionListener(listener);
    }
    
    public void addBtnAdicionarPedidoListener(ActionListener listener){
        this.btnAdicionarPedido.addActionListener(listener);
    }
    
    public void addCmbMesasListener(ActionListener listener){
        this.cmbMesas.addActionListener(listener);
    }
    
    public void cmbSelectIndex(int index){
        this.cmbMesas.setSelectedIndex(index);
    }
    
    public String getTotal(){
        return this.txtTotal.getText();
    }
    
    public void setTotal(String total){
        this.txtTotal.setText("   R$ "+total);
    }
            
    public int getNumMesa(){
        String mesa = String.valueOf(this.cmbMesas.getSelectedItem());
        String[] substrings = mesa.split(" ");
        int numMesa = Integer.parseInt(substrings[1]);
        return numMesa;
    }
    
    public DefaultTableModel getModeloTabela(){
        return (DefaultTableModel) this.tblPedidos.getModel();
    }
    
    public JTable getTabela(){
        return this.tblPedidos;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarPedido;
    private javax.swing.JButton btnAlterarConta;
    private javax.swing.JButton btnFecharConta;
    private javax.swing.JComboBox<String> cmbMesas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTituloContas;
    private javax.swing.JLabel lblTotalConta;
    private javax.swing.JTable tblPedidos;
    private javax.swing.JFormattedTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
