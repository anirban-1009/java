import java.io.*;
class TwoFile
{
    public static void main(String a[]) throws Exception
    {
        ByteArrayOutputStream bs = new ByteArrayOutputStream();
        FileOutputStream fos1 = new FileOutputStream("file1.txt");
        FileOutputStream fos2 = new FileOutputStream("file2.txt");
        bs.write(65);
        bs.writeTo(fos1);
        bs.writeTo(fos2);
        bs.close();
        fos1.close();
        fos2.close();
        System.out.println("Done!!!!!!!!!!!!");
    }
}