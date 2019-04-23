package basic05;

public class BbsMember {
	private int id;
	private String title;
	private String name;
	private String date;
	private String content;
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getName() {
		return name;
	}
	public String getDate() {
		return date;
	}
	public String getContent() {
		return content;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String fullString() {
		return "BbsFull [id=" + id + ", title=" + title + ", name=" + name + 
		", date=" + date.substring(0, 16) + "\n         content=" + content + "]";
	}
	@Override
	public String toString() {
		return "BbsMember [id=" + id + ", title=" + title + ", name=" + name + ", date=" + date.substring(0, 16) + "\n content=" + content + "]";
	}
	
	
}
