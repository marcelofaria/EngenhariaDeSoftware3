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

        setMaximumSize(new java.awt.Dimension(518, 351));
        setMinimumSize(new java.awt.Dimension(518, 351));
        setPreferredSize(new java.awt.Dimension(518, 351));

        cmbMesas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mesa 1", "Mesa 2", "Mesa 3", "Mesa 4", "Mesa 5", "Mesa 6" }));

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

        lblTotalConta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotalConta.setText("Total");

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(102, 255, 102));
        txtTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        btnFecharConta.setText("Fechar conta");

        btnAdicionarPedido.setText("Adicionar pedido");

        btnAlterarConta.setText("Alterar conta");

        lblTituloContas.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTituloContas.setText("Contas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTotalConta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                        .addComponent(cmbMesas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFecharConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdicionarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterarConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(lblTituloContas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblTituloContas)
                .addGap(35, 35, 35)
                .addComponent(cmbMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFecharConta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdicionarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalConta))
                .addContainerGap(34, Short.MAX_VALUE))
        );
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTituloContas;
    private javax.swing.JLabel lblTotalConta;
    private javax.swing.JTable tblPedidos;
    private javax.swing.JFormattedTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
