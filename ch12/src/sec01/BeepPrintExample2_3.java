package sec01;

import java.awt.*;

public class BeepPrintExample2_3 {

	public static void main(String[] args) {
		Thread thread = new Thread(() -> {				// 람다식
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				toolkit.beep();
				try { Thread.sleep(500);} catch(Exception e) {}
			}
		});
	}
}
