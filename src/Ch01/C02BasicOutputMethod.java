package Ch01;

public class C02BasicOutputMethod {

	public static void main(String[] args) {
		//System.out           : 표준 출력 스트림(해석 : 표준출력장치(모니터)에 데이터 전달)
		
		//System.out.print()   : 콘솔화면에 내용 출력
		//Escape 문자 사용을 통한 개행(줄바꿈)
		//Escape : 탈출하다, 벗어나다
		//Escape 문자 : 기존의 문자 용도를 벗어나 특정한 기능 수행에 사용되는 문자
		// \n : 줄바꿈(개행)
		// \b : 한 문자 삭제
		// \t : 8칸 커서 이동
//		System.out.print("Hello World!\n");
//		System.out.print("Hello World!\n");
//		System.out.print("Hello World!\n");
//		System.out.print("Hello World!\n");
//		
//		System.out.print("   *\n");
//		System.out.print("  ***\n");
//		System.out.print(" *****\n");
//		System.out.print("*******\n");
//		
		//System.out.printf()
		//format : 형식, 서식
		//서식 : 서류를 꾸미는 일정한 양식
		
		//%d : 10진 정수 서식문자 
		//%f : 실수 서식문자
		//%c : 한문자 서식문자
		//%s : 문자열 서식문자
//		System.out.printf("%d\n", 10);
//		System.out.printf("%d + %d = %d\n", 10, 20, 10+20);
//		System.out.printf("%f + %f = %f\n", 10.23, 20.75, 10.23+20.75);
//		System.out.printf("%c %c %c\n", 'A', 'B', 'C' );
//		System.out.printf("%s %s %s\n", "This is", "String", "Test");
//		System.out.printf("%d.%s : %d\n", 1, "성적", 100 );
//		
		//문제
//		서식문자를 이용해서 다음과 같은 문장을 완성
//		나의 이름은 %s입니다
//		나의 나이는 %d 세 입니다.
//		나의 성별은 %c 입니다.
//		System.out.printf("나의 이름은 %s 입니다.\n", "최승명");
//		System.out.printf("나의 나이는 %d 세 입니다.\n", 26);
//		System.out.printf("나의 성별은 %c 입니다.\n", '남');
		
		//서식문자 정렬/자리 수 지정
		//%10d  : 10칸 확보 후 오른쪽 정렬
		//%-10d : 10칸 확보 후 왼쪽 정렬
//		System.out.printf("%-10d%d\n", 1234, 5678);
//		System.out.printf("%.3f\n", 10.123456);
	
		//주의!!
//		System.out.printf("I say \"Hello?\"");
		
		//System.out.println() 

		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		
		
		//문제1
		System.out.printf("%s\t%s\t%s\t%s\n","No","이름","나이","쥐소");
		System.out.printf("%d\t%s\t%d\t%s\n",1,"홍길동",20,"대구");
		System.out.printf("%d\t%s\t%d\t%s\n",2,"남길동",30,"서울");
		System.out.printf("%d\t%s\t%d\t%s\n",3,"서길동",40,"울산");
		System.out.printf("%d\t%s\t%d\t%s\n",4,"동길동",50,"김해");
		System.out.printf("\n");
		
		//문제2
		System.out.printf("%s\t%s\t%s\t%s\n","Code","Title","Publisher","Price");
		System.out.printf("%d\t%s\t%s\t%d\n",1010,"DoItJava","00미디어",29000);
		System.out.printf("%d\t%s\t%s\t%d\n",2020,"윤성우C","오렌지 미디어",25000);
		System.out.printf("\n");
		
		//문제3
		System.out.printf("%5s\n","*");
		System.out.printf("%6s\n","***");
		System.out.printf("%7s\n","*****");
		System.out.printf("%8s\n","*******");
		System.out.printf("%7s\n","*****");
		System.out.printf("%6s\n","***");
		System.out.printf("%5s\n","*");
		
		
		System.out.println("GitHub TEST");
		
	
		
	}

}
