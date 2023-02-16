package com.desafio.popular;

import com.desafio.popular.model.Pessoa;
import com.desafio.popular.service.PontosService;
import com.desafio.popular.service.business.punctuation.Dependentes;
import com.desafio.popular.service.business.punctuation.RendaFamiliar;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        PontosService service = new PontosService();


        List<Pessoa> dependentes1 = new ArrayList<>();
        List<Pessoa> dependentes2 = new ArrayList<>();
        List<Pessoa> dependentes3 = new ArrayList<>();
        List<Pessoa> dependentes4 = new ArrayList<>();

        List<Pessoa> pessoas = new ArrayList<>();

        // 2 pontos
        dependentes1.add(new Pessoa("Dependente1 1", BigDecimal.ZERO, LocalDate.of(1985, 3, 10), null));
        dependentes1.add(new Pessoa("Dependente1 2", BigDecimal.ZERO, LocalDate.of(2001, 8, 25), null));
        dependentes1.add(new Pessoa("Dependente1 3", BigDecimal.ZERO, LocalDate.of(2007, 1, 6), null));
        dependentes1.add(new Pessoa("Dependente1 4", BigDecimal.ZERO, LocalDate.of(2009, 10, 28), null));

        // 3 pontos
        dependentes2.add(new Pessoa("Dependente2 1", BigDecimal.ZERO, LocalDate.of(1985, 3, 10), null));
        dependentes2.add(new Pessoa("Dependente2 2", BigDecimal.ZERO, LocalDate.of(2006, 8, 25), null));
        dependentes2.add(new Pessoa("Dependente2 3", BigDecimal.ZERO, LocalDate.of(2007, 1, 6), null));
        dependentes2.add(new Pessoa("Dependente2 4", BigDecimal.ZERO, LocalDate.of(2009, 10, 28), null));

        // 2 pontos
        dependentes3.add(new Pessoa("Dependente3 1", BigDecimal.ZERO, LocalDate.of(1985, 3, 10), null));
        dependentes3.add(new Pessoa("Dependente3 2", BigDecimal.ZERO, LocalDate.of(1986, 8, 25), null));
        dependentes3.add(new Pessoa("Dependente3 3", BigDecimal.ZERO, LocalDate.of(1987, 1, 6), null));
        dependentes3.add(new Pessoa("Dependente3 4", BigDecimal.ZERO, LocalDate.of(2009, 10, 28), null));

        // 0 pontos
        dependentes4.add(new Pessoa("Dependente4 1", BigDecimal.ZERO, LocalDate.of(1985, 3, 10), null));
        dependentes4.add(new Pessoa("Dependente4 2", BigDecimal.ZERO, LocalDate.of(1986, 8, 25), null));
        dependentes4.add(new Pessoa("Dependente4 3", BigDecimal.ZERO, LocalDate.of(1987, 1, 6), null));
        dependentes4.add(new Pessoa("Dependente4 4", BigDecimal.ZERO, LocalDate.of(1988, 10, 28), null));

        // 3 pontos -> total: 5
        pessoas.add(new Pessoa("Pedro", new BigDecimal("1500"), LocalDate.of( 1983 , 03 , 01 ), dependentes1));
        // 5 pontos -> total: 8
        pessoas.add(new Pessoa("Ana", new BigDecimal("600"), LocalDate.of( 1981 , 03 , 01 ), dependentes2));
        // 3 pontos -> total: 5
        pessoas.add(new Pessoa("João", new BigDecimal("1000"), LocalDate.of( 1982 , 03 , 01 ), dependentes3));
        // 3 pontos -> total: 3
        pessoas.add(new Pessoa("Maria", new BigDecimal("1000"), LocalDate.of( 1982 , 03 , 01 ), dependentes4));

        for (Pessoa p: pessoas) {
            service.concederPontos(p, new RendaFamiliar());
            service.concederPontos(p, new Dependentes());
        }


        Collections.sort((ArrayList<Pessoa>) pessoas);
        System.out.println("O RESULTADO ESPERADO ( ORDENADAS PELA PONTUAÇÃO):");
        for (Pessoa p: pessoas) {
            System.out.println(p);
        }


    }

}