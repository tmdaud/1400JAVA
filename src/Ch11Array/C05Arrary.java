package Ch11Array;

public class C05Arrary {

	public static void main(String[] args) {

		int arr[][]=
			{
					{10,20},
					{30,40,50},
					{50,60,70,80},
					{90,100}	
			};
		
		System.out.println("행의 길이 : "+arr.length);
		System.out.println("0번 행의 길이 : "+arr[0].length);
		System.out.println("1번 행의 길이 : "+arr[1].length);
		System.out.println("2번 행의 길이 : "+arr[2].length);
		System.out.println("3번 행의 길이 : "+arr[3].length);
	}

}
