package com.thiago_Souza.consumo_kafka.listaner;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class EnderecoCliente {
    @KafkaListener(topics = "${topic.endereco-cliente}" , groupId = "${spring.kafka.consumer.group_id}")
    public void obterenderecoclinete(String enderecoString) throws JsonProcessingException{
        log.info("Mensagem endereco: " , enderecoString );
    }
}
