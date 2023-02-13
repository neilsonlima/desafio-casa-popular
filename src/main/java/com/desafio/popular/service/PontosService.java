package com.desafio.popular.service;

import com.desafio.popular.model.Pessoa;

import java.math.BigDecimal;

public class PontosService {
    public int calcularPontos(Pessoa pessoa) {

        if(pessoa.getRenda().compareTo(new BigDecimal("900")) <= 0){
            return 5;
        } else  if(pessoa.getRenda().compareTo(new BigDecimal("900")) > 0 && pessoa.getRenda().compareTo(new BigDecimal("1500")) <= 0){
            return 3;
        }
        return 0;
    }
}
