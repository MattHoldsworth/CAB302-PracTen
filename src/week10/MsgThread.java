package week10;

public class MsgThread extends Thread {
	static final int MAX=20; 

	public MsgThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i=0; i<=MAX-1; i++) {
			System.out.println(this.getName());
		}
	}
	
}
