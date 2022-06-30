package co.develhope.DependencyInjection.Services;

import co.develhope.DependencyInjection.Components.MyComponent;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private MyComponent myComponent;

    public MyService(MyComponent myComponent){
        this.myComponent=myComponent;
    }

    public String getName(){
        System.out.println("MyService called!");
        return myComponent.getMyComponentName();
    }

}
