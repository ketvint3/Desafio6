package SpringAvancado.com.Desafio6.services;

import SpringAvancado.com.Desafio6.models.AgendamentoModel;
import SpringAvancado.com.Desafio6.models.PacienteModel;
import SpringAvancado.com.Desafio6.repository.AgendamentoRepository;
import SpringAvancado.com.Desafio6.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgendamentoService {
    @Autowired
    public AgendamentoRepository agendamentoRepository;


    // ADICIONANDO....
    public void adicionar (AgendamentoModel agendamentoAdicionado) {

        agendamentoRepository.save(agendamentoAdicionado);
    }


    // LISTANDO....
    public List<AgendamentoModel> Listar(){
        return agendamentoRepository.findAll();
    }


    // PROCURANDO...
    public Optional<AgendamentoModel> acharPorId(Integer Id){
        return agendamentoRepository.findById(Id);
    }


    //REMOVENDO...
    public void remove(Integer Id){
        Optional<AgendamentoModel> pesquisarPorId = acharPorId(Id);
    }



}


