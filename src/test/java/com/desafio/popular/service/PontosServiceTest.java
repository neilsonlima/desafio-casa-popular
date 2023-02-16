package com.desafio.popular.service;

import com.desafio.popular.model.Pessoa;
import com.desafio.popular.service.business.punctuation.dependents.Dependentes;
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
    @BeforeEach
    public void inicializar(){
        this.service = new PontosService();
    }
    @Test
    void pontosDeveriaSerCincoParaRendaAte900() {
        var pessoa = new Pessoa("Pedro", new BigDecimal("600"), LocalDate.of( 1978 , 6 , 7 ), null);
        service.concederPontos(pessoa, new RendaFamiliar());
        assertEquals(5, pessoa.getPontos());
    }

    @Test
    void pontosDeveriaSerCincoParaRendaIgual900() {
        var pessoa = new Pessoa("Pedro", new BigDecimal("900"), LocalDate.of( 1978 , 6 , 7 ), null);
        service.concederPontos(pessoa, new RendaFamiliar());
        assertEquals(5, pessoa.getPontos());
    }

    @Test
    void pontosDeveriaSerTresParaRendaDe901A1500() {
        var pessoa = new Pessoa("Pedro", new BigDecimal("1000"), LocalDate.of( 1978 , 6 , 7 ), null);
        service.concederPontos(pessoa, new RendaFamiliar());
        assertEquals(3, pessoa.getPontos());
    }

    @Test
    void pontosDeveriaSerTresParaRendaIgualA1500() {
        var pessoa = new Pessoa("Pedro", new BigDecimal("1500"), LocalDate.of( 1978 , 6 , 7 ), null);
        service.concederPontos(pessoa, new RendaFamiliar());
        assertEquals(3, pessoa.getPontos());
    }

    @Test
    void pontosDeveriaSerZeroParaRendaMaiorQue1500() {
        var pessoa = new Pessoa("Pedro", new BigDecimal("1501"), LocalDate.of( 1978 , 6 , 7 ), null);
        service.concederPontos(pessoa, new RendaFamiliar());
        assertEquals(0, pessoa.getPontos());
    }

    @Test
    void pontosDeveriaSerTresParaFamiliaComTresOuMaisDependentes() {

        List<Pessoa> dependentes = new ArrayList<>();
        dependentes.add(new Pessoa("Dependente 1", BigDecimal.ZERO, LocalDate.of(1985, 3, 10), null));
        dependentes.add(new Pessoa("Dependente 2", BigDecimal.ZERO, LocalDate.of(2004, 8, 25), null));
        dependentes.add(new Pessoa("Dependente 3", BigDecimal.ZERO, LocalDate.of(2007, 1, 6), null));
        dependentes.add(new Pessoa("Dependente 4", BigDecimal.ZERO, LocalDate.of(2009, 10, 28), null));

        var pessoa = new Pessoa("Pedro", new BigDecimal("1501"), LocalDate.of( 1978 , 6 , 7 ), dependentes);
        service.concederPontos(pessoa, new Dependentes());
        assertEquals(2, pessoa.getPontos());
    }

    @Test
    void pontosDeveriaSerDoisParaFamiliaComUmOuDoisDependentes() {

        List<Pessoa> dependentes = new ArrayList<>();
        dependentes.add(new Pessoa("Dependente 1", BigDecimal.ZERO, LocalDate.of(1985, 3, 10), null));
        dependentes.add(new Pessoa("Dependente 2", BigDecimal.ZERO, LocalDate.of(2005, 8, 25), null));
        dependentes.add(new Pessoa("Dependente 3", BigDecimal.ZERO, LocalDate.of(2006, 1, 6), null));
        dependentes.add(new Pessoa("Dependente 4", BigDecimal.ZERO, LocalDate.of(2009, 10, 28), null));

        var pessoa = new Pessoa("Pedro", new BigDecimal("1501"), LocalDate.of( 1978 , 6 , 7 ), dependentes);
        service.concederPontos(pessoa, new Dependentes());
        assertEquals(3, pessoa.getPontos());
    }

}