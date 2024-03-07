package br.com.fiap.culthub.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.tapago.model.Item;

@RestController
@RequestMapping("item")
public class ItemController {

    Logger log = LoggerFactory.getLogger(getClass());

    List<Item> repository = new ArrayList<>();
    
    @GetMapping
    public List<Item> index(){
        return repository;
    }

    @PostMapping
    public ResponseEntity<Item> create(@RequestBody Item item){
        log.info("Cadastrando item {}", item);
        repository.add(item);
        return ResponseEntity.status(HttpStatus.CREATED).body(item);
    }

    @GetMapping("{id}")
    public ResponseEntity<Item> show(@PathVariable Long id){
        log.info("buscando item com id {}", id);

        for(Item item: repository){
            if (item.id().equals(id))
                return ResponseEntity.status(HttpStatus.OK).body(item);
        }

        

        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
    
}
