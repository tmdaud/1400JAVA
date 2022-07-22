package Ch11Array;

import java.util.Scanner;

public class C04Array {

	public static void main(String[] args) {

		//1 행,열의 크기 입력받음
		Scanner sc=new Scanner(System.in);
		System.out.print("행 크기 입력 >> ");
		int a=sc.nextInt();
		System.out.print("열 크기 입력 >> ");
		int b=sc.nextInt();
		
		int [][] arr= new int [a][b];
		
		//2 행,열안에 각각의 위치에 값을 입력
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(i+"행"+j+" 열"+" 값 입력 >> ");
				arr[i][j]=sc.nextInt();
			}
		}
		
		//3 각 행의 값의 총합을 출력
		int rowsum[]=new int [arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				rowsum[i]+=arr[i][j];
			}
		}
			
		//4 각 열의 값의 총합을 출력
		int colsum[]=new int [arr[0].length];
		
		for(int j=0;j<arr[j].length;j++)
		{
			for(int i=0;i<arr.length;i++)
			{
				colsum[j]+=arr[i][j];
			}
		}
		
		for(int i=0;i<rowsum.length;i++) {
			System.out.printf("%d 행의 총합 : %d\n",i,rowsum[i]);
		}
		for(int i=0;i<colsum.length;i++) {
			System.out.printf("%d 열의 총합 : %d\n",i,colsum[i]);
		}
		
		
		//5 모든 값 총합
		
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=0;j<arr[i].length;j++)
//			{
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
		
	}

}
