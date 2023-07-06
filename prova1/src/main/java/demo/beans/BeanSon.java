package demo.beans;


import org.springframework.context.annotation.DependsOn;

@DependsOn("beanSon") // serve se vogliamo essere sicuri che il bean beanSon venga creato prima di beanFather
public class BeanSon {

    String son;
    BeanFather beanFather;

    public String getSon() {
        return son;
    }

    public void setSon(String son) {
        this.son = son;
    }

    public BeanFather getBeanFather() {
        return beanFather;
    }

    public void setBeanFather(BeanFather beanFather) {
        this.beanFather = beanFather;
    }

    @Override
    public String toString() {
        return "BeanSon{" +
                "son='" + son + '\'' +
                ", beanFather=" + beanFather +
                '}';
    }
}
