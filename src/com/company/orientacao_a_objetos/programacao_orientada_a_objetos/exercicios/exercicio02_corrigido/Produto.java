package com.company.orientacao_a_objetos.programacao_orientada_a_objetos.exercicios.exercicio02_corrigido;
public class Produto {
    static final Integer QUANTIDADE_MINIMA_ESTOQUE = 10;// Essa não é uma variável e sim, uma constante.
    String nome;
    Integer quantidadeEstoque;
    Boolean eNecessarioReporEstoque() {
        return quantidadeEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE;
    }
}
