package qa.com.main;

public class Conditionals {
	
	public int Conditional (int x, int y, boolean z) {
		
		if (x % 2 == 0 || y % 2 == 0 ) {
			System.out.println("Even number detected");
			return 0;
		}
		
		if (z == true) {
			return (x + y);
		}
		else {
			return (x * y);
		}
	}
}