package sec05_2;

import java.util.function.*;

public class SupplierExample {
	public static void main(String[] args) {
		IntSupplier intSupplier = () -> {
			int num = (int) (Math.random() * 6) + 1;
			return num;
		};

		int num = intSupplier.getAsInt();
		System.out.println("눈의 수 : " + num);
	}
}
