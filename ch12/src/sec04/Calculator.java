package sec04;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory (int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
	
//	public void setMemory(int memory) {		//	synchronized로 묶음
//		System.out.println(Thread.currentThread().getName());
//		synchronized (this) {
//			this.memory = memory;
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//			}
//			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
//		}
//	}
}
