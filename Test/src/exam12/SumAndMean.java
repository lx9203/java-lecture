package exam12;

public class SumAndMean {

	public static void main(String[] args) {
		int[][] intArray = {
				{95, 86, 88},
				{88, 92, 96, 85},
				{78, 83, 93, 87, 88}
		};
		int sum = 0;
		int cnt = 0;
		double avg = 0.0;
		for ( int i = 0 ; i <intArray.length; i++){
			for (int j = 0; j < intArray[i].length; j++){
				sum += intArray[i][j];
				cnt++;
			}
		}
		avg = sum/cnt;
		System.out.println(avg);
	}
}
