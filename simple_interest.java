// code for simple interest (instance variable)
class simple_interest {
	// instance variables
	float si,p=250,r=15;
	int t=3;
	// main function
	public static void main(String[] args){
		//     driver class object
		simple_interest myobj = new simple_interest();
		myobj.si=((myobj.p*myobj.r*myobj.t)/100);
		System.out.println("Simple Interest is :\n"+myobj.si);
	}
}
