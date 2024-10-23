import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int x = rnd.nextInt(6);
		System.out.println("Int: "+x);
		
		double y = rnd.nextDouble();
		System.out.println("Double: "+y);
		
		boolean z = rnd.nextBoolean();
		System.out.println("Boolean: "+z);
		
	}

}
