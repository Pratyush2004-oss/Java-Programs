package File_Handling;

import java.io.*;
import java.util.Scanner;

public class Copying_content_File {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the File whose content is to be copied : ");
            String filename1 = sc.nextLine();
            FileInputStream readfile = new FileInputStream("File_Handling//" + filename1);
            System.out.print("Enter the File where to copy : ");
            String filename2 = sc.nextLine();
            FileOutputStream writefile = new FileOutputStream("File_Handling//" + filename2);

            int ch;
            while ((ch = readfile.read()) != -1) {
                writefile.write((char) ch);
            }
            readfile.close();
            writefile.close();
            System.out.println("\nContent of file " + filename1 + " has been successfully copied into " + filename2);
        } catch (IOException i) {
            System.out.println("Error in opening the file" + i);
        }
    }

}