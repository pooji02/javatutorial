package sample;

public class poojaarray {

	public static void main(String[] args) {
		
		int[] array1= {10,11,12}; //integer
		String[] array2= {"pooja","sirisha","cyril"}; //string
		//int array1[]=new int[3];
		
		System.out.println("Second name is " +array2[1]);//prints sirisha
		array2[1]="prashanth";//changing array value
		System.out.println("Second name is " +array2[1]);//prints prashanth
		
		for(int i=0;i<array2.length;i++)//printing a specific array
		{
			System.out.println("The contents of the array are" +array2[i]);
		}
		
		int[][] arraymulti= {{10,11,58},{66,96,78}};//multi dimensional integer array
		
		System.out.println("two dimen is " +arraymulti[0][2]);//printing a specific array
		
		for(int i=0;i<arraymulti.length;i++) //printing all elements of integer array
		{
			for(int a=0;a<arraymulti[i].length;a++) {
				System.out.println("Print is" +arraymulti[i][a]);
			}
		}
		String[][] arraystr1= {{"af","dg"},{"rrr"}};//multi dimensional string array
		
		for(int i=0;i<arraystr1.length;i++) //printing all elements of string array
		{
			for(int j=0;j<arraystr1[i].length;j++) {
				System.out.println("string is" + arraystr1[i][j]);
			}
		}
		
		char[] arraychar= {'a'}; //char array
		System.out.println("character is" +arraychar[0]);	
	}
}
