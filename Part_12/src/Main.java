import  java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
			Scanner scan = new Scanner(System.in);
			String name = "";
			
			while(name.isBlank()) {
				System.out.println("Enter your name: ");
				name = scan.nextLine();
			}
			
			System.out.println("Hello "+name);
		*/
		
		Scanner scan = new Scanner(System.in);
		String name = "";
		
		do {
			System.out.println("Enter your name: ");
			name = scan.nextLine();
		}while(name.isBlank());
		
		System.out.println("Hello "+name);
	}

}
