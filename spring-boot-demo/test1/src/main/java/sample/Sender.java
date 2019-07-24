package sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sender {

    @GetMapping("/test")
    public String test( String param) {
        System.out.println("hello word");
        return param;
    }


}
