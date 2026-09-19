import java.util.Scanner;

public class IT26102230Lab8Q3{
	
	public static void main(String[] args){
		
		int size6Array[] = new int[6];
		int max;
		
		Scanner lookfor = new Scanner(System.in);
		
		for(int counter = 0; counter < size6Array.length; counter++){
			
			System.out.print("Enter a Positive Number (" + (counter + 1) + "/6): ");
			size6Array[counter] = lookfor.nextInt();
			
			if(size6Array[counter] <= 0){
				System.out.println("Error: Please Enter ONLY Positive Numbers");
				counter--;
				continue;
			}
			
		}
		
		System.out.println("\nArray Contents:");
		for(int counter = 0; counter < size6Array.length; counter++){
			System.out.print(size6Array[counter] + " ");
		}
		
		max = size6Array[0];
		for(int counter = 0; counter < size6Array.length; counter++){
			if(size6Array[counter] > max){
				max = size6Array[counter];
			}
		}
		
		System.out.println("\nThe Maximum Number Entered: " + max);
		
	}
}