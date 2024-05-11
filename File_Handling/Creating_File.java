package File_Handling;

import java.io.File;
import java.io.IOException;

public class Creating_File {
    public static void main(String[] args) {
        File f1 = new File("File_Handling//TextFile.txt");
        try{
            if(f1.exists()){
                System.out.println("The file already exists.");
            }
            else{
                //create a file if it doesn't exist, otherwise do nothing
                f1.createNewFile();
                System.out.println("File created: " + f1.getAbsolutePath());
            }
        }        
        catch(IOException i) {
            System.out.println("Error creating the file.");
        }
    }
    
}
