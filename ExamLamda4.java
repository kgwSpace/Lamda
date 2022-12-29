//구구단을 출력하는 함수를 람다식으로 호출한 예시.

interface Multiplication
{
	public void mp();
}

public class ExamLamda4 {

	public static void main(String[] args) {
		
		Multiplication mt = () -> {
			for(int x = 2; x <= 9; x++)
			for(int y = 1; y <= 9; y++)
			System.out.println(x + " x " + y + " = " + x*y);
		};
		
		mt.mp();
	}

}
