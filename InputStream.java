import java.io.*;

public class InputStream {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            // Create an InputStream to read from a file
            fileInputStream = new FileInputStream("example.txt");

            int data;
            // Read the file byte by byte
            while ((data = fileInputStream.read()) != -1) {
                // Print each byte as a character
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
