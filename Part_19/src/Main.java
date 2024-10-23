import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ArrayList<String>> groceryList = new ArrayList();

		ArrayList<String> bakeryList = new ArrayList<String>();
		bakeryList.add("Pasta");
		bakeryList.add("Garlic Bread");
		bakeryList.add("Donuts");
		
		ArrayList<String> produceList = new ArrayList<String>();
		produceList.add("Tomatoes");
		produceList.add("Zucchini");
		produceList.add("Peppers");
		
		ArrayList<String> drinkList = new ArrayList<String>();
		drinkList.add("Soda");
		drinkList.add("Coffee");
		drinkList.add("Coca Cola");
		
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinkList);
		
		System.out.println("Grocery List: "+groceryList);
		
		System.out.println("Bakery List: "+groceryList.get(0));
		System.out.println("Pasta: "+groceryList.get(0).get(0));
		
		
	}

}
