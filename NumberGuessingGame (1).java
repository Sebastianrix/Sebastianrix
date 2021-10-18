import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;


class NumberGuessingGame {
    public static void main(String[] args) {




         System.out.println("Guess the secret number between 1-99"); 

//Here we generate the secret number the player has to guess

        int min = 1;
        int max =  99;


        int Secret = (int)Math.floor(Math.random()*(max-min+1)+min);


//We make Gameover and assign it to zero because we make a conditional statement later in our While-loop. This way we can make the game running in loop, as slong as 
//we don't change the gameover value. We of course change the gameover value once the game finishes, by the player winning
        int GameOver = 0;



        Scanner scan = new Scanner(System.in);

//We use a while loop, so we can can keep getting inputs while the game is running. The game will not end, before the int value "GameOver" equals 1.
//With this approach, we can keep getting input from the user, until the player finally guesses the correct number, 
//which will correspond in "GameOver" being assighned the value 1, and thereby ending the game


        while (GameOver==0){
            String userInput = scan.nextLine();
// Here we convert our input, which is a string, into an int. Because it's an int we can easily make conditional statements based on whether it is lower, higher or the same number as the secret one 

            int intInput = Integer.parseInt(userInput);

// Check if our input is too high

            if(intInput>Secret){
                System.out.println("Your number is too high");
            }

// Check if our input is too low

            if(intInput<Secret){
                System.out.println("Your number is too low");
            }          

// Finally, if the input equals the secret number, and thereby ending the game

             if (intInput==Secret){
                System.out.println("You won by guessing the right number!");
                 GameOver = 1;}

        }
    }
}