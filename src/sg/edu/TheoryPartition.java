package sg.edu;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class TheoryPartition {

	public static void main(String[] args) {
		long startUp = System.nanoTime();

		int[] A = SortUtils.getRandomIntArray(100_000_000);
		final int pivot = A[0];
		System.out.println("Pivot Element is: " + pivot);

		int count = 0;
		
		int i = 0;
		
		for(int j=1; j<A.length; j++){
			
			if(A[j] <= pivot){
				i++;
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
			
			count++;
		}
		
		
		A[0] = A[i];
		A[i] = pivot;

//		System.out.println(Arrays.asList(ArrayUtils.toObject(A)));
		System.out.println("Number of Executions: "+ count);
		System.out.println("\nElasped Time: " + (System.nanoTime() - startUp));
	}

}
