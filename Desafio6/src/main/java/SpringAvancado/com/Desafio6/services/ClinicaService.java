package SpringAvancado.com.Desafio6.services;

import SpringAvancado.com.Desafio6.models.ClinicaModel;
import SpringAvancado.com.Desafio6.repository.ClinicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class ClinicaService {
    @Autowired
    public ClinicaRepository clinicaRepository;


    // ADICIONANDO....
    public void adicionar (ClinicaModel cnpjAdicionado) {
        clinicaRepository.save(cnpjAdicionado);
    }


    // LISTANDO....
    public List<ClinicaModel> Listar(){
        return clinicaRepository.findAll();
    }


    // PROCURANDO...
    public ClinicaModel buscarPorCnpj(Integer clinica) {
        Optional<ClinicaModel> optclinica = clinicaRepository.findById(clinica);
        return optclinica.get();
    }


    //REMOVENDO...
    public void remove(Integer cnpj){
        clinicaRepository.deleteById(cnpj);
    }


    //ATUALIZANDO...
    public void atualizar(Integer cnpj,ClinicaModel clinica){
        remove(cnpj);
        adicionar(clinica);

    }






}





