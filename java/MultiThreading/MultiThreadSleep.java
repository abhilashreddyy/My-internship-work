class Threading1 extends Thread{
	public void run() {
		for(int i = 0; i < 5; i++) {
			try {Thread.sleep(1000);}
			catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
			
		}
	}
	
	public static void main(String[] args) {
		Threading1 t1 = new Threading1();
		Threading1 t2 = new Threading1();
		
		// if i call run it wont create a separate call stack it runs on main thread
		// but start method creates a separate call stack which helps the program too run paralelly
		t1.start();
		t2.start();
	}
}

