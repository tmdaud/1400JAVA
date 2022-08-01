package Ch21ArrayList;

import java.util.ArrayList;
import java.util.List;

class BoardDTO
{
	private int No;
	private String title;
	private String content;
	private String writer;
	private String regdate;
	
	public BoardDTO(int no, String title, String content, String writer, String regdate) {
		super();
		No = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "BoardDTO [No=" + No + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regdate="
				+ regdate + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof BoardDTO) {
			BoardDTO down = (BoardDTO)obj;
			return this.No==down.No;
		}
		return super.equals(obj);
	}
}

public class C02ArrayListMain {
	
	public static void addDTO(List<BoardDTO> list, BoardDTO dto) {
		list.add(dto);
	}
	public static void ShowDTO(List<BoardDTO> list) {
		for(BoardDTO dto : list) {
			System.out.println(dto.toString());
		}	
	}
	public static void main(String[] args) {

		List<BoardDTO> list = new ArrayList();
		//키보드로 BoardDTO 단위의 값을 하나 이상 받아 list에 저장
		
		addDTO(list,new BoardDTO(1,"제목1","내용2","작성자3","2022-08-01"));
		addDTO(list,new BoardDTO(2,"제목1","내용2","작성자3","2022-08-01"));
		addDTO(list,new BoardDTO(3,"제목1","내용2","작성자3","2022-08-01"));
		addDTO(list,new BoardDTO(4,"제목1","내용2","작성자3","2022-08-01"));
		
		BoardDTO search = new BoardDTO(6,"제목1","내용2","작성자3","2022-08-01");
		
		if(list.contains(search)) {
			System.out.println("존재합니다");
		}
		else {
			System.out.println("존재하지 않습니다");
		}
		
		ShowDTO(list);
//		BoardDTO bdto = new BoardDTO(1,"a","b","c","d");
//		list.add();
//		//list에 저장된 BoardDTO를 모두 확인
//		System.out.println(bdto.toString());
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list[i]);
		
	}

}
