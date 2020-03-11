package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RepositorioTexto {
    public ArrayList<Palavra> texto;

    public RepositorioTexto(){
        this.texto = new ArrayList<>();
    }

    //ta lendo o /n como uma palavra
    public ArrayList<Palavra> lerTexto() throws IOException {

        FileReader fileReader = new FileReader("texto1.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String lineString = null;
        ArrayList<String> textoString = new ArrayList<>();

        //le o texto completo
        while((lineString=bufferedReader.readLine())!=null){
            lineString = lineString.replaceAll("[^a-zA-Z0-9\\s·‡„ÈÍÌÛıÁ]", " ");
            textoString.addAll(Arrays.asList(lineString.split(" ")));
        }
        //transforma string em Palavras
        for (String s: textoString){
            if(s.length() != 0){
                texto.add(new Palavra(s));
            }
        }
        return texto;
    }

    //escrever texto
    public void escreverTexto(Texto texto) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("texto1.txt"));
        for(Palavra p : texto.getTexto()){
           writer.append(p.getPalavra()).append(" ");
        }
        writer.close();
        System.out.println("foi");
    }

}
