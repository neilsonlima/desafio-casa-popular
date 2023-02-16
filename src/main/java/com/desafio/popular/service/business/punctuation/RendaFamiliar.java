package com.desafio.popular.service.business.punctuation;

import com.desafio.popular.model.Pessoa;

public class RendaFamiliar implements Pontos {
    @Override
    public void concederPontos(Pessoa pessoa) {
        new PontosParaRendaAteNovicentosReais(
                new PontosParaRendaDeNovicentosEUmAMilEQuinhetosReais(
                        new SemPontos()
                )
        ).conceder(pessoa);
    }
}
