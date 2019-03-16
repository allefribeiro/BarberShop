/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cliente;
import Model.Usuario;

/**
 *
 * @author Allef
 */
public class Main {
    
    public static void main(String[] args){

        Cliente cliente = new Cliente(1, "Allef", "Coronel Tedim", "22740-240");
        System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario(1, "barbaeiro", "senha");
        System.out.println(usuario.getNome());        
    }
}
