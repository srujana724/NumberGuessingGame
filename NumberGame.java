import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int numGenerated = r.nextInt(100)+1;
        int numGuessed;
        int NumOfAttp = 0;

        System.out.println("Welcome to the Number Game!!");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("You have 10 guesses");

        do{
            System.out.println("Enter your guess: ");
            numGuessed = sc.nextInt();
            NumOfAttp++;
            System.out.println();

            if(numGuessed == numGenerated){
                System.out.println("You have guessed the correct number!!");
                System.out.println("it took u "+ NumOfAttp + " attempts");
            }
            else if( numGuessed < numGenerated){
                System.out.println("Your number was too low.");
                if(NumOfAttp == 10){
                    System.out.println("The number was "+ numGenerated);
                }
                System.out.println();
            }
            else{
                System.out.println("Your number was too high.");
                if(NumOfAttp == 10){
                    System.out.println("The number was "+ numGenerated);
                }
                System.out.println();
            }

            
        } while(numGuessed!=numGenerated && NumOfAttp<10);

        sc.close();
    }
    
}
