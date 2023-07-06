package demo.beans;

public class BeanSingleton {
    private String messaggio;

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
