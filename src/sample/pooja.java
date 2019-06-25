package sample;

public class pooja {

	public static void main(String[] args) {
		
		myClass obj1=new myClass(5);
		myClass obj2;
		obj2=obj1.method1();
		
		System.out.println("obj1 is" +obj1.i);
		System.out.println("obj2 is" +obj2.i);
		
	}}
	
class myClass{
	
	int i;
	
	myClass(int a){
		i=a;
	}
	
	myClass method1() {
		myClass obj=new myClass(i+10);
				return obj;
	}
}
	
	
