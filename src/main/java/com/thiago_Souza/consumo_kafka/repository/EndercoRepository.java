package com.thiago_Souza.consumo_kafka.repository;

import com.thiago_Souza.consumo_kafka.model.EnderecoModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EndercoRepository extends MongoRepository<EnderecoModel , String> {

    public EnderecoModel save(EnderecoModel enderecoModel);
}
