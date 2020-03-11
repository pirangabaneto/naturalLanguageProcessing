package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
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
            verbos.add(lineString.toLowerCase());
        }
        return verbos;
    }

    private String lerPronomes(String palavra) throws IOException {
        FileReader fileReader = new FileReader("pronomes.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String lineString = null;
        ArrayList<String> pronomes = new ArrayList<>();

        //le o texto completo
        while((lineString=bufferedReader.readLine())!=null){
            pronomes.add(lineString.toLowerCase());
        }

        for(String s : pronomes){
            if(s.equals(palavra.toLowerCase())){
                return "pronome";
            }
        }
        return("");
    }

    private String lerArtigos(String palavra) throws IOException {
        FileReader fileReader = new FileReader("artigos.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String lineString = null;
        ArrayList<String> pronomes = new ArrayList<>();

        //le o texto completo
        while((lineString=bufferedReader.readLine())!=null){
            pronomes.add(lineString.toLowerCase());
        }

        for(String s : pronomes){
            if(s.equals(palavra.toLowerCase())){
                return "artigo";
            }
        }
        return("");
    }

    private String todosVerbos(String palavra) throws IOException {
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
        return ("");
    }

    private String lerNomes(String palavra) throws IOException {
        FileReader fileReader = new FileReader("nomes1.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String lineString = null;
        ArrayList<String> nomes = new ArrayList<>();

        //le o texto completo
        while((lineString=bufferedReader.readLine())!=null){
            nomes.add(lineString.toLowerCase());
        }

        for(String s : nomes){
            if(s.equals(palavra.toLowerCase())){
                return "substantivo proprio";
            }
        }
        return("");
    }

    public String classificarPalavra(String palavra) throws IOException {
        if(palavra.charAt(0) ==  palavra.toUpperCase().charAt(0)){
            String res = lerNomes(palavra);
            if (!res.equals("")) {
                return res;
            }
        }
        String res = lerArtigos(palavra);
        if (!res.equals("")) {
            return res;
        }
        res = lerPronomes(palavra);
        if (!res.equals("")) {
            return res;
        }
        res = todosVerbos(palavra);
        if (!res.equals("")) {
            return res;
        }
        return "desconhecido";
    }
}
