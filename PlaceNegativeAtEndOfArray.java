public class PlaceNegativeAtEndOfArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n count of array :");
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		s.close();
	for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			if(arr[i]<0 && arr[j]>0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			else {
				continue;
			}
			}
		}
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+",");
	}
	}
}