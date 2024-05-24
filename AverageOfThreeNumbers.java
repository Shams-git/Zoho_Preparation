import java.util.Scanner;

public class AverageOfThreeNumbers {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a,b,c");
		float a=s.nextInt();
		float b=s.nextInt();
		float c=s.nextInt();
		System.out.println(avg3Num(a, b, c));
	}
	public static float avg3Num(float a, float b,float c) {
		float n=a+b+c/3;
		return n;
	}