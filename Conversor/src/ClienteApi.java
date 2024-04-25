import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ClienteApi {
    private final String URL_BASE = "https://v6.exchangerate-api.com/v6/";
    //antes de compilar esta aplicacion debe reemplazar el valor de esta constante por su API_KEY.
    private final String API_KEY = "TU_API_KEY";
    private final String CONVERT = "/pair/";

    private HttpClient client = HttpClient.newHttpClient();

    private HttpRequest getRequest(String baseCurrency, String targetCurrency, String amount) {
        URI endpoint = URI.create(URL_BASE + API_KEY + CONVERT + baseCurrency +"/" + targetCurrency + "/" + amount);
        return HttpRequest.newBuilder()
                .uri(endpoint)
                .build();
    }

   private HttpResponse<String> sendRequest(String baseCurrency, String targetCurrency, String amount){
        HttpResponse<String> respuesta = null;
       try {
           respuesta = client.send(getRequest(baseCurrency, targetCurrency, amount), HttpResponse.BodyHandlers.ofString());
       } catch (IOException e) {
           System.out.println(" ocurrio un error consultando la API");
           System.out.println(e.getMessage());
       } catch (InterruptedException e) {
           System.out.println(" ocurrio un error consultando la API");
           System.out.println(e.getMessage());
       }
       return respuesta;
   }

   public DatosDeMonedas getAmount(String baseCurrency, String targetCurrency, String amount){
       HttpResponse<String> respuesta = sendRequest(baseCurrency, targetCurrency, amount);
       if (respuesta == null) return null;

       return new Gson().fromJson(respuesta.body(), DatosDeMonedas.class);
   }
}