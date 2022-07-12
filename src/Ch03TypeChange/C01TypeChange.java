package Ch03TypeChange;

public class C01TypeChange {

	public static void main(String[] args) {

		//형변환
		//데이터 연산(처리)시 자료형이 다른 값들을 일치시키는 작업
		//형변환 종류
		//자동형변환(암식적) : 컴파일러에 의해 자동으로 자료형이 일치, 데이터 손실염려 X
		//ex)큰 공간 = 작은 공간의 값
		//강제형변환(명시적) : 프로그래머에 의해 강제적으로 자료형을 일치, 데이터 손실염려 O
		//ex)작은 공간 = 큰 공간에 저장된 값
		
//		1 자동 형변환
//		byte < short,char < int < long < float < double
		byte byteval = 10;
		int intval = byteval; //자동형변환
		System.out.println("intval : " + intval);
		
		char charval = '가';
		intval = charval;
		System.out.println("intval : " + intval);
		
		long longval = intval;
		System.out.println("longval : " + longval);
		
		float floatval = longval;
		System.out.println("floatval : " + floatval);
		
		double doubleval = floatval;
		System.out.println("doubleval : " + doubleval);
		
		
	}

}
