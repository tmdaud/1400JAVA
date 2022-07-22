package Ch11Array;

import java.util.Scanner;

public class C02Array {

	public static void main(String[] args) {

		//문제1
		//1 배열의 크기를 입력받음
		Scanner sc=new Scanner(System.in);
		System.out.print("배열의 크기 입력 >> ");
		int a=sc.nextInt();
		int[] arr1=new int[a];
		int sum = 0;
		
		//2 크기만큼 점수를 키보드로부터 입력받아 배열에 차례대로 저장
		//3 배열에 저장된 각 요소에 접근하여 전체 합과 평균을 출력
		for(int i=0;i<a;i++) {
			System.out.print("점수 입력 >> ");
			int b=sc.nextInt();
			arr1[i]=b;
			sum+=b;
		}
		double avg = ((double)(sum)/arr1.length);
		System.out.println("전체 합 : "+sum);
		System.out.println("평균 : "+avg);
		
		//4 배열안의 저장된 점수 중에 가장 큰값과 가장 작은 값을 출력
		int max=arr1[0];		
		for(int i=1;i<arr1.length;i++)
		{
			if(arr1[i]>max) {
				max=arr1[i];
			}
		}
		System.out.println("가장 큰 값 : "+max);
		
		int min=arr1[0];		
		for(int i=1;i<arr1.length;i++)
		{
			if(arr1[i]<min) {
				min=arr1[i];
			}
		}
		System.out.println("가장 작은 값 : "+min);
		
		//문제2
		int ar[]= {10,30,20,15,4};
		sort(ar);
		for(int i:ar) {
			System.out.println(i+" ");
		}
	}

	private static void sort(int[] ar) {

		//배열을 정렬
		//버블/선택/삽입/기수/병합/퀵..아무거나 정렬로직 사용
		//선택정렬 사용(왼쪽요소부터 차례대로 정렬되는 방식)
		for(int i=0;i<ar.length-1;i++) 
		{
			for(int j=i+1;j<ar.length;j++) 
			{
				if(ar[i]>ar[j])
				{
					int tmp=ar[i];
					ar[i]=ar[j];
					ar[j]=tmp;
				}
			}
		}
		
		
		
		
		
		
		
		
	}

}
