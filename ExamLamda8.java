
interface Calculate<T>
{
	T cal(T a,T b);
}

public class ExamLamda8 {

	// 두 수를 연산해서 반환하는 함수.
	public static <T extends Number> void calAndprint(Calculate<T> op, T n1, T n2)
	{
		T result = op.cal(n1,n2);
		
		System.out.println(result);
		
		
	}
	
	public static void main(String[] args) {
		// 2. 4+5를 구하는 코드를 완성하세요 (람다식)
		
		calAndprint((a, b)->a+b,4.3,5.2);
		
	}

}
