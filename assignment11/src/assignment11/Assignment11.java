package assignment11;

import java.util.Scanner;

public class Assignment11 {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the size for array :");
	int size=input.nextInt();
	System.out.println("Enter your choice\na.Smallest number"
			+ "\nb.Largest number"
			+ "\nc.Sum of all elements"
			+ "\nd.Number of elements");
	char choice=input.next().charAt(0);
	int arr[]=new int [size];
	System.out.println("Enter the values for array :");
	Functions obj=new Functions();
	int i,j;
	for(i=0;i<size;i++) {
		arr[i]=input.nextInt();
	}
	switch(choice) {
	case 'a':
		obj.Small(arr);
		break;
	case 'b':
		obj.Large(arr);
		break;
	case 'c':
		obj.Sum(arr);
		break;
	case 'd':
		obj.Count(arr);
		break;
	default:
		System.out.println("Please enter a valid input :");
		break;
	}
}
}


