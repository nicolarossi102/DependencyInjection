package co.develhope.DependencyInjection.Components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private String myComponentName;

    @Autowired
    public void MyComponent(){
        this.myComponentName="Nicola Rossi";
    }

    public String getMyComponentName() {
        System.out.println("MyComponent Called!");
        return myComponentName;
    }

}
