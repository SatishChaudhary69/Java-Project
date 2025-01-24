class Counter {
    private int count = 0;

    synchronized void increment() {
        count++;
    }

    int getCount() {
        return count;
    }
}

class MyThread3 extends Thread {
    Counter counter;

    MyThread3(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class ThreadSynchronization {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        MyThread3 t1 = new MyThread3(counter);
        MyThread3 t2 = new MyThread3(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + counter.getCount());
    }
}
