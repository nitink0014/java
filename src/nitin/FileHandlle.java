package nitin;
import javax.sound.midi.Soundbank;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class FileHandlle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the file name :");
        String FileName = input.next();

        try(FileReader reader = new FileReader(FileName)){
            int read;
            while((read = reader.read())!=-1) {
                System.out.print((char)read);
            }
            }catch(FileNotFoundException e){
            System.out.println("File Not Found");
            }
        catch(IOException e){
            System.out.printf("Exception is Ocurred : %s",e.getMessage());

        }
    }
}
