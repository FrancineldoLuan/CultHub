package br.com.fiap.culthub.model;

import java.util.Random;

public record Item(Long id, String nome,) {
    public Item(Long id, String nome,){
        this.id = Math.abs( new Random().nextLong() );
        this.nome = nome;
        
    }
}


    