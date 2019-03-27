package Exercise09;

public class StringBuilderExample {
	public static void main(String[] args) {
		String str = "";
		for (int i = 0; i < 100; i++) {
			str += i;
		}
		System.out.println(str);

		System.out.println();

		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < 100; i++) {
			sb.append(i);
		}
		System.out.println(sb.toString());

	}
}
