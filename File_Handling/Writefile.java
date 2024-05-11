package File_Handling;
import java.io.*;
import java.util.Scanner;
public class Writefile {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the name of file to write:");
            String filename = scan.nextLine();

            // Create a file object with specified name           
            FileWriter f = new FileWriter("File_Handling//" + filename);
            try{
                System.out.println("Enter the content to be written in file: ");
                String s = scan.nextLine();
                f.write(s);
            }
            finally{
                f.close();
            }
            System.out.println("Data written successfully in the file");
        }
        catch(IOException i){
            System.out.println("Error in opening the file." + i);
        }
        
    }
}
