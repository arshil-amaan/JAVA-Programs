class parent {
	int d = 10;
	int print() {
		System.out.print("using print : ");
		return d;
	}
	int desc_print_par() {
		System.out.print("data in parent is : ");
		return d;
	}
}

class child extends parent {
	int t = 20;
	int print() {
		System.out.print("using print : ");
		return t;
	}
  int desc_print(){
    System.out.print("data in child is : ");
    return t;
  }
}

public class parent_child_relation {
  public static void main(String[] args) {
    parent o = new parent();
    child b = new child();
    parent j = new child();

    System.out.println(o.d);
    // System.out.println(o.t);    // Parent cannot access child data members
    System.out.println(o.print());
    System.out.println(o.desc_print_par());
    // System.out.println(o.desc_print());   // Parent cannot access child member functions

    System.out.println("******************************");
    
    System.out.println(b.t);
    System.out.println(b.d);
    System.out.println(b.print());
    System.out.println(b.desc_print_par());
    System.out.println(b.desc_print());
    
    System.out.println("******************************");

    System.out.println(j.d);
    // System.out.println(j.t);    // Parent cannot access child data members
    System.out.println(j.print());
    System.out.println(j.desc_print_par());
    // System.out.println(j.desc_print());   // Parent cannot access child member functions
  }
}
