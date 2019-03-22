package sec02;

public class RemoteControlExample3 {

	public static void main(String[] args) {
		
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}

}
