import java.util.Scanner;

public class WebsiteType {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Website URL : ");
        String website = scan.nextLine();
        if (website.contains(".com")){
            System.out.println("The given URL is of a commercial website.");
        }
        else if (website.contains(".org")){
            System.out.println("The given URL is of an organization website.");
        }
        else if (website.contains(".edu")){
            System.out.println("The given URL is of an educational institution's website.");
        }
        else if (website.contains(".in")){
            System.out.println("The given URL belongs to India.");
        }
        else {
            System.out.println("Invalid URL");
        }
    }
    
}
