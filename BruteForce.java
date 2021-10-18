package domain;

import java.util.Scanner;
import java.util.Arrays;

public class BruteForce {
    public static void main(String[] args) {
        System.out.println("Key Breaker Is Live" + "\n" + " " + "\n" + "The random 4 digit lock is");

        /*
         * We use this interger in the condition that runs/stops the loop we use later
         */

        int Stop = 0;

        /* The four digits of the lock array */

        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;

        /* The four digits of the key array */

        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;

        /* Counts how many tries it's taken to break the lock */

        int tries = 0;

        /*
         * Here we generate numbers between 0 til 9 for each of the four digits of the
         * key array
         */

        int min = 0;
        int max = 9;

        int Secret1 = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int Secret2 = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int Secret3 = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int Secret4 = (int) Math.floor(Math.random() * (max - min + 1) + min);

        /* We assign the new random generated nunmber into the key array */

        a1 = a1 + Secret1;
        a2 = a2 + Secret2;
        a3 = a3 + Secret3;
        a4 = a4 + Secret4;
        int[] arr2 = new int[] { a1, a2, a3, a4 };
        System.out.println(Arrays.toString(arr2));

        /*
         * We use a scanner to activate the loop. If the user input "0" the loop will
         * start
         */
        System.out.println("\n" + " " + "\n" + "Press 0 to start the brute force attack");
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        int intInput = Integer.parseInt(userInput);
        Stop = intInput;

        /*
         * This is the loop that changes the values of the key array. It counts up to 10
         * and puts a 1 value to the next digit
         *
         */

        while (Stop == 0) {

            tries = tries + 1;

            c4 = c4 + 1;
            if (c4 == 10) {
                c4 = 0;
                c3 = c3 + 1;
                if (c3 == 10) {
                    c3 = 0;
                    c2 = c2 + 1;
                    if (c2 == 10) {
                        c2 = 0;
                        c1 = c1 + 1;
                        if (c1 == 10) {
                            c1 = 0;
                        }
                    }
                }
            }

            // This is the key array and keep changing values as the loop runes
            int[] arr1 = new int[] { c1, c2, c3, c4 };

            System.out.println(Arrays.toString(arr1));

            // We compare the key and lock arrays. If the two arrays are euqal, we have
            // found the key and the programs ends

            if (Arrays.equals(arr1, arr2)) {
                Stop = 1;
                System.out.println("The lock was " + Arrays.toString(arr1) + " and it took " + tries
                        + " tries for the program to find the key");
            }
        }

    }
}
