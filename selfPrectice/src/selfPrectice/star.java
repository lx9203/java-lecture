package selfPrectice;

public class star {
	public static void main(String[] args) {
		int i = 0;
		int a = 0;
		int b = 10;
		for (i = 0; i < 10; i++) {
			for (int i2 = a; i2 < 2 * b; i2++) {
				System.out.print("☆");
			}
			for (int i3 = b - 1; i3 > i; i3--) {
				System.out.print("☆");
			}
			for (int i4 = a; i4 < i + 1; i4++) {
				System.out.print("★");
			}
			for (int i5 = a; i5 < i; i5++) {
				System.out.print("★");
			}
			for (int i6 = b - 1; i6 > i; i6--) {
				System.out.print("☆");
			}
			for (int i7 = a; i7 < 2 * b; i7++) {
				System.out.print("☆");
			}
			System.out.println();
		}
		for (int j = a; j < i; j++) {
			for (int j2 = a; j2 < j; j2++) {
				System.out.print("☆");
			}
			for (int j3 = b - 1; j3 > j; j3--) {
				System.out.print("★");
			}
			for (int j4 = a; j4 < 2 * b; j4++) {
				System.out.print("★");
			}
			for (int j5 = a; j5 < 2 * b; j5++) {
				System.out.print("★");
			}
			
			System.out.println();
		}

	}
}
