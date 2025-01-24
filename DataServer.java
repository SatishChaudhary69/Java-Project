
import java.net.*;

public class DataServer {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        try {
            // Create a DatagramSocket to listen on port 9876
            socket = new DatagramSocket(9876);
            byte[] receiveData = new byte[1024];

            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

                // Receive data from client
                socket.receive(receivePacket);

                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Received: " + message);

                // Send a response back to the client
                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();
                String response = "Hello from server!";
                DatagramPacket sendPacket = new DatagramPacket(response.getBytes(), response.length(), clientAddress, clientPort);
                socket.send(sendPacket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
        }
    }
}

