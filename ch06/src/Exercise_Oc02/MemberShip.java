package Exercise_Oc02;

public class MemberShip extends Customer {
	private int cusnum;
	private int mile;

	public MemberShip(String name, String num, String add, int cusnum, int mile) {
		super(name, num, add);
		this.cusnum = cusnum;
		this.mile = mile;
	}

	@Override
	public void show() {
		super.show();
		System.out.println(cusnum);
		System.out.println(mile);
	}

}
