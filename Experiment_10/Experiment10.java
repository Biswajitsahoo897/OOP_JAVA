package Experiment_10;

class ThreadDemo extends Thread {
    private String message;
    public ThreadDemo(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        synchronized (this) {
            System.out.println(message);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
        }
    }
}

public class Experiment10 {
    public static void main(String[] args) {
        ThreadDemo thread1 = new ThreadDemo("HELLO");
        ThreadDemo thread2 = new ThreadDemo("World");

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e);
        }
        System.out.println("Is thread1 alive? " + thread1.isAlive());
        System.out.println("Is thread2 alive? " + thread2.isAlive());
        try {
            System.out.println("Trying to restart thread1...");
            thread1.start();
        } catch (IllegalThreadStateException e) {
            System.out.println("Cannot restart thread1: " + e);
        }
    }
}
