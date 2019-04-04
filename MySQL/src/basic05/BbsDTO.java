package basic05;

public class BbsDTO {
	private int id;
	private int memberid;
	private String title;
	private String date;
	private String content;

	public BbsDTO(int id, int memberid, String title, String date, String content) {
		this.id = id;
		this.memberid = memberid;
		this.title = title;
		this.date = date;
		this.content = content;
	}
	
	public BbsDTO(int memberid, String title, String date, String content) {
		this.memberid = memberid;
		this.title = title;
		this.date = date;
		this.content = content;
	}

	public BbsDTO(String title, String date, String content) {
		this.title = title;
		this.date = date;
		this.content = content;
	}

	public BbsDTO() {
	}

	public BbsDTO(int id, int memberid) {
		this.id = id;
		this.memberid = memberid;
	}

	public BbsDTO(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "BbsDTO [id=" + id + ", memberid=" + memberid + ", title=" + title + ", date=" + date + ", content="
				+ content + "]";
	}

}
