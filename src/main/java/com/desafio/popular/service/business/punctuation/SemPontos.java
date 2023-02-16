package com.desafio.popular.service.business.punctuation;

import com.desafio.popular.model.Pessoa;

public class SemPontos extends PontosParaRenda {

    public SemPontos() {
        super(null);
    }

    public void efetuarConceder(Pessoa pessoa){
        pessoa.concederPontos(0);
    }

    @Override
    public boolean deveAplicar(Pessoa pessoa) {
        return true;
    }
}
