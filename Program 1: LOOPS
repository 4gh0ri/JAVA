// JAVA LAB PROGRAM 1: Looping Statements
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException 
    {
        int s, a, b, option;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        do {
            System.out.println("\n---------MENU---------");
            System.out.println("1.Sum of digits \n2.Prime number between a and b \n3.Palindrome numbers \n4.EXIT \nChoose your option:");
            option = Integer.parseInt(bf.readLine());
            switch (option) {
                case 1:                                          //Sum of digits
                    System.out.println("Enter the number:");
                    s = Integer.parseInt(bf.readLine());
                    System.out.println("Sum of digits is:" + sum(s));
                    break;
                case 2:                                          //Prime number between a and b
                    System.out.println("Enter number to start range");
                    a = Integer.parseInt(bf.readLine());
                    System.out.println("Enter number to end range");
                    b = Integer.parseInt(bf.readLine());
                    System.out.print("Prime numbers are:");
                    prime(a, b);
                    break;
                case 3:                                        //Palindrome numbers
                    palindrome_numbers();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Humans are really dumb!");
                    break;
            }
        }while(option != 4);
    }
//Functions
    public static int sum(int no) 
    {
        int digit;
        int sum = 0;
        while (no > 0 )
        {
            digit = no%10;
            sum = sum + digit;
            no=no/10;
        }
        return sum;
    }

    public static int prime(int x, int y) 
    {
        for (int i = x; i <= y; i++)
        {
          if(isPrime(i))
            {
             System.out.print(i+" ");
            }
         }
         return x;
    }
    
  public static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        else if (n == 2)
            return true;
        else if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void palindrome_numbers() 
    {
        for (int i = 10000; i <= 11000; i++) 
        {
         int num = i, reverse = 0, r;
         int originalNum = num;
         while (num != 0) 
         {
           r = num % 10;
           reverse = reverse * 10 + r;
           num /= 10;
         } 
         if (originalNum == reverse) 
         {
         System.out.println("Palindrome no is:" + originalNum);
         }
        }
    }
}
