package OC02;

public class Clack {
	public static void main(String[] args) {

		int sec = 0;
		for (int hour = 0; hour < 24; hour++) {
			for (int min = 0; min < 60; min++) {
				// if (hour % 10 == 3 || min / 10 || min % 10 == 3) {
				// sec += 60;
				// }
				String time = hour + ":" + min;
				if (time.indexOf("3") >= 0)
					sec += 60;
			}
		}
		System.out.println(sec);
	}
}
