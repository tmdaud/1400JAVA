package Ch07While;

import java.util.Scanner;

public class C07While {

	public static void main(String[] args) {

		//기본
		//1 탈출용 변수 지정
		//2 탈출용 조건식
		//3 조건식이 false가 되도록하는 연산식
		
//		int i = 1;		//탈출용 변수
//		while(i<=10)	//탈출용 조건식
//		{
//			System.out.println("Hello World!");
//			i++;	//조건식이 거짓이 되기 위한 연산식
//		}
		
		//02 1부터 10까지 합 구하기
		
//		int i=1;
//		int sum = 0;
//		while(i<=10)
//		{
//			
//			System.out.println("i = "+i);
//			sum += i;
//			i++;
//		}
//		System.out.println("i sum = " +sum);
		
		
		//문제
		//정수값 하나 입력받아 1부터 n까지의 합 
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 >>> ");
//		int n = sc.nextInt();
//		int i = 1;
//		int sum = 0;
//		
//		while(i<=n)
//		{
//			sum+=i;
//			i++;
//		}
//		System.out.printf("1부터 %d까지의 합 : %d", n, sum);
		
		//문제2
		//정수값 2개 입력받아 n-m 합 
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수1 입력 >>> ");
//		int n = sc.nextInt();
//		System.out.print("정수2 입력 >>> ");
//		int m = sc.nextInt();
//		
//		//swap
//		if(n>m)
//		{
//			int temp = 0;
//			temp = n;
//			n = m;
//			m = temp;
//		}
//		System.out.printf("값 변경 : n >> %d, m>> %d\n", n, m);
//				
//		int sum = 0; 
//		int i = n;
//		
//		while(i<=m)
//		{
//			sum += i;
//			i++;
//		}
//		System.out.printf("합 : "+ (sum));
		
		
		//2단 구구단
//		int dan = 2;
//		int i = 1;
//		
//		System.out.println("2단");
//		while(i<=9)
//		{
//			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
//			i++;
//		}
//		
		//2단 역순
//		int dan = 2;
//		int i = 9;
//		
//		System.out.println("2단 역순");
//		while(i>0)
//		{
//			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
//			i--;
//		}
		
		//n단 역순
//		Scanner sc = new Scanner(System.in);
//		System.out.print("단수 입력 >>> ");
//		int n = sc.nextInt();
//		
//		int dan = n;
//		int i = 9;
//		
//		System.out.printf("%3d단 역순\n", dan);
//		while(i>0)
//		{
//			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
//			i--;
//		}
		
		//문제
		//1부터 n까지 수중에 3의 배수의 합 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 >>> ");
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		
		while(i<=n)
		{
			
			if(i%3==0)
			{
				System.out.println("3의 배수 : " + i);
				sum+=i;
			}
			i++;
		}
		System.out.printf("1-%d 사이의 3의 배수의 합 : %d", n, sum);
		
		
		
		
		
		
		
		
	}

}
