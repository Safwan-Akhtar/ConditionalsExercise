package qa.com.main;

public class Runner {
	
	public static void main(String[] args) {
		
		Conditionals con = new Conditionals();
		
		System.out.println(con.Conditional(1, 2, true));
		System.out.println(con.Conditional(3, 3, false));
		System.out.println(con.Conditional(1, 1, true));
		
	}
}