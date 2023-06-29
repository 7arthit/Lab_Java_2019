public class Thread2 implements Runnable {
	private String tn;
	Thread2(String name){
		tn = name;
	}
	public void run() {
		int count = 0;
		while( count <= 10) {
			System.out.println("This is in a thread "+ tn +" : "+ (count++));
			try {
				Thread.sleep(100);
			}
			catch (InterruptedException e){}
		}
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(new Thread2("A"));
		Thread t2 = new Thread(new Thread2("B"));
		t1.start();
		t2.start(); 
	}
}
