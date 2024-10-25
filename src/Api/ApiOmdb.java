package Api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiOmdb {
    String endereco ="http://www.omdbapi.com/?t=deadpool&apikey=360c0a1f";


    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(endereco))
            .build();
    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

    String json = response.body();

    public ApiOmdb() throws IOException, InterruptedException {
    }
}
