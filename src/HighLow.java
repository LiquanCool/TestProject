import java.util.Scanner;
public class HighLow {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the maximum number: ");
        int max = s.nextInt();
        int number = (int)(Math.random()*max)+1;
        int count = 1;
        System.out.print("Guess what the number is: ");
        int guess = s.nextInt();
        while (guess != number)
        {
            count++;
            if (guess > number)
            {
                System.out.println("Too high!");
            }
            if (guess < number)
            {
                System.out.println("Too low!.");
            }
            System.out.print("Guess what the number is: ");
            guess = s.nextInt();
        }
        System.out.print("You got it!  The secret number was " + number + ". You guessed it after " + count + " guesses.");
    }
}
