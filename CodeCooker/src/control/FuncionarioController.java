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
import view.funcionarios.ExcluiFuncionario;
import view.funcionarios.PainelFuncionario;

/**
 *
 * @author Dulcina
 */
public class FuncionarioController {
    
    private PainelFuncionario painelFunc;
    private CadastrarFuncionario cadFunc;
    private ExcluiFuncionario excFunc;
    UsuarioDAO udao = UsuarioDAO.getInstance();
    List<Usuario> usuarios;
    
    public FuncionarioController(PainelFuncionario pf){
    
        this.painelFunc = pf;
        this.cadFunc = this.painelFunc.getCadastrarFuncFrame();
        this.excFunc = this.painelFunc.getExcluiFuncFrame();
        
        painelFunc.addBtnCadastrarFuncListener(new BtnAbrirCadastrarListener());
        cadFunc.addBtnCadastrarListener(new BtnCadastrarListener());
        cadFunc.addBtnCancelarListener(new BtnCancelarListener());
        painelFunc.addBtnExcluirFuncListener(new BtnAbrirExcluirListener());
        excFunc.addBtnBuscarListener(new BtnBuscarFuncListener());
        excFunc.addBtnCancelarListener(new BtnCancelarFuncListener());
        excFunc.addBtnExcluirListener(new BtnExcluirFuncListener());

    }
    
    class BtnExcluirFuncListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            excFunc.excluirFuncionario();
            
            String nome;
            Object [] o = new Object[4];
            nome = excFunc.getNomeFunc();
            
            List<Usuario> funcionario = udao.retrieveLike(nome);
            
            excFunc.instanciarTabela();
            excFunc.limparTabela();
            
            for(int i = 0; i < funcionario.size(); i++){
                try{
                o[1] = funcionario.get(i).getNome();
                o[2] = funcionario.get(i).getCpf();
                o[0] = funcionario.get(i).getId();
                excFunc.preencherTabela(o);
                //o[i+3] = produto.get(i).getQtd();    
                } catch(ArrayIndexOutOfBoundsException a){
                }       
            } 
        }
    
    }
    
    class BtnAbrirExcluirListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            excFunc.setVisible(true);
            try {
            excFunc.limparTabela();
                
            } catch (NullPointerException e) {
            }
        }
    }
    
    class BtnBuscarFuncListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            String nome;
            Object [] o = new Object[4];
            nome = excFunc.getNomeFunc();
            
            List<Usuario> funcionario = udao.retrieveLike(nome);
            
            excFunc.instanciarTabela();
            excFunc.limparTabela();
            
            for(int i = 0; i < funcionario.size(); i++){
                try{
                o[1] = funcionario.get(i).getNome();
                o[2] = funcionario.get(i).getCpf();
                o[0] = funcionario.get(i).getId();
                excFunc.preencherTabela(o);
                //o[i+3] = produto.get(i).getQtd();    
                } catch(ArrayIndexOutOfBoundsException a){
                }       
            } 
        }
    }

    class BtnCancelarFuncListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
           excFunc.dispose();
           painelFunc.setLstVoid();
           painelFunc.relistar();
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
    
}
