// code to swap two integers
import java.util.Scanner;
public class swap {
  // function to swap two integers using third variable
  static int swapin(int a, int b){
    // local variables
    int temp=a; a=b; b=temp;
    System.out.println("First num = "+a+", Second num = "+b+" (after function call)");
    return 0;
  }
  public static void main(String[] args){
    int num1,num2;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First Number");
    num1 = sc.nextInt();
    System.out.println("Enter Second Number");
    num2 = sc.nextInt();
    System.out.println("First num = "+num1+", Second num = "+num2+" (before function call)");
    swapin(num1,num2);
    sc.close();
  }
}
