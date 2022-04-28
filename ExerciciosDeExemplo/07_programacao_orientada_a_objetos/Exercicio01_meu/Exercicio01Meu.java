package com.company.programacao_orientada_a_objetos;

/*
Método que informa necessidade de repor estoque
Crie um programa que contenha um método que verifique a necessidade de repor o estoque de determinado
produto em uma
loja qualquer.
Considere que a quantidade mínima de um produto deva ser 10.
Se o estoque for menor que isso, então ele
retornará *true*, pois, será necessária a reposição do estoque, caso contrário, ele retornará false.
//criar classe
Como parâmetro, esse método deverá receber um tipo que você irá criar e chamar de Produto, ou seja,
você vai criar uma
classe chamada Produto com os atributos necessários.!!
Os atributos da classe serão nome e quantidadeEstoque.
Feito isso, implemente o método main do programa.
//criar uma variavel
Nele você vai criar uma variável do tipo Produto e depois usar essa
variável para invocar o método que valida a necessidade de reposição de estoque.
No final, você vai exibir, no console, se é necessária a reposição ou não.
 */

public class Exercicio01Meu {
    public static void main(String[] args) {
        Produto1 produto = new Produto1();

        produto.nome = "Lojas Americanas";
        produto.Produto = 10;
        produto.quantidadeMinima = 10;

        reposicaoEstoque(produto);
    }

    static void reposicaoEstoque(Produto1 produto) {
        Boolean reposicao = produto.Produto < produto.quantidadeMinima;
        if (reposicao) {
            System.out.println("Precisa-se de Reposição");
        } else {
            System.out.println("Não precisa fazer a reposição");
        }
    }
}
