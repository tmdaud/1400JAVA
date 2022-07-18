package Ch07While;

import java.util.Scanner;

public class C03BreakContinue {

	public static void main(String[] args) {
//		-1을 입력하기 전까지는 무한대로 값을 입력받아 입력된 값의 합을 입력
		
//		Scanner sc = new Scanner(System.in);
//		
//		int sum = 0;
//		int data = 0;
//		
//		while(true)
//		{
//			System.out.print("정수 입력 : ");
//			data = sc.nextInt();
//			if (data==-1)
//				break; //가장 근접한 while 문을 벗어남
//			
//			sum+=data;		
//		}
//		System.out.println("누적 합 : " + sum);
		
		
		//1-10까지의 수 중의 3의 배수는 제외한 합을 출력
	
//		int i = 1;
//		int sum = 0;
//		
//		while(i<=10) 
//		{
//			if(i%3==0) 
//			{
//				i++;
//				continue;
//			}
//				System.out.println("i : " + i);
//			sum+=i;
//			i++;
//		}
//		System.out.println("합 : "+sum);
		
		//문제
		//1부터 n까지의 수중에 4의 배수는 제외한 수의 합과 평균 출력
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; //누적 합
		double avg = 0;
		int i = 1;
		int cnt = 0; //누적 수
		
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		
		while(i<=a)
		{
			if(i%4==0)
			{
				i++;
				continue;
			}
			System.out.println("i : " + i);
			sum+=i; cnt++; avg = (double)sum/cnt;
			
			i++;
			
		}
		System.out.println("합 : "+sum);
		System.out.println("평균 : "+avg);
		
		
		
		
		
	}
}


