class MyThread1 extends Thread {
    public MyThread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " is running with priority " + getPriority());
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("Thread 1");
        MyThread1 t2 = new MyThread1("Thread 2");
        MyThread1 t3 = new MyThread1("Thread 3");

        // Setting thread priorities
        t1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        t2.setPriority(Thread.NORM_PRIORITY); // Priority 5 (default)
        t3.setPriority(Thread.MAX_PRIORITY); // Priority 10

        // Starting threads
        t1.start();
        t2.start();
        t3.start();
    }
}
