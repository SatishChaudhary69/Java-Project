import java.net.*;

public class IPAddressFinder {
    public static void main(String[] args) {
        try {
            // Replace "example.com" with any domain name
            String domain = "example.com";

            // Get the IP address of the domain
            InetAddress ip = InetAddress.getByName(domain);

            // Display the domain name and its IP address
            System.out.println("Domain Name: " + domain);
            System.out.println("IP Address: " + ip.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Could not find IP address for the given domain.");
        }
    }
}
