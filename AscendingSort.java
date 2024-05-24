import java.util.Scanner;

public class AscendingSort {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of array : ");
	int n=s.nextInt();
	int arr[]=new int[n];
	System.out.print("Enter the values of array : ");
	for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();
	}
	s.close();
	for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+",");
	}
}
}