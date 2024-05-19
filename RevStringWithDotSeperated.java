import java.util.Scanner;

public class RevStringWithDotSeperated {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Words :");
	String words=s.next();
	s.close();
	System.out.println(revWords(words.toCharArray()));
	}
	public static void reverse(char []c,int start,int end) {
	char temp;
	while(start<=end) {
		temp=c[start];
		c[start]=c[end];
		c[end]=temp;
		start++;
		end--;
	}
	}
	public static String revWords(char[]s) {

		int start=0;
		for(int end=0;end<s.length-1;end++) {
			if(s[end]=='.') {
				reverse(s,start,end);
				start=end+1;
			}
		}
		reverse(s, start, s.length-1);
		reverse(s, 0, s.length-1);
		return new String(s);
	}
}