package Ch14Inheritance;

class Test
{
	Test(){
		System.out.println("Test 생성자 호출");
	}
}


class Point2D extends Test //상위클래스(부모,수퍼)
{
	public int x;
	public int y;
	
	Point2D()
	{
		System.out.println("Point2D 생성자 호출");
	}
	
	public void ShowXY() {
		System.out.println("X : "+x+" Y : "+y);
	}
}
class Point3D extends Point2D //Point2D를 상위클래스로 하는 Point3D클래스(하위/서브/자식)
{
	public int z;
	
	Point3D()
	{
		System.out.println("Point3D 생성자 호출");
	}
	
	public void ShowXYZ() //추가
	{
		ShowXY();
		System.out.print("Z : "+z);
	}
}


public class C01상속Main {

	public static void main(String[] args) {

		Point3D ob = new Point3D();
		ob.x=10;
		ob.y=20;
		ob.z=30;
		ob.ShowXY();
		ob.ShowXYZ();
		
	}

}
