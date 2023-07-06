package demo.beans;

public class SetterInjectionBean {

    DependencyBean dependency;

    public SetterInjectionBean() {
        super();
    }

    public DependencyBean getDependency() {
        return dependency;
    }

    public void setDependency(DependencyBean dependencyBean) {
        this.dependency = dependencyBean;
        System.out.println("sono nel setter");
    }

    public void doSomething() {
        dependency.doSomething();

    }

}
