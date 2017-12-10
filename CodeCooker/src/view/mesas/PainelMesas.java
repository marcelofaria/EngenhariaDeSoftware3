/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.mesas;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class PainelMesas extends javax.swing.JPanel {

    /**
     * Creates new form PainelMesas
     */
    public PainelMesas() {

        initComponents();
        this.btnMesa1.setForeground(new Color(102, 255, 102));
        this.btnMesa1.setBackground(new Color(102, 255, 102));
        this.btnMesa2.setForeground(new Color(102, 255, 102));
        this.btnMesa2.setBackground(new Color(102, 255, 102));
        this.btnMesa3.setForeground(new Color(102, 255, 102));
        this.btnMesa3.setBackground(new Color(102, 255, 102));
        this.btnMesa4.setForeground(new Color(102, 255, 102));
        this.btnMesa4.setBackground(new Color(102, 255, 102));
        this.btnMesa5.setForeground(new Color(102, 255, 102));
        this.btnMesa5.setBackground(new Color(102, 255, 102));
        this.btnMesa6.setForeground(new Color(102, 255, 102));
        this.btnMesa6.setBackground(new Color(102, 255, 102));
    }

    public ReservaMesa getReservaMesaFrame() {
        return new ReservaMesa();
    }

    public ExcluirReserva getExcluirReservaFrame() {
        return new ExcluirReserva();
    }

    public void addBtnReservarListener(ActionListener listener) {
        this.btnReservarMesa.addActionListener(listener);
    }

    public void addBtnExcluirListener(ActionListener listener) {
        this.btnExcluir.addActionListener(listener);
    }

    public void addBtnMesa1Listener(ActionListener listener) {
        this.btnMesa1.addActionListener(listener);
    }

    public void addBtnMesa2Listener(ActionListener listener) {
        this.btnMesa2.addActionListener(listener);
    }

    public void addBtnMesa3Listener(ActionListener listener) {
        this.btnMesa3.addActionListener(listener);
    }

    public void addBtnMesa4Listener(ActionListener listener) {
        this.btnMesa4.addActionListener(listener);
    }

    public void addBtnMesa5Listener(ActionListener listener) {
        this.btnMesa5.addActionListener(listener);
    }

    public void addBtnMesa6Listener(ActionListener listener) {
        this.btnMesa6.addActionListener(listener);
    }

    public int switchMesa1Color() {

        int status;
        //255, 255, 102
        if (this.btnMesa1.getForeground().getRed() == 255
                && this.btnMesa1.getForeground().getGreen() == 255) {
            JOptionPane.showMessageDialog(null, "Essa mesa está reservada. Para excluir a reserva, clique no botão 'Excluir reserva'.");
            return 3;
        }

        if (this.btnMesa1.getForeground().getRed() == 102) {
            status = 1;
            this.btnMesa1.setForeground(new Color(255, 102, 102));
            this.btnMesa1.setBackground(new Color(255, 102, 102));
        } else {
            status = 0;
            this.btnMesa1.setForeground(new Color(102, 255, 102));
            this.btnMesa1.setBackground(new Color(102, 255, 102));
        }

        return status;

    }

    public int switchMesa2Color() {

        int status;
        if (this.btnMesa2.getForeground().getRed() == 255
                && this.btnMesa2.getForeground().getGreen() == 255) {
            JOptionPane.showMessageDialog(null, "Essa mesa está reservada. Para excluir a reserva, clique no botão 'Excluir reserva'.");
            return 3;
        }

        if (this.btnMesa2.getForeground().getRed() == 102) {
            status = 1;
            this.btnMesa2.setForeground(new Color(255, 102, 102));
            this.btnMesa2.setBackground(new Color(255, 102, 102));
        } else {
            status = 0;
            this.btnMesa2.setForeground(new Color(102, 255, 102));
            this.btnMesa2.setBackground(new Color(102, 255, 102));
        }

        return status;

    }

    public int switchMesa3Color() {

        int status;
        if(this.btnMesa3.getForeground().getRed() == 255 &&
           this.btnMesa3.getForeground().getGreen() == 255){
            JOptionPane.showMessageDialog(null, "Essa mesa está reservada. Para excluir a reserva, clique no botão 'Excluir reserva'.");
            return 3;
        }
            

        if (this.btnMesa3.getForeground().getRed() == 102) {
            status = 1;
            this.btnMesa3.setForeground(new Color(255, 102, 102));
            this.btnMesa3.setBackground(new Color(255, 102, 102));
        } else {
            status = 0;
            this.btnMesa3.setForeground(new Color(102, 255, 102));
            this.btnMesa3.setBackground(new Color(102, 255, 102));
        }

        return status;

    }

    public int switchMesa4Color() {

        int status;
        if(this.btnMesa4.getForeground().getRed() == 255 &&
           this.btnMesa4.getForeground().getGreen() == 255){
            JOptionPane.showMessageDialog(null, "Essa mesa está reservada. Para excluir a reserva, clique no botão 'Excluir reserva'.");
            return 3;
        }
        
        if (this.btnMesa4.getForeground().getRed() == 102) {
            status = 1;
            this.btnMesa4.setForeground(new Color(255, 102, 102));
            this.btnMesa4.setBackground(new Color(255, 102, 102));
        } else {
            status = 0;
            this.btnMesa4.setForeground(new Color(102, 255, 102));
            this.btnMesa4.setBackground(new Color(102, 255, 102));
        }

        return status;

    }

    public int switchMesa5Color() {

        int status;
        if(this.btnMesa5.getForeground().getRed() == 255 &&
           this.btnMesa5.getForeground().getGreen() == 255){
            JOptionPane.showMessageDialog(null, "Essa mesa está reservada. Para excluir a reserva, clique no botão 'Excluir reserva'.");
            return 3;
        }
        if (this.btnMesa5.getForeground().getRed() == 102) {
            status = 1;
            this.btnMesa5.setForeground(new Color(255, 102, 102));
            this.btnMesa5.setBackground(new Color(255, 102, 102));
        } else {
            status = 0;
            this.btnMesa5.setForeground(new Color(102, 255, 102));
            this.btnMesa5.setBackground(new Color(102, 255, 102));
        }

        return status;
    }

    public int switchMesa6Color() {

        int status;
        if(this.btnMesa6.getForeground().getRed() == 255 &&
           this.btnMesa6.getForeground().getGreen() == 255){
            JOptionPane.showMessageDialog(null, "Essa mesa está reservada. Para excluir a reserva, clique no botão 'Excluir reserva'.");
            return 3;
        }
        //255, 255, 102
        if (this.btnMesa6.getForeground().getRed() == 102) {
            status = 1;
            this.btnMesa6.setForeground(new Color(255, 102, 102));
            this.btnMesa6.setBackground(new Color(255, 102, 102));
        } else {
            status = 0;
            this.btnMesa6.setForeground(new Color(102, 255, 102));
            this.btnMesa6.setBackground(new Color(102, 255, 102));
        }

        return status;

    }

    public void switchMesaColor(int numMesa) {

        if (numMesa == 1) {
            this.switchMesa1Color();
        } else if (numMesa == 2) {
            this.switchMesa2Color();
        } else if (numMesa == 3) {
            this.switchMesa3Color();
        } else if (numMesa == 4) {
            this.switchMesa4Color();
        } else if (numMesa == 5) {
            this.switchMesa5Color();
        } else if (numMesa == 6) {
            this.switchMesa6Color();
        }
    }

    public void reservarMesa(int numMesa) {

        switch (numMesa) {

            case 1:
                this.btnMesa1.setBackground(new Color(255, 255, 102));
                this.btnMesa1.setForeground(new Color(255, 255, 102));
                break;

            case 2:
                this.btnMesa2.setBackground(new Color(255, 255, 102));
                this.btnMesa2.setForeground(new Color(255, 255, 102));
                break;

            case 3:
                this.btnMesa3.setBackground(new Color(255, 255, 102));
                this.btnMesa3.setForeground(new Color(255, 255, 102));
                break;

            case 4:
                this.btnMesa4.setBackground(new Color(255, 255, 102));
                this.btnMesa4.setForeground(new Color(255, 255, 102));
                break;

            case 5:
                this.btnMesa5.setBackground(new Color(255, 255, 102));
                this.btnMesa5.setForeground(new Color(255, 255, 102));
                break;

            case 6:
                this.btnMesa1.setBackground(new Color(255, 255, 102));
                this.btnMesa1.setForeground(new Color(255, 255, 102));
                break;

        }

    }

    public void liberarMesa(int numMesa) {

        switch (numMesa) {

            case 1:
                this.btnMesa1.setBackground(new Color(102, 255, 102));
                this.btnMesa1.setForeground(new Color(102, 255, 102));
                break;

            case 2:
                this.btnMesa2.setBackground(new Color(102, 255, 102));
                this.btnMesa2.setForeground(new Color(102, 255, 102));
                break;

            case 3:
                this.btnMesa3.setBackground(new Color(102, 255, 102));
                this.btnMesa3.setForeground(new Color(102, 255, 102));
                break;

            case 4:
                this.btnMesa4.setBackground(new Color(102, 255, 102));
                this.btnMesa4.setForeground(new Color(102, 255, 102));
                break;

            case 5:
                this.btnMesa5.setBackground(new Color(102, 255, 102));
                this.btnMesa5.setForeground(new Color(102, 255, 102));
                break;

            case 6:
                this.btnMesa1.setBackground(new Color(102, 255, 102));
                this.btnMesa1.setForeground(new Color(102, 255, 102));
                break;

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

        lblMesa2 = new javax.swing.JLabel();
        lblMesa3 = new javax.swing.JLabel();
        lblMesa4 = new javax.swing.JLabel();
        lblMesa5 = new javax.swing.JLabel();
        btnMesa2 = new javax.swing.JButton();
        lblMesa6 = new javax.swing.JLabel();
        lblMesa1 = new javax.swing.JLabel();
        btnReservarMesa = new javax.swing.JButton();
        btnMesa3 = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnMesa1 = new javax.swing.JButton();
        blTituloMesa = new javax.swing.JLabel();
        btnMesa4 = new javax.swing.JButton();
        btnMesa6 = new javax.swing.JButton();
        btnMesa5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(540, 350));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMesa2.setText("Mesa 2");
        add(lblMesa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        lblMesa3.setText("Mesa 3");
        add(lblMesa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        lblMesa4.setText("Mesa 4");
        add(lblMesa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        lblMesa5.setText("Mesa 5");
        add(lblMesa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        btnMesa2.setBackground(new java.awt.Color(102, 255, 102));
        btnMesa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Small_Table.png"))); // NOI18N
        add(btnMesa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 84, 79));

        lblMesa6.setText("Mesa 6");
        add(lblMesa6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        lblMesa1.setText("Mesa 1");
        add(lblMesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        btnReservarMesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Reservar Mesa/button_reservar-mesa.png"))); // NOI18N
        btnReservarMesa.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Reservar Mesa/button_reservar-mesa_clicked.png"))); // NOI18N
        btnReservarMesa.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Reservar Mesa/button_reservar-mesa_swap.png"))); // NOI18N
        add(btnReservarMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 110, 36));

        btnMesa3.setBackground(new java.awt.Color(102, 255, 102));
        btnMesa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Small_Table.png"))); // NOI18N
        add(btnMesa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 84, 79));

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Excluir Reserva/button_excluir-reserva.png"))); // NOI18N
        btnExcluir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Excluir Reserva/button_excluir-reserva_clicked.png"))); // NOI18N
        btnExcluir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Botões/Excluir Reserva/button_excluir-reserva_swap.png"))); // NOI18N
        add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 110, 36));

        btnMesa1.setBackground(new java.awt.Color(102, 255, 102));
        btnMesa1.setForeground(new java.awt.Color(102, 255, 102));
        btnMesa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Small_Table.png"))); // NOI18N
        btnMesa1.setOpaque(true);
        add(btnMesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 84, 79));

        blTituloMesa.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        blTituloMesa.setText("Mesas");
        add(blTituloMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 25, -1, -1));

        btnMesa4.setBackground(new java.awt.Color(102, 255, 102));
        btnMesa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Small_Table.png"))); // NOI18N
        add(btnMesa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 84, 79));

        btnMesa6.setBackground(new java.awt.Color(102, 255, 102));
        btnMesa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Small_Table.png"))); // NOI18N
        add(btnMesa6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 84, 79));

        btnMesa5.setBackground(new java.awt.Color(102, 255, 102));
        btnMesa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Small_Table.png"))); // NOI18N
        add(btnMesa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 84, 79));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Estilo/Redimensionadas/pexels-photo-349610RE.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 350));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blTituloMesa;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnMesa1;
    private javax.swing.JButton btnMesa2;
    private javax.swing.JButton btnMesa3;
    private javax.swing.JButton btnMesa4;
    private javax.swing.JButton btnMesa5;
    private javax.swing.JButton btnMesa6;
    private javax.swing.JButton btnReservarMesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblMesa1;
    private javax.swing.JLabel lblMesa2;
    private javax.swing.JLabel lblMesa3;
    private javax.swing.JLabel lblMesa4;
    private javax.swing.JLabel lblMesa5;
    private javax.swing.JLabel lblMesa6;
    // End of variables declaration//GEN-END:variables
}
