package nitin;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        String Filename = "java.txt";

        try(FileWriter file = new FileWriter(Filename)){
            file.write("this is a java file");
            System.out.println("written in file is Succeded");
        }catch(IOException e){
            System.out.println("Exception is occured");
        }
    }
}
