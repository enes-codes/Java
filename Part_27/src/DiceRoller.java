import java.util.Random;

public class DiceRoller {
	
	Random rnd;
	int number;
	
	DiceRoller(){
		rnd = new Random();
		roll();
	}
	
	void roll() {
		number = rnd.nextInt(6)+1;
		System.out.println(number);
	}
}


