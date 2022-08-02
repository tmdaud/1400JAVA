package Ch21ArrayList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class C05MapMain {

	public static void main(String[] args) {

		Map<String,Integer> map = new HashMap();
		
		map.put("aaa", 111);
		map.put("bbb", 222);
		map.put("ccc", 333);
		map.put("ddd", 444);
		
		System.out.println("SIZE : "+map.size());
		
		//System.out.println("get : "+map.get("bbb"));
		
		//기존방식
		
//		Set<String> set = map.keySet();			//모든 map 안의 key를 set형태로 변환
//		Iterator<String> iter = set.iterator(); //set 안의 값을 순회하기 위한 기준점
//		while(iter.hasNext())	//다음 위치에 데이터 있는지 여부 확인
//		{
//			String key = iter.next();	//다음 위치로 이동
//			Integer value = map.get(key);
//			System.out.println("KEY : "+key+" VAL : "+value);
//		}
		
		for(String key : map.keySet());
		{
			System.out.println("KEY : "+key + " VAL : "+map.get(key));
		}
		
	}

}
