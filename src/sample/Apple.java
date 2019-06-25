package sample;

public class Apple extends Fruit {

	public Apple() {
		setCalories(15);
	}
	@Override	
	 public void makeJuice() {
		   System.out.println("Apple juice is made");
	   }
	 public void removeSeeds() {
		 System.out.println("Remove seeds in apple before eating");
	 }
}
