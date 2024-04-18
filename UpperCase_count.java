import java.util.*;

public class UpperCase_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int upperCase_count = 0;
        for(char ch : str.toCharArray()) {
            if(Character.isUpperCase(ch)){
                upperCase_count++;
            }
        }
        if(upperCase_count < 6) System.out.print("NOT A ");
        System.out.println("VALID STRING");
        sc.close();
    }
}
