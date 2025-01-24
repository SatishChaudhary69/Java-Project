// Implementing the Runnable interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running.");
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        // Create an instance of MyRunnable
        MyRunnable myRunnable = new MyRunnable();

        // Create a thread and pass the Runnable instance to it
        Thread thread = new Thread(myRunnable);

        // Start the thread
        thread.start();
    }
}
