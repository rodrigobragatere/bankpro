package com.bankpro.analisador.model;

import java.util.Map;  // Import correto para Map
import java.util.HashMap;

public class ResultadoAnalise {
    private int palavrasDistintas;
    private Map<String, Integer> ocorrencias;

    public ResultadoAnalise(int palavrasDistintas, Map<String, Integer> ocorrencias) {
        this.palavrasDistintas = palavrasDistintas;
        this.ocorrencias = ocorrencias;
    }

    public int getPalavrasDistintas() {
        return palavrasDistintas;
    }

    public Map<String, Integer> getOcorrencias() {
        return ocorrencias;
    }
}
