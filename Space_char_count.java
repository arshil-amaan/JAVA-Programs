import java.util.*;

public class Space_char_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int space_count = 0;
        int char_count = 0;
        char[] strArr = str.toCharArray();
        for(char ch : strArr){
            if(ch==' '){
                space_count++;
            } else {
                char_count++;
            }
        }
        System.out.println("Space count: " + space_count);
        System.out.println("Character count: " + char_count);
        sc.close();
    }
}
