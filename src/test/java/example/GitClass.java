package example;
import java.util.Scanner;
public class GitClass {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int a;
    int b;
    int v;
    int c;

    int d;
    int e;
    System.out.printf("Enter the first integer number: ");
    a = input.nextInt();

    System.out.print("Enter the second integer number: ");
    b = input.nextInt();
    System.out.printf("Enter the third integer number: ");
    c = input.nextInt();
    System.out.printf("Enter fourth integer number: ");
    d = input.nextInt();
    System.out.print("Enter the fifth integer number: ");
    e = input.nextInt();
    if (a > b && a > c && a > d && a > e)
      System.out.println("The largest number is " + a);
    if (b > a && b > c && b > d && b > e)
      System.out.println("The largest number is " + b);
    if (c > a && c > b && c > d && c > e)
      System.out.println("The largest number is " + c);
    if (d > a && d > b && d > c && d > e)
      System.out.println("The largest number is " + d);
    if (e > a && e > b && e > c && e > d)
      System.out.println("The largest number is" + e);
    if (a < b && a < c && a < d && a < e)
      System.out.println("The largest number is " + a);
    if (b < a && b < c && b < d && b < e)
      System.out.println("The largest number is" + b);
    if (c < a && c < b && c < d && c < e)
      System.out.println("The largest number is" + c);
    if (d < a && d < b && d < c && d < e)
      System.out.println("The largest number is " + d);
    if (e < a && e < b && e < c && e < d)
      System.out.println("The largest number is " + e);
  }
}
