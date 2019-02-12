import java.util.Scanner;
public class ThirdQ {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = kb.nextInt();
        int b = kb.nextInt();
        int s = a + b;
        int p = a * b;
        int d = a - b;
        int q = a / b;
        System.out.println("sum of " + a + " and " + b + " is " + s);
        System.out.println("product of " + a + " and " + b + " is " + p);
        System.out.println("difference of " + a + " and " + b + " is " + d);
        System.out.println("quotient of " + a + " and " + b + " is " + q);

    }
}
