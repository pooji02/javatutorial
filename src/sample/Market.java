package sample;

public class Market {

	public static void main(String[] args) {
		
	
	Apple a =new Apple();
	a.makeJuice();
	a.removeSeeds();
	
	Banana b = new Banana();
	b.makeJuice();
	b.peel();
	
	//Polymorphism
	
	Fruit fruit=new Apple();
	fruit.makeJuice();
	((Apple)fruit).removeSeeds(); //typecasting
	squeeze(fruit);
	
	fruit=new Banana();
	fruit.makeJuice();	
	((Banana)fruit).peel();
	squeeze(fruit);
	}
	public static void squeeze(Fruit f) {
		if(f instanceof Apple) {
			System.out.println("Squeeze apple");
			
		}else if(f instanceof Banana){
			System.out.println("squeeze Banana");
			
		}
		
	
	
	
	}
}
