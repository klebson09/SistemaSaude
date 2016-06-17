
package servlet;

import dao.*;
import java.util.ArrayList;
import java.util.List;
import model.Endereco;
import model.Paciente;
import model.Pessoa;

/**
 *
 * @author klebson
 */
public class ControladorDAO {
     ArrayList<Object> objetos = new ArrayList();
    public ControladorDAO() {
        
    }
    private void construtorDeObjetos(ArrayList<Object> objetos, String classe){
        Pessoa pessoa;
        Paciente paciente;
        Endereco endereco ;
        
        for (int i=0; i<objetos.size();i++){
            if(objetos.get(i).getClass()== Pessoa.class){
                
                pessoa = (Pessoa) objetos.get(i);
            }else if(objetos.get(i).getClass()== Paciente.class){
                paciente = (Paciente) objetos.get(i);
                
//            }else if(objetos.get(i).getClass()== Medico.class){
//                Medico medico = new Medico();
//                medico = (Medico) objetos.get(i);
//                
            }else if(objetos.get(i).getClass()== Endereco.class){
                endereco = (Endereco) objetos.get(i);
                
            }
            
            
            switch (classe){
                case "Paciente":
                        DAOPaciente daoPaciente = new DAOPaciente();
                        daoPaciente.adicionar(paciente, pessoa, endereco);
            }
        }
        
    }
    
}
