package demo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogAspect {

    //@Before("execution(* demo.beans.MyBeanInterface.hello(..))")

    @Before(value = "bean(namedBean)") // eseguito ogni volta che viene instanziato un bean che contiene nel nome "myBean"
    public void logBefore(){
        System.out.println("inizio esecuzione");
    }
    @After(value = "within (demo.services..*)")
    public void logAfter(){
        System.out.println("fine esecuzione");
    }
}
