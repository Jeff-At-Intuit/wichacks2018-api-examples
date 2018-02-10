import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jclyne1 on 2/10/18.
 */
public class SamplePost {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String request = "{\n"
            + "  'q': 'The quick brown fox jumped over the lazy dog.',\n"
            + "  'source': 'en',\n"
            + "  'target': 'es',\n"
            + "  'format': 'text'\n"
            + "  }";


        ResponseEntity<String> response =
            restTemplate.postForEntity("https://translation.googleapis.com/language/translate/v2?key="
                + System.getenv("G_API_KEY"), request, String.class);
        log.print(response.getBody());
    }

}
