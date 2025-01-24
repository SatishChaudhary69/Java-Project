import java.io.IOException;
import java.net.*;
public class URLDemo {
    public static void main(String []args) throws IOException {
        URL hp = new URL("https://www.facebook.com");
        URLConnection hpCon = hp.openConnection();
        int len = hpCon.getContentLength();
        System.out.println("contentLength:"+len);
    }
}