import java.util.Scanner;

public class CountOfChars {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char ch[]=str.toCharArray();
		int space=0;
		int number=0;
		int alpha=0;
		for(int i=0;i<str.length()-1;i++) {
			if(ch[i]==' ') {
				space++;
			}
			if(ch[i]>='0'&&ch[i]<='9') {
				number++;
			}
			if((ch[i]>='A'&&ch[i]<='z')||ch[i]>='a'&&ch[i]<='z') {
				alpha++;
			}
		}
		System.out.print("number is :"+number+" space is :"+space+" alphabets is :"+alpha );
	}
}
