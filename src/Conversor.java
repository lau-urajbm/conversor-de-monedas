import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Conversor {
    RegistroMonedas registroMonedas;
    public Moneda obtenerValor(String  monedaBase, String monedaObjetivo){

        registroMonedas = new RegistroMonedas(monedaBase, monedaObjetivo);

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/b3b1ff6eef6de812b7917c0d/pair/"
                +monedaBase+"/"+monedaObjetivo);
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }




    }
    public void hacerConversion(Moneda tasa ){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escriba la cifra que desea convertir: ");
        double cifra= teclado.nextDouble();
        registroMonedas.setCifraInicial(cifra);
        System.out.println(tasa.conversion_rate()*cifra);
        registroMonedas.setConversion(tasa.conversion_rate()*cifra);

    }

}
