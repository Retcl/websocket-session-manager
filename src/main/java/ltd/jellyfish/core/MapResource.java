package ltd.jellyfish.core;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;



@Component
public class MapResource {

    @Bean
    public Map<String, String> sessionMapBean(){
        return new HashMap<>();
    }

}
