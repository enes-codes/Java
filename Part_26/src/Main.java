
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human human = new Human("Rick",65,70);
		Human human2 = new Human("Morty",16,50);
		
		System.out.println(human.name+"-"+human.age+"-"+human.weight);
		System.out.println(human2.name+"-"+human2.age+"-"+human2.weight);
		
		human.eat();
		human.drink();

		human2.eat();
		human2.drink();
	}	

}
