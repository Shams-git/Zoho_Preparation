package zoho;

import java.util.Scanner;

public class RevStringWithDotSeperated_Proper {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter words that contains N :");
	String str=s.nextLine();
	s.close();
	System.out.println(revWords(str));
	}
	public static void reverse(int start,int end,char[] c) {
		char temp;
		while(start<end) {
			temp=c[start];
			c[start]=c[end];
			c[end]=temp;
			start++;
			end--;
		}
	}
	public static String revWords(String s) {
		char[] c=s.toCharArray();
		int start=0;
		int end=0;
		reverse(0, c.length-1, c);
		while(end<c.length) {
			if(c[end]!='.') {
				end++;
			}
			else {
				reverse(start, end-1, c);
				start=end+1;
				end=start;
			}
		}
		reverse(start, end-1, c);
		return new String(c);
	}
}

