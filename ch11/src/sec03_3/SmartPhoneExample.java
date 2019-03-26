package sec03_3;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		System.out.println(myPhone);
		System.out.println(myPhone.toString());
		System.out.println(strObj.toString());
	}

}
