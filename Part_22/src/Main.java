
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x1 = add(1,2);
		System.out.println(x1);
		
		int x2 = add(1,2,3);
		System.out.println(x2);
		
		int x3 = add(1,2,3,4);
		System.out.println(x3);
		
		double y1 = add(1.2,2.3);
		System.out.println(y1);
		
		double y2 = add(1.2,2.3,3.4);
		System.out.println(y2);
		
		double y3 = add(1.2,2.3,3.4,4.5);
		System.out.println(y3);
	}
	
	static int add(int a, int b) {
		System.out.println("This is overloaded method #1");
		return a+b;
	}
	static int add(int a, int b, int c) {
		System.out.println("This is overloaded method #2");
		return a+b+c;
	}
	static int add(int a, int b, int c, int d) {
		System.out.println("This is overloaded method #3");
		return a+b+c+d;
	}
	
	static double add(double a, double b) {
		System.out.println("This is overloaded method #4");
		return a+b;
	}
	static double add(double a, double b, double c) {
		System.out.println("This is overloaded method #5");
		return a+b+c;
	}
	static double add(double a, double b, double c, double d) {
		System.out.println("This is overloaded method #6");
		return a+b+c+d;
	}
	

}
