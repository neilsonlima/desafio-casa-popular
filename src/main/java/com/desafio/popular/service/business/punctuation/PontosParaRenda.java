package com.desafio.popular.service.business.punctuation;

import com.desafio.popular.model.Pessoa;

public abstract class PontosParaRenda {

    protected PontosParaRenda proximo;

    public PontosParaRenda(PontosParaRenda proximo){
        this.proximo = proximo;
    }

    public void conceder(Pessoa pessoa){
        if(deveAplicar(pessoa)){
            efetuarConceder(pessoa);
        }else {
            proximo.conceder(pessoa);
        }
    }
    protected abstract void efetuarConceder(Pessoa pessoa);
    protected abstract boolean deveAplicar(Pessoa pessoa);
}
