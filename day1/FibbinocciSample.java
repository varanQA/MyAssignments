package week1.day1;

import org.apache.commons.math3.stat.descriptive.summary.Sum;

public class FibbinocciSample {

	public static void main(String[] args) {

		int firstNum = 0, secNum = 1, sum = 0;
		
		System.out.println(firstNum);
		System.out.println(secNum);
		
		for (int i = 0; i < 11; i++) {
			
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			
			System.out.println(sum);
			
			
			
		}
		
		
	}

}
