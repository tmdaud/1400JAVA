package Ch06Ifswitch;

import java.util.Scanner;

public class C02Switch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("등수 입력 >> ");
		int rank = sc.nextInt();
		
		switch(rank)
		{
		case 1:
			System.out.print("금메달");
			break;
		case 2:
			System.out.print("은메달");
			break;
		case 3:
			System.out.print("동메달");
			break;
		default:
			System.out.print("!!");
			break;
			
		}
		
		
	}

}
