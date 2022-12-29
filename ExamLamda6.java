@FunctionalInterface	//함수형 인터페이스라는 의미를 강조.
interface Addable
{
	void printSum(int a, int b);
}

public class ExamLamda6 {

	public static void main(String[] args) {
		Addable add = null;
		
		// 가장 긴 타입의 람다식
		add = (int a, int b) -> {System.out.println(a+b);};
		add.printSum(1, 2);
		
		// 중괄호를 생략(한 줄인 경우 가능)
		add = (int a, int b) -> System.out.println(a+b);
		add.printSum(3, 4);
		
		// 파라미터의 타입을 생략 (가장 많은 케이스)
		add = (a, b) -> System.out.println(a+b);
		add.printSum(5, 6);
	}

}
