import java.util.Scanner;

public class Double_Val {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a,b,c");
		double a=s.nextDouble();
		double b=s.nextDouble();
		double c=s.nextDouble();
		double d=s.nextDouble();
		double e=((a*b-b*b)/(c-d));
		System.out.println(e);
		s.close();
	}
}
