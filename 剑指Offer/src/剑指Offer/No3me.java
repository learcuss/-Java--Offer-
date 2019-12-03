package 剑指Offer;
/*
 * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的，
 * 也不知道每个数字重复几次。
 * 请找出数组中任意一个重复的数字。
Input:
{2, 3, 1, 0, 2, 5}

Output:
2
 */
import java.util.Scanner;

public class No3me {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数组的长度:");
		int N = sc.nextInt();
		int arr1[] = new int[N];
		int arr2[] = new int[N];
		for (int i = 0; i < arr1.length; i++) {			
			arr1[i] = sc.nextInt();
			arr2[i] = 1;
		}
		for (int i = 0; i < arr2.length; i++) {
			for (int j = i+1; j < arr2.length; j++) {
				if(arr1[i]==arr1[j]){
					arr2[i]++; 
				}
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			if(arr2[i]>1){
				System.out.println(arr2[i]);
			}
		}	
	}
}
