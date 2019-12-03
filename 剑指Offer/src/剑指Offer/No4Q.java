package 剑指Offer;

import java.util.Scanner;

public class No4Q {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int[][] arr1 = {
	               {1,   4,  7, 11, 15},
	               {2,   5,  8, 12, 19},
	               {3,   6,  9, 16, 22},
	               {10, 13, 14, 17, 24},
	               {18, 21, 23, 26, 30}	               		
		};
		
		System.out.println("请输入要查询的数字:");
		int a = sc.nextInt();
		
		int col=arr1[0].length,row=arr1.length;
		int r=0,co=col-1;
		boolean te = false;
		
		while(co >= 0 && r <= row-1){
			if(arr1[r][co]==a){
				te=true;
				break;
			}else if(a < arr1[r][co]){
				co--;
			}else{
				r++;
			}
		}
		System.out.println(te);
	}	
}
