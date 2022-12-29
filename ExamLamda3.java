//ExamLamda2를 람다식으로 구현한 것.
//즉, 람다는 이너 클래스의 형식을 가져와서 축약시킨 버전이라고 말할 수 있다.

public class ExamLamda3 {
	
	public static void printHello(Printable prn)
	{
		prn.print("hello");
	}
	
	public static void main(String[] args) {
		
		//람다식. 중복되거나 불필요한 코드를 제거함으로서 코드의 간결함이 높아진다.
		//메소드 1개짜리 객체 s
		Printable prn = s -> {System.out.println(s);};
		
		//화살표만으로 함수 1개짜리 객체라는 걸 알 수 있다.
		//화살표 기준 왼쪽 = 함수의 파라미터, 오른쪽 = 구현부
		printHello(prn);
		printHello( s -> {System.out.println(s);});
	}
	
}
