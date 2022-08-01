package Ch19Exception;

//throws : 생성된 예외객체의 위치값을 실행한 블럭의 catch로 전달하는 코드
//throw  : 예외객체 생성 예약어

public class C04ExceptionMain {

	public static void div(int n1, int n2) throws Exception{
		if(n2==0)
			throw new ArithmeticException("산술 예외 발생! 왜 0으로 나눔?");
		System.out.println(n1/n2);
	}
	
	public static void main(String[] args) {

		
		try {
			div(10,0);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("MAIN에서 예외처리");
		}
		
	}

}
