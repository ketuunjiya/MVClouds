public class Task6 {
	public static void main(String[] args) {
		foo(null);
		bar(null);
	}

	// Using a try-catch block:
	static void foo(String x){
		try {
			System.out.println("First character: " + x.charAt(0));
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException !");
		}
	}

	// Using if-else condition:
	static void bar(String x){
		if(x != null)
			System.out.println("First character: " + x.charAt(0));
		else
			System.out.println("NullPointerException !");
	}
}