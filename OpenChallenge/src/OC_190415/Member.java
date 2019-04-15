package OC_190415;

import java.util.Objects;

public class Member implements Comparable<Member> {
	private String name;
	private String mail;
	private String tel;
	
	public String getName() { return name; }
	public String getMail() { return mail; }
	public String getTel() { return tel; }
	public void setName(String name) { this.name = name; }
	public void setMail(String mail) {
		String mailRegExp = "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$";
		if (mail.matches(mailRegExp))
			this.mail = mail;
		else
			this.mail = "";
	}
	public void setTel(String tel) {
		String telRegExp = "^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$";
		if (tel.matches(telRegExp))
			this.tel = tel;
		else
			this.tel = "";
	}
	
	@Override
	public int compareTo(Member m) {
		if (name.compareTo(m.getName()) > 0) return 1;
		if (name.compareTo(m.getName()) < 0) return -1;
		return tel.compareTo(m.getTel());
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", mail=" + mail + ", tel=" + tel + "]";
	}
}