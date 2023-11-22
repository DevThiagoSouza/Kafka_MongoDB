package com.thiago_Souza.consumo_kafka.listaner;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.thiago_Souza.consumo_kafka.model.EnderecoModel;
import com.thiago_Souza.consumo_kafka.service.EnderecoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class EnderecoCliente {
    @Autowired
    private EnderecoService enderecoService;

    @KafkaListener(topics = "${topic.endereco-cliente}" , groupId = "${spring.kafka.consumer.group_id}")
    public void obterenderecoclinete(String enderecoString) throws JsonProcessingException{
        log.info("Mensagem endereco: " , enderecoString );

        ObjectMapper objectMapper = new ObjectMapper();
        EnderecoModel enderecoModel = objectMapper.readValue(enderecoString, EnderecoModel.class);

        enderecoService.save(enderecoModel);
        log.info("Savo com sucesso", enderecoModel);



    }

}
