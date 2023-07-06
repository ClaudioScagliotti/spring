package demo.beans;
public class BeanFather {

    String father;

    public void setFather(String father) {
        this.father = father;
    }

    public String getFather() {
        return father;
    }

    @Override
    public String toString() {
        return "BeanFather{" +
                "father='" + father + '\'' +
                '}';
    }
}
