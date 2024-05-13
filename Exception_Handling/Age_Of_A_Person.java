package Exception_Handling;

import java.util.Scanner;

class MyAgeException extends Exception{
    public void MaxAge(){
        System.out.println("Age can not be greater than 130");
    }
    public void minAge(){
        System.out.println("Age cannot be negative.....");
    }
}
public class Age_Of_A_Person {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Age : ");    
        int age = sc.nextInt();
        if(age < 0){
            try{
                throw new MyAgeException();
            }
            catch(MyAgeException e){
                e.minAge();
            }
        } 
        else if(age > 130){
            try{
                throw new MyAgeException();
            }
            catch(MyAgeException e){
                e.MaxAge();
            }
        }
        else{
            System.out.println("Age of the Person is " + age);
        }
        
    }
}
