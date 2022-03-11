package a15_lombok;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class IphoneTest {

	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		System.out.println("현재날짜 : " + now);
		LocalDateTime nowDateTime = LocalDateTime.now();
		System.out.println("현재시간 : " + nowDateTime);
		
		System.out.println("datetime 표현 형식 변환 : " 
					+ nowDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		
		System.out.println();
		
		Iphone iphone12Mini = new Iphone(12, "mini", "white", 128, LocalDate.parse("2020-01-01").getYear());
		Iphone iphone12Mini2 = new Iphone(12, "mini", "white", 128, LocalDate.parse("2020-01-01").getYear());
		
		Iphone iphone13Mini = new Iphone(13, "mini", "black", 256, LocalDate.parse("2020-01-01").getYear());
		Iphone iphone12Max = new Iphone(12, "max", "red", 512, LocalDate.parse("2020-01-01").getYear());
		Iphone iphone13Max = new Iphone(13, "max", "blue", 128, LocalDate.parse("2020-01-01").getYear());
		
		iphone13Mini.setColor("gray");
		
		System.out.println("두 아이폰 비교 : " + (iphone12Mini.equals(iphone12Mini2)));
		
		
		
		
		
		
		System.out.println(iphone12Mini);
		System.out.println(iphone12Max);
		System.out.println(iphone13Max);
		System.out.println(iphone13Mini);
		
		
		
		
		
		
	}
}
