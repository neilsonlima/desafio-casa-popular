package com.desafio.popular.service;

import com.desafio.popular.model.Pessoa;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PontosServiceTest {
    @Test
    void pontosDeveriaSerCincoParaRendaTodalAte900() {
        PontosService service = new PontosService();
        List<Pessoa> dependentes = new ArrayList<>();
        int ponto = service.calcularPontos(new Pessoa("Pedro", new BigDecimal("600"), LocalDate.of( 1978 , 6 , 7 ), dependentes));

        assertEquals(5, ponto);
    }

    @Test
    void pontosDeveriaSerCincoParaRendaTodalIgual900() {
        PontosService service = new PontosService();
        List<Pessoa> dependentes = new ArrayList<>();
        int ponto = service.calcularPontos(new Pessoa("Pedro", new BigDecimal("900"), LocalDate.of( 1978 , 6 , 7 ), dependentes));

        assertEquals(5, ponto);
    }

    @Test
    void pontosDeveriaSerTresParaRendaTodalDe901A1500() {
        PontosService service = new PontosService();
        List<Pessoa> dependentes = new ArrayList<>();
        int ponto = service.calcularPontos(new Pessoa("Pedro", new BigDecimal("1000"), LocalDate.of( 1978 , 6 , 7 ), dependentes));

        assertEquals(3, ponto);
    }

    @Test
    void pontosDeveriaSerTresParaRendaTodalIgualA1500() {
        PontosService service = new PontosService();
        List<Pessoa> dependentes = new ArrayList<>();
        int ponto = service.calcularPontos(new Pessoa("Pedro", new BigDecimal("1500"), LocalDate.of( 1978 , 6 , 7 ), dependentes));

        assertEquals(3, ponto);
    }

    @Test
    void pontosDeveriaSerZeroParaRendaTodalMaiorQue1500() {
        PontosService service = new PontosService();
        List<Pessoa> dependentes = new ArrayList<>();
        int ponto = service.calcularPontos(new Pessoa("Pedro", new BigDecimal("1501"), LocalDate.of( 1978 , 6 , 7 ), dependentes));

        assertEquals(0, ponto);
    }

}