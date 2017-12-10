/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.cardapio;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rafael
 */
public class MostrarCardapio extends javax.swing.JFrame {

    /**
     * Creates new form MostrarCardapio
     */
    public MostrarCardapio() {
        initComponents();
        CenteredFrame(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItens = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        lblTituloCriarCardapio = new javax.swing.JLabel();
        lblDia = new javax.swing.JLabel();
        cmbDia = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 340));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblItens.setBackground(new java.awt.Color(255, 248, 244));
        tblItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "itemID", "Nome", "Tipo", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Float.class
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
        tblItens.setFocusable(false);
        tblItens.setGridColor(new java.awt.Color(216, 201, 192));
        tblItens.setSelectionBackground(new java.awt.Color(244, 216, 194));
        tblItens.setSelectionForeground(new java.awt.Color(81, 56, 39));
        jScrollPane1.setViewportView(tblItens);
        if (tblItens.getColumnModel().getColumnCount() > 0) {
            tblItens.getColumnModel().getColumn(0).setMinWidth(0);
            tblItens.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblItens.getColumnModel().getColumn(0).setMaxWidth(0);
            tblItens.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblItens.getColumnModel().getColumn(2).setPreferredWidth(20);
            tblItens.getColumnModel().getColumn(3).setPreferredWidth(60);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 113, 456, 146));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Sair/button_sair.png"))); // NOI18N
        btnCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Sair/button_sair_clicked.png"))); // NOI18N
        btnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Sair/button_sair_swap.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 277, 198, 23));

        lblTituloCriarCardapio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTituloCriarCardapio.setText("Cardápios");
        jPanel1.add(lblTituloCriarCardapio, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 22, -1, -1));

        lblDia.setText("Dia");
        jPanel1.add(lblDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 78, -1, -1));

        cmbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado" }));
        jPanel1.add(cmbDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 69, 312, 33));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Redimensionadas/pexels-photo-349610RE.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 320));

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

    public void addCmbDiaListener(ActionListener listener){
        this.cmbDia.addActionListener(listener);
    }
    
    public String getDia(){
        return String.valueOf(this.cmbDia.getSelectedItem());
    }
    
    public DefaultTableModel getModeloTabela() {
        return (DefaultTableModel) this.tblItens.getModel();
    }

    public JTable getTabela() {
        return this.tblItens;
    }
    
    public void CenteredFrame(javax.swing.JFrame objFrame) {
        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
        int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
        int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
        objFrame.setLocation(iCoordX, iCoordY);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbDia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblTituloCriarCardapio;
    private javax.swing.JTable tblItens;
    // End of variables declaration//GEN-END:variables
}
