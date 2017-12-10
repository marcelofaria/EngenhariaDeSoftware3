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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloCriarCardapio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTituloCriarCardapio.setText("Criar cardápio");
        jPanel1.add(lblTituloCriarCardapio, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 44, -1, -1));

        lblDia.setText("Dia");
        jPanel1.add(lblDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 100, -1, -1));

        cmbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado" }));
        jPanel1.add(cmbDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 91, 312, 33));

        tblItens.setBackground(new java.awt.Color(255, 248, 244));
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
        tblItens.setGridColor(new java.awt.Color(216, 201, 192));
        tblItens.setSelectionBackground(new java.awt.Color(244, 216, 194));
        tblItens.setSelectionForeground(new java.awt.Color(81, 56, 39));
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 135, 456, 109));

        btnCriarCardapio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Criar Cardápio/button_criar-cardapio.png"))); // NOI18N
        btnCriarCardapio.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Criar Cardápio/button_criar-cardapio_clicked.png"))); // NOI18N
        btnCriarCardapio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Criar Cardápio/button_criar-cardapio_swap.png"))); // NOI18N
        jPanel1.add(btnCriarCardapio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 299, 116, 23));

        btnLimparTudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Limpar Tudo/Comprido/button_limpar-tudo.png"))); // NOI18N
        btnLimparTudo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Limpar Tudo/Comprido/button_limpar-tudo_clicked.png"))); // NOI18N
        btnLimparTudo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Limpar Tudo/Comprido/button_limpar-tudo_swap.png"))); // NOI18N
        jPanel1.add(btnLimparTudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 299, 116, 23));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Sair/Pequeno/button_sair.png"))); // NOI18N
        btnCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Sair/Pequeno/button_sair_clicked.png"))); // NOI18N
        btnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Sair/Pequeno/button_sair_swap.png"))); // NOI18N
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 299, 116, 23));

        txtBuscar.setBackground(new java.awt.Color(255, 248, 244));
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 252, 389, 29));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lupa.png"))); // NOI18N
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 252, 50, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Redimensionadas/pexels-photo-349610RE.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 340));

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblTituloCriarCardapio;
    private javax.swing.JTable tblItens;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
