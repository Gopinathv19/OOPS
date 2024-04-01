package IO;
import java.io.*;
public class filewriter2 {
    public static void main(String[] args) {
        try{
        FileWriter fr = new FileWriter("C:\\Users\\gopin\\OneDrive\\Desktop\\Desktop 2\\OOPS\\IO\\hello.txt");
        fr.write("nallama");
        fr.close();    
        }
    
    catch(Exception e)
    {
        System.out.println(e);
    }
}
}