package Ch14Inheritance;

class Perent
{
	int x;
	Perent(){
		System.out.println("Perent의 디폴트 생성자 호출");
	}
	Perent(int x){
		System.out.println("Perent(x)의 디폴트 생성자 호출");
	}
}
class Son extends Perent
{
	int y;
	Son(){
		super(); //상위클래스의 디폴트생성자 호출(기본값)
		System.out.println("Son의 디폴트 생성자 호출");
	}
	Son(int x){
		super(x); //상위클래스의 Perent(int x) 생성자 호출 -> x멤버의 초기값 설정
		this.y=0; //하위클래스 y멤버에 0으로 초기화
		System.out.println("Son(x)의 디폴트 생성자 호출");
	}
	Son(int x,int y){
		super(x);
		this.y=y;
		System.out.println("Son(x,y)의 디폴트 생성자 호출");
	}
}

public class C02상속Main {

	public static void main(String[] args) {

//		Son ob1 = new Son(); //Perent()->Son() 생성자 호출 
//		Son ob2 = new Son(10); //Perent()->Son(x) 생성자 호출 
//		System.out.println(ob2.x+","+ob2.y);
		Son ob3 = new Son(10,20); //Perent()->Son(x,y) 생성자 호출 
		System.out.println(ob3.x+","+ob3.y);
//		System.out.println(ob2);
//		System.out.println(ob3);
		
	}

}
