package com.desafio.popular.service;

import com.desafio.popular.model.Pessoa;
import com.desafio.popular.service.business.punctuation.Pontos;

public class PontosService {
    public void concederPontos(Pessoa pessoa, Pontos pontos) {
        pontos.concederPontos(pessoa);
    }
}
