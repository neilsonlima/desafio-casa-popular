package com.desafio.popular.service.business.punctuation;

import com.desafio.popular.model.Pessoa;

public class PontosParaAteDoisDependentesMenoresDeDezoitoAnos extends PontosParaRenda {
    public PontosParaAteDoisDependentesMenoresDeDezoitoAnos(PontosParaRenda proximo) {
        super(proximo);
    }
    public void efetuarConceder(Pessoa pessoa){
        pessoa.concederPontos(2);
    }

    @Override
    public boolean deveAplicar(Pessoa pessoa) {
        return pessoa.getQdeMenoresDeDezoitoAnos() > 0 && pessoa.getQdeMenoresDeDezoitoAnos() <=2;
    }
}
