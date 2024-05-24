import java.util.Scanner;

public class CompareTwoNumbers {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		if(a!=b) {
			System.out.println(a+"!="+b);
		}
		if(a<b) {
			System.out.println(a+"<"+b);
		}
		if(a<=b) {
			System.out.println(a+"<="+b);
		}
	}