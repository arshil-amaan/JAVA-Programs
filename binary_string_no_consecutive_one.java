public class binary_string_no_consecutive_one {
	static void binStrs(int n,int lastPlace, String str) {
		if(n==0) {
			System.out.println(str);
			return;
		}
		binStrs(n-1, 0, str+"0");
		if(lastPlace==0) {
			binStrs(n-1, 1, str+"1");
		}
	}
  public static void main(String[] args) {
    int n = 3;
    binStrs(n,0,"");
  }
}
