package com.desafio.popular.service;

import com.desafio.popular.model.Pessoa;
import com.desafio.popular.service.business.punctuation.familyincome.RendaFamiliar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PontosServiceTest {

    private PontosService service;
    private List<Pessoa> dependentes;
    @BeforeEach
    public void inicializar(){
        this.service = new PontosService();
        this.dependentes = new ArrayList<>();
    }
    @Test
    void pontosDeveriaSerCincoParaRendaAte900() {
        var pessoa = new Pessoa("Pedro", new BigDecimal("600"), LocalDate.of( 1978 , 6 , 7 ), dependentes);
        service.concederPontos(pessoa, new RendaFamiliar());
        assertEquals(5, pessoa.getPontos());
    }

    @Test
    void pontosDeveriaSerCincoParaRendaIgual900() {
        var pessoa = new Pessoa("Pedro", new BigDecimal("900"), LocalDate.of( 1978 , 6 , 7 ), dependentes);
        service.concederPontos(pessoa, new RendaFamiliar());
        assertEquals(5, pessoa.getPontos());
    }

    @Test
    void pontosDeveriaSerTresParaRendaDe901A1500() {
        var pessoa = new Pessoa("Pedro", new BigDecimal("1000"), LocalDate.of( 1978 , 6 , 7 ), dependentes);
        service.concederPontos(pessoa, new RendaFamiliar());
        assertEquals(3, pessoa.getPontos());
    }

    @Test
    void pontosDeveriaSerTresParaRendaIgualA1500() {
        var pessoa = new Pessoa("Pedro", new BigDecimal("1500"), LocalDate.of( 1978 , 6 , 7 ), dependentes);
        service.concederPontos(pessoa, new RendaFamiliar());
        assertEquals(3, pessoa.getPontos());
    }

    @Test
    void pontosDeveriaSerZeroParaRendaMaiorQue1500() {
        var pessoa = new Pessoa("Pedro", new BigDecimal("1501"), LocalDate.of( 1978 , 6 , 7 ), dependentes);
        service.concederPontos(pessoa, new RendaFamiliar());
        assertEquals(0, pessoa.getPontos());
    }

}