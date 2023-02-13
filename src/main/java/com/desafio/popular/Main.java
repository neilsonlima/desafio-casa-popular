package com.desafio.popular;

import com.desafio.popular.model.Pessoa;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> dependentes = new ArrayList<>();
        var pessoa = new Pessoa("Pedro", new BigDecimal("600"), LocalDate.of( 1978 , 6 , 7 ), dependentes);
        System.out.println(pessoa);
    }
}