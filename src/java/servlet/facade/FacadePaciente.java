/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.facade;

import dao.DAOPessoa;
import dao.DAOPaciente;
import dao.DAOEndereco;
import model.Paciente;
import model.Pessoa;

/**
 *
 * @author klebson
 */
public class FacadePaciente {
    private DAOPessoa daopessoa;
    private DAOPaciente daopaciente;
    private DAOEndereco daoendereco;
    int idPessoa;
    
    public FacadePaciente(DAOPessoa daopessoa, DAOPaciente daopaciente) {
        daopessoa =  new DAOPessoa();
        daopaciente =  new DAOPaciente();
        //this.daopaciente = daopaciente;
        this.daoendereco = daoendereco;
    }

  
    
    
    public void AdicionarFacadePaciente(Pessoa pessoa, Paciente paciente){
        daopessoa.adicionar(pessoa);
        idPessoa = daopessoa.buscarPessoa(pessoa.getCpf()).getIdPessoa();
       // daopaciente.adicionar(paciente, pessoa);
        daopaciente.adicionar(paciente);
    }
}
