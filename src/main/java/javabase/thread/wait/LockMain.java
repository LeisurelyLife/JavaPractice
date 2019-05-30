//package javabase.thread.wait;
//
///**
// * @author ruanting
// * @date 2019/05/29
// */
//public class LockMain {
//
//    public static Lock lock = new Lock();
//
//    public static boolean flag = true;
//
//    public static void main(String[] args) {
//        lockObject();
//
//    }
//
//    /**
//     * 如果一个线程没有占有一个对象的话，是不能使用
//     */
//    public static void lockObject() {
//        new Thread() {
//            @Override
//            public void run() {
//                synchronized () {
//                lock.saySomething(Thread.currentThread().getName());
//                while (flag) {
//
//                }
//            }
//        }.start();
//        new Thread() {
//            @Override
//            public void run() {
//                lock.saySomething(Thread.currentThread().getName());
//            }
//        }.start();
//    }
//
//    public static void testIllegalMonitor_2() {
//        new Thread() {
//            @Override
//            public void run() {
//                lock.whileMethod();
//            }
//        }.start();
//        new Thread() {
//            @Override
//            public void run() {
//                try {
//                    wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }.start();
//    }
//}
