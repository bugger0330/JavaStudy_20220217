package a18_컬렉션;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> strSet = new HashSet<String>();
		strSet.add("강민");
		strSet.add("강민1");
		strSet.add("강민2");
		strSet.add("강민3");//set은 같은 값은 저장되지 않는다, 순서가 없다(주머니)
		
		System.out.println(strSet);//전체보기 가능
		
		strSet.remove("강민2"); //값 하나 지움
		
		System.out.println(strSet);
		System.out.println();
		
		
		//하나의 값을 가져오려면
		Iterator<String> ir = strSet.iterator();//Iterator는 통에서 순서대로 하나씩 꺼낸다
		while(ir.hasNext()) {//hasNext는 다음이 있니? true이면 반복
			String str = ir.next();//next 하면 꺼내는것, 다음칸으로 가는것
			if(str.equals("강민3")) { //원하는 값을 바로 출력
				System.out.println(str);
			}
		}
		
		
		
		
		
		
		
		
		
	}
}
