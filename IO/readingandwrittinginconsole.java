package IO;
import java.io.*;
public class readingandwrittinginconsole {
    public static void main(String[] args) throws IOException {
        InputStreamReader in =null;
        try{
            in=new InputStreamReader(System.in);
            System.out.println("Q ammaku illana na loop avaen:");
            char c ;
            do{
                c=(char)in.read();
                System.out.println(c);
            }while(c!='q');
        }
        finally{
            if(in!=null){
                in.close();
            }
        }
        
    }
}
