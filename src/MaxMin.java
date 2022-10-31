import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number (or -1 to quit): ");
        int num = s.nextInt();
        int minimum = num;
        int min = num;
        int maximum = num;
        int count = 0;
        while (num != -1)
        {
            System.out.print("Enter a number (or -1 to quit): ");
            num = s.nextInt();
            min = minimum;
            if (minimum > num)
            {
                minimum = num;
            }
            if (maximum < num)
            {
                maximum = num;
            }
            count += 1;
        }
        if (count == 0)
        {
            System.out.println("You didn't enter any numbers.");
        }
        else
        {
            System.out.println("Max is: " + maximum + "\n" + "Min is: " + min);
        }
    }
}
