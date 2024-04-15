//Importing Scanner
import java.util.Scanner;

public class blackjack {
    public static void main(String[] args){  
        //Initialize scanner
        Scanner userInput = new Scanner(System.in);
        //Initializing variables
        int num1 = (int)(10*Math.random() +1);
        int num2 = (int)(10*Math.random() +1);
        int num3 = (int)(10*Math.random() +1);
        int sum = num1 + num2;
        //Printing cards + sum
        System.out.println("You have a " + num1 + " and a " + num2 + " for a total of " + sum);
        System.out.print("Enter a 1 if you want another card or any other number, if not enter any other number: ");
        int input = userInput.nextInt();
        //Closing scanner to avoid wasteage of resources
        userInput.close();
        if (input ==1)
        {
            sum = num1 + num2 + num3;
            System.out.print("You got a " + num3 + " for a total of " + sum);
        }
        else
        {
            int dealer1 = (int)(10*Math.random() +1);
            int dealer2 = (int)(10*Math.random() +1);
            int dealer3 = (int)(10*Math.random() +1);  
            int dealerSum = dealer1 + dealer2 + dealer3;
            System.out.println("The dealer has a " + dealer1 + ", " + dealer2 + " and " + dealer3 + " for a total of " + dealerSum +".");
            if (dealerSum > 21) 
            {
                System.out.println("You Win! Dealer got over 21");
            }
            else if (sum > 21)
            {
                System.out.println("You lose :( You Got over 21");

            }
            else if (dealerSum == sum)
            {
                System.out.println("Tie. You and the dealer got the same amount");

            }
            else if (dealerSum > sum) 
            {
                System.out.println("You lose :( Dealer got higher than you");

            }
            else 
            {
                System.out.println("You win! You got higher than the dealer");
            }
        }
        


    }
}

