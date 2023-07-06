package demo.config;
import demo.aspect.LogAspect;
import demo.beans.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

@Configuration
@SpringBootApplication
@EnableAspectJAutoProxy
@ImportResource("property.xml")
@ComponentScan(basePackages = "demo")
public class ProjectConfig {

    @Value("${prop}")
    private String message;

    @Primary
    @Bean
    public MyBean myBean(){
        MyBean b= new MyBean();
        b.setText("bean");
        return  b;
    }
    @Lazy
    @Bean
    public MyBean myBean2(){
        MyBean b= new MyBean();
        b.setText("bean2");
        return  b;
    }
    @Lazy
    @Bean("C")
    public MyBean myBean3(){
        MyBean b= new MyBean();
        b.setText("bean3");
        return  b;
    }
    @Lazy
    @Bean
    public BeanJavaCentric myBean4(){
        BeanJavaCentric b= new BeanJavaCentric();
        b.setMessage(message);
        return  b;
    }

    @Bean
    public MyBeanInterface myBeanInterface() {
        return new MyBean();
    }
    @Bean
    public BeanFather beanFather(){
        BeanFather beanFather= new BeanFather();
        beanFather.setFather("Anakin");
        return  beanFather;
    }
    @Bean
    public BeanSon beanSon(){
        BeanSon beanSon= new BeanSon();
        beanSon.setSon("Luke");
        beanSon.setBeanFather(beanFather());
        return  beanSon;
    }
    @Lazy //in questo modo il bean viene creato solo quando richiesto nel main. Questa notation equivalente all'attributo lazy-init nell'XML di configurazione di Spring
    @Bean
    public LazyBean lazyBean(){
        LazyBean l= new LazyBean();
        System.out.println("Creazione bean lazy");
        return l;
    }

    @Bean
    public LogAspect getLogApect(){
        return new LogAspect();
    }


}
