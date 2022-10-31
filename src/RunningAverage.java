import java.util.Scanner;
public class RunningAverage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number (or -1 to quit): ");
        int num = s.nextInt();
        int sum = num;
        int total = num;
        int count = 0;
        int c = 0;
        double average = 0;
        while (num != -1)
        {
            System.out.print("Enter a number (or -1 to quit): ");
            num = s.nextInt();
            total = sum;
            sum += num;
            count += 1;
        }
        average = (double)total/count;
        if (count == 0)
        {
            System.out.println("You didn't enter any numbers.");
        }
        else
        {
            System.out.println("Sum is: " + total + "\n" + "Numbers added is: " + count + "\n" + "Average is: " + average);
        }
    }
}
