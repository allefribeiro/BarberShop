/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import Servico.Correio;
import View.Agenda;
import java.util.ArrayList;

/**
 *
 * @author Allef
 */
public class AgendaController {
    
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController( Agenda view) 
    {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizaTabela()
    {
        //Buscar uma lista com agendamentos do banco de dados
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        
        //Exibir esta lista na view
        helper.preencherTabela(agendamentos);
    }
    
    public void atualizaCliente()
    {
        //Buscar clientes do banco de dados
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
        //Exibir cliente no combobox cliente
        helper.preencherClientes(clientes);
    }
    
    public void atualizaServico()
    {
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        
        helper.preencherServicos(servicos);
    }
    
    public void atualizaValor()
    {
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor());
    }
    
    public void agendar()
    {
        //Buscar Objeto Agendamento da tela
        Agendamento agendamento = helper.obterModelo();
        
        //Salvar Obejto no banco de dados
        new AgendamentoDAO().insert(agendamento);
        
        Correio correio = new Correio();
        correio.NotificarPorEmail(agendamento);
        
        //Inserir elemento na tabela
        atualizaTabela();
        helper.limparTela();
    }
}
