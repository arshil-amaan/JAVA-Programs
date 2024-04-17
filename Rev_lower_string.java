import java.util.*;

public class Rev_lower_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        StringBuilder sb = new StringBuilder("");
        for (int i = str.length() - 1; i > -1; i--) {
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
        sc.close();
    }
}
