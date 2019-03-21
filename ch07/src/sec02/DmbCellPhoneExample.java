package sec02;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);

		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("색상 : " + dmbCellPhone.color);

		System.out.println("채널 : " + dmbCellPhone.channel);

		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요? 집게리아죠?");
		dmbCellPhone.receiveVoice("아니요! 뚱인데여?");
		dmbCellPhone.sendVoice("집게리아 아니에요?");
		dmbCellPhone.receiveVoice("아니요! 뚱이라니깐요?");
		dmbCellPhone.hangUp();

		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
