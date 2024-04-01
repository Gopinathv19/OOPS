package IO;
import java.io.*;
public class Fileoutputstream{
public static void main(String[] args) {
    try{
        FileOutputStream fo=new FileOutputStream("C:\\Users\\gopin\\OneDrive\\Desktop\\Desktop 2\\OOPS\\IO\\hello.txt");
        String gopi="Hello gopinath";
        byte[] b=gopi.getBytes();
        fo.write(b);
        fo.close();

    }
    catch(Exception e){
        System.out.println(e);
    }
}
}

