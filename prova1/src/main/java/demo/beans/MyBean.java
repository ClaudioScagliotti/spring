package demo.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MyBean implements MyBeanInterface{

    //voglio creare un bean di questa classe tramite il context
    @PostConstruct //equivalente a init-method del file di configurazione xml
    public void init() {
        System.out.println("init");
    }
    @PreDestroy //equivalente a destroy-method del file di configurazione xml
    public void destroy() {
        System.out.println("destroy");
    }


    private String text;

    @Override
    public void hello() {
        System.out.println("Aspect");
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
