package Ch02Su;

public class C05변수자료형 {

	public static void main(String[] args) {

		
		int num1; 		//4byte 정수 공간 형성 + num1 이름 부여
		num1 = 10;		//= 대입연산자	공간 = 값, 오른쪽부터 먼저 처리
						//10리터럴값을 먼저 저장한 뒤(int) num1 변수송간에 대입
		
		int num2 = 4;	//4리터럴을 먼저 저장한 뒤 4byte 정수 공간인
						//num2 변수 공간 초기값으로 대입
		int num3 = num1 + num2; // num1안의 값과 num2안의 값의 합을 4byte 정수공간인 num3 공간에 초기화 
		System.out.println(num3); //num3의 값을 콘솔창에 출력
		
	}

}
