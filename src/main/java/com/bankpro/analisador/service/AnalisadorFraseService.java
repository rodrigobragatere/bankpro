package com.bankpro.analisador.service;

import com.bankpro.analisador.model.ResultadoAnalise;
import java.util.HashMap;
import java.util.Map;  // Certifique-se que o import é da coleção Java
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/analisador")
public class AnalisadorFraseService {

    @POST
    @Path("/analise")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response analisarFrase(String frase) {
        String[] palavras = frase.toLowerCase().split("\\s+");
        Map<String, Integer> ocorrencias = new HashMap<>();  // Usando HashMap correto

        for (String palavra : palavras) {
            ocorrencias.put(palavra, ocorrencias.getOrDefault(palavra, 0) + 1);
        }

        int palavrasDistintas = ocorrencias.size();

        return Response.ok(new ResultadoAnalise(palavrasDistintas, ocorrencias)).build();
    }
}
