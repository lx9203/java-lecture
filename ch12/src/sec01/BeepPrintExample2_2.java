package sec01;

import java.awt.*;

public class BeepPrintExample2_2 {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable(){		// 익명객체식
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try { Thread.sleep(500);} catch(Exception e) {}
				}
			}
		});
	}
}
