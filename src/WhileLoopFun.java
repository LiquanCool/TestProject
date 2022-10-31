public class WhileLoopFun
{
    public WhileLoopFun() {}

    public double factorial(int number)
    {
        double d = number;
        int c = number - 1;
        while (c > 0)
        {
            d = d * c;
            c --;
        }
        return d;
    }

    public void printDigits(int number)
    {
        String s = String.valueOf(number);
        int c = s.length() - 1;
        while (c >= 0)
        {
            System.out.println(s.substring(c, c+1));
            c--;
        }
    }

    public int sumOfDigits(int number)
    {
        String s = String.valueOf(number);
        int c = 0;
        int sum = 0;
        while (c < s.length())
        {
            sum = sum + Integer.parseInt(s.substring(c, c+1));
            c ++;
        }
        return sum;
    }

    public boolean isPrime(int number)
    {
        int c = number - 1;
        int f = 2;
        if (number == 1)
        {
            return false;
        }
        while (c > 1)
        {
            if (number%c == 0)
            {
                f++;
            }
            c--;
        }
        if (f > 2)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public int maxDoubles(int number, int threshold)
    {
        int c = 0;
        if (number > threshold)
        {
            return c;
        }
        while (number <= threshold)
        {
            number *= 2;
            c++;
        }
        number /= 2;
        c--;
        return c;
    }
}
