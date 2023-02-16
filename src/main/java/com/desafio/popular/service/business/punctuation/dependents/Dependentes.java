package com.desafio.popular.service.business.punctuation.dependents;

import com.desafio.popular.model.Pessoa;
import com.desafio.popular.service.business.punctuation.Pontos;

import java.util.stream.Collectors;

public class Dependentes implements Pontos {
    @Override
    public void concederPontos(Pessoa pessoa) {
        var depedentesMaioresDeDezoitoAnos =  pessoa
                .getDependentes()
                .stream()
                .filter(dependente -> dependente.getIdade() < 18)
                .collect(Collectors.toList())
                .size();

        if(depedentesMaioresDeDezoitoAnos >= 1 && depedentesMaioresDeDezoitoAnos < 3){
            pessoa.concederPontos(2);
        } else if(depedentesMaioresDeDezoitoAnos >= 3){
            pessoa.concederPontos(3);
        } else {
            pessoa.concederPontos(0);
        }

    }

}
