/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Mesa;
import model.MesaDAO;
import model.Reserva;
import model.ReservaDAO;
import view.mesas.ExcluirReserva;
import view.mesas.PainelMesas;
import view.mesas.ReservaMesa;

/**
 *
 * @author Rafael
 */
public class MesasController {

    private PainelMesas tela;
    private ReservaMesa telaReserva;
    private ExcluirReserva telaExcluir;

    public MesasController(PainelMesas tela) {

        this.tela = tela;
        this.carregarStatusMesas();
        
        tela.addBtnMesa1Listener(new btnMesa1Listener());
        tela.addBtnMesa2Listener(new btnMesa2Listener());
        tela.addBtnMesa3Listener(new btnMesa3Listener());
        tela.addBtnMesa4Listener(new btnMesa4Listener());
        tela.addBtnMesa5Listener(new btnMesa5Listener());
        tela.addBtnMesa6Listener(new btnMesa6Listener());
        tela.addBtnReservarListener(new btnReservarListener());
        tela.addBtnExcluirListener(new btnExcluirListener());
        this.telaReserva = this.tela.getReservaMesaFrame();
        this.telaReserva.addBtnConfirmarListener(new btnConfirmarReservaListener());
        this.telaReserva.addBtnCancelarListener(new btnCancelarReservaListener());

        this.telaExcluir = this.tela.getExcluirReservaFrame();
        this.telaExcluir.addBtnConfirmarListener(new btnConfirmarExcluirListener());
        this.telaExcluir.addBtnCancelarListener(new btnCancelarExcluirListener());
        
    }

    public final void carregarStatusMesas(){
        
        MesaDAO mdao = MesaDAO.getInstance();
        List<Mesa> mesas = mdao.RetrieveAll();
        
        for(Mesa m : mesas){
            if(m.getStatus() == 1){
                tela.switchMesaColor(m.getNumMesa());
            }
            else if(m.getStatus() == 2){
                tela.reservarMesa(m.getNumMesa());
            }
        }        
        
    }
    
    class btnReservarListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            telaReserva.setVisible(true);
        }
        
    }
    
    class btnCancelarExcluirListener implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            telaExcluir.dispose();
        }
    }
    
    class btnConfirmarExcluirListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            ReservaDAO rDAO = ReservaDAO.getInstance();
            List<Reserva> reservas = rDAO.retrieveGeneric("SELECT * FROM reserva WHERE dataEHorario LIKE '" + telaExcluir.getDataHora() + "' "
            + "AND numMesa = " + telaExcluir.getMesa());
            
            if(!reservas.isEmpty()){
                rDAO.delete(reservas.get(0));
                MesaDAO mdao = MesaDAO.getInstance();
                mdao.update(new Mesa(telaExcluir.getMesa(), 0));
                tela.liberarMesa(telaExcluir.getMesa());
                JOptionPane.showMessageDialog(null, "Reserva excluída com sucesso.");
                telaExcluir.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Não foi possível encontrar a reserva.");
            }
            
        }
        
    }
    
    class btnExcluirListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            telaExcluir.setVisible(true);
        }
        
    }
    
    class btnConfirmarReservaListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                ReservaDAO rdao = ReservaDAO.getInstance();
                rdao.create(telaReserva.getMesa(), CodeCookerController.getUsuarioID(), telaReserva.getNome(), telaReserva.getDataHora(), telaReserva.getPessoas(), telaReserva.getTelefone());
                MesaDAO mdao = MesaDAO.getInstance();
                mdao.update(new Mesa(telaReserva.getMesa(), 2));
                tela.reservarMesa(telaReserva.getMesa());
                telaReserva.dispose();
                JOptionPane.showMessageDialog(null, "Reserva criada com sucesso.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Falha ao criar reserva. Cheque o formulário.");
            }
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
                int status = tela.switchMesa1Color();
                MesaDAO mdao = MesaDAO.getInstance();
                mdao.update(new Mesa(1, status));
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
                int status = tela.switchMesa2Color();
                MesaDAO mdao = MesaDAO.getInstance();
                mdao.update(new Mesa(2, status));
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
                int status = tela.switchMesa3Color();
                MesaDAO mdao = MesaDAO.getInstance();
                mdao.update(new Mesa(3, status));
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
                int status = tela.switchMesa4Color();
                MesaDAO mdao = MesaDAO.getInstance();
                mdao.update(new Mesa(4, status));
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
                int status = tela.switchMesa5Color();
                MesaDAO mdao = MesaDAO.getInstance();
                mdao.update(new Mesa(5, status));
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
                int status = tela.switchMesa6Color();
                MesaDAO mdao = MesaDAO.getInstance();
                mdao.update(new Mesa(6, status));
            } else {

            }

        }

    }
    
}
