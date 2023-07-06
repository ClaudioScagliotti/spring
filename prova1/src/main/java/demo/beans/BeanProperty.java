package demo.beans;

public class BeanProperty {
    private String messaggio;
    private String proprieta;

    public void saluto() {
        System.out.println(messaggio); ;
    }

    public void saluto2() {
        System.out.println(proprieta); ;
    }

    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }

    public String getMessaggio() {
        return messaggio;
    }

    public String getProprieta() {
        return proprieta;
    }

    public void setProprieta(String proprieta) {
        this.proprieta = proprieta;
    }
}
