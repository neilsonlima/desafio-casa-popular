package com.desafio.popular.service.business.punctuation;

import com.desafio.popular.model.Pessoa;

public class PontosParaMaisDeTresDependentesMenoresDeDezoitoAnos extends PontosParaRenda {
    public PontosParaMaisDeTresDependentesMenoresDeDezoitoAnos(PontosParaRenda proximo) {
        super(proximo);
    }

    public void efetuarConceder(Pessoa pessoa){
        pessoa.concederPontos(3);
    }

    @Override
    public boolean deveAplicar(Pessoa pessoa) {
        return pessoa.getQdeMenoresDeDezoitoAnos() >=3;
    }

}
