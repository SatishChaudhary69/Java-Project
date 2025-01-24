import java.io.*;
public class BufferWriter {
    public static void main(String[]args) throws Exception {
        FileWriter writer = new FileWriter("D:\\testout.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("Welcome to JavaTpoint.");
        buffer.close();
        System.out.println("Success");
    }
}