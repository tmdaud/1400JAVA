package Ch15UpDownCasting;

class Computer
{
	//-SN : String; //SerialNo
	//-CPUSpec : str
	//-RAMSpec : str
	//-DISKSpec : str
	private String SN;
	private String CPU;
	private String RAM;
	private String DISK;
	//+PowerOn() : void ->"전원을 켭니다"
	//+PowerOff() : void ->"전원을 끕니다"
	public void PowerOn() {
		System.out.println(SN + " 전원을 켭니다");
	}
	public void PowerOff() {
		System.out.println(SN + " 전원을 끕니다");
	}
	//Getter and Setter 메서드 필요
	public String getSN() {
		return SN;
	}
	public String getCPU() {
		return CPU;
	}
	public String getRAM() {
		return RAM;
	}
	public String getDISK() {
		return DISK;
	}
	
	//모든 인자를 받는 생성자 함수 만들기
	public Computer(String sN, String cPU, String rAM, String dISK) {
		super();	//Object 클래스로부터 멤버받기
		SN = sN;
		CPU = cPU;
		RAM = rAM;
		DISK = dISK;
	}
}

class NoteBook extends Computer
{
	//+battery : int
	//+move() : void -> "이동합니다" , 호출시마다 배터리 -5감소
	public int battery;
	public void move() {
		System.out.println(this.getSN() + "이동합니다");
		if(battery-5<0) 
		{
			battery = 0;
			System.out.println("배터리가 부족하여 꺼집니다");
			PowerOff();
		}
		else
		{
			System.out.println(this.getSN() + "이동합니다");
			battery -= 5;
		}
	}
	
	public NoteBook(String sN, String cPU, String rAM, String dISK, int battery) {
		super(sN, cPU, rAM, dISK);
		this.battery = battery;
	}
	@Override
	public String toString() {
		return "NoteBook [battery=" + battery + ", getSN()=" + getSN() + ", getCPU()=" + getCPU() + ", getRAM()="
				+ getRAM() + ", getDISK()=" + getDISK() + "]";
	}
	
}

class Tablet extends Computer
{
	//+PencilNo : str
	//+WritePen() : void -> "Pen으로 씁니다"
	public String PencilNo;
	public void WritePen() {
		System.out.println("Pen으로 씁니다");
	}
	public Tablet(String sN, String cPU, String rAM, String dISK, String pencilNo) {
		super(sN, cPU, rAM, dISK);
		PencilNo = pencilNo;
	}
	@Override
	public String toString() {
		return "Tablet [PencilNo=" + PencilNo + ", getSN()=" + getSN() + ", getCPU()=" + getCPU() + ", getRAM()="
				+ getRAM() + ", getDISK()=" + getDISK() + "]";
	}
	
}

public class C03UpDownCastingMain {

	public static void ShowInfo(Computer ref) {
		//instanceof로 각각 연결된 객체에 맞게 DownCasting
		if(ref instanceof NoteBook) {
			NoteBook down = (NoteBook)ref;
			System.out.println(down);
		}
		else if(ref instanceof Tablet) {
			Tablet down = (Tablet)ref;
			System.out.println(down);
		}
		//전달받은 멤버의 Spec 값을 출력하는 코드 작성
	}
	
	public static void main(String[] args) {
		
		
		NoteBook Mycom = new NoteBook("1-2-3-4","I7","16G","1T",100);
		Tablet Mytab = new Tablet("9-8-7-6","I3","8G","128G","Pen-123");
		
		ShowInfo(Mycom);
		ShowInfo(Mytab);
		
		Mytab.PowerOff();
		Mycom.PowerOn();
	}

}
