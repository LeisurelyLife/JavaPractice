package javabase.innerclass.private_;

/**
 * @author ruanting
 * @date 2019/11/18
 */
public class Outer {

    private class Pri {
        int x;
    }

    private Pri pri;

    public Pri getPri() {
        return pri;
    }

}
