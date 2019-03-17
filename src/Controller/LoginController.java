 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.Usuario;
import View.Login;

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
        // Se o usuario da view for o mesmo usuario e senha do mesmo usuario que veio do banco, direcionar para o menu principal
        //se nao mostrar uma mensagem ao usuario
    }
    
    public void fizTarefa()
    {
        System.out.println("Busquei algo do banco de dados");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
    
}
