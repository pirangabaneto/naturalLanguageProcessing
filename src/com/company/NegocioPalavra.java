package com.company;

import java.io.IOException;

public class NegocioPalavra {
    private RepositorioPalavra repPalavra;

    public NegocioPalavra(){
        this.repPalavra = new RepositorioPalavra();
    }
    public String classificarPalavra(String palavra) throws IOException {
        return repPalavra.classificarPalavra(palavra);
    }
}
