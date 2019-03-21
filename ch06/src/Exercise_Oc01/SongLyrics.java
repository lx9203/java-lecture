package Exercise_Oc01;

public class SongLyrics extends Song {
	private String Lyrics;
	
	public SongLyrics(String title, String album, String composer, int year, int track, String Lyrics) {
		super(title, album, composer, year, track);
		this.Lyrics = Lyrics;
	}

	@Override
	public void show() {
		super.show();
		System.out.println(Lyrics);
	}
	
	
	
}
