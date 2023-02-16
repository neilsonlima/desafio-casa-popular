package com.desafio.popular.service.business.punctuation;

import com.desafio.popular.model.Pessoa;

import java.math.BigDecimal;

public class PontosParaRendaDeNovicentosEUmAMilEQuinhetosReais extends PontosParaRenda{

    public PontosParaRendaDeNovicentosEUmAMilEQuinhetosReais(PontosParaRenda proximo) {
        super(proximo);
    }

    public void efetuarConceder(Pessoa pessoa){
        pessoa.concederPontos(3);
    }

    @Override
    public boolean deveAplicar(Pessoa pessoa) {
        return pessoa.getRenda().compareTo(new BigDecimal("900")) > 0 && pessoa.getRenda().compareTo(new BigDecimal("1500")) <= 0;
    }
}
