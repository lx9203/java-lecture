package basic02;

public class SongDTO {
	private int id;
	private String title;
	private String lyrics;

	public SongDTO(int id, String title, String lyrics) {
		this.id = id;
		this.title = title;
		this.lyrics = lyrics;
	}

	public SongDTO() {

	}

	public SongDTO(String title, String lyrics) {
		this.title = title;
		this.lyrics = lyrics;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLyrics() {
		return lyrics;
	}

	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}

	@Override
	public String toString() {
		return "SongDTO [id=" + id + ", title=" + title + ", lyrics=" + lyrics + "]";
	}

}
