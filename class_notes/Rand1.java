//Rand1.java
import java.io.*;

class Rand1{
    public static void main(String args[])throws Exception{
        RandomAccessFile raf = new RandomAccessFile("file2.txt", "r");
        raf.seek(5);
        System.out.println(raf.read());
        raf.close();
    }
}