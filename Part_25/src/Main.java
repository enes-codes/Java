
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car();
		
		System.out.println("Make: "+car1.make);
		System.out.println("Model: "+car1.model);
		System.out.println("Year: "+car1.year);
		System.out.println("Color: "+car1.color);
		System.out.println("Price: "+car1.price);
		
		car1.drive();
		car1.brake();
	}	

}
