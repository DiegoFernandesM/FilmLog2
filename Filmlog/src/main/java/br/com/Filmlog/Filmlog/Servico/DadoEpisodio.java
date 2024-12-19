package br.com.Filmlog.Filmlog.Servico;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)

public record DadoEpisodio (@JsonAlias("Title") String Titulo,
                            @JsonAlias ("Episode") Integer episodio,
                            @JsonAlias ("imdbRating") String avaliacao,
                            @JsonAlias ("Released") String dataLancamento,
                            @JsonAlias ("Season") Integer temporada) {
}

