package Ch09ClassBasic;

import java.util.Scanner;

class Grade
{
	int math;
	int science;
	int english;
	
	Grade(int math, int science, int english)
	{
		this.math=math;this.science=science;this.english=english;
	}
	double average()
	{
//		double avg = (double)(this.math+this.science+this.english)/3;
		return (double)(this.math+this.science+this.english)/3;
	}
	
	
}

public class C13Prac {

	 
		//Grade 클래스를 작성해보자. 3 과목의 점수를 입력받아 Grade 객체를 생성하고 성적 평균을 출력하는 main()과 실행 예시는 다음과 같다.

		public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
		   int math = sc.nextInt();
		   int science = sc.nextInt();
		   int english = sc.nextInt();
		   Grade me = new Grade(math, science, english);
		   System.out.println("평균은 "+me.average()); // average()는 평균을 계산하여 리턴
		   
		   sc.close();
		}

//		수학, 과학, 영어 순으로 3개의 정수 입력 >> 90 88 96
//		평균은 91
//		[Hint] Grade 클래스에 int 타입의 math, science, english 필드를 private로 선언하고, 생성자와 세 과목의 평균을 리턴하는 average() 메소드를 작성한다.
	 

}
