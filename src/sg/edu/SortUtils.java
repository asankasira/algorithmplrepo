package sg.edu;

import java.util.Arrays;
import java.util.Random;

import org.apache.commons.lang3.ArrayUtils;

public class SortUtils {

	public static int[] getRandomIntArray() {
		
		int[] A = new int[100];

		Random rand = new Random();

		for (int i = 0; i < A.length; i++) {

			int num = rand.nextInt(256);
			while (num < 1) {
				num = rand.nextInt(256);
			}
			A[i] = num;
		}

		System.out.println(Arrays.asList(ArrayUtils.toObject(A)));

		return A;
	}
	
	public static int[] getRandomIntArray(int size) {

		if(size <= 0){
			System.err.println("Invalid Array Size...! ");
			System.exit(0);
		}
		
		int[] A = new int[size];

		Random rand = new Random();

		for (int i = 0; i < A.length; i++) {

			int num = rand.nextInt(100);
			while (num < 1) {
				num = rand.nextInt(100);
			}
			A[i] = num;
		}

//		System.out.println(Arrays.asList(ArrayUtils.toObject(A)) + " ---> size: "+size);

		return A;
	}
}
