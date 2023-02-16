package com.desafio.popular;

import com.desafio.popular.model.Pessoa;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> dependentes = new ArrayList<>();
        dependentes.add(new Pessoa("Dependente 1", BigDecimal.ZERO, LocalDate.of(1985, 3, 10), null));
        dependentes.add(new Pessoa("Dependente 2", BigDecimal.ZERO, LocalDate.of(2001, 8, 25), null));
        dependentes.add(new Pessoa("Dependente 3", BigDecimal.ZERO, LocalDate.of(2007, 1, 6), null));
        dependentes.add(new Pessoa("Dependente 4", BigDecimal.ZERO, LocalDate.of(2009, 10, 28), null));

        var pessoa = new Pessoa("Pedro", new BigDecimal("600"), LocalDate.of( 1979 , 03 , 01 ), dependentes);
        System.out.println("Idade: " + pessoa.getIdade() );



        var depedentesMaioresDeDezoitoAnos =  dependentes.stream().filter(dependente -> dependente.getIdade() >= 18).collect(Collectors.toList()).size();
    }
}