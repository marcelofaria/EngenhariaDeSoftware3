/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.UsuarioDAO;
import view.CadastrarFuncionario;
import view.PainelFuncionario;

/**
 *
 * @author Dulcina
 */
public class FuncionarioController {
    
    private PainelFuncionario painelFunc;
    private CadastrarFuncionario cadFunc;
    
    public FuncionarioController(PainelFuncionario pf){
    
        this.painelFunc = pf;
        this.cadFunc = this.painelFunc.getCadastrarFuncFrame();
        painelFunc.addBtnCadastrarFuncListener(new BtnAbrirCadastrarListener());
        cadFunc.addBtnCadastrarListener(new BtnCadastrarListener());
        cadFunc.addBtnCancelarListener(new BtnCancelarListener());

    }
    
    class BtnAbrirCadastrarListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            //System.out.println("Criando nova tela...");
            cadFunc.setVisible(true);
            
        }
    }
    
    class BtnCadastrarListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            int cargo;
            String nomeCompleto;
            String usuario;
            String senha;
            String cnpj;
            String cpf;
            
            cargo = cadFunc.getCargoFunc();
            nomeCompleto = cadFunc.getNomeCompleto();
            usuario = cadFunc.getUsuario();
            senha = cadFunc.getSenha();
            cnpj = cadFunc.getCNPJ();
            cpf = cadFunc.getCPF();
            
            UsuarioDAO u = UsuarioDAO.getInstance();
            if(cargo == 1 || cargo == 2){
                u.create(usuario, senha, cargo, nomeCompleto, cpf);
                JOptionPane.showMessageDialog(null, "Usuário " + usuario + "cadastrado com sucesso.");
                cadFunc.dispose();
            }        
            else{
                u.create(usuario, senha, cargo, nomeCompleto, cpf, cnpj);
                JOptionPane.showMessageDialog(null, "Usuário " + usuario + "cadastrado com sucesso.");
                cadFunc.dispose();
            }
  
        }
    }
    
    class BtnCancelarListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            cadFunc.dispose();
        }
    }
    
}
