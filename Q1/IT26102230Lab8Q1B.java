import java.util.Scanner;

public class IT26102230Lab8Q1B{
	
	public static void main(String[] args){
		
		int myArray[] = new int[5];
		int evenArray[] = new int[5];
		
		Scanner lookfor = new Scanner(System.in);
		
		System.out.println("Enter 5 Number:");
		
		for(int counter = 0; counter < myArray.length; counter++){
			
			System.out.print("Enter Number " + (counter+1) + ":");
			myArray[counter] = lookfor.nextInt();
			
		}
		
		System.out.println("\nmyArray Content:");
		
		for(int counter = 0; counter < myArray.length; counter++){
			
			System.out.print(myArray[counter] + " ");
			
		}
		
		int evenCounter = 0;
		
		for(int counter = 0; counter < myArray.length; counter++){
			
			if(myArray[counter]%2 == 0){
				
				evenArray[evenCounter] = myArray[counter];
				evenCounter++;
				
			}
			
		}
		
		System.out.println("\n\nevenArray Content:");
		
		for(int counter = 0; counter < evenArray.length; counter++){
			
			System.out.print(evenArray[counter] + " ");
			
		}
			
		
		lookfor.close();
		System.out.println();
		
	}
}