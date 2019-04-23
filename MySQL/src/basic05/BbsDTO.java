package basic05;

public class BbsDTO {
	private int id;
	private int memberId;
	private String title;
	private String name;
	private String date;
	private String content;
	
	public BbsDTO() { }
	public BbsDTO(int memberId, String title, String content) {
		this.memberId = memberId;
		this.title = title;
		this.content = content;
	}
	public BbsDTO(int id, int memberId, String title, String date, String content) {
		this.id = id;
		this.memberId = memberId;
		this.title = title;
		this.date = date;
		this.content = content;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() { return id; }
	public int getMemberId() { return memberId; }
	public String getTitle() { return title; }
	public String getDate() { return date; }
	public String getContent() { return content; }
	public void setId(int id) { this.id = id; }
	public void setMemberId(int memberId) { this.memberId = memberId; }
	public void setTitle(String title) { this.title = title; }
	public void setDate(String date) { this.date = date; }
	public void setContent(String content) { this.content = content; }	
	@Override
	public String toString() {
		return "Bbs [id=" + id + ", memberId=" + memberId + ", title=" + title +
				", date=" + date.substring(0, 16) + ", content=" + content + "]";
	}
}