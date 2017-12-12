/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.contas;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.EventListener;
import java.util.HashSet;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import view.cardapio.CriarCardapio;
import view.cardapio.NewJFrame;

/**
 *
 * @author Rafael
 */
public class AlterarConta extends javax.swing.JFrame {

    private static HashSet<Integer> selectedItems;
    
    /**
     * Creates new form AlterarConta
     */
    public AlterarConta() {
        initComponents();
        CenteredFrame(this);

        tblItens.setRowHeight(34);

        tblItens.getColumn("Excl").setCellRenderer(new DefaultTableCellRenderer() {
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JCheckBox j = new JCheckBox();
                j.setSelected(((Boolean) value).booleanValue());
                j.setHorizontalAlignment(CENTER);
                return j;
            }
        });

        tblItens.getColumn("Alt").setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JButton j = new JButton(new ImageIcon(getClass().getResource("/image/pencil.png")));
                j.setPreferredSize(new Dimension(34, 34));
                j.setMaximumSize(new Dimension(34, 34));
                j.setMinimumSize(new Dimension(34, 34));
                j.setHorizontalAlignment(CENTER);
                return j;
            }
        });
        
        tblItens.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                JTable table = (JTable) mouseEvent.getSource();
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                if(table.getSelectedColumn() == 4){
                    int row = table.rowAtPoint(mouseEvent.getPoint());
                    Boolean value = (Boolean) model.getValueAt(row, 4);
                    if(value){
                        value = false;
                        AlterarConta.getSelectedItems().remove((Integer) model.getValueAt(row, 1));
                        model.setValueAt(value, row, 4);
                    }
                    else{
                        value = true;
                        AlterarConta.getSelectedItems().add((Integer) model.getValueAt(row, 1));
                        model.setValueAt(value, row, 4);
                    }
                }
                else if(table.getSelectedColumn() == 5){
                    int row = table.rowAtPoint(mouseEvent.getPoint());
                    AdicionarPedido ap = new AdicionarPedido();
                    ap.setVisible(true);
                    ap.addWindowListener(new WindowAdapter(){
                        @Override
                            public void windowIconified(WindowEvent e) {
                                model.setValueAt(ap.getQtd(), row, 3);
                                ap.setVisible(false);
                            }
                    });
                }
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItens = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblItens.setBackground(new java.awt.Color(255, 248, 244));
        tblItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "itemID", "pedidoID", "Pedido", "Qtd", "Excl", "Alt"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblItens.setGridColor(new java.awt.Color(216, 201, 192));
        tblItens.setSelectionBackground(new java.awt.Color(244, 216, 194));
        tblItens.setSelectionForeground(new java.awt.Color(81, 56, 39));
        jScrollPane1.setViewportView(tblItens);
        if (tblItens.getColumnModel().getColumnCount() > 0) {
            tblItens.getColumnModel().getColumn(0).setMinWidth(0);
            tblItens.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblItens.getColumnModel().getColumn(0).setMaxWidth(0);
            tblItens.getColumnModel().getColumn(1).setMinWidth(0);
            tblItens.getColumnModel().getColumn(1).setPreferredWidth(0);
            tblItens.getColumnModel().getColumn(1).setMaxWidth(0);
            tblItens.getColumnModel().getColumn(2).setPreferredWidth(160);
            tblItens.getColumnModel().getColumn(3).setPreferredWidth(5);
            tblItens.getColumnModel().getColumn(4).setPreferredWidth(5);
            tblItens.getColumnModel().getColumn(5).setPreferredWidth(25);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 95, 277, 118));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/allt_pedido.png"))); // NOI18N
        jLabel1.setText(" ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 270, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Cancelar/Maior/button_cancelar.png"))); // NOI18N
        btnCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Cancelar/Maior/button_cancelar_clicked.png"))); // NOI18N
        btnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Cancelar/Maior/button_cancelar_swap.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 242, 91, 29));

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Salvar/button_salvar.png"))); // NOI18N
        btnSalvar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Salvar/button_salvar_clicked.png"))); // NOI18N
        btnSalvar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Salvar/button_salvar_swap.png"))); // NOI18N
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 242, 91, 29));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Redimensionadas/pexels-photo-349610RE.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    public static HashSet<Integer> getSelectedItems(){
        return CriarCardapio.selectedItems;
    }
    
    public void addBtnSalvarListener(ActionListener listener){
        this.btnSalvar.addActionListener(listener);
    }
    
    public DefaultTableModel getModeloTabela(){
        return (DefaultTableModel) this.tblItens.getModel();
    }
    
    public void CenteredFrame(javax.swing.JFrame objFrame) {
        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
        int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
        int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
        objFrame.setLocation(iCoordX, iCoordY);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblItens;
    // End of variables declaration//GEN-END:variables
}
