package es.unavarra.gpi2;

/**
 * Hello world!
 *
 */

import java.io.IOException;
import java.net.URI;
import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;
import jdk.incubator.http.HttpResponse.BodyHandler;

public class GPIA115496 
{
    public static void main( String[] args )
    {
	HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
              .uri(URI.create("http://localhost:8080"))
              .GET()
              .build();
        
        
        try {
		HttpResponse<String> respuesta=client.send(request, BodyHandler.asString());
        	System.out.println(respuesta.body());
      } catch (IOException | InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }   
    }
}
