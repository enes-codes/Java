import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int rows;
		int columns;
		String symbol = "";
		
		System.out.println("Enter of rows: ");
		rows = scan.nextInt();
		System.out.println("Enter of columns: ");
		columns = scan.nextInt();
		System.out.println("Enter of symbol: ");
		symbol = scan.next();
		
		for(int i=1; i <= rows; i++) {
			System.out.println();
			for(int j=1; j <= columns; i++) {
				System.out.println(symbol);
			}
		}
		
	}

}
