package sec04;

public class OverFlowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1000000;
		int y = 1000000;
		int z = x*y;
		System.out.println(z);
		
		long lx = 1000000L;
		long ly = 1000000L;
		long lz = lx + ly;
		System.out.println(lz );
	}

}
