package javabase.implement;

/**
 * Created by hoval on 2019/04/08.
 */
public interface FInterface_1 {

    int value = 110;

    default void defaultImpl() {
        System.out.println("defaultImpl_1");
    }

}
