package Ch10ClassBasic;

import java.util.Scanner;

public class C05Prac {

	public static void main(String[] args) {
		
		//String 클래스로 문자열 입력받기
		Scanner sc=new Scanner(System.in);
		
		System.out.print("문자열 입력 >> ");
		String a = sc.next();
		String b = new String(a);
		
		//1 입력받은 문자열의 길이 출력
		System.out.println("길이 : "+b.length());
		
		//2 문자열의 idx 중에 2,3,4만 출력
		System.out.println("IDX 2,3,4 : "+b.substring(2,5));
		
		//3 다른 문자열을 하나 더 받아서 이전에 저장된 문자열에 해당 문자열이 포함되어 있는지 여부 확인
		System.out.print("추가 문자열 >> ");
		String c = sc.nextLine();
		System.out.println("포함 여부 : "+b.contains(c));
		
		//4 다른 문자열을 하나 더 받아서 이전에 저장된 문자열에 해당 문자열이 일치하는지 여부
		System.out.print("추가 문자열 >> ");
		String d = sc.next();
		System.out.println("일치 여부 : "+b.equals(d));
		
		//5 저장된 문자열의 길이를 확인해서 특정문자열 위치 idx 확인후 확인된 idx 위치에서 마지막 idx까지 잘라내기
		System.out.println("길이 : "+b.length());
		int e = b.length();
		System.out.print("특정 문자열 입력 >> ");
		String f = sc.next();
		int g = b.indexOf(f);
		System.out.println("특정 문자~마지막 문자 : "+b.substring(g,e));
		
		
		
		
		
		
		
	}

}
