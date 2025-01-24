class SharedResource {
    static synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread5 extends Thread {
    int num;

    MyThread5(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        SharedResource.printTable(num);
    }
}

public class StaticSynExample {
    public static void main(String[] args) {
        MyThread5 t1 = new MyThread5(2);
        MyThread5 t2 = new MyThread5(3);

        t1.start();
        t2.start();
    }
}
