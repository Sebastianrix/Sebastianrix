            import java.security.spec.EncodedKeySpec;
            import java.util.concurrent.ThreadLocalRandom;
            import java.util.Scanner;
            import java.util.Arrays;


            class Hangman {
                public static void main(String[] args) {
                    int Stop = 0;

                    String okay = "!";

                 
                    String letter1 = "b";

                    String letter2 = "a";

                    String letter3 = "z";

                    String letter4 = "o";

                    String letter5 = "k";
               
                 
                    String letterdot1 = "*";
                    String letterdot2 = "*";
                    String letterdot3 = "*";
                    String letterdot4 = "*";
                    String letterdot5 = "*";
                    String letterdot6 = "*";
                    String letterdot7 = "*";
                  





                     Scanner scan = new Scanner(System.in);     
                    do{  

                    String userInput = scan.nextLine();


                   
                 
                  if (userInput.equals(letter1)){letterdot1 = userInput;}
                  if (userInput.equals(letter2)){letterdot7 = userInput;
                                                 letterdot2 = userInput;}
                  if (userInput.equals(letter3)){letterdot3 = userInput;}
                  if (userInput.equals(letter4)){letterdot4 = userInput;
                  letterdot5 = userInput;}
                  if (userInput.equals(letter5)){letterdot6 = userInput;}                               

                    String[] array1 = {letterdot1, letterdot2, letterdot3, letterdot4, letterdot5, letterdot6, letterdot7};
                    System.out.println(Arrays.toString(array1));
                   

                  if (userInput.equals(okay)){System.exit(0);}
                 

                         }while (Stop ==0);


                     }



                 }









        