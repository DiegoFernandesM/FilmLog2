package br.com.Filmlog.Filmlog.Servico;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;




        public class ConverteDado implements IConverteDados {
    private ObjectMapper mapper = new ObjectMapper();

    public ConverteDado() {
    }

    public <T> T obterDados(String json, Class<T> classe) {
        try {
            return this.mapper.readValue(json, classe);
        } catch (JsonProcessingException var4) {
            JsonProcessingException e = var4;
            throw new RuntimeException(e);
        }
    }
}

