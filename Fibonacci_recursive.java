import java.util.Scanner;
public class Fibonacci_recursive {
    public static int Fibonacci(int number)
     {
        if (number==1||number==0) 
        {
            return 0;
        }
        if(number==2) 
        {
            return 1;
        }
        return Fibonacci(number-1)+Fibonacci(number-2);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println(Fibonacci(number));
    }
}