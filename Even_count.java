import java.util.*;
public class Even_count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            int digit = n%10;
            if(digit%2==0){
                count++;
            }
            n/=10;
        }
        if(count>3){
            System.out.println(count);
        } else {
            System.out.println("IT IS NOT A VALID NUMBER");
        }
        sc.close();
    }
}
