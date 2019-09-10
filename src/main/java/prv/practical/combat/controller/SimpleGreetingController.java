package prv.practical.combat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author frankwei <frank@frankwei.xyz>
 */
@RestController
public class SimpleGreetingController {

    @GetMapping("/greet")
    private Greeting greeting(
            @RequestParam(value = "name", defaultValue = "you")
                    String name) {
        return new Greeting("Hey " + name);
    }
}

class Greeting {
    private String message;

    Greeting(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
