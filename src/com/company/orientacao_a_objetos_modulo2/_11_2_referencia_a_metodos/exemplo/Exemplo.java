package com.company.orientacao_a_objetos_modulo2._11_2_referencia_a_metodos.exemplo;

import com.company.orientacao_a_objetos_modulo2._11_2_referencia_a_metodos.dao.FaturaDAO;
import com.company.orientacao_a_objetos_modulo2._11_2_referencia_a_metodos.modelo.Fatura;

import java.util.List;

public class Exemplo {
    public static void main(String[] args) {
        List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();

        /*for (Fatura f :faturasVencidas){
            f.atualizarStatus();
        }
        */

/*
        faturasVencidas.forEach(f -> f.atualizarStatus());//for bem mais moderno
*/
        faturasVencidas.forEach(Fatura::atualizarStatus);//for que o prof indicou que seria melhor usar daqui pra frente
    }
}
