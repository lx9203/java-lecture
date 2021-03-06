package basic04_member;

public class MemberDTO {
	private int id;
	private String password;
	private String name;
	private String Birthday;
	private String address;

	public MemberDTO(String password, String name, String birthday, String address) {
		this.password = password;
		this.name = name;
		this.Birthday = birthday;
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
		return Birthday;
	}

	public void setBirthday(String birthday) {
		Birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", password=" + password + ", name=" + name + ", Birthday=" + Birthday
				+ ", address=" + address + "]";
	}

}
