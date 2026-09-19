import java.util.Scanner;

public class IT26102230Lab8Q4{
	
	public static void main(String[] args){
		
		int studentArray[] = new int[8];
		int searchID;
		boolean found = false;
		
		Scanner lookfor = new Scanner(System.in);
		
		for(int counter = 0; counter < studentArray.length; counter++){
			System.out.print("Enter Student ID for Student " + (counter + 1) + ": ");
			studentArray[counter] = lookfor.nextInt();
			
			if(studentArray[counter] <= 0){
				System.out.println("Error: Please Enter ONLY Positive Numbers");
				counter--;
				continue;
			}
		}
		
		System.out.print("\nEnter a Student ID to Search: ");
		searchID = lookfor.nextInt();
		
		for(int counter = 0; counter < studentArray.length; counter++){
			if(searchID == studentArray[counter]){
				found = true;
				break;
			}
		}
		
		if(found){
			System.out.println("\nStudent is Available");
		}
		else{
			System.out.println("\nStudent is Not Available");
		}
	}
	
}