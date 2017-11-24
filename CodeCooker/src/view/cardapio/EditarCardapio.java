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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTituloCriarCardapio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTituloCriarCardapio.setText("Editar Cardápio");

        cmbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado" }));

        jLabel1.setText("Dia");

        btnSalvar.setText("Salvar");

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
        jScrollPane2.setViewportView(tblExcluir);
        if (tblExcluir.getColumnModel().getColumnCount() > 0) {
            tblExcluir.getColumnModel().getColumn(0).setMinWidth(0);
            tblExcluir.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblExcluir.getColumnModel().getColumn(0).setMaxWidth(0);
            tblExcluir.getColumnModel().getColumn(1).setPreferredWidth(15);
            tblExcluir.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblExcluir.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lupa.png"))); // NOI18N

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
        jScrollPane1.setViewportView(tblIncluir);
        if (tblIncluir.getColumnModel().getColumnCount() > 0) {
            tblIncluir.getColumnModel().getColumn(0).setMinWidth(0);
            tblIncluir.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblIncluir.getColumnModel().getColumn(0).setMaxWidth(0);
            tblIncluir.getColumnModel().getColumn(1).setPreferredWidth(15);
            tblIncluir.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblIncluir.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        btnLimparTudo.setText("Limpar Tudo");

        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(lblTituloCriarCardapio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimparTudo)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTituloCriarCardapio)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLimparTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTituloCriarCardapio;
    private javax.swing.JTable tblExcluir;
    private javax.swing.JTable tblIncluir;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
