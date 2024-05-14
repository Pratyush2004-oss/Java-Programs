package File_Handling;
import java.io.*;
import java.util.Scanner;

public class RenameFile {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the current file name with extension: ");
        String currFileName = scan.nextLine();
        File currFile = new File("File_Handling//" + currFileName);
        if (!currFile.exists()) {
            System.out.println("The file does not exist.");
        }
        else{
            System.out.println("Current file name is " + currFile.getName());
            System.out.print("Now enter the new file name with extension:");
            String newFileName = scan.nextLine();
            File newFile = new File("File_Handling//"+ newFileName);
            currFile.renameTo(newFile);
            System.out.println("File Succesfully Renamed");
        }
    }
}
