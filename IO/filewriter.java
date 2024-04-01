package IO;
import java.io.*;
public class filewriter {
    public static void main(String[] args) {
        try{
            FileWriter out =new FileWriter("C:\\Users\\gopin\\OneDrive\\Desktop\\Desktop 2\\OOPS\\IO\\hello.txt");
            out.write("Sollunga bro");
            out.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
