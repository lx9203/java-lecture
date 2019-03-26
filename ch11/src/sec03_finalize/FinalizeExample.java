package sec03_finalize;

public class FinalizeExample {

	public static void main(String[] args) {
		Counter counter = null;
		for (int i = 0; i < 51; i++) {
			counter = new Counter(i);

			counter = null;

			System.gc();
		}
	}

}
