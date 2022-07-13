package Ch05Operator;

import java.util.Scanner;

public class C01Basic {

	public static void main(String[] args) {

		//산술 연산자
//		int a = 10, b = 3, c;
//		System.out.println("a + b = " + (a+b));
//		System.out.println("a - b = " + (a-b));
//		System.out.println("a * b = " + (a*b));
//		System.out.println("a / b = " + (a/b));
//		System.out.println("a % b = " + (a%b)); //나머지 계산 % 연산자 중요
//												//1)짝홀수 2)배수 3)끝자리 4)수 범위 제한
//		System.out.println("-a = " + (-a));		//a=-a와 혼동 주의
//		
		//복합대입 연산자
		//+=, -=, *=, /=, %=
//		int a = 10;
//		a+=10;
//		System.out.println("a : " + a);
//		a-=5;
//		System.out.println("a : " + a);
//		a*=7;
//		System.out.println("a : " + a);
//		a/=7;
//		System.out.println("a : " + a);
//		
		//비교연산자
		// > >= < <= == !=
//		int a = 10, b = 20;
		//System.out.println("a == b ? " + (a=b)); 
//		System.out.println("a == b ? " + (a==b));
//		System.out.println("a >= b ? " + (a>=b));
//		System.out.println("a >  b ? " + (a>b));
//		System.out.println("a <= b ? " + (a<=b));
//		System.out.println("a <  b ? " + (a<b));
//		System.out.println("a != b ? " + (a!=b));
		
		
		//논리연산자
		//and 연산자(&&)-그리고 : 둘다 참이면 참(true) 반환
		//or 연산자(||) -또는  : 둘 중 하나라도 참(true)이면 참(true) 반환
		//! 부정연산자 : true인 경우 false 반환, false인 경우 true
		
//		System.out.println("true && true ? " + (true&&true));
//		System.out.println("false && true ? " + (false&&true));
//		System.out.println("true && false ? " + (true&&false));
//		System.out.println("false && false ? " + (false&&false));
		
//		int a = 10, b = 20, c = 15;
//		System.out.println("true && true ? " + (a>=b&&a>=c));
//		System.out.println("false && true ? " + (b>=c&&b>=a));
//		System.out.println("true && false ? " + (true&&false));
//		System.out.println("false && false ? " + (false&&false));
		
//		System.out.println("true || true ? " + (true||true));
//		System.out.println("false || true ? " + (false||true));
//		System.out.println("true || false ? " + (true||false));
//		System.out.println("false || false ? " + (false||false));
		
//		boolean flag = true;
//		System.out.println(!flag);
		
		//증감 연산자(++, --)
		//전치 연산자 : ++a, --a
		//후치 연산자 : a++, a--
		
//		int a=10,b=20,c,d;
//		c=--a + b--;
//		d=a-- + --b;
//		System.out.printf("%d %d %d %d\n",a,b,c,d);

		//삼항연산자 
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수입력 : ");
//		int score = sc.nextInt();
//		char grade = (score>90)? 'A':'B';
//		System.out.println("grade : " + grade);
//		
		//문제
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : ");
		int a = sc.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int b = sc.nextInt();
		
		int result = (a>b)? a:b;
		System.out.println("더 큰 수 : " + result);
		
	}

}
