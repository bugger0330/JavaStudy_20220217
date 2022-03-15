package a18_컬렉션;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		ArrayList<String> strList = new ArrayList<String>();
		
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		
		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		strList.add("e");
		strList.add("f");
		
		System.out.println(intList.size());//인덱스 갯수
		System.out.println(strList.size());
		System.out.println("==========================");
		
		for(int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
		System.out.println("==========================");
		for(int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		
		System.out.println("==========================");
		for(int num : intList) { //제일 처음부터 끝까지 반복하는데, 첫번쨰 값을 num에 넣고 ..... 반복
			System.out.println(num); //폴이치
		}
		
		System.out.println("==========================");
		for(String ss : strList) {
			System.out.println(ss);
		}
		System.out.println("=============값 수정=============");
		strList.set(2, "q");
		strList.set(3, "q");
		strList.set(4, "q");
		for(String ss : strList) {
			System.out.println(ss);
		}
		
		System.out.println("============뒤에서부터 값 삭제==============");
//		strList.remove(strList.size()-1);
//		System.out.println();
//		System.out.println(strList);
//		
//		strList.remove(strList.size()-1);
//		System.out.println();
//		System.out.println(strList);
//		
//		strList.remove(strList.size()-1);
//		System.out.println();
//		System.out.println(strList);
		
		//리스트가 비어있지 않으면 계속 반복하여 가장 뒤에 있는 값을 삭제
		while(!strList.isEmpty()) { //안 비워져 있을때 반복
			strList.remove(strList.size()-1);
			System.out.println();
			System.out.println(strList);
		}
		
		strList.add("a");
		strList.add("b");
		strList.add("q");
		strList.add("q");
		strList.add("q");
		strList.add("f");
		
		
		//리스트에 q가 존재하면 해당 위치의 값을 삭제
		System.out.println("==========================");
		while(strList.contains("q")) {
			System.out.println(strList.remove("q"));
		}
		System.out.println(strList);
		
		if(!strList.isEmpty()) {
			strList.clear();
		}
		System.out.println(strList);
		
//		
//		for(int i = 0; i < strList.size(); i++) {
//				if(!strList.contains("q")) {
//					break;
//				}
//				
//				
//				if(strList.get(i).equals("q")) {
//					System.out.println(strList.remove(i));
//				}
//				
//			}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
