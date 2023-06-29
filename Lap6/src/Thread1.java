public class Thread1 extends Thread {
	private String tn;
	Thread1(String name){
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
		Thread1 t1 = new Thread1("A");
		Thread1 t2 = new Thread1("B");
		t1.start();
		t2.start();
	}
}
