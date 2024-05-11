package File_Handling;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the file name: ");
            String filename = sc.nextLine();
            FileReader f1 = new FileReader("File_Handling//" + filename);
            try{
                int data;
                while((data=f1.read())!= -1){
                    System.out.print((char)data);
                }
            }
            finally{
                f1.close();
                System.out.println("\n \nFile Closed..");
            }
        }
        catch(IOException i){
            System.out.println("Error in opening the file : " +i);
        }
    }
}
