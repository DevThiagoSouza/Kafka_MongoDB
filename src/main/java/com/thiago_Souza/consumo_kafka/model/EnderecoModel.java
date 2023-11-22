package com.thiago_Souza.consumo_kafka.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class EnderecoModel {

    @Id
    private String id;
    private String cep;
    private String logadouro;
    private String complemento;
    private String bairro;
    private String uf;
    private Long numero;
}
