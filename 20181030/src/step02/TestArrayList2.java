package step02;

import java.util.ArrayList;

public class TestArrayList2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new MemberVO("id01", "pw01", "아이유", "종로"));
		System.out.println(list);
		list.add(new MemberVO("id02", "pw02", "신세경", "마포"));
		System.out.println(list);

		Object obj = list.get(0);
		MemberVO mvo = (MemberVO)obj;
		System.out.println(mvo.getName()); // 아이유
		
		MemberVO mvo1 = (MemberVO)list.get(1);
		System.out.println(mvo1.getName()); // 신세경
		mvo1.setName("김희철");// 김희철로 바꿈.
		
		System.out.println(list);
		System.out.println("================================");
		list.add(new MemberVO("id03", "pw03", "강호동", "구미"));
		for (int i = 0; i < list.size(); i++) {
			MemberVO vo = (MemberVO)list.get(i);
			System.out.println(vo.getName());			
		}
		System.out.println("================================");
		list.add(new MemberVO("id04", "pw04", "주원진", "부평"));
		list.add(new MemberVO("id05", "pw05", "김지훈", "부평"));
		// 부평에 사는 모든 사람의 이름을 출력
		for (int i = 0; i < list.size(); i++) {
			MemberVO vo = (MemberVO)list.get(i);
			if (vo.getAddress().equals("부평")) {
				System.out.println(vo.getName());
			}
		}
		System.out.println("================================");
		System.out.println(list);
		MemberVO mem = new MemberVO("javaking", "qwerty", "Wonjin", "Busan");
		list.set(4, mem);
		System.out.println(list);
	}
}