interface Calculate<T>//int 형 두 개를 받아서 리턴하는 함수형 인터페이스
{
	public T add(T a,T b);
}

public class ExamLamda7 {

	public static void main(String[] args) {
		Calculate<Integer> cal = null;
		
		cal = (a,b) ->  a + b ;
		
		System.out.println(cal.add(2, 3));
	}

}
