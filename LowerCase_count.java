import java.util.*;

public class LowerCase_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            // Alternative Approach
            // if(Character.isLowerCase(str.charAt(i))) {
            if(str.charAt(i)<= 'z' && str.charAt(i)>='a') {
                count++;
            }
        }
        if(count == 0) System.out.println("No lower case characters present");
        else System.out.println(count);
        sc.close();
    }    
}
