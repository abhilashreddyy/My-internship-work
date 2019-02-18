
public class RestartingThread extends Thread {
	public void run() {
		try {
			System.out.println("my thread is running");
		}
		catch(IllegalThreadStateException e){
			System.out.println(e);
		}
		finally {
			System.out.println("entered finally");
		}
		
		// I am unable to understand why the output is working this way
	}
	
	public static void main(String[] args) {
		RestartingThread t1 = new RestartingThread();
		t1.start();
		t1.start();
	}
}
