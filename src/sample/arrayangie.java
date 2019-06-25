package sample;

import java.util.Scanner;

public class arrayangie {

	private static int grades[];	
	private static Scanner scanner = new Scanner(System.in);
		
	public static void main(String[] args) {
		
		System.out.println("Enter the number of grades");
		grades= new int[scanner.nextInt()];
		 
		getGrades();
		calculateSum();
		double z=calculateAverage();

		System.out.println("the average is" +z);
		System.out.println("the highest is" +getHighest());
		System.out.println("the lowest is" +getLowest());
	}
	/** Used to explain the concept of the method 
	 * 
	 */
	public static void getGrades() {
		
		for(int i=0;i<grades.length;i++) {
			System.out.println("Enter the grade" +(i+1));
			grades[i]= scanner.nextInt();
		}
	}
	
	public static int calculateSum() {
		int a=0;
		for(int i =0;i<grades.length;i++) {
			
			a=a+grades[i];
		
		}	return a;}
	
   public static double calculateAverage() {
	return (calculateSum()/grades.length);
}
	
   public static int getHighest() {
	   int highest = grades[0];
	   for(int grade: grades) {
		   if(grade >highest) {
			   highest =grade;
		   }
		   }return highest;}
   
   public static int getLowest(){
	   int lowest=grades[0];
	   for(int grade: grades) {
		   if(grade<lowest) {
			   lowest=grade;
		   }
	   }
	   return lowest;
   }
   
   
   
}
