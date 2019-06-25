package sample;

public class TasteTester {

	public static void main(String[] args) {
		
		Cake cake=new Cake("chocalate");
		cake.setPrice(100);
		System.out.println("The flavor is "+ cake.getFlavor());
		System.out.println("The price is "+ cake.getPrice());
		
		
		BirthdayCake bcake=new BirthdayCake();
		System.out.println("The flavor is" + bcake.getFlavor());
		System.out.println("The price is" + bcake.getPrice());
		
		WeddingCake wcake=new WeddingCake();
		wcake.setPrice(250);
		System.out.println("The flavor is" + wcake.getFlavor());
		System.out.println("The price is" + wcake.getPrice());
	}
}
