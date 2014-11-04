package sg.edu;

import java.util.Arrays;
import java.util.Random;

import org.apache.commons.lang3.ArrayUtils;

/**
 * 
 * @author Asanka Siriwardena
 *
 */

public class CountingSort {

	public static void main(String[] args) {
	   		
		long start = System.nanoTime();
		
		CountingSort cs = new CountingSort();
		cs.sortOnCounting();	
		
		System.out.println("\nCounting Sort Elapsed Time (ns): " + (System.nanoTime() - start));
	}
	
	
	public void sortOnCounting(){
		
		int[] A = SortUtils.getRandomIntArray();
		
		if( A == null || A.length < 1){
			System.err.println("Array should not be Empty. ");
		}
		
		
		int maxVal = A[0];
		
		for (int i=1; i < A.length; i++) {
			
			if(A[i] > maxVal)
				maxVal = A[i];
		}

		int[] C = new int[maxVal + 1];
		
		for (int i=0; i < A.length; i++) {
			
			int count = C[A[i]];
			C[A[i]] = ++count;
		}
		
//		System.out.println(Arrays.asList(ArrayUtils.toObject(C)));
		
		for (int i=2; i < C.length; i++) {
			
			C[i] = C[i] + C[i -1];
		}
		
//		System.out.println(Arrays.asList(ArrayUtils.toObject(C)));
		
		int[] B = new int[A.length];
		
		for (int j=0; j<A.length; j++) {
			
			int index = C[A[j]];
			if(index > 0){
				B[--index] = A[j];
				C[A[j]] = index;
			}
		}
		
		Integer[] sortedArr = ArrayUtils.toObject(B);
		System.out.println(Arrays.asList(sortedArr));
	}
}
