package conexion;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

import record.Moneda;

public class Conexion {
    public Moneda parMoneda(String baseCode, String targetCode) throws IOException, InterruptedException {
        // String yourApiKeys = "e081013ad7131dca73876f9e";

        // URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" +
        // yourApiKeys + "/pair/" + baseCode + "/" + targetCode);
        URI direccion = URI.create(
                "https://v6.exchangerate-api.com/v6/e081013ad7131dca73876f9e/pair/" + baseCode + "/" + targetCode);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);

        } catch (IOException | IllegalStateException e) {
            throw new RuntimeException(e);
        }

        

    }

}