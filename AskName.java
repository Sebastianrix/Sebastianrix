package domain;

/*Here we import the toolbox we need to for the scanner.
"util" means utility and scanner is one of multipule tools util provides*/

import java.util.Scanner;


public class AskName {

    public static void main(String[] args) {
        System.out.println("What is your name?");
        
        /*Here we declare a new scanner an object. In this case we choose to call it newScan
        the scanner works as an input */
        
        Scanner newScan = new Scanner (System.in);
        
        /*Here we make the scanner object "newScan" a string. 
        We choose to call the string "name", because it's gonna contain the input, 
        which in this programmed should be your name
        */
        String name = newScan.next();
        
        //Here we spit out the string, which is "name" and add abit of text
        System.out.println("Hey "+name+", I hope you're having one of those wonderful days");
    }

}