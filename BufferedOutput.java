import java.io.*;

public class BufferedOutput {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            // Create a FileOutputStream to write to a file
            fileOutputStream = new FileOutputStream("output.txt");

            // Create a BufferedOutputStream to improve performance
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            String message = "Hello, Buffered OutputStream!";

            // Convert the message to bytes and write to the buffered output stream
            bufferedOutputStream.write(message.getBytes());

            // Flush the buffer to ensure all data is written to the file
            bufferedOutputStream.flush();

            System.out.println("Data has been written to output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
