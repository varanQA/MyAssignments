package week1.day1;

public class RStringExample {

	public static void main(String[] args) {

		String name = "Amazon devalopment centre, Chennai";
		String lowerCase = name.toLowerCase();
		String[] words = lowerCase.split(" ");
		for (int i = words.length-1; i >= 0; i--) {
			System.out.print(words[i]+ " ");

		}



	}

}
