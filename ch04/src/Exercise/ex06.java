package Exercise;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
				if (i == j) break;
			}
			System.out.println("");
		}
	}

}
