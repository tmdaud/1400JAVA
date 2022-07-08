package Ch02Su;


//보수개념을 도입해서 사용자가 뺄셈 요청시 덧셈으로 치환하여 뺄셈과 동일한 결과값을 전달


public class C03음의정수 {

	public static void main(String[] args) {
		
		
		System.out.printf("%d\n", (byte)(0b11000101));
		
		System.out.println("Q1");
		System.out.printf("10진수   ->   2진수\n");
		System.out.printf("11   ->   00001011\n");
		System.out.printf("-11   ->  11110101\n");
		System.out.printf("111   ->  01101111\n");
		System.out.printf("-111   -> 10010001\n");
		System.out.printf("96   ->   01100000\n");
		System.out.printf("-96   ->  10100000\n");
	////문제
		//2진수		->		10진수
		//10001010	-> -128+8+2= -118
		//11000101	-> -128+64+4+1 = -59
		//01110101	-> 64+32+16+4+1 = 117
		//11001100	-> -128+64+8+4 = -52
		

	}

}
