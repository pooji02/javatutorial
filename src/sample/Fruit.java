package sample;

public class Fruit {
  int calories;
  
	public int geCalories() {
		return calories;
	}
   
	public void setCalories(int calories) {
		this.calories=calories;
	}
   public void makeJuice() {
	   System.out.println("Juice is made");
   }
}
