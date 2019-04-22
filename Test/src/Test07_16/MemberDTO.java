package Test07_16;

public class MemberDTO {
	private int id;
	private String password;
	private String name;
	private String birthday;
	private String address;

	public MemberDTO(int id, String password, String name, String birthday, String address) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.birthday = birthday;
		this.address = address;
	}

	public MemberDTO(String password, String name, String birthday, String address) {
		this.password = password;
		this.name = name;
		this.birthday = birthday;
		this.address = address;
	}

	public MemberDTO() {
	}

	public MemberDTO(int id) {
		this.id = id;
	}

	public MemberDTO(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public MemberDTO(int id, String password) {
		this.id = id;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", password=" + password + ", name=" + name + ", birthday=" + birthday
				+ ", address=" + address + "]";
	}

}
