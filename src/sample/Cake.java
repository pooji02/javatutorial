package sample;

public class Cake {

	private String flavor;
	private int price;
	
	public Cake(String f) {
		setFlavor(f);
		setPrice(200);
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String f) {
		this.flavor=f;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int p) {
		this.price=p;
	}
}
