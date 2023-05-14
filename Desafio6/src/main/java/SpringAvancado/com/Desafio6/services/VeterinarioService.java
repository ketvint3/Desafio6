package SpringAvancado.com.Desafio6.services;

import SpringAvancado.com.Desafio6.models.ClinicaModel;
import SpringAvancado.com.Desafio6.models.VeterinarioModel;

import SpringAvancado.com.Desafio6.repository.VeterinarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeterinarioService {

    @Autowired
    public VeterinarioRepository veterinarioRepository;


    // ADICIONANDO....
    public void adicionar (VeterinarioModel veterinarioAdicionado) {
        veterinarioRepository.save(veterinarioAdicionado);
    }


    // LISTANDO....
    public List<VeterinarioModel> Listar(){
        return veterinarioRepository.findAll();
    }


    // PROCURANDO...
    public Optional<VeterinarioModel> acharPorCrm(Integer crm){
        return veterinarioRepository.findById(crm);
    }


    //REMOVENDO...
    public void remove(Integer crm){
        Optional<VeterinarioModel> pesqeuisarPorCrm = acharPorCrm(crm);
    }
    //ATUALIZANDO...
    public void atualizar(Integer crm, VeterinarioModel veterinario){
        remove(crm);
        adicionar(veterinario);

    }

}




