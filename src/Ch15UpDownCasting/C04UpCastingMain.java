package Ch15UpDownCasting;

class C04Animal
{
	public void Sound() {System.out.println("소리를 냅니다");}
}
class C04Dog extends C04Animal
{
	//함수 재정의
	public void Sound() {System.out.println("멍멍 소리를 냅니다");}
	//확장
	public void Move() {System.out.println("이동합니다");}
}


public class C04UpCastingMain {

	public static void main(String[] args) {

		C04Animal ob = new C04Animal();
		C04Animal ani = new C04Dog(); //UpCasting 
		ani.Sound(); //가능(상위클래스 참조변수로 오버라이딩된 하위클래스 함수에 접근이 가능)
		//ani.Move(); //불가능(->DownCasting을 통한 접근 필요)
		
	}

}
