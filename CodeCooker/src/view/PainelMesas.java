/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.event.ActionListener;

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
    }

    public ReservaMesa getReservaMesaFrame(){
        return new ReservaMesa();
    }
    
    public void addBtnReservarListener(ActionListener listener){
        this.btnReservarMesa.addActionListener(listener);
    }
    
    public void addBtnMesa1Listener(ActionListener listener){
        this.btnMesa1.addActionListener(listener);
    }
    
    public void addBtnMesa2Listener(ActionListener listener){
        this.btnMesa2.addActionListener(listener);
    }
    
    public void addBtnMesa3Listener(ActionListener listener){
        this.btnMesa3.addActionListener(listener);
    }
    
    public void addBtnMesa4Listener(ActionListener listener){
        this.btnMesa4.addActionListener(listener);
    }
    
    public void addBtnMesa5Listener(ActionListener listener){
        this.btnMesa5.addActionListener(listener);
    }
    
    public void addBtnMesa6Listener(ActionListener listener){
        this.btnMesa6.addActionListener(listener);
    }
    
    public void switchMesa1Color(){
        
        if(this.btnMesa1.getForeground().getRed() == 102){
            this.btnMesa1.setForeground(new Color(255, 102, 102));
            this.btnMesa1.setBackground(new Color(255, 102, 102));
        }
        else{
            this.btnMesa1.setForeground(new Color(102, 255, 102));
            this.btnMesa1.setBackground(new Color(102, 255, 102));
        }
        
    }
    
    public void switchMesa2Color(){
        
        if(this.btnMesa2.getForeground().getRed() == 102){
            this.btnMesa2.setForeground(new Color(255, 102, 102));
            this.btnMesa2.setBackground(new Color(255, 102, 102));
        }
        else{
            this.btnMesa2.setForeground(new Color(102, 255, 102));
            this.btnMesa2.setBackground(new Color(102, 255, 102));
        }
        
    }
    
    public void switchMesa3Color(){
        
        if(this.btnMesa3.getForeground().getRed() == 102){
            this.btnMesa3.setForeground(new Color(255, 102, 102));
            this.btnMesa3.setBackground(new Color(255, 102, 102));
        }
        else{
            this.btnMesa3.setForeground(new Color(102, 255, 102));
            this.btnMesa3.setBackground(new Color(102, 255, 102));
        }
        
    }
    
    public void switchMesa4Color(){
        
        if(this.btnMesa4.getForeground().getRed() == 102){
            this.btnMesa4.setForeground(new Color(255, 102, 102));
            this.btnMesa4.setBackground(new Color(255, 102, 102));
        }
        else{
            this.btnMesa4.setForeground(new Color(102, 255, 102));
            this.btnMesa4.setBackground(new Color(102, 255, 102));
        }
        
    }
    
    public void switchMesa5Color(){
        
        if(this.btnMesa5.getForeground().getRed() == 102){
            this.btnMesa5.setForeground(new Color(255, 102, 102));
            this.btnMesa5.setBackground(new Color(255, 102, 102));
        }
        else{
            this.btnMesa5.setForeground(new Color(102, 255, 102));
            this.btnMesa5.setBackground(new Color(102, 255, 102));
        }
        
    }
    
    public void switchMesa6Color(){
        
        if(this.btnMesa6.getForeground().getRed() == 102){
            this.btnMesa6.setForeground(new Color(255, 102, 102));
            this.btnMesa6.setBackground(new Color(255, 102, 102));
        }
        else{
            this.btnMesa6.setForeground(new Color(102, 255, 102));
            this.btnMesa6.setBackground(new Color(102, 255, 102));
        }
        
    }
    
    public void reservarMesa(int numMesa){
        
        switch(numMesa){
            
            case 1:
                this.btnMesa1.setBackground(new Color(255,255,102));
                this.btnMesa1.setForeground(new Color(255,255,102));
                break;
                
            case 2:
                this.btnMesa2.setBackground(new Color(255,255,102));
                this.btnMesa2.setForeground(new Color(255,255,102));
                break;
                
            case 3:
                this.btnMesa3.setBackground(new Color(255,255,102));
                this.btnMesa3.setForeground(new Color(255,255,102));
                break;
                
            case 4:
                this.btnMesa4.setBackground(new Color(255,255,102));
                this.btnMesa4.setForeground(new Color(255,255,102));
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
        btnExcluirReserva = new javax.swing.JButton();
        btnMesa1 = new javax.swing.JButton();
        blTituloMesa = new javax.swing.JLabel();
        btnMesa4 = new javax.swing.JButton();
        btnMesa6 = new javax.swing.JButton();
        btnMesa5 = new javax.swing.JButton();

        lblMesa2.setText("Mesa 2");

        lblMesa3.setText("Mesa 3");

        lblMesa4.setText("Mesa 4");

        lblMesa5.setText("Mesa 5");

        btnMesa2.setBackground(new java.awt.Color(102, 255, 102));
        btnMesa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Small_Table.png"))); // NOI18N

        lblMesa6.setText("Mesa 6");

        lblMesa1.setText("Mesa 1");

        btnReservarMesa.setBackground(new java.awt.Color(255, 153, 51));
        btnReservarMesa.setText("Reservar mesa");

        btnMesa3.setBackground(new java.awt.Color(255, 102, 102));
        btnMesa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Small_Table.png"))); // NOI18N

        btnExcluirReserva.setText("Excluir reserva");

        btnMesa1.setBackground(new java.awt.Color(102, 255, 102));
        btnMesa1.setForeground(new java.awt.Color(102, 255, 102));
        btnMesa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Small_Table.png"))); // NOI18N
        btnMesa1.setOpaque(true);

        blTituloMesa.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        blTituloMesa.setText("Mesas");

        btnMesa4.setBackground(new java.awt.Color(255, 102, 102));
        btnMesa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Small_Table.png"))); // NOI18N

        btnMesa6.setBackground(new java.awt.Color(255, 255, 102));
        btnMesa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Small_Table.png"))); // NOI18N

        btnMesa5.setBackground(new java.awt.Color(255, 102, 102));
        btnMesa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Small_Table.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnMesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblMesa4)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMesa6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblMesa5)
                                        .addGap(58, 58, 58))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnMesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(lblMesa6))
                                    .addComponent(btnMesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(blTituloMesa)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMesa1)
                                .addGap(62, 62, 62)
                                .addComponent(lblMesa2)
                                .addGap(69, 69, 69)
                                .addComponent(lblMesa3)))))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReservarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReservarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluirReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(blTituloMesa)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMesa1)
                            .addComponent(lblMesa2)
                            .addComponent(lblMesa3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnMesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnMesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMesa4)
                            .addComponent(lblMesa5)
                            .addComponent(lblMesa6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMesa6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blTituloMesa;
    private javax.swing.JButton btnExcluirReserva;
    private javax.swing.JButton btnMesa1;
    private javax.swing.JButton btnMesa2;
    private javax.swing.JButton btnMesa3;
    private javax.swing.JButton btnMesa4;
    private javax.swing.JButton btnMesa5;
    private javax.swing.JButton btnMesa6;
    private javax.swing.JButton btnReservarMesa;
    private javax.swing.JLabel lblMesa1;
    private javax.swing.JLabel lblMesa2;
    private javax.swing.JLabel lblMesa3;
    private javax.swing.JLabel lblMesa4;
    private javax.swing.JLabel lblMesa5;
    private javax.swing.JLabel lblMesa6;
    // End of variables declaration//GEN-END:variables
}
