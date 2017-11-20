/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ReservaDAO;
import view.PainelMesas;
import view.ReservaMesa;

/**
 *
 * @author Rafael
 */
public class MesasController {

    private PainelMesas tela;
    private ReservaMesa telaReserva;

    public MesasController(PainelMesas tela) {

        this.tela = tela;
        tela.addBtnMesa1Listener(new btnMesa1Listener());
        tela.addBtnMesa2Listener(new btnMesa2Listener());
        tela.addBtnMesa3Listener(new btnMesa3Listener());
        tela.addBtnMesa4Listener(new btnMesa4Listener());
        tela.addBtnMesa5Listener(new btnMesa5Listener());
        tela.addBtnMesa6Listener(new btnMesa6Listener());
        tela.addBtnReservarListener(new btnReservarListener());
        this.telaReserva = this.tela.getReservaMesaFrame();
        this.telaReserva.addBtnConfirmarListener(new btnConfirmarReservaListener());
        this.telaReserva.addBtnCancelarListener(new btnCancelarReservaListener());

    }

    class btnReservarListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            telaReserva.setVisible(true);
        }
        
    }
    
    class btnConfirmarReservaListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                ReservaDAO rdao = ReservaDAO.getInstance();
                rdao.create(telaReserva.getMesa(), CodeCookerController.getUsuarioID(), telaReserva.getNome(), telaReserva.getDataHora(), telaReserva.getPessoas(), telaReserva.getTelefone());
                JOptionPane.showMessageDialog(null, "Reserva criada com sucesso.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Falha ao criar reserva. Cheque o formulário.");
            }
            
            tela.reservarMesa(telaReserva.getMesa());
            telaReserva.dispose();
            
        }
        
    }
    
    class btnCancelarReservaListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            telaReserva.dispose();
        }
        
    }
    
    class btnMesa1Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int resposta = JOptionPane.showConfirmDialog(
                    null,
                    "Você realmente deseja mudar o status da Mesa 1?",
                    "Mudança de status",
                    JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                tela.switchMesa1Color();
            } else {

            }

        }

    }

    class btnMesa2Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int resposta = JOptionPane.showConfirmDialog(
                    null,
                    "Você realmente deseja mudar o status da Mesa 2?",
                    "Mudança de status",
                    JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                tela.switchMesa2Color();
            } else {

            }

        }

    }

    class btnMesa3Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int resposta = JOptionPane.showConfirmDialog(
                    null,
                    "Você realmente deseja mudar o status da Mesa 3?",
                    "Mudança de status",
                    JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                tela.switchMesa3Color();
            } else {

            }

        }

    }

    class btnMesa4Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int resposta = JOptionPane.showConfirmDialog(
                    null,
                    "Você realmente deseja mudar o status da Mesa 4?",
                    "Mudança de status",
                    JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                tela.switchMesa4Color();
            } else {

            }

        }

    }

    class btnMesa5Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int resposta = JOptionPane.showConfirmDialog(
                    null,
                    "Você realmente deseja mudar o status da Mesa 5?",
                    "Mudança de status",
                    JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                tela.switchMesa5Color();
            } else {

            }

        }

    }

    class btnMesa6Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int resposta = JOptionPane.showConfirmDialog(
                    null,
                    "Você realmente deseja mudar o status da Mesa 6?",
                    "Mudança de status",
                    JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                tela.switchMesa6Color();
            } else {

            }

        }

    }

}
