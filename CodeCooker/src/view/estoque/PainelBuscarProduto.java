/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.estoque;

import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dulcina
 */
public class PainelBuscarProduto extends javax.swing.JFrame {

    DefaultTableModel modelo;
    
    public PainelBuscarProduto() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void addBtnBuscarListener(ActionListener listener){
        this.btnBuscar.addActionListener(listener);
    }
    
    public void addBtnCancelarListener(ActionListener listener){
        this.btnCancelar.addActionListener(listener);
    }
    
    public String getNomeProd(){
        return txtBuscarProduto.getText();
    }
    
    public void instanciarTabela(){
        modelo = (DefaultTableModel) tblTabela.getModel();
    }
    
    public void preencherTabela(Object [] o){

        modelo.addRow(new Object[]{o[0], o[1], o[2], o[3]});
        
    }
    
    public void limparTabela(){
        if(modelo.getRowCount() > 0){
            while(modelo.getRowCount() > 0)
            {
                modelo.removeRow(0);
            }
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBuscarProduto = new javax.swing.JLabel();
        txtBuscarProduto = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBuscarProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBuscarProduto.setText("Buscar Produto");
        getContentPane().add(lblBuscarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 22, -1, -1));

        txtBuscarProduto.setBackground(new java.awt.Color(255, 248, 248));
        getContentPane().add(txtBuscarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 57, 224, 30));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Buscar/Buscar Pequeno/button_buscar.png"))); // NOI18N
        btnBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Buscar/Buscar Pequeno/button_buscar_clicked.png"))); // NOI18N
        btnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Buscar/Buscar Pequeno/button_buscar_swap.png"))); // NOI18N
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 57, 108, 30));

        tblTabela.setBackground(new java.awt.Color(255, 248, 244));
        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Marca", "Fornecedor", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblTabela.setGridColor(new java.awt.Color(216, 201, 192));
        tblTabela.setSelectionBackground(new java.awt.Color(244, 216, 194));
        tblTabela.setSelectionForeground(new java.awt.Color(81, 56, 39));
        jScrollPane1.setViewportView(tblTabela);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 125, 400, 108));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Cancelar/button_cancelar.png"))); // NOI18N
        btnCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Cancelar/button_cancelar_clicked.png"))); // NOI18N
        btnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Cancelar/button_cancelar_swap.png"))); // NOI18N
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 263, 75, 23));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Redimensionadas/pexels-photo-349610RE400x310.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscarProduto;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtBuscarProduto;
    // End of variables declaration//GEN-END:variables
}
