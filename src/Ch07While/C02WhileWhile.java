package Ch07While;

import java.util.Scanner;

public class C02WhileWhile {

	public static void main(String[] args) {

		//전체 구구단 출력(2-9단)
		
//		int dan = 2;
//		int i;
//		
//		while(dan<=9) 
//		{
//			System.out.printf("%3d단\n", dan);
//			i = 1;
//			while(i<=9) 
//			{
//				System.out.printf("%d * %d = %d\n", dan, i, dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		//문제
		//i 역순
//		int dan = 2;
//		int i;
//		
//		while(dan<=9) 
//		{
//			System.out.printf("%3d단 역순\n", dan);
//			i = 9;
//			while(i>0) 
//			{
//				System.out.printf("%d * %d = %d\n", dan, i, dan*i);
//				i--;
//			}
//			System.out.println();
//			dan++;
//		}
		
		
		//문제 
		//단,i 역순
//		int dan = 9;
//		int i;
//		
//		while(dan>=2) 
//		{
//			System.out.printf("%3d단 역순\n", dan);
//			i = 9;
//			while(i>0) 
//			{
//				System.out.printf("%d * %d = %d\n", dan, i, dan*i);
//				i--;
//			}
//			System.out.println();
//			dan--;
//		}
		
		//별찍기
		//*****
		//*****
		//*****
		//*****
		
//		String a = "*";
//		int i = 0;
//		int j = 0;
//		
//		while(i<4)
//		{	
//			j = 0;
//			while(j<=4)
//				{
//				System.out.print(a);
//				j++;
//				}
//			System.out.println();
//			i++;
//		}

		
//		*
//		**
//		***
//		****
		
//		String a = "*";
//		int i = 0;
//		int j = 0;
//		
//		while(i<4)
//		{
//			j = 0;
//			while(j<=i)
//			{
//				System.out.print(a);
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		//****
		//***
		//**
		//*
		
//		String a = "*";
//		int i = 0;
//		int j = 0;
//		
//		while(i<4)
//		{
//			j = 0;
//			while(j<=3-i)
//			{
//				System.out.print(a);
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		//   * 
		//  *** 
		// *****
		//*******
		
//		String a = "*";
//		int i = 0; //행증가
//		int j = 0; //공백
//		int k = 0; //별
//		
//		while(i<4)
//		{
//			j=0;
//			while(j<=2-i)
//			{
//				System.out.print(" ");
//				j++;
//				
//				}
//			k = 0;
//			while(k<=(2*i))
//			{
//				System.out.print(a);
//				k++;
//			}
//				System.out.println();
//				i++;
//		}
		
		//*******
		// *****
		//  ***
		//   *
		
//		String a = "*";
//		int i = 0; //행증가
//		int j = 0; //공백
//		int k = 0; //별
//		
//		while(i<4)
//		{
//			j=0;
//			while(j<=i-1)
//			{
//				System.out.print(" ");
//				j++;
//				
//				}
//			k = 0;
//			while(k<=6-(2*i))
//			{
//				System.out.print(a);
//				k++;
//			}
//				System.out.println();
//				i++;
//		}
//		
		
		//문제
		Scanner sc = new Scanner(System.in);
		//높이 입력받아 출력하는 직각삼각형
//		int h = sc.nextInt();
//		int i = 0;
//		int j = 0;
//		
//		while(i<h)
//		{
//			j = 0;
//			while(j<=i)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		//높이 입력받아 출력하는 직각역삼각형
//		int h = sc.nextInt();
//		int i = 0;
//		int j = 0;
//		
//		while(i<h)
//		{
//			j = 0;
//			while(j<h-i)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		//높이 입력받아 출력하는 정삼각형
		//높이 입력받아 출력하는 역삼각형
		//높이 입력받아 출력하는 다이아몬드
		int i=0;
		int j=0;
		int k=0;
		
		while(i<7)
		{
			if(i<=3)
			{
				j=0; //공백
				while(j<=2-i)
				{
					System.out.print(" ");
					j++;
				}
				k=0; //별
				while(k<=2*i)
				{
					System.out.print("*");
					k++;
				}
			}
			else
			{
				j=0; //공백
				while(j<=i-4)
				{
					System.out.print(" ");
					j++;
				}
				k=0; //별
				while(k<=12-(2*i))
				{
					System.out.print("*");
					k++;
				}
			}
			
			System.out.println();
			i++;
		}
		
		//높이 입력받아 출력하는 모래시계
		
		
		
		
		
		
		
		
		
		
		
	}

}
