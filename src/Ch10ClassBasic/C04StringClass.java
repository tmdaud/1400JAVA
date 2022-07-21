package Ch10ClassBasic;

import java.util.Scanner;

public class C04StringClass {

	public static void main(String[] args) {

		String str1=new String("JAVA IS");
		String str2=new String(" POWERFUL");
		String str3=str1+str2;
		
//		System.out.println(str3);
		
//		System.out.println("길이 : "+str1.length());
//		System.out.println("단일문자 찾기 : "+str1.charAt(1));
//		System.out.println("문자열 Idx 검색 : "+str1.indexOf("V"));
//		System.out.println("문자열 자르기 : "+str1.substring(1,4));
//		System.out.println("문자열 중 일부 찾기 : "+str1.contains("VA"));
//		System.out.println("문자열 교체하기 : "+str1.replace('A','a'));
		
		//단일 한 문자 받기 연습
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력 >> ");
		char tmp=sc.nextLine().charAt(1);
		
		System.out.println("단일문자 확인 : "+tmp);
		
	}

}
