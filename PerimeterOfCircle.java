import java.util.Scanner;

public class PerimeterOfCircle {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius : ");
		double r=s.nextDouble();
		System.out.println(perimeterOfCircle(r));
	}
	public static double perimeterOfCircle(double r) {
		double pi=3.14;
		return 2.0*pi*r;
	}
}