import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jclyne1 on 2/10/18.
 */
public class Sample {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/posts", String.class);
        log.print(response.getBody());
    }

}
