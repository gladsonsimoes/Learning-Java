package com.company.logica_de_programacao.variaveis_e_constantes.exercicios;
/*
* Crie um programa que vai receber do usuário o valor do produto e a quantidade do produto que se deseja.-
*
* Com essas informações "encontre o subtotal" que será o "valor do produto" *multiplicado* pela "quantidade".-
*
   Depois você vai precisar usar uma estrutura de decisão.
   *
   * Se a quantidade desejada do produto for maior que 10 unidades,
   *
* vai ser preciso dar um desconto de 10% em cima do subtotal,
*
*  mas se for menor que 10, você NÃO aplica desconto algum.
*
Para encontrar o valor referente ao percentual de desconto (que vai ser 0% ou 10%, dependendo da quantidade)
*
* você multiplica o subtotal pelo próprio percentual e divide tudo por 100.
*
Tendo o valor referente ao percentual de desconto, você vai retirar esse valor do subtotal. O que sobrar será o valor
*
* total final e deverá ser apresentado no console.*/


import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valordoProduto = scanner.nextDouble();

        System.out.print("Digite a Quantidade de Produtos: ");
        Double quantidadeproduto = scanner.nextDouble();

        Double subtotal = valordoProduto * quantidadeproduto;
        Boolean temDesconto = quantidadeproduto > 10;

        if(temDesconto) {
            Double desconto = (subtotal * 10) / 100;
            subtotal = subtotal - desconto;
            System.out.println("O cliente comprou " + quantidadeproduto + " produtos, \nlogo recebera um desconto de 10%, pagando " + subtotal);
        } else {
            System.out.println("O cliente  não comprou mais  de 10 unidade pagará " + subtotal );
        }
    }
}
