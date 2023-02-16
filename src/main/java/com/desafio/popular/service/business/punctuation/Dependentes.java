package com.desafio.popular.service.business.punctuation;

import com.desafio.popular.model.Pessoa;

public class Dependentes implements Pontos {
    @Override
    public void concederPontos(Pessoa pessoa) {
        new PontosParaAteDoisDependentesMenoresDeDezoitoAnos(
                new PontosParaMaisDeTresDependentesMenoresDeDezoitoAnos(
                        new SemPontos()
                )
        ).conceder(pessoa);
    }

}
