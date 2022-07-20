package Ch09ClassBasic;

import java.util.Scanner;

class Song
{
	String title;
	String artist;
	int year;
	String country;
	
	Song(String title, String artist, int year, String country)
	{
		this.title=title;this.artist=artist;this.year=year;this.country=country;
	}
	
	void show()
	{
		System.out.printf("%d년 %s 국적의 %s가 부른 %s\n",year,country,artist,title);
	}
}

public class C14Prac {
//	노래 한 곡을 나타내는 Song 클래스를 작성하라. Song은 다음 필드로 구성된다.
//
//	- 노래의 제목을 나타내는 title
//	- 가수를 나타내는 artist
//	- 노래가 발표된 연도를 나타내는 year
//	- 국적을 나타내는 country
//
//	또한 Song 클래스에 다음 생성자와 메소드를 작성하라.
//	- 생성자 2개: 기본 생성자와 매개변수로 모든 필드를 초기화하는 생성자
//	- 노래 정보를 출력하는 show() 메소드
//	- main() 메소드에서는 1978년, 스웨덴 국적의 ABBA가 부른 "Dancing Queen"을
//	song 객체로 생성하고 show()를 이용하여 노래의 정보를 다음과 같이 출력하라.
//	1978년 스웨덴국적의 ABBA가 부른 Dancing Queen
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("제목 입력 >>> ");
		String title = sc.next();
		System.out.print("아티스트 입력 >>> ");
		String artist = sc.next();
		System.out.print("연도 입력 >>> ");
		int year = sc.nextInt();
		System.out.print("국적 입력 >>> ");
		String country = sc.next();
		
		Song s = new Song(title,artist,year,country);
		s.show();
		
	}
}
