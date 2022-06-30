package co.develhope.DependencyInjection.Controllers;

import co.develhope.DependencyInjection.Services.MyService;
import org.springframework.web.bind.annotation.GetMapping;

public class MyController {

    private MyService myService;

    public MyController(MyService myService){
        this.myService=myService;
    }

    @GetMapping("/getName")
    public String getName(){
        System.out.println("MyController Called!");
        return myService.getName();
    }

    @GetMapping("/")
    public String hello(){
        return "Welcome!";
    }

}
