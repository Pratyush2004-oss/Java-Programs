package File_Handling;
import java.io.*;
import java.util.Scanner;
public class Writefile {
    public static void main(String[] args) {
        try{
            FileWriter f = new FileWriter("File_Handling//TextFile.txt");
            try{
                Scanner scan = new Scanner(System.in);
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
