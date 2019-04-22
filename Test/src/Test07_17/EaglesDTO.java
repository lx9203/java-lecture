package Test07_17;

public class EaglesDTO {
	private int no;
	private String name;
	private String posit;
	private String hs;
	private String hand;
	private String nickname;
	private int backNo;
	private String birth;
	private int salary;

	public EaglesDTO(int no, String name, String posit, String hs, String hand, String nickname, int backNo, String birth,
			int salary) {
		this.no = no;
		this.name = name;
		this.posit = posit;
		this.hs = hs;
		this.hand = hand;
		this.nickname = nickname;
		this.backNo = backNo;
		this.birth = birth;
		this.salary = salary;
	}
	
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public EaglesDTO(int no) {
		super();
		this.no = no;
	}

	public EaglesDTO() {

	}

	public int getBackNo() {
		return backNo;
	}

	public void setBackNo(int backNo) {
		this.backNo = backNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosit() {
		return posit;
	}

	public void setPosit(String posit) {
		this.posit = posit;
	}

	public String getHs() {
		return hs;
	}

	public void setHs(String hs) {
		this.hs = hs;
	}

	public String getHand() {
		return hand;
	}

	public void setHand(String hand) {
		this.hand = hand;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EaglesDTO [no=" + no + ", name=" + name + ", posit=" + posit + ", hs=" + hs + ", hand=" + hand
				+ ", nickname=" + nickname + ", backNo=" + backNo + ", birth=" + birth + ", salary=" + salary + "]";
	}

}
