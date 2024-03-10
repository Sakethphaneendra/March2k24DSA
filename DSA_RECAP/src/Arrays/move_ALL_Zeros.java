package Arrays;
//Given an array of random numbers, Push all the zero’s of a given array to the end
//of the array. For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0},
//it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}. The order of all other elements
//should be same. Expected time complexity is O(n) and extra space is O(1).

import java.util.*;

public class move_ALL_Zeros {

	public static void main(String[] args) {
		
		int len = 5,last =len-1,dummy=0;
		int[] arr = array_val(len); 
		 
		for(int i=0;i<len;i++) {
			if(arr[i]==0) {
//				Swap
				System.out.println(arr[last] +" And " +arr[i] );
				last--;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		

	}
	
	
	public static int[] array_val(int length) {
		Scanner in = new Scanner(System.in);
		int[] arr=new int[length];
		System.out.print("Enter Array of "+length +" Elements : ");
		for(int i=0;i<length;i++) {
			arr[i]=in.nextInt();
		}
		
		
		return arr;
	}

}
