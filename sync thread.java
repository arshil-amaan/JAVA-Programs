class MyThread extends Thread {

	String name;
    MyThread(String name) {
        this.name=name;
    }

    public void run() {
       // wish(name);
       synchronized(this){
		
        for(int i=0;i<3;i++)
			System.out.println(name);
	}
    }
    
    // synchronized void wish(String name) {
		
    //     for(int i=0;i<3;i++)
	// 		System.out.println(name);
	// }


}

class SyncThread{
	public static void main(String arg[])
	{
		
		MyThread t1=new MyThread("Hello");
		MyThread t2=new MyThread("World");
		t1.start();
		t2.start();
	}
}
