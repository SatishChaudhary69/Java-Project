// Extending the Thread class
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running.");
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        // Create an instance of MyThread
        MyThread thread = new MyThread();

        // Start the thread
        thread.start();
    }
}
