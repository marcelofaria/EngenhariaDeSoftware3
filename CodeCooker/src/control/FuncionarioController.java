/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Usuario;
import model.UsuarioDAO;
import view.funcionarios.CadastrarFuncionario;
import view.funcionarios.ConfirmaExcluirFuncionario;
import view.funcionarios.ExcluirFuncionario;
import view.funcionarios.PainelFuncionario;

/**
 *
 * @author Dulcina
 */
public class FuncionarioController {
    
    private PainelFuncionario painelFunc;
    private CadastrarFuncionario cadFunc;
    private ExcluirFuncionario excFunc;
    private ConfirmaExcluirFuncionario ceFunc;
    UsuarioDAO u = UsuarioDAO.getInstance();
    List<Usuario> usuarios;
    
    public FuncionarioController(PainelFuncionario pf){
    
        this.painelFunc = pf;
        this.cadFunc = this.painelFunc.getCadastrarFuncFrame();
        this.excFunc = this.painelFunc.getExcluirFuncFrame();
        this.ceFunc = this.excFunc.getConfirmaExcluirFuncFrame();
        
        painelFunc.addBtnCadastrarFuncListener(new BtnAbrirCadastrarListener());
        cadFunc.addBtnCadastrarListener(new BtnCadastrarListener());
        cadFunc.addBtnCancelarListener(new BtnCancelarListener());
        painelFunc.addBtnExcluirFuncListener(new BtnAbrirExcluirListener());
        excFunc.addBtnCancelarListener(new btnCancelarEListener());
        excFunc.addcmbSeletorListener(new CmbSeletorListener());

    }
    
    class CmbSeletorListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            excFunc.setLstVoid();
            excFunc.setLstFuncionariosByCmb();
        }
    
    
    }

    class btnCancelarEListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            excFunc.dispose();
            painelFunc.setLstVoid();
            painelFunc.relistar();
        }
    }

    class BtnAbrirExcluirListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            //System.out.println("Criando nova tela...");
            
            excFunc.setVisible(true);
            excFunc.setLstVoid();
            excFunc.relistar();
            
        }
    }
    
    class BtnAbrirCadastrarListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            //System.out.println("Criando nova tela...");
            cadFunc.setVisible(true);
            cadFunc.setTextVoid();
            
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
                JOptionPane.showMessageDialog(null, "Usuário " + usuario + " cadastrado com sucesso.");
                cadFunc.dispose();
            }        
            else{
                u.create(usuario, senha, cargo, nomeCompleto, cpf, cnpj);
                JOptionPane.showMessageDialog(null, "Usuário " + usuario + " cadastrado com sucesso.");
                cadFunc.dispose();
            }
            
            painelFunc.setLstVoid();
            
            painelFunc.relistar();
            /*String nome = null;
            usuarios = u.retrieveAll();
            try{
                int i = 0;
                while(usuarios.get(i).getNome() != null){
                    nome = usuarios.get(i).getNome();
                    //System.out.println(nome);
                    painelFunc.setLstFuncionarios(i, nome);
                    i++;
                }
            } catch(IndexOutOfBoundsException e){

            }*/
            
        }
    }
    
    class BtnCancelarListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            cadFunc.dispose();
        }
    }
    
    class BtnConfirmaExcluirListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
        
            ceFunc.escolheExclusao();
            
        }
    
    }
    
}
