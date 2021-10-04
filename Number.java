package domain;



import java.util.Scanner;


public class Number{

    public static void main(String[] args) {
        System.out.println("Put in number");
        Scanner newScan = new Scanner (System.in);
        int number = newScan.nextInt(); 
        if (number % 2 == 0) {   
            System.out.println("Entered Number is Even");
        }
        else {
            System.out.println("Entered Number is Odd");
        }
         if (number > 0) {
  System.out.println("Your number is possitive"); 

   }else if(number < 0) {
  System.out.println("Your number is negative");

   }else if (number ==0){System.out.println("Your number is zero");}
        }
        
    }

