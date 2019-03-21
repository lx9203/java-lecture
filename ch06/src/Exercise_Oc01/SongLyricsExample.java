package Exercise_Oc01;

public class SongLyricsExample {
	public static void main(String[] args) {
		String title = "Love of My Life";
		String album = "A Night at the Opera";
		String composer = "Freddie Mercury";
		int year = 1975;
		int track = 9;
		String Lyrics = "가사";

		SongLyrics s1 = new SongLyrics(title, album, composer, year, track, Lyrics);
		s1.show();

	}

}
