package trycatch;



import java.io.FileNotFoundException;
import java.io.IOException;

public class jump {

    public static void main(String[] args) {
        try {
            multiple();
        } catch ( IOException e) {
            e.printStackTrace();
        }
    }

    public static void multiple() throws IOException, FileNotFoundException{
        System.out.println("Inside multiple");
    }

}


