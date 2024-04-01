package IO;
import java.io.*;
public class inputstream {
    public static void main(String[] args) {
    try{
        FileInputStream fis = new FileInputStream("C:\\Users\\gopin\\OneDrive\\Desktop\\OOPS\\IO\\hello.txt");
        int c = 0;
        while ((c!=-1)) {
            c=fis.read();
            System.out.println((char) c);
            
        }
        
        fis.close();
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
}
