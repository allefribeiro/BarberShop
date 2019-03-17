/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author Allef
 */
public class Main {
    
    public static void main(String[] args){
        
        Servico servico = new Servico(1, "barba", 30);

        Cliente cliente = new Cliente(1, "Allef", "Coronel Tedim", "22740-240");
        System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario(1, "barbaeiro", "senha");
        System.out.println(usuario.getNome());        
        
        Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "16/03/2019 22:00");
        System.out.println(agendamento.getCliente().getNome());
    }
}
