package Exercise;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x = 0; x < 11; x++) {
			for (int y = 0; y < 11; y++) {
				if(4*x + 5*y == 60) {
					System.out.println("("+ x + ", " + y + ")");
				}
			}
		}
	}
}
