import java.io.File.*;
import java.io.PrintWriter;
public class PrintWriterExample {
    public static void main(String[]args) throws Exception {
        PrintWriter writer = new PrintWriter(System.out);
        writer.write("Welcome to BCA Note(pokhara University)");
        writer.flush();
        writer.close();
        PrintWriter writer1 = new PrintWriter("D:\\testout.txt");
        writer1.write("For All Semister Notes.");
        writer1.flush();
        writer1.close();
    }
}