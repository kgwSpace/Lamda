
public class ExamLamda5 {

	public static void main(String[] args) {
		Printable prn = null;
		
		prn = (String s)->{ System.out.println(s); };	// 가장 긴 타입의 람다식
		prn.print("hello1");
		
		prn = (String s)-> System.out.println(s);		// 중괄호를 생략(한 줄인 경우 가능)
		prn.print("hello2");
		
		prn = (s)->{ System.out.println(s); };			// 파라미터의 타입을 생략 (가장 많은 케이스)
		prn.print("hello3");
		
		prn = s->{ System.out.println(s); };			// 파라미터의 소괄호을 생략 (파라미터가 1개인 경우만)
		prn.print("hello4");
	}

}
