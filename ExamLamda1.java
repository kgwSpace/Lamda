// 일반적인 인터페이스와 이를 이너클래스로 구현한 클래스
//ExamLamda2.java에서 익명클래스로 구현함.

//함수형 인터페이스
interface Printable
{
	public void print(String s);
}



public class ExamLamda1 {

	public static void main(String[] args) {
		
		class Printer implements Printable
		{
			public void print(String s)
			{
				System.out.println(s);
			}
		}
		
		Printable prn = new Printer();
		prn.print("hello");
	}

}
