import java.util.Scanner;

class a {
	int a = 4, b = 7;
}

class b extends a {
	int c = a * b;

	void bcla() {
		c = a * b;
	}
}

public class multi_lvl_inherit_def_val_change extends a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		b ob = new b();
		System.out.println("type a : ");
		ob.a = sc.nextInt();
		System.out.println("type b : ");
		ob.b = sc.nextInt();
		System.out.println("prod is (using default values): " + ob.c);
		ob.bcla();
		System.out.println("prod is (using fun (actually change)): " + ob.c);
		sc.close();
	}
}
