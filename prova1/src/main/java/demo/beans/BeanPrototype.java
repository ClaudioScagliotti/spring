package demo.beans;

public class BeanPrototype {
    private String messaggio="Bean Prototype";

    public String saluto() {
        return messaggio;
    }

    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }

    public String getMessaggio() {
        return messaggio;
    }
}
