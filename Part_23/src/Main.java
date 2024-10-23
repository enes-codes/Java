
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
			System.out.printf("This is format string %d",123);
			System.out.println();
			System.out.println("----------------------------");
			System.out.printf("%d This is format string",123);
		*/
		
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Enes";
		int myInt = 21;
		double myDouble = 3.41;
		
		System.out.printf("Boolean = %b",myBoolean);
		System.out.println();
		System.out.printf("Char = %c",myChar);
		System.out.println();
		System.out.printf("String = %s",myString);
		System.out.println();
		System.out.printf("Int = %d",myInt);
		System.out.println();
		System.out.printf("Double = %f",myDouble);
		System.out.println();
		System.out.printf("Hello %10s",myString);
		System.out.println();
		System.out.printf("You have this much money %f",myDouble);
		System.out.println();
		System.out.printf("You have this much money %.2f",myDouble);
		System.out.println();
		System.out.printf("You have this much money %+.2f",myDouble);

		
	}	

}
