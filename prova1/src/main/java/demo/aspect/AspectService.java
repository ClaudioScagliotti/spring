package demo.aspect;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Service;
@Aspect
@Service
public class AspectService {

    @Before("execution(* demo.beans.MyBeanInterface.hello(..))")
    public void before() {
        System.out.println("Before");
    }
    @After("execution(* demo.beans.MyBeanInterface.hello(..))")
    public void after() {
        System.out.println("After");
    }
    @AfterReturning("execution(* demo.beans.MyBeanInterface.hello(..))")
    public void afterReturn() {
        System.out.println("After return");
    }
    @AfterThrowing("execution(* demo.beans.MyBeanInterface.hello(..))")
    public void afterThrow() {
        System.out.println("After throw");
    }

   /* @Around // sostituisce il parametro del metodo cheviene specificato
    public Object around(ProceedingJoinPoint joinPoint){
        return "message"
    }
    */

}
