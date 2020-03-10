package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class RepositorioPalavra {

    private ArrayList<String> lerVerbos() throws IOException {

        FileReader fileReader = new FileReader("verbos.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String lineString = null;
        ArrayList<String> verbos = new ArrayList<>();

        //le o texto completo
        while((lineString=bufferedReader.readLine())!=null){
            verbos.add(lineString);
        }
        return verbos;
    }
    public String classificarPalavra(String palavra) throws IOException {
        ArrayList<String> verbos = lerVerbos();
        int tamanhoVerbo;
        for(String v : verbos){
            tamanhoVerbo = v.length()-2;
            if(tamanhoVerbo >0){
                if(palavra.length() >= tamanhoVerbo){
                    if(palavra.substring(0,tamanhoVerbo).equals(v.substring(0,tamanhoVerbo))){
                        return "vebo";
                    }
                }
            }
        }
        return ("desconhecido");
    }
}
