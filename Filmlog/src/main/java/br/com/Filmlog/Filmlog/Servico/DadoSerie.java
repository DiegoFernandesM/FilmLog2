package br.com.Filmlog.Filmlog.Servico;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(
        ignoreUnknown = true
)
public record DadoSerie(String titulo, Integer TotalTemporadas, String Avaliacao) {
    public DadoSerie(@JsonAlias({"Title"}) String titulo, @JsonAlias({"totalSeasons"}) Integer TotalTemporadas, @JsonAlias({"imdbRating"}) String Avaliacao) {
        this.titulo = titulo;
        this.TotalTemporadas = TotalTemporadas;
        this.Avaliacao = Avaliacao;
    }

    @JsonAlias({"Title"})
    public String titulo() {
        return this.titulo;
    }

    @JsonAlias({"totalSeasons"})
    public Integer TotalTemporadas() {
        return this.TotalTemporadas;
    }


}

