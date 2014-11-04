package sg.edu;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

/**
 * 
 * @author Asanka Siriwardena
 *
 */

public class ArrayPartition {

	public static void main(String[] args) {
		
		long startUp = System.nanoTime();

		int[] A = SortUtils.getRandomIntArray(100_000_000);
		final int pivot = A[0];
		System.out.println("Pivot Element is: " + pivot);
		
		int i = 1;
		int j = A.length-1;
		int count = 0;
		
		while (i <= j){
			
			if(A[i] <= pivot){
				i++;
				if(A[j] > pivot)
					j--;
			}
			else{
				
				if(A[j] <= pivot){
					
					int temp = A[i];
					A[i] = A[j];
					A[j] = temp;
					i++;			
				}
				j--;
			}	
			
			count++;
		}
		
		A[0] = A[j];
		A[j] = pivot;

//		System.out.println(Arrays.asList(ArrayUtils.toObject(A)));
		System.out.println("Number of Executions: "+ count);
		System.out.println("\nMy Algo: " + (System.nanoTime() - startUp));
	}
}
