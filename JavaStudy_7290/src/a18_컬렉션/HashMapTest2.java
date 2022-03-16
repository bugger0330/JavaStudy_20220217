package a18_컬렉션;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest2 {
	
	public static void main(String[] args) {
		
		/*
		 * 한글을 쓰면 영어로 바뀌는것
		 * 텀블러 => tumbler
		 * 머그컵 => mugCup
		 * 아메리카노 => americano
		 * 책 => book
		 * 
		 */
		
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("텀블러", "tumbler");
		hashMap.put("머그컵", "mugCup");
		hashMap.put("아메리카노", "americano");
		hashMap.put("책", "book");// ==add
		
		
		String str = "텀블러";
		
		if(hashMap.containsKey(str)) {// 해당 키 값이 존재하면
			System.out.println(hashMap.get(str));
		}else {
			System.out.println("해당 단어는 번역할 수 없습니다");
		}
		
		System.out.println("============set 형태로 키값 가져오기===============");
		Set<String> set = hashMap.keySet();//해당 값을 set 자료형으로 변환시켜 준다
		Iterator<String> ir = set.iterator();//키 값만 set으로 바꿈
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		if(str.equals("머그컵")) {
//			System.out.println("mugCup");
//		}else if(str.equals(" 텀블러")) {
//			System.out.println("tumbler");
//		}else if(str.equals("아메리카노")) {
//			System.out.println("americano");
//		}else if(str.equals("책")) {
//			System.out.println("book");
//		}else {
//			System.out.println("해당 단어는 번역할 수 없습니다");
//		}
		
		
		
		
		
		
		
		
		
	}

}
