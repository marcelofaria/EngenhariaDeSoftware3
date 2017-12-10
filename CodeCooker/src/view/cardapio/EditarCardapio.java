/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.cardapio;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashSet;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rafael
 */
public class EditarCardapio extends javax.swing.JFrame {

    private static HashSet<Integer> selectedItems;

    /**
     * Creates new form EditarCardápio
     */
    public EditarCardapio() {
        selectedItems = new HashSet<>();
        initComponents();
        CenteredFrame(this);

        tblIncluir.getColumn("Incluir").setCellRenderer(new DefaultTableCellRenderer() {
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JCheckBox j = new JCheckBox();
                j.setSelected(((Boolean) value).booleanValue());
                j.setHorizontalAlignment(CENTER);
                return j;
            }
        });

        tblExcluir.getColumn("Incluso").setCellRenderer(new DefaultTableCellRenderer() {
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JCheckBox j = new JCheckBox();
                j.setSelected(((Boolean) value).booleanValue());
                j.setHorizontalAlignment(CENTER);
                return j;
            }
        });

        tblIncluir.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                JTable table = (JTable) mouseEvent.getSource();
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                if (table.getSelectedColumn() == 1) {
                    int row = table.rowAtPoint(mouseEvent.getPoint());
                    Boolean value = (Boolean) model.getValueAt(row, 1);
                    if (!value) {
                        value = true;
                        if (!EditarCardapio.getSelectedItems().contains(model.getValueAt(row, 0))) {
                            EditarCardapio.getSelectedItems().add((Integer) model.getValueAt(row, 0));
                        }
                        DefaultTableModel modeloTblExcluir = (DefaultTableModel) tblExcluir.getModel();
                        modeloTblExcluir.addRow(new Object[]{model.getValueAt(row, 0), value, model.getValueAt(row, 2), model.getValueAt(row, 3)});
                        model.removeRow(row);
                    }
                }
            }
        });

        tblExcluir.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                JTable table = (JTable) mouseEvent.getSource();
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                if (table.getSelectedColumn() == 1) {
                    int row = table.rowAtPoint(mouseEvent.getPoint());
                    Boolean value = (Boolean) model.getValueAt(row, 1);
                    if (value) {
                        value = false;
                        if (EditarCardapio.getSelectedItems().contains(model.getValueAt(row, 0))) {
                            EditarCardapio.getSelectedItems().remove(model.getValueAt(row, 0));
                        }
                        DefaultTableModel modeloTblIncluir = (DefaultTableModel) tblIncluir.getModel();
                        modeloTblIncluir.addRow(new Object[]{model.getValueAt(row, 0), value, model.getValueAt(row, 2), model.getValueAt(row, 3)});
                        model.removeRow(row);
                    }
                }
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTituloCriarCardapio = new javax.swing.JLabel();
        cmbDia = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblExcluir = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblIncluir = new javax.swing.JTable();
        btnLimparTudo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloCriarCardapio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTituloCriarCardapio.setText("Editar Cardápio");
        jPanel1.add(lblTituloCriarCardapio, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 26, -1, -1));

        cmbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado" }));
        jPanel1.add(cmbDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 81, 333, 30));

        jLabel1.setText("Dia");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 89, -1, -1));

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Salvar/button_salvar.png"))); // NOI18N
        btnSalvar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Salvar/button_salvar_clicked.png"))); // NOI18N
        btnSalvar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Salvar/button_salvar_swap.png"))); // NOI18N
        jPanel1.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 325, 91, 29));

        tblExcluir.setBackground(new java.awt.Color(255, 248, 244));
        tblExcluir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "itemID", "Incluso", "Nome", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblExcluir.setGridColor(new java.awt.Color(216, 201, 192));
        tblExcluir.setSelectionBackground(new java.awt.Color(244, 216, 194));
        tblExcluir.setSelectionForeground(new java.awt.Color(81, 56, 39));
        jScrollPane2.setViewportView(tblExcluir);
        if (tblExcluir.getColumnModel().getColumnCount() > 0) {
            tblExcluir.getColumnModel().getColumn(0).setMinWidth(0);
            tblExcluir.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblExcluir.getColumnModel().getColumn(0).setMaxWidth(0);
            tblExcluir.getColumnModel().getColumn(1).setPreferredWidth(15);
            tblExcluir.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblExcluir.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 129, 332, 178));

        btnBuscar.setBackground(new java.awt.Color(255, 248, 244));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Vazio/button_clicked.png"))); // NOI18N
        btnBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Vazio/button_clicked.png"))); // NOI18N
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 325, 50, 29));

        txtBuscar.setBackground(new java.awt.Color(255, 248, 244));
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 325, 258, 29));

        tblIncluir.setBackground(new java.awt.Color(255, 248, 244));
        tblIncluir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "itemID", "Incluir", "Nome", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblIncluir.setGridColor(new java.awt.Color(216, 201, 192));
        tblIncluir.setSelectionBackground(new java.awt.Color(244, 216, 194));
        tblIncluir.setSelectionForeground(new java.awt.Color(81, 56, 39));
        jScrollPane1.setViewportView(tblIncluir);
        if (tblIncluir.getColumnModel().getColumnCount() > 0) {
            tblIncluir.getColumnModel().getColumn(0).setMinWidth(0);
            tblIncluir.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblIncluir.getColumnModel().getColumn(0).setMaxWidth(0);
            tblIncluir.getColumnModel().getColumn(1).setPreferredWidth(15);
            tblIncluir.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblIncluir.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 129, 332, 178));

        btnLimparTudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Limpar Tudo/button_limpar-tudo.png"))); // NOI18N
        btnLimparTudo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Limpar Tudo/button_limpar-tudo_clicked.png"))); // NOI18N
        btnLimparTudo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Limpar Tudo/button_limpar-tudo_swap.png"))); // NOI18N
        jPanel1.add(btnLimparTudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 325, 91, 29));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Cancelar/Maior/button_cancelar.png"))); // NOI18N
        btnCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Cancelar/Maior/button_cancelar_clicked.png"))); // NOI18N
        btnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Cancelar/Maior/button_cancelar_swap.png"))); // NOI18N
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 325, 91, 29));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Redimensionadas/pexels-photo-349610712x367.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void addBtnBuscarListener(ActionListener listener){
        this.btnBuscar.addActionListener(listener);
    }
    
    public void addBtnCancelarListener(ActionListener listener){
        this.btnCancelar.addActionListener(listener);
    }
    
    public void addBtnSalvarListener(ActionListener listener){
        this.btnSalvar.addActionListener(listener);
    }
    
    public void addBtnLimparTudoListener(ActionListener listener){
        this.btnLimparTudo.addActionListener(listener);
    }
    
    public void addCmbDiaListener(ActionListener listener){
        this.cmbDia.addActionListener(listener);
    }
    
    public static HashSet<Integer> getSelectedItems() {
        return EditarCardapio.selectedItems;
    }
    
    public String getDia(){
        return String.valueOf(this.cmbDia.getSelectedItem());
    }
    
    public void setDia(String dia){
        if(dia.compareTo("Segunda-feira") == 0){
            this.cmbDia.setSelectedIndex(0);
        }
        else if(dia.compareTo("Terça-feira") == 0){
            this.cmbDia.setSelectedIndex(1);
        }
        else if(dia.compareTo("Quarta-feira") == 0){
            this.cmbDia.setSelectedIndex(2);
        }
        else if(dia.compareTo("Quinta-feira") == 0){
            this.cmbDia.setSelectedIndex(3);
        }
        else if(dia.compareTo("Sexta-feira") == 0){
            this.cmbDia.setSelectedIndex(4);
        }
        else if(dia.compareTo("Sábado") == 0){
            this.cmbDia.setSelectedIndex(5);
        }
    }
    
    public String getBusca(){
        return this.txtBuscar.getText();
    }
    
    public DefaultTableModel getModeloTblIncluir(){
        return (DefaultTableModel) this.tblIncluir.getModel();
    }
    
    public DefaultTableModel getModeloTblExcluir(){
        return (DefaultTableModel) this.tblExcluir.getModel();
    }
    
    public void addModeloTblIncluirListener(TableModelListener listener){
        this.tblIncluir.getModel().addTableModelListener(listener);
    }
    
    public void addModeloTblExcluir(TableModelListener listener){
        this.tblExcluir.getModel().addTableModelListener(listener);
    }
    
    public void CenteredFrame(javax.swing.JFrame objFrame) {
        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
        int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
        int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
        objFrame.setLocation(iCoordX, iCoordY);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimparTudo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbDia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTituloCriarCardapio;
    private javax.swing.JTable tblExcluir;
    private javax.swing.JTable tblIncluir;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
