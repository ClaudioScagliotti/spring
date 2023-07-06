package demo.beans;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class LazyBean {
    @PostConstruct //equivalente a init-method del file di configurazione xml
    public void init() {
        System.out.println("init lazy");
    }
    @PreDestroy //equivalente a destroy-method del file di configurazione xml
    public void destroy() {
        System.out.println("destroy lazy");
    }
    public void sonoPigro(){
        System.out.println("Sono pigro");
    }
}
