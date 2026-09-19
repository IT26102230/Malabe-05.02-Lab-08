public class IT26102230Lab8Q2{
	
	public static void main(String[] args){
		
		int A[] = {10, 20, 30, 40, 50};
		int B[] = {34, 67, 12, 89, 12};
		
		int C[] = new int[5];
		
		System.out.println("A Array Contents:");
		
		for(int counter = 0; counter < A.length; counter++){
			
			System.out.print(A[counter] + " ");
			
		}
		
		System.out.println("\n\nB Array Contents:");
		
		for(int counter = 0; counter < B.length; counter++){
			
			System.out.print(B[counter] + " ");
			
		}
		
		System.out.println("\n\nC Array Contents (A + B):");
		
		for(int counter = 0; counter < C.length; counter++){
			
			C[counter] = A[counter] + B[counter];
			
		}
		
		for(int counter = 0; counter < C.length; counter++){
			
			System.out.print(C[counter] + " ");
			
		}
		
	}
}