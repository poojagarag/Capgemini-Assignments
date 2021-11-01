package amstrongNumber;

public class AmstrongNumber1 {

    public static void main(String[] args) {

        //Program to find armstrong number from 100 to 999
        //153, 370, 371, 407

        for (int i = 100 ; i <= 1000 ; i++)
        {
            int n = i;
            int r = 0;
            int sum = 0;

            while (n > 0)
            {
                r = n % 10;
                n = n / 10;
                sum = sum + (r * r * r);

            }
            if (i == sum)
            {
                System.out.println ("It is Amstrong Number"+i);
            }
        }
    } // main method
} // Armstrong class


