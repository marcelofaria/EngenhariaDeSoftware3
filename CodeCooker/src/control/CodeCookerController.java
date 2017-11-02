/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.swing.JOptionPane;
import model.Usuario;
import model.UsuarioDAO;
import view.AuthenticationView;

/**
 *
 * @author rafael
 */
public class CodeCookerController {
    
    public CodeCookerController(){
        
    }
    
    public void start(){
        AuthenticationView authView = new AuthenticationView();
        authView.setVisible(true);     
    }
    
    public int autUsuario(String u, String senha){
        
        UsuarioDAO udao = UsuarioDAO.getInstance();
        
        Usuario usuario = udao.retrieveByUsername(u);
        Usuario usuarioSenha = udao.retrieveByPass(senha);
           
        if(usuario != null && usuarioSenha != null){
            return usuario.getTipoUsuario();
          
        }else{
           return 0;
        }
        
    }
    
}
