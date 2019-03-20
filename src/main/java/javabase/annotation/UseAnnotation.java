package javabase.annotation;

/**
 * Created by Rt on 2018/8/3.
 */
public class UseAnnotation {

    @Test(ignore = true)
    public void testYes() {
        System.out.println("yes");
    }

    @Test(ignore = false)
    public void testNo() {
        System.out.println("no");
    }

}
