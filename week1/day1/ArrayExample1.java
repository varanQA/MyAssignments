package week1.day1;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayExample1 {

	public static void main(String[] args) {

		int[] values = {2,5,7,7,5,9,2,3};
		Arrays.sort(values);

		for (int i = 0; i < values.length; i++) {
			for (int j = i+1; j < values.length; j++) {

				if (values[i]==values[j]) {
					System.out.println(values[i]);	
					
				}

			}


		}




	}

}
