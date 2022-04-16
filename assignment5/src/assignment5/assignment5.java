package assignment5;

import java.util.Scanner;

public class assignment5 {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a word to get its subset");
	String word=input.nextLine();
	for(int i=0;i<word.length();i++) {
		for(int j=i+1;j<word.length()+1;j++) {
			System.out.println(word.substring(i, j));
		}
	}
	
}

}
