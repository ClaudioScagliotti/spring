package demo.beans;

import org.springframework.stereotype.Component;

@Component
public class DependencyBeanComponent {
    public void doSomething() {
        System.out.println("DependencyBean");
    }
}
