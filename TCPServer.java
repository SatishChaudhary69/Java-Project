import java.io.*;
import java.net.*;
public class TCPServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server is listening on port 5000");
// Accept a client connection
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");
// Create input and output streams
            BufferedReader input = new BufferedReader(new
                    InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
// Read and respond to client messages
            String message = input.readLine();
            System.out.println("Received: " + message);
            output.println("Hello, client!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
