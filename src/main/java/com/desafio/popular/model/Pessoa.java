package com.desafio.popular.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

public class Pessoa implements Comparable<Pessoa>{
    private final String nome;
    private final BigDecimal renda;
    private final LocalDate dataNascimento;

    private int pontos;
    
    private final List<Pessoa> dependentes;

    public Pessoa(String nome, BigDecimal renda, LocalDate dataNascimento, List<Pessoa> dependentes) {
        this.nome = nome;
        this.renda = renda;
        this.dataNascimento = dataNascimento;
        this.dependentes = dependentes;
        this.pontos = 0;
    }

    public BigDecimal getRenda() {
        return renda;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public int getPontos() {
        return pontos;
    }

    public List<Pessoa> getDependentes() {
        return dependentes;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", renda=" + renda +
                ", dataNascimento=" + dataNascimento +
                ", pontos=" + pontos +
                '}';
    }

    public void concederPontos(int pontos) {
        this.pontos += pontos;
    }

    public int getIdade() {
        final LocalDate dataAtual = LocalDate.now();
        final Period periodo = Period.between(getDataNascimento(), dataAtual);
        return periodo.getYears();
    }

    public int getQdeMenoresDeDezoitoAnos(){
        return getDependentes()
                .stream()
                .filter(dependente -> dependente.getIdade() < 18)
                .collect(Collectors.toList())
                .size();
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        int compareage = pessoa.getPontos();
        return compareage - this.pontos;
    }
}
