package com.thiago_Souza.consumo_kafka.controller;

import com.thiago_Souza.consumo_kafka.model.EnderecoModel;
import com.thiago_Souza.consumo_kafka.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @PostMapping
    public ResponseEntity<EnderecoModel> saveMongo(@RequestBody EnderecoModel enderecoModel){
        enderecoService.save(enderecoModel);
        return ResponseEntity.ok(enderecoModel);
    }
    @GetMapping
    public ResponseEntity<List<EnderecoModel>> listAll(){
        List<EnderecoModel> list = enderecoService.modelList();
        return ResponseEntity.ok(list);
    }
}
