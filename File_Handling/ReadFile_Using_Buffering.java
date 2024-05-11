package File_Handling;

import java.io.*;

/**
 * ReadFile_Using_Buffering
 */
public class ReadFile_Using_Buffering {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("File_Handling//TextFile.txt"));
        String data = br.readLine();
        System.out.println(data);
    }
}