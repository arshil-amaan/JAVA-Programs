import java.util.*;

public class Reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("num : "+num);
        int revNum = 0;
        
        while(num>0){
            int digit = num%10;
            revNum = revNum*10 + digit;
            num/=10;
        }
        // Alternative Approach
        // char[] digits = Integer.toString(num).toCharArray();
        // for (int i = digits.length-1; i > -1; i--) {
        //     revNum = (revNum*10) + Character.getNumericValue(digits[i]);
        // }
        System.out.println("revNum : "+revNum);
        sc.close();
    }
}