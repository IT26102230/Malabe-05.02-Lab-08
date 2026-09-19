import java.util.Scanner;

public class IT26102230Lab8Q1A{
	
	public static void main(String[] args){
		
		int myArray[] = new int[5];
		
		Scanner lookfor = new Scanner(System.in);
		
		System.out.println("Enter 5 Number:");
		
		for(int counter = 0; counter < myArray.length; counter++){
			
			System.out.print("Enter Number " + (counter+1) + ":");
			myArray[counter] = lookfor.nextInt();
			
		}
		
		System.out.println("\nArray in Reverse Order:");
		
		for(int counter = myArray.length - 1; counter >= 0; counter--){
			
			System.out.print(myArray[counter] + " ");
			
		}
		
		lookfor.close();
		System.out.println();
		
	}
}