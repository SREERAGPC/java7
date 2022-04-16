package assignment11;

public class Functions {
	int i,j,temp;
void Small(int arr[]) {
	for(i=0;i<arr.length;i++) {
		for(j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
System.out.println("The largest number in array is "+arr[0]);
}
void Sum(int arr[]) {
	int sum=0;
	for(i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	System.out.println("Sum of all elements in array = "+sum);
}
void Count(int arr[]) {
	int length=arr.length;
	System.out.println("The length of array is "+length);
}
void Large(int arr[]) {
	for(i=0;i<arr.length;i++) {
		for(j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println("The largest number in array is "+arr[0]);
	}

}
