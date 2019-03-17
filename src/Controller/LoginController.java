 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;

/**
 *
 * @author Allef
 */
public class LoginController {
    private final Login view;
    private final LoginHelper helper;

    public LoginController( Login view)
    {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema()
    {
        // Pegar um usuario da view
        Usuario usuario =  helper.obterModelo();
        
        // Pesquisar o usuario no banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado =  usuarioDAO.selectPorNomeESenha(usuario);
        
        // Se o usuario da view for o mesmo usuario e senha do mesmo usuario que veio do banco, direcionar para o menu principal
        if(usuarioAutenticado != null) {
           MenuPrincipal menu = new MenuPrincipal();
           menu.setVisible(true);
           this.view.dispose();
        }else{
            view.exibeMensagem("Usuario ou senha invalido");
        }
    }
    
    public void fizTarefa()
    {
        System.out.println("Busquei algo do banco de dados");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
    
}
