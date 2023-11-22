package com.thiago_Souza.consumo_kafka.service;

import com.thiago_Souza.consumo_kafka.model.EnderecoModel;
import com.thiago_Souza.consumo_kafka.repository.EndercoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    @Autowired
    private EndercoRepository endercoRepository;

    public EnderecoModel save(EnderecoModel enderecoModel){
        endercoRepository.save(enderecoModel);
        return enderecoModel;
    }

    public List<EnderecoModel> modelList(){
       return endercoRepository.findAll();
    }


}
