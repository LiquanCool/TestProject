import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number (or q to quit): ");
        String sentinel = s.nextLine();
        int num = 0;
        if (sentinel.equals("q"))
        {
            num = 0;
        }
        else
        {
            num = Integer.parseInt(sentinel);
        }
        int minimum = num;
        int min = num;
        int maximum = num;
        int count = 0;
        while (!(sentinel.equals("q")))
        {

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
            System.out.print("Enter a number (or q to quit): ");
            sentinel = s.nextLine();
            if (sentinel.equals("q"))
            {
                num = 0;
            }
            else
            {
                num = Integer.parseInt(sentinel);
            }
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
