import java.util.*;

public class unique_chars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        HashSet<Character> set = new HashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            if(!set.contains(str.charAt(i))){
                set.add(str.charAt(i));
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();
        System.out.println(set.toString());
        sc.close();
    }
}
