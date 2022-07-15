package Ch06Ifswitch;

import java.util.Scanner;

public class C01If {

	public static void main(String[] args) {

		//단순 IF
		//if(조건식)
		//{
		//	참인경우 실행되는 코드;
		//}
//		int age=7;
//		
//		if(age>=8)
//		{
//			System.out.println("취학 아동입니다");
//		}
//		System.out.println("첫번째 IF문 벗어남");
//		if(age<8) 
//		{
//			System.out.println("미취학 아동입니다");
//		}
//		System.out.println("두번째 IF문 벗어남");
//		System.out.println("프로그램 종료");
	
		//IF-ELSE문
//		if(조건식)
//		{
//			//참인경우 실행될 코드;
//		}
//		else
//		{
//			//거짓인 경우 실행될 코드
//		}
		
//		int age=7;
//		
//		if(age>=8)
//		{
//			System.out.println("취학 아동입니다");
//		}
//		else
//		{
//			System.out.println("미취학 아동입니다");
//		}
//		System.out.println("프로그램 종료");
		
		
		//문제1
		//정수 하나를 받아서 짝수면 짝수 홀수면 홀수 출력
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		String result = (a%2==0)?"짝수":"홀수;";
//		System.out.println(result);	
//		
		//문제2
		//정수 하나를 받아서 3의 배수면 "3의배수입니다"
		//4의 배수면 "4의 배수입니다" 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.printf("정수 입력 : ");
//		int a = sc.nextInt();
//		if(a%3==0)
//		{
//			System.out.println("3의 배수");
//		}
//		if(a%4==0)
//		{
//			System.out.println("4의 배수");
//		}

		//문제3
		//두 정수를 입력받아서 큰 수를 출력(if-else)
//		Scanner sc = new Scanner(System.in);
//		System.out.printf("첫번째 정수 입력 : ");
//		int a = sc.nextInt();
//		System.out.printf("두번째 정수 입력 : ");
//		int b = sc.nextInt();
//		
//		if(a>b)
//		{
//			System.out.println("더 큰 수 : " + a);
//		}
//		else
//		{
//			System.out.print("더 큰 수 : " + b);
//		}
		
		//문제4
		//세 정수를 입력받아서 큰 수를 출력(if)
		Scanner sc = new Scanner(System.in);
		System.out.printf("첫번째 정수 입력 : ");
		int a = sc.nextInt();
		System.out.printf("두번째 정수 입력 : ");
		int b = sc.nextInt();
		System.out.printf("세번째 정수 입력 : ");
		int c = sc.nextInt();
		
		if(a>=b && a>=c)
		{
				System.out.println("가장 큰 수 : " + a);
			}
		else if(b>=a && b>=c)	
		{
			System.out.println("가장 큰 수 : " + b);
		}
		else
		{
			System.out.println("가장 큰 수 : " + c);
		}

		sc.close();
		
		
		//문제5
		//3의 배수이면서 4의 배수라면 출력
		//3의 배수가 아니면서 5의 배수인 수 출력
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();
//		
//		if (num%3==0)
//		{
//			if(num%4==0)
//			{
//				System.out.println("3과 4의 공배수");
//			}
//		}
//		else
//		{
//			if(num%5==0)
//			{
//				System.out.print("3의 배수가 아닌 5의 배수");
//			}
//			else
//			{
//				System.out.println("걍 숫자");
//			}
//		}
		

		//국영수 점수 40이상 & 평균 60 이상이면 합격
//		Scanner sc = new Scanner(System.in);
//		System.out.print("국어 점수 : ");
//		int kor = sc.nextInt();
//		System.out.print("영어 점수 : ");
//		int eng = sc.nextInt();
//		System.out.print("수학 점수 : ");
//		int mat = sc.nextInt();
//		
//		double avg = (double)(kor+eng+mat)/3;
//		
//		if(kor>=40 & eng>=40 & mat>=40)
//		{
//			if(avg >= 60)
//			{
//				System.out.printf("평균 %f점-합격!", avg);
//			}
//			else
//			{
//				System.out.printf("평균 %f점-불합격!", avg);
//			}
//		}
//		else
//		{
//			System.out.println("점수과락-불합격");
//		}
		
		//평균 점수를 입력받아 90이상이면 A 80b 70c 60d 60미만 f 출력
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("국어 점수 : ");
//		int kor = sc.nextInt();
//		System.out.print("영어 점수 : ");
//		int eng = sc.nextInt();
//		System.out.print("수학 점수 : ");
//		int mat = sc.nextInt();
//		
//		double avg = (double)(kor+eng+mat)/3;
//		
//		if(avg>=90)
//		{
//			System.out.printf("평균점수 : %.1f 성적 : A", avg);
//		}
//		else if(avg>=80)
//		{
//			System.out.printf("평균점수 : %.1f 성적 : B", avg);
//		}
//		else if(avg>=70)
//		{
//			System.out.printf("평균점수 : %.1f 성적 : C", avg);
//		}
//		else if(avg>=60)
//		{
//			System.out.printf("평균점수 : %.1f 성적 : D", avg);
//		}
//		else 
//		{
//			System.out.printf("평균점수 : %.1f 성적 : F", avg);
//		}
//		
		
		
		
		
		
		
		
		
		
		
	}
}