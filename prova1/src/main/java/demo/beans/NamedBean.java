package demo.beans;


import javax.inject.Named;

@Named
public class NamedBean {
    public void saluto() {
        System.out.println("named bean");
    }
}
