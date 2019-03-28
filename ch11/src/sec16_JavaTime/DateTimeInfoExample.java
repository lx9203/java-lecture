package sec16_JavaTime;

import java.time.*;

public class DateTimeInfoExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		String strDateTime = now.getYear() + "년 ";
		System.out.println(strDateTime);
		strDateTime = now.getMonthValue() + "월 ";
		System.out.println(strDateTime);
		strDateTime = now.getDayOfMonth() + "일 ";
		System.out.println(strDateTime);
		strDateTime = now.getDayOfWeek() + " ";
		System.out.println(strDateTime);
		strDateTime = now.getHour() + "시 ";
		System.out.println(strDateTime);
		strDateTime = now.getMinute() + "분 ";
		System.out.println(strDateTime);
		strDateTime = now.getSecond() + "초 ";
		System.out.println(strDateTime);
		strDateTime = now.getNano() + "나노초 ";
		System.out.println(strDateTime);
		System.out.println(strDateTime + "\n");
		System.out.println(strDateTime);
		LocalDate nowDate = now.toLocalDate();
		if (nowDate.isLeapYear()) {
			System.out.println("올해는 윤년 : 2월은 29일까지 있습니다.");
		} else {
			System.out.println("올해는 평년 : 2월은 28일까지 있습니다.");
		}
		
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협전 세계시 : " + utcDateTime);
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("협전 세계시 : " + seoulDateTime);
		ZoneId seoulZoneId = seoulDateTime.getZone();
		System.out.println("서울 존아이디 : " + seoulZoneId);
		ZoneOffset seoulZoneOffset = seoulDateTime.getOffset();
		System.out.println("서울 존오프셋 : " + seoulZoneOffset + "\n");
	}
}
