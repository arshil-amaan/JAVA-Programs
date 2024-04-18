import java.util.Scanner;

public class Perfect_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int divisor_sum = 0;
        for (int i = 1; i < num; i++) {
            if(num%i == 0) {
                divisor_sum += i;
            }
        }
        if(divisor_sum!=num) System.out.print("NOT ");
        System.out.println("PERFECT NUMBER");
        sc.close();
    }
}
