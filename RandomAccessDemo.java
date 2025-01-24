import java.io.*;
public class RandomAccessDemo {
    public static void main(String[]args) throws IOException {
        char a[] = {'a','e','i','o','u'};
        RandomAccessFile rand = new RandomAccessFile("rand.txt","rw");
        System.out.println("Writing vowel letters to File:");
        for(int i = 0; i<a.length; i++) {
            rand.writeChar(a[i]);
        }
        System.out.println("Finishing Writing:");
        rand.close();
    }
}