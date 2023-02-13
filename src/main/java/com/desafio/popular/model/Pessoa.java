package com.desafio.popular.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Pessoa {
    private final String nome;
    private final BigDecimal renda;
    private final LocalDate dataNascimento;
    
    private final List<Pessoa> dependentes;

    public Pessoa(String nome, BigDecimal renda, LocalDate dataNascimento, List<Pessoa> dependentes) {
        this.nome = nome;
        this.renda = renda;
        this.dataNascimento = dataNascimento;
        this.dependentes = dependentes;
    }

    public BigDecimal getRenda() {
        return renda;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", renda=" + renda +
                ", dataNascimento=" + dataNascimento +
                '}';
    }


}
