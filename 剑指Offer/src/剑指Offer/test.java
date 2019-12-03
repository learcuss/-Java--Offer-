package ½£Ö¸Offer;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		Scanner scanner = new Scanner(System.in);
		StringBuffer str = sb.append(scanner.next());		
	
		int p1 = str.length();
		for (int i = 0; i < p1; i++) {
			if(str.charAt(i) == ' '){
				str.append("   ");
			}
			System.out.println(str.charAt(i));
		}
		//System.out.println(str);
		
		
	}	
	
}
