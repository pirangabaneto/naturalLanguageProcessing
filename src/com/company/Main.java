package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        NegocioTexto negTexto = new NegocioTexto();
        NegocioPalavra negPalavra = new NegocioPalavra();
        Scanner input = new Scanner(System.in);

        Texto t = negTexto.lerTexto();

        //numero total de palavras no texto:
        //System.out.println(negTexto.qntPalavrasTexto(t));
        //-----------------------------------------------------------------------------------------------------------

        //System.out.println(negTexto.palavraMaiorOcorrencia(t).getPalavra() +
         //       " -> " + negTexto.palavraMaiorOcorrencia(t).getOcorrencia());
        //-----------------------------------------------------------------------------------------------------------
        //alterar essa palara pra omputaao ufape
        //negTexto.substituirPalavra(t, negTexto.palavraMaiorOcorrencia(t).getPalavra(),"COMPUTACAO UFAPE");
        //-----------------------------------------------------------------------------------------------------------
       //identificar os verbos
        for(Palavra p : t.getTexto()){
            System.out.println(p.getPalavra() + "->" + p.getClasseGramatical());
        }

    }
}
