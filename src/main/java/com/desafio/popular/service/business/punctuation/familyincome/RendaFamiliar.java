package com.desafio.popular.service.business.punctuation.familyincome;

import com.desafio.popular.model.Pessoa;
import com.desafio.popular.service.business.punctuation.Pontos;
import com.desafio.popular.service.business.punctuation.SemPontos;

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
