package aop.spring;

import org.aspectj.apache.bcel.classfile.Method;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/03/05 11:42
 * Editored:
 */
@Component
public class GreetingThrowAdvice implements ThrowsAdvice {

    public void afterThrowing(Method method, Object[] args, Object target, Exception e) {
        System.out.println("---------- Throw Exception ----------");
        System.out.println("Target Class: " + target.getClass().getName());
        System.out.println("Method Name: " + method.getName());
        System.out.println("Exception Message: " + e.getMessage());
        System.out.println("-------------------------------------");
    }
}
