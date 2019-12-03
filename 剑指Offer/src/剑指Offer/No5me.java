package ½£Ö¸Offer;

import java.io.*;
import java.util.Scanner;

public class No5me {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*StringBuffer sb = new StringBuffer();
		StringBuffer str = sb.append(scanner.next());		
		String str1 = replacePlace(str);
		System.out.println(str1);*/
		
		
		String str = sc.nextLine();
		StringBuffer bf=new StringBuffer(str);
		String result=replacePlace(bf);
		System.out.println(result);

		
		
	}
	public static String replacePlace(StringBuffer str){
		int p1 = str.length() - 1;
		
		for (int i = 0; i <= p1; i++) {
			if(str.charAt(i) == ' '){
				str.append("  ");
			}
		}	
		int p2 = str.length() - 1;
		while(p1 >= 0 && p2 > p1){
			char c = str.charAt(p1--);
			if(c == ' '){
				str.setCharAt(p2--, '0');
				str.setCharAt(p2--, '2');
				str.setCharAt(p2--, '%');
			} else {
				str.setCharAt(p2--, c);
			}
		}
		return str.toString();
		
	}
}
