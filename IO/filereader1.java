package IO;
import java.io.*;
public class filereader1 {
    public static void main(String[] args) {
        try{
        FileReader fr=new FileReader("C:\\Users\\gopin\\OneDrive\\Desktop\\Desktop 2\\OOPS\\IO\\hello.txt");
        int i=0;
        while(i!=-1)
        {
            System.out.print((char)i);
            i=fr.read();
        }
        fr.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
