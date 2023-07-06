package org.example;
import demo.aspect.ProdottoImpl;
import demo.aspect.ProdottoProxy;
import demo.beans.*;
import demo.config.ProjectConfig;
import demo.services.InjectService;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import demo.services.ProductService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String[] args)
    {
//        creazioneBean();
//        serviceAndRepository();
//        fatherAndSon();
//        lazy();
//        differentTypeInjection();
//        xmlConfig();
//        singletonAndPrototype();
//        xmlProperty();
//        jsrNotation();
        proxy();

    }

    public static void creazioneBean(){
        try(var context= new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            //by type
            MyBean b1 = context.getBean(MyBean.class);
            System.out.println(b1.getText());
            //by name
             MyBean b2= context.getBean("myBean2",MyBean.class);
            System.out.println(b2.getText());
            //by name custom
            MyBean b3 = context.getBean("C", MyBean.class);
            System.out.println(b3.getText());

            //tipo bean
            Class<?> type = context.getType("myBean");
            System.out.println("Tipologia del bean:" + type.getName());

            //cancellazione bean
            BeanDefinitionRegistry registry = (BeanDefinitionRegistry) context.getAutowireCapableBeanFactory();
            registry.removeBeanDefinition("myBean");
        }
    }

    public static void serviceAndRepository(){
        try(var context= new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            ProductService srv = context.getBean(ProductService.class);
            srv.addProduct();
        }
    }
    public static void fatherAndSon(){
        try(var context= new AnnotationConfigApplicationContext(ProjectConfig.class)) {
;           BeanSon b= context.getBean(BeanSon.class);
            b.getBeanFather().setFather("Darth Vader");
            System.out.println(b);
            System.out.println("Figlio: "+b.getSon());

            BeanFather beanFather=context.getBean(BeanFather.class);
            System.out.println(beanFather);
        }
    }
    public static void lazy(){
        try(var context= new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            LazyBean lazyBean=context.getBean(LazyBean.class);
            lazyBean.sonoPigro();
        }
    }
    public static void differentTypeInjection(){
        try(var context= new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            SetterInjectionBean setterInjectionBean= context.getBean(SetterInjectionBean.class);
            setterInjectionBean.doSomething();

            ConstructorInjectionBean constructorInjectionBean= context.getBean(ConstructorInjectionBean.class);
            constructorInjectionBean.doSomething();

            AutowiredInjectionBean autowiredInjectionBean= context.getBean(AutowiredInjectionBean.class);
            autowiredInjectionBean.doSomething();
        }
    }
    public static void xmlConfig(){


        try(var context = new ClassPathXmlApplicationContext("beans.xml")) {
            SetterInjectionBean setterInjectionBean= context.getBean(SetterInjectionBean.class);
            setterInjectionBean.doSomething();

        }
    }
    public static void singletonAndPrototype() {


        try (var context = new ClassPathXmlApplicationContext("beans.xml")) {


            BeanSingleton b = context.getBean(BeanSingleton.class);
            b.setMessaggio("Bean Singleton"); //sempre la stessa istanza, default
            System.out.println(b.saluto());

            BeanSingleton c = context.getBean(BeanSingleton.class);
            System.out.println(c.saluto());

            BeanPrototype d = context.getBean("beanPrototype",BeanPrototype.class);
            System.out.println(d.saluto()); //ogni volta istanza diversa

            BeanPrototype e = context.getBean("beanPrototype", BeanPrototype.class);
            e.setMessaggio("Altro Bean Prototype");
            System.out.println(e.saluto());

        }
    }
    public static void xmlProperty() {


        try (var context = new ClassPathXmlApplicationContext("property.xml")) {


            BeanProperty b = context.getBean(BeanProperty.class);
            b.saluto();
            b.saluto2();

        }
    }
    public static void jsrNotation(){
        try(var context= new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            InjectService i= context.getBean(InjectService.class);
            // vedi la classe InjectService
            i.prova();
            // utilizzo della notation value
            BeanJavaCentric b= context.getBean(BeanJavaCentric.class);
            System.out.println(b.getMessage());

        }
    }
    public static void proxy() {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            //Concetto di proxy, una classe che contiene all'interno un'istanza di un'altra classe, permettendoci di eseguire i metodi
            //come se stessimo invocando la classe stessa
            ProductService p= context.getBean(ProductService.class);
            p.addProduct();

            NamedBean n = context.getBean(NamedBean.class);
            n.saluto();

            ProdottoProxy pp = new ProdottoProxy(new ProdottoImpl());
            System.out.println(pp.getProdotto() + "\n" + pp.getProdotti());
        }
    }



}