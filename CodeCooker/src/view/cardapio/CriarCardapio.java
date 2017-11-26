/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.cardapio;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashSet;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafael
 */
public class CriarCardapio extends javax.swing.JFrame {

    public static HashSet<Integer> selectedItems;
    
    /**
     * Creates new form CriarCardapio
     */
    public CriarCardapio() {
        selectedItems = new HashSet<>();
        setLookAndFeel();
        initComponents();
        tblItens.getColumn("Incluir").setCellRenderer(new DefaultTableCellRenderer() {
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JCheckBox j = new JCheckBox();
                j.setSelected(((Boolean) value).booleanValue());
                j.setHorizontalAlignment(CENTER);
                return j;
            }
        });

        tblItens.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                JTable table = (JTable) mouseEvent.getSource();
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                if(table.getSelectedColumn() == 1){
                    int row = table.rowAtPoint(mouseEvent.getPoint());
                    Boolean value = (Boolean) model.getValueAt(row, 1);
                    if(value){
                        value = false;
                        if(CriarCardapio.getSelectedItems().contains(model.getValueAt(row, 0))){
                            CriarCardapio.getSelectedItems().remove(model.getValueAt(row, 0));
                        }
                        model.setValueAt(value, row, 1);
                    }
                    else{
                        value = true;
                        CriarCardapio.getSelectedItems().add((Integer) model.getValueAt(row, 0));
                        model.setValueAt(value, row, 1);
                    }
                }
            }
        });

        CenteredFrame(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTituloCriarCardapio = new javax.swing.JLabel();
        lblDia = new javax.swing.JLabel();
        cmbDia = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItens = new javax.swing.JTable();
        btnCriarCardapio = new javax.swing.JButton();
        btnLimparTudo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblTituloCriarCardapio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTituloCriarCardapio.setText("Criar cardápio");

        lblDia.setText("Dia");

        cmbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado" }));

        tblItens.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblItens);
        if (tblItens.getColumnModel().getColumnCount() > 0) {
            tblItens.getColumnModel().getColumn(0).setMinWidth(0);
            tblItens.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblItens.getColumnModel().getColumn(0).setMaxWidth(0);
            tblItens.getColumnModel().getColumn(1).setPreferredWidth(10);
            tblItens.getColumnModel().getColumn(2).setPreferredWidth(260);
            tblItens.getColumnModel().getColumn(3).setMinWidth(45);
            tblItens.getColumnModel().getColumn(3).setPreferredWidth(60);
        }

        btnCriarCardapio.setText("Criar cardapio");

        btnLimparTudo.setText("Limpar tudo");

        btnCancelar.setText("Sair");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lupa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(lblTituloCriarCardapio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lblDia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnCriarCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(46, 46, 46)
                            .addComponent(btnLimparTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblTituloCriarCardapio)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDia)
                    .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnCriarCardapio)
                    .addComponent(btnLimparTudo)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18))
        );

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

    public static HashSet<Integer> getSelectedItems(){
        return CriarCardapio.selectedItems;
    }
    
    public void addBtnBuscarListener(ActionListener listener) {
        this.btnBuscar.addActionListener(listener);
    }

    public void addBtnCriarCardapioListener(ActionListener listener) {
        this.btnCriarCardapio.addActionListener(listener);
    }

    public void addBtnLimparTudoListener(ActionListener listener) {
        this.btnLimparTudo.addActionListener(listener);
    }

    public void addBtnCancelarListener(ActionListener listener) {
        this.btnCancelar.addActionListener(listener);
    }

    public DefaultTableModel getModeloTabela() {
        return (DefaultTableModel) this.tblItens.getModel();
    }

    public JTable getTabela() {
        return this.tblItens;
    }

    public String getDia() {
        return String.valueOf(this.cmbDia.getSelectedItem());
    }

    public String getBusca() {
        return this.txtBuscar.getText();
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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCriarCardapio;
    private javax.swing.JButton btnLimparTudo;
    private javax.swing.JComboBox<String> cmbDia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblTituloCriarCardapio;
    private javax.swing.JTable tblItens;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
