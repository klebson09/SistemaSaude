package servlet;

import dao.*;
import java.util.ArrayList;
import java.util.List;
import model.Endereco;
import model.Paciente;
import model.Pessoa;
import servlet.facade.FacadePaciente;

/**
 *
 * @author klebson
 */
public class ControladorDAO {

    ArrayList<Object> objetos = new ArrayList();

    public ControladorDAO() {

    }

    protected void construtorDeObjetos(Pessoa pessoa, Paciente paciente, String classe) {
//        Endereco endereco;ArrayList<Object> objetos

//        for (int i = 0; i < objetos.size(); i++) {
//            if (objetos.get(i).getClass() == Pessoa.class) {
//
//                pessoa = (Pessoa) objetos.get(i);
//            } else if (objetos.get(i).getClass() == Paciente.class) {
//                paciente = (Paciente) objetos.get(i);

//            }else if(objetos.get(i).getClass()== Medico.class){
//                Medico medico = new Medico();
//                medico = (Medico) objetos.get(i);
//                
//            } else if (objetos.get(i).getClass() == Endereco.class) {
//                endereco = (Endereco) objetos.get(i);

//            }
//
//        }
        switch (classe) {
            case "Paciente":
                DAOPessoa daoPessoa = new DAOPessoa();
                DAOPaciente daoPaciente = new DAOPaciente();
                FacadePaciente facadePaciente = new FacadePaciente(daoPessoa, daoPaciente);
                facadePaciente.AdicionarPaciente(pessoa, paciente);
        }

    }

}
