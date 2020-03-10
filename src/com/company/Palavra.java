package com.company;

import java.io.IOException;
import java.util.ArrayList;

public class Palavra {
    private String palavra;
    private int ocorrencia;
    private String classeGramatical;

    public Palavra(String palavra) throws IOException {
        NegocioPalavra negPalavra = new NegocioPalavra();
        this.palavra  =  palavra;
        this.ocorrencia = 1;
        this.classeGramatical = negPalavra.classificarPalavra(palavra);

    }

    public Palavra(String palavra, int nOcorrencia){
        this.palavra  =  palavra;
        this.ocorrencia = nOcorrencia;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public int getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(int ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public String getClasseGramatical() {   
        return classeGramatical;
    }

    public void setClasseGramatical(String classeGramatical) {
        this.classeGramatical = classeGramatical;
    }
}
