package AlphaTeam.myfirstjavaapplication.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // Injecting values which has been saved in our application.properties
    @Value("${team.coach}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String teamInfo()
    {
        return coachName + " is the coach of " + teamName;
    }

    @GetMapping("/")
    public String sayHello()
    {
        return "Hello World!";
    }

    @GetMapping ("/Test")
    public String test()
    {
        return "This is a test Controller!";
    }
}
