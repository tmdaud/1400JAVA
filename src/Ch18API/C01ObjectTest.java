package Ch18API;

class A
{
	int x;
	int y;
	
	@Override
	public  String toString() {
		return "x="+x+" y="+y;
	}
}

public class C01ObjectTest {

	public static void main(String[] args) {

		Object ob1 = new Object();
		System.out.println(ob1.toString());
		System.out.println(ob1);
		
		A ob2 = new A();
		ob2.x=10; ob2.y=20;
		System.out.println(ob2.toString());
		System.out.println(ob2);
	}

}
