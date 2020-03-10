package com.company;

import java.util.ArrayList;

public class Texto {

    private ArrayList<Palavra> texto;
    private ArrayList<Palavra> textoSemDuplicacao;
    private int numeroPalavras;

    public Texto(ArrayList<Palavra> texto){
        this.texto  =  texto;
        this.numeroPalavras = texto.size();
        textoSemDuplicacao = numeroOcorrencia(texto);
    }

    //array texto ta contando o numero de palavras errado
    private ArrayList<Palavra> numeroOcorrencia(ArrayList<Palavra> text){
        ArrayList<Palavra> t = new ArrayList<>(text);

        for(int i = 0; i < t.size()-1; i++){
            for (int j = i+1; j < t.size(); j++){
                if(t.get(i).getPalavra().equals(t.get(j).getPalavra())){
                    //System.out.println(t.get(i).getPalavra() + "=" + t.get(j).getPalavra());
                    t.get(i).setOcorrencia(t.get(i).getOcorrencia()+1);
                    t.remove(t.get(j));
                }
            }
        }
        return t;
    }

    public ArrayList<Palavra> getTexto() {
        return texto;
    }

    public void setTexto(ArrayList<Palavra> texto) {
        this.texto = texto;
    }

    public int getNumeroPalavras() {
        return numeroPalavras;
    }

    public void setNumeroPalavras(int numeroPalavras) {
        this.numeroPalavras = numeroPalavras;
    }

    public ArrayList<Palavra> getTextoSemDuplicacao() {
        return textoSemDuplicacao;
    }

    public void setTextoSemDuplicacao(ArrayList<Palavra> textoSemDuplicacao) {
        this.textoSemDuplicacao = textoSemDuplicacao;
    }
}

