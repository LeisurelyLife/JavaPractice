package javabase.implement;

/**
 * Created by hoval on 2019/04/08.
 */
public interface FInterface_2 {

    int value = 110;

    default void defaultImpl() {
        System.out.println("defaultImpl_2");
    }

}
