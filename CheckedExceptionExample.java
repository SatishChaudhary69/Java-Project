import java.io.*;  // Importing required for checked exceptions

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            // Trying to open a file that doesn't exist (checked exception)
            FileReader file = new FileReader("nonexistentfile.txt");
            BufferedReader reader = new BufferedReader(file);
            reader.readLine();
            reader.close();
        } catch (FileNotFoundException e) {
            // Handle the checked exception
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            // Handle other IO exceptions
            System.out.println("Error: IO exception occurred.");
        }
    }
}
