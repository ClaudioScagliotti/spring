package demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutowiredInjectionBean {
    private DependencyBeanComponent dependency;

    @Autowired
    public void setDependency(DependencyBeanComponent dependency) {
        this.dependency = dependency;
    }

    public void doSomething() {
        dependency.doSomething();
    }
}
