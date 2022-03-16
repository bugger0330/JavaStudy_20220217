package a18_컬렉션;

import java.util.HashMap;

public class HashMapTest {

	/*
	 * Map
	 * add 대신에 put
	 * set 대신에 replace
	 * 
	 */
	
	public static void main(String[] args) {
		
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("가", "강민"); // 키,값
		hashMap.put("나", "강민2");
		hashMap.put("다", "강민3");
		hashMap.put("라", "강민4");
		hashMap.put("마", "강민5");
		
		System.out.println(hashMap);//순서가 없음
		System.out.println();
		System.out.println(hashMap.get("다"));//"다" 가 가지고 있는 값을 출력
		System.out.println(hashMap.containsValue("강민2"));//"강민2"를 찾아라
		
		System.out.println(hashMap.remove("라"));//지움
		System.out.println(hashMap);
		
		System.out.println(hashMap.replace("마", "강민11"));// 해당 키값 수정
		System.out.println(hashMap);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
