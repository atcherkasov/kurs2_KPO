package jmm;

import java.util.Scanner;

//*
class A {
    private boolean running = true;

    synchronized
    boolean isRunning(){
        return running;
    }
    synchronized
    void setRunning(boolean newValue){
        running = newValue;
    }
}
//*/

/**
 * TODO:
 * 1. Run the program VolatileTest1 having isRunning declared without volatile =>
 *       thread is not finishing when isRunning set to false.
 * 2. Run the program VolatileTest1 having isRunning with volatile =>
 *       thread is finishing after input in console...
 * 3. Run the program having replaced isRunning with class A instance and compare it with 1 and 2 above...
 */

class VolatileTest1 {

    public static
    volatile
    boolean isRunning = true;

    public static void main(String[] args) {
        System.out.println("thread = " + Thread.currentThread());
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (isRunning) {

                }
                System.out.println("thread finishing...");
            }
        });
        t.start();

        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        isRunning = false;
        System.out.println("main thread finished");
    }
}

class VolatileTest2 {

    static A a = new A();

    public static void main(String[] args) {
        System.out.println("thread = " + Thread.currentThread());
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (a.isRunning()) {

                }
                System.out.println("thread finished");
            }
        });
        t.start();

        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        a.setRunning(false);
        System.out.println("main thread finished");
    }
}
