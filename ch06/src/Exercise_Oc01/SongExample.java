package Exercise_Oc01;

public class SongExample {

	public static void main(String[] args) {
		String title = "Love of My Life";
		String album = "A Night at the Opera";
		String composer = "Freddie Mercury";
		int year = 1975;
		int track = 9;

		Song s1 = new Song(title, album, composer, year, track);
		s1.show();

	}

}
