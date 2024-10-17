package com.bankpro.analisador.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.HashMap;
import java.util.Map;

@Named
@RequestScoped
public class AnalisadorFraseBean {

    private String frase; // Propriedade que estava faltando
    private Integer qtdPalavrasDistintas;
    private Map<String, Integer> resultado;

    // Método para analisar a frase
    public void analisarFrase() {
        if (frase != null && !frase.isEmpty()) {
            resultado = new HashMap<>();
            String[] palavras = frase.split("\\s+");

            // Contar ocorrências de cada palavra
            for (String palavra : palavras) {
                resultado.put(palavra, resultado.getOrDefault(palavra, 0) + 1);
            }

            // Definir a quantidade de palavras distintas
            qtdPalavrasDistintas = resultado.size();
        } else {
            // Caso a frase seja vazia, reseta os valores
            resultado = null;
            qtdPalavrasDistintas = null;
        }
    }

    // Getters e Setters

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public Integer getQtdPalavrasDistintas() {
        return qtdPalavrasDistintas;
    }

    public void setQtdPalavrasDistintas(Integer qtdPalavrasDistintas) {
        this.qtdPalavrasDistintas = qtdPalavrasDistintas;
    }

    public Map<String, Integer> getResultado() {
        return resultado;
    }

    public void setResultado(Map<String, Integer> resultado) {
        this.resultado = resultado;
    }
}

