package com.company;

import java.io.IOException;
import java.util.ArrayList;

public class NegocioTexto {
    private RepositorioTexto repTexto;

    public NegocioTexto(){
        this.repTexto = new RepositorioTexto();
    }

    //concertar numero de ocorrencias dps daq
    public void substituirPalavra(Texto texto, String original, String subtituicao) throws IOException {
        for(Palavra p : texto.getTexto()){
            if(p.getPalavra().equals(original)){
                p.setPalavra(subtituicao);
            }
        }
        repTexto.escreverTexto(texto);
    }

    public Palavra palavraMaiorOcorrencia(Texto texto){
        Palavra maiorOcorrencia = new Palavra("", 0);
        for(Palavra p : texto.getTextoSemDuplicacao()){
            if(p.getOcorrencia() > maiorOcorrencia.getOcorrencia()){
                maiorOcorrencia = p;
            }
        }
        return maiorOcorrencia;
    }

    public Texto lerTexto() throws IOException {
        return (new Texto(repTexto.lerTexto()));
    }

    public int qntPalavrasTexto(Texto texto){
        return texto.getNumeroPalavras();
    }
}
