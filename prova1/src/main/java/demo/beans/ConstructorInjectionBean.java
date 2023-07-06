package demo.beans;

import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectionBean {
    private final DependencyBeanComponent dependency;
    public ConstructorInjectionBean(DependencyBeanComponent dependency) {
        this.dependency = dependency;
    }

    public void doSomething() {
        dependency.doSomething();
    }
}
