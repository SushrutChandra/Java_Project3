package studentCode;
public class Question1 {

	public static int weirdSum(int a, int b, int c) {

		int sumNum = 0;
		
		if ( a == 7) {
			sumNum = 0;
		} else if (b == 7) {
			sumNum = a;
		} else if (c == 7) {
			sumNum = a + b;
		} else {
			sumNum = a + b + c;
		}
		
		return sumNum;
	}

}
