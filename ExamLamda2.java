//익명 클래스


public class ExamLamda2 {

	public static void main(String[] args) {
		
		//익명 클래스 코드.
		//익명 클래스를 구현하는 전제는 1. 클래스 1개, 2. 함수형 인터페이스
		Printable prn = new Printable()
		{
			public void print(String s)
			{
				System.out.println(s);
			}
		};
		
		
		prn.print("hello");
	}

}