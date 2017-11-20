/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.PainelMesas;

/**
 *
 * @author Rafael
 */
public class MesasController {

    private PainelMesas tela;

    public MesasController(PainelMesas tela) {

        this.tela = tela;
        tela.addBtnMesa1Listener(new btnMesa1Listener());
        tela.addBtnMesa2Listener(new btnMesa2Listener());
        tela.addBtnMesa3Listener(new btnMesa3Listener());
        tela.addBtnMesa4Listener(new btnMesa4Listener());
        tela.addBtnMesa5Listener(new btnMesa5Listener());
        tela.addBtnMesa6Listener(new btnMesa6Listener());

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
