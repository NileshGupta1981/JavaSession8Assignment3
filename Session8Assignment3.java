public class Session8Assignment3 extends Thread {
	
	public void run() {
		
		for (int i = 0 ; i < 5 ; i++){
		
			System.out.println ("Thread is running "+Thread.currentThread().getName());
		System.out.println ("Thread priortiy "+Thread.currentThread().getPriority());
		try{  
			System.out.println (Thread.currentThread().getName()+ " is going to sleep");
			Thread.sleep(10);  
			System.out.println (Thread.currentThread().getName()+ " is wake up");  
			}catch(InterruptedException e){  
			throw new RuntimeException("Thread interrupted..."+e);  
			} 
		}
		}
	public static void main (String args[]) {
		
		Session8Assignment3 sa = new Session8Assignment3();
		Session8Assignment3 sa1 = new Session8Assignment3();
		Session8Assignment3 sa2 = new Session8Assignment3();
		sa2.setName("Min");
		sa2.setPriority(Thread.MIN_PRIORITY);
	    sa2.start();
		sa.setName("Max");
		sa.setPriority(Thread.MAX_PRIORITY);
		sa.start();
		sa1.setName("Normal");
		sa1.setPriority(Thread.NORM_PRIORITY);
		sa1.start();
		

	}
	
	
}