package sample;

public class Banana extends Fruit{
  
	public Banana() {
		setCalories(25);
	}
	@Override
	 public void makeJuice() {
		   System.out.println("Banana juice is made");
	   }
	 public void peel() {	
		 System.out.println("Peel the banana before eating");
	 }

}
