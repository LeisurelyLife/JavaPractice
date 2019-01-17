package autoboxing;

import java.util.Date;

/**
 * Created by Rt on 2018/8/17.
 */
public class Count {
    public static void main(String[] args) {
        primary();
        box();
    }

    public static void primary() {
        Date start = new Date();
        long sum = 0;
        for(long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        Date end = new Date();
        System.out.println("primary" + (start.getTime() - end.getTime()));
    }

    public static void box() {
        Date start = new Date();
        Long sum = 0L;
        for(long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        Date end = new Date();
        System.out.println("box" + (start.getTime() - end.getTime()));
    }
}
