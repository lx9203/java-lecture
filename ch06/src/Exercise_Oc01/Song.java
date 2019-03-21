package Exercise_Oc01;

public class Song {
	private String title;
	private String album;
	private String composer;
	private int year;
	private int track;

	public Song(String title, String album, String composer, int year, int track) {
		this.title = title;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	public void show() {
		System.out.println(title);
		System.out.println(album);
		System.out.println(composer);
		System.out.println(year);
		System.out.println(track);
	}

}
