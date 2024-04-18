import java.util.Scanner;

public class Count_spaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        int space_count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                space_count++;
            }
        }
        if(space_count > 3) System.out.println(space_count);
        else System.out.println("NOT A VALID STRING");
        sc.close();
    }
}
