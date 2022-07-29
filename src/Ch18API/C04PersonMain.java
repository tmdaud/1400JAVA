package Ch18API;

class Person
{
	private String name; //이름
	private String id;	 //주민등록번호
	private String addr; //주소
	
	//생성자는 Main 함수 보면서 만들기
	Person(String name,String id,String addr){
		this.name=name;
		this.id=id;
		this.addr=addr;
	}
	//toString() 재정의 name과 addr만 리턴
	
	@Override
	public String toString() {
		String a = name+" "+addr;
		return a;
	}

	//equals() 재정의 id와 addr가 일치하면 t/f
	@Override
	public boolean equals(Object obj) 
	{
		if(obj instanceof Person) {
			Person down = (Person)obj; 
			return this.id==down.id && this.addr==down.addr;
		}
		return false;
		
	}
}

public class C04PersonMain {

	public static void main(String[] args) {

		Person hong1 = new Person("홍길동","888888-8888888","대구");
		Person hong2 = new Person("홍길동","888888-8888888","대구");
		Person kim = new Person("김상중","123456-1234567","대구");
		
		System.out.println(hong1); //name,addr 리턴
		System.out.println(hong1.equals(hong2)); //true
		System.out.println(hong1.equals(kim)); //false
		
	}

}
