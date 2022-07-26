package Ch14Inheritance;

class Employee
{
	String name;
	int age;
	int time;
	
	Employee(String name, int age, int time){
		this.name=name;
		this.age=age;
		this.time=time;
	}
}
class PartTimer extends Employee
{
	int timesalary;
	int day;
	
	PartTimer(String name, int age, int time, int timesalary, int day)
	{
		super(name,age,time);
		this.timesalary=timesalary;
		this.day=day;
	}

	@Override
	public String toString() {
		return "PartTimer [timesalary=" + timesalary + ", day=" + day + ", name=" + name + ", age=" + age + ", time="
				+ time + "]";
	}
	
}
class Regular extends Employee
{
	int yearsalary;
	String jik;
	
	Regular(String name, int age, int time, int yearsalary, String jik)
	{
		super(name,age,time);
		this.yearsalary=yearsalary;
		this.jik=jik;
	}

	@Override
	public String toString() {
		return "Regular [yearsalary=" + yearsalary + ", jik=" + jik + ", name=" + name + ", age=" + age + ", time="
				+ time + "]";
	}
	
}
public class C03상속Main {

	public static void main(String[] args) {

		PartTimer hong = new PartTimer("홍길동",55,4,20000,90); //이름,나이,근무시간,시급,근무일수
		Regular kim = new Regular("김상중",44,8,3800,"대리"); //이름,나이,근무시간,연봉,직책
		System.out.println(hong.toString());
		System.out.println(kim.toString());
		
	}

}
