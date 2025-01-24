import java.io.*;
import java.net.*;
public class TCPClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000)) {
// Create input and output streams
            BufferedReader input = new BufferedReader(new
                    InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
// Send and receive messages
            output.println("Hello, server!");
            String response = input.readLine();
            System.out.println("Server says: " + response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}