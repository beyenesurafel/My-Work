import java.util.Scanner;

public class SecondQ {
    public static void main(String args[])
    {
        Scanner input = new Scanner (System.in);
        int b;
        int c;
        int a;

        System.out.print("Enter an Integer: ");
        b = input.nextInt();

        System.out.print("Enter an Integer: ");
        c = input.nextInt();

        a = b * c;

        System.out.printf( "Product of variables b and c (a)= %d\n ", a );

        /* This program performs a sample payroll calculation */
    }
}
