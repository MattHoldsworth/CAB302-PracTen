/**
 * 
 */
package week10;

/**
 * @author hogan
 *
 */
public class RunThreeThreads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread one = new MsgThread("One");
		one.setPriority(Thread.MIN_PRIORITY);
	    Thread two = new MsgThread("Two");
	    two.setPriority(Thread.MAX_PRIORITY);
	    Thread three = new MsgThread("Three");
	    three.setPriority(Thread.MIN_PRIORITY);
	    one.start();
	    two.start(); 
	    three.start(); 
	}

}
