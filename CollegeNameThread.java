class CollegeThread extends Thread {
    private final String collegeName;

    // Constructor to set the college name
    public CollegeThread(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public void run() {
        // Print the college name 10 times
        for (int i = 1; i <= 10; i++) {
            System.out.println(collegeName);
            try {
                Thread.sleep(500); // Simulate delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class CollegeNameThread {
    public static void main(String[] args) {
        // Create and start a thread for printing the college name
        CollegeThread thread = new CollegeThread("SchEms");
        thread.start();
    }
}
