import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
			String[] animals = {"Cat","Dog","Rat","Bird"};
			
			for(String i: animals) {
				System.out.println(i);
			}
		*/
		
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Rat");
		animals.add("Bird");
		
		for(String i: animals) {
			System.out.println(i);
		}
	}

}
