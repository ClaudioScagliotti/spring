package demo.components;

import org.springframework.stereotype.Component;

@Component(value = "exempleComponent")
public class ExempleComponent {
    public ExempleComponent(){
        super();
    }

    public void exempleMethod(){
        System.out.println("metodo di esempio");
    }

}
