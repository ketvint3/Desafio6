package SpringAvancado.com.Desafio6.services;

import SpringAvancado.com.Desafio6.models.ClinicaModel;
import SpringAvancado.com.Desafio6.models.PacienteModel;
import SpringAvancado.com.Desafio6.repository.PacienteRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {
    @Autowired
    public PacienteRepository pacienteRepository;


    // ADICIONANDO....
    public void adicionar(PacienteModel pacienteAdicionado) {
        pacienteRepository.save(pacienteAdicionado);
    }


    // LISTANDO....
    public List<PacienteModel> Listar() {
        return pacienteRepository.findAll();
    }


    // PROCURANDO...
    public Optional<PacienteModel> acharPorId(Integer id) {
        return pacienteRepository.findById(Integer.valueOf(id));
    }


    //REMOVENDO...
    public void remove(Integer id) {
        Optional<PacienteModel> pesquisarAnimalPaciente = acharPorId(id);
    }

    public void atualizar(Integer id, PacienteModel paciente) {
        remove(id);
        adicionar(paciente);


    }
}