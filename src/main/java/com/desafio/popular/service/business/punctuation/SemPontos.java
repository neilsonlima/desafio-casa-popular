package com.desafio.popular.service.business.punctuation;

import com.desafio.popular.model.Pessoa;
import com.desafio.popular.service.business.punctuation.familyincome.PontosParaRenda;

public class SemPontos extends PontosParaRenda {

    public SemPontos() {
        super(null);
    }

    public void efetuarConcede(Pessoa pessoa){
        pessoa.concederPontos(0);
    }

    @Override
    public boolean deveAplicar(Pessoa pessoa) {
        return true;
    }
}
