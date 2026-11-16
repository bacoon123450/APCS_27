/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int[] arr = new int[1001];
		int x = 0;
		int y = 3;
		while(x <1001){
			arr[x] = y;
			System.out.println(arr[x]);
			y = y +3;
			x ++;
		}
		int[] arr2 = new int[1001];
		int a = 0;
		int b = 1000;
		while(a < 1001){
			arr2[a] = b;
			System.out.println(arr2[a]);
			b = b - 1;
			a ++;
		}
	}
}
