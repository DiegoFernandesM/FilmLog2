package br.com.Filmlog.Filmlog.Principal;

import br.com.Filmlog.Filmlog.ModeloApi.ConsumoApi;
import br.com.Filmlog.Filmlog.Servico.ConverteDado;
import br.com.Filmlog.Filmlog.Servico.DadoEpisodio;
import br.com.Filmlog.Filmlog.Servico.DadoSerie;

import java.util.List;
import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumoApi = new ConsumoApi();
    private ConverteDado converteDados = new ConverteDado();

    private final String  ENDERECO = "https://superflixapi.dev/serie/84958";


    public void exibeMenu (){
        System.out.println("Digite o nome da série para busca");
        var nomeSerie = leitura.nextLine();
        var consumoApi = new ConsumoApi();
        var json = consumoApi.obterDados(new StringBuilder().append(ENDERECO).append(nomeSerie.replace(" ", "+")).toString());

        ConverteDado converteDados = new ConverteDado();
        DadoSerie dados	= converteDados.obterDados(json, DadoSerie.class);
        System.out.println(dados);

        System.out.println("Hello World");

    }


}

