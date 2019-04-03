package basic02;

import java.util.*;

public class SongTest {
	public static void main(String[] args) {
		SongDAO sDao = new SongDAO();

		// SongDTO sDto = sDao.selectOne(119);
		// System.out.println(sDto.toString() + "\n");
		// sDto.setTitle("넌 is 뭔들");
		// sDto.setLyrics("나 지금 너 땜에 혼란스러 제발 누가 나 좀 말려줘");
		// sDao.updateSong(sDto);
		// sDto = sDao.selectOne(119);
		// System.out.println(sDto.toString() + "\n");

		List<SongDTO> songList = sDao.selectAll();
		for (SongDTO song : songList) {
			System.out.println(song.toString());
		}

		sDao.close();
	}
}
