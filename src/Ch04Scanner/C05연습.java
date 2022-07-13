package Ch04Scanner;

import java.util.Scanner;

public class C05연습 {

	public static void main(String[] args) {

//		이름을 입력하세요 : 홍길동
//		홍길동 님의 나이를 입력하세요 : 34
//		홍길동 님의 주소를 입력하세요 : 대구광역시 달서구 ~~0동
//		[PROFILE]
//		이름 : 홍길동
//		나이 : 34세
//		주소 : 대구광역시 달서구 ~~0동
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름을 입력하세요 : ");
//		String name = sc.next();
//		System.out.print("나이를 입력하세요 : ");
//		int age = sc.nextInt();
//		System.out.print("주소를 입력하세요 : ");
//		sc.nextLine();
//		String addr = sc.nextLine();
//		
//		System.out.println();
//		System.out.println("[PROFILE]");
//		System.out.printf("이름 : %s\n나이 : %d\n주소 : %s", name, age, addr);
//		
		
//		문제1
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("첫번째 수 : ");
//		int num1 = sc.nextInt();
//		System.out.print("두번째 수 : ");
//		int num2 = sc.nextInt();
//		
//		int result = num1 + num2;
//		System.out.println("덧셈 결과 : " + result);
		
//		문제2
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("주민번호 6자리 : ");
		int idnum = sc.nextInt();
		System.out.print("전화번호 : ");
		String phone = sc.next();
		
		System.out.println();
		System.out.println("[입력한 내용]");
		System.out.printf("이름 : %s\n주민번호 6자리 : %d\n전화번호 : %s", name, idnum, phone);
		
		
		
	}

}
