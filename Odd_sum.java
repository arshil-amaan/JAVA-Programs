import java.util.*;

public class Odd_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int odd_sum = 0;
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt(); sc.nextLine();
            if(num%2!=0){
                odd_sum += num;
            }
        }
        if(odd_sum>8){
            System.out.println(odd_sum);
        } else {
            System.out.println("NA");
        }
        sc.close();
    }
}
