package trycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GeneratingIOException {

    public static void main(String[] args) throws IOException {
        try {
            FileInputStream fileInputStream = openRandomFile("C:\\Users\\Ankita\\Google Drive (hydbd.CS)\\Java Programs\\new project\\src\\trycatch\\GeneratingIOException.java");
            System.out.println(new String(fileInputStream.readAllBytes())); // ---> throws IOException

            openRandomFile("randomFile");
        } catch (FileNotFoundException e) {
            System.out.println("Error Message : " + e);
            e.printStackTrace();
        }
    }

    private static FileInputStream openRandomFile(String fileName) throws FileNotFoundException {
        return new FileInputStream(fileName);
    }
}
