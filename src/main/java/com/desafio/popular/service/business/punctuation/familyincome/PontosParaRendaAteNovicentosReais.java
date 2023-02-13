package com.desafio.popular.service.business.punctuation.familyincome;

import com.desafio.popular.model.Pessoa;

import java.math.BigDecimal;

public class PontosParaRendaAteNovicentosReais extends PontosParaRenda{

    public PontosParaRendaAteNovicentosReais(PontosParaRenda proximo) {
        super(proximo);
    }

    public void efetuarConcede(Pessoa pessoa){
        pessoa.concederPontos(5);
    }

    @Override
    public boolean deveAplicar(Pessoa pessoa) {
        return pessoa.getRenda().compareTo(new BigDecimal("900")) <= 0;
    }
}
