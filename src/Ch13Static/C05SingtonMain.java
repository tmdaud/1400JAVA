package Ch13Static;


//싱글톤 패턴 처리 시작
class Product
{
	String PName;
	int amount;
	//모든 인자를 받아 저장하는 생성자를 만듭니다.
}
class Refrigerator
{
	//싱글톤 패턴 처리합니다.
	private static Refrigerator instance;
	public static Refrigerator getInstance()
	{
		if(instance==null)
		{
			instance=new Refrigerator();
		}
		return instance;
	}
	private Refrigerator() {}
		
	Product [] list = new Product[100];
	int ProductNum = 0;
	void SetProduct(Product product) {
		//list  ProductNum번째 idx에 외부에서 생성된 Product가 연결
		
		//ProductNum의 count 1증가
	}
	Product getProduct(String search,int amount) {
			
		//반복문과 문자열 검색 처리를 통해서 list에 저장된 search 
		//객체 꺼내와서 요청 개수만큼 차감
		//찾은 Product의 주소를 리턴
		return null;
	}
}

public class C05SingtonMain {

	public static void main(String[] args) {
		//냉장고 객체 가져오기(싱글톤 패턴)
		Refrigerator refrigerator= Refregerator.getInstance();
				
		//상품정보객체 생성 
		Product prod = new Product("콜라",5);
				
		//냉장고에 상품저장
		refrigerator.SetProduct(prod);

		//냉장고에 상품반환
		Product prod1 =refrigerator.getProduct("사이다",1); 
						
		System.out.println("get Item : " + prod1.toString());

	}

}
