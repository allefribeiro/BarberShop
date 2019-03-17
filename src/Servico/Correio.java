/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servico;

import Model.Agendamento;

/**
 *
 * @author Allef
 */
public class Correio {
    
    public void NotificarPorEmail( Agendamento agendamento)
    {
        String emailFormatado = formatarEmail(agendamento);
        String destinatario = agendamento.getCliente().getEmail();
        
        //Uso da Classe de Email
        Email email = new Email("Agendamento BarberShop", emailFormatado, destinatario);
        email.enviar();
    }

    private String formatarEmail(Agendamento agendamento)
    {
        String nomeCliente = agendamento.getCliente().getNome();
        String servico = agendamento.getServico().getDescricao();
        String dataAgendamento = agendamento.getDataFormatada();
        String horaAgendamento = agendamento.getHoraFormatada();
        float valor = agendamento.getValor();
        
        return "Ola! " + nomeCliente + ", seu agendamento para " + 
                servico + ", esta marcado para o dia " + dataAgendamento + " as " 
                + horaAgendamento + ", o valor fica para voce fica R$"+ valor + " .";
    }
}
