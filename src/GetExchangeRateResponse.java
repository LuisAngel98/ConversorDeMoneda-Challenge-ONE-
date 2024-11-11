import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GetExchangeRateResponse {
    public static ExchangeRateResponse getExchangeRate (String base_code) {
        URI direction = URI.create("https://v6.exchangerate-api.com/v6/bdf445670af07b6d23300be4/latest/"+ base_code);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direction)
                .build();
        try {
            HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), ExchangeRateResponse.class);
        }catch (Exception e) {
            throw new RuntimeException("Error inesperado.");
        }
    }
}
