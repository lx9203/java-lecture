package Exercise_Oc01;

public class SongLyricsExample {
	public static void main(String[] args) {
		String title = "Love of My Life";
		String album = "A Night at the Opera";
		String composer = "Freddie Mercury";
		int year = 1975;
		int track = 9;
		String Lyrics = "Love of my life, you've hurt me\r\n" + 
				"You've broken my heart and now you leave me\r\n" + 
				"Love of my life, can't you see?\r\n" + 
				"Bring it back, bring it back\r\n" + 
				"Don't take it away from me, because you don't know\r\n" + 
				"What it means to me\r\n" + 
				"Love of my life, don't leave me\r\n" + 
				"You've stolen my love, you now desert me\r\n" + 
				"Love of my life, can't you see?\r\n" + 
				"Bring it back, bring it back (back)\r\n" + 
				"Don't take it away from me\r\n" + 
				"Because you don't know\r\n" + 
				"What it means to me\r\n" + 
				"Obrigado\r\n" + 
				"You will remember\r\n" + 
				"When this is blown over\r\n" + 
				"Everything's all by the way\r\n" + 
				"When I grow older\r\n" + 
				"I will be there at your side to remind you\r\n" + 
				"How I still love you (I still love you)\r\n" + 
				"I still love you\r\n" + 
				"Oh, hurry back, hurry back\r\n" + 
				"Don't take it away from me\r\n" + 
				"Because you don't know what it means to me\r\n" + 
				"Love of my life\r\n" + 
				"Love of my life\r\n" + 
				"Ooh, eh (alright)";

		SongLyrics s1 = new SongLyrics(title, album, composer, year, track, Lyrics);
		s1.show();

	}

}
