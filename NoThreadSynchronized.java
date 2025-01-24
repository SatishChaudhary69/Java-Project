class Counter1 {
    private int count = 0;

    void increment() {
        count++;
    }

    int getCount() {
        return count;
    }
}

class MyThread4 extends Thread {
    Counter1 counter;

    MyThread4(Counter1 counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment(); // No synchronization
        }
    }
}

public class NoThreadSynchronized {
    public static void main(String[] args) throws InterruptedException {
        Counter1 counter = new Counter1();

        MyThread4 t1 = new MyThread4(counter);
        MyThread4 t2 = new MyThread4(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count (Without Synchronization): " + counter.getCount());
    }
}
