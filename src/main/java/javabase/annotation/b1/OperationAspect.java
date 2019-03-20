package javabase.annotation.b1;

import org.aspectj.lang.annotation.Around;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/03/04 9:29
 * Editored:
 */
public class OperationAspect {

    @Around(value = "@annotation(description)")
    public Object doOperation(Operation operation) {
return null;
    }

}
