package Arrays;
//Given an array of integers, our task is to write a program that efficiently finds the second-largest element present in the array. 

import java.util.*;
public class secound_largest_element {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int len = 5;
	
	int arr[] = array_val(len);
	System.out.print("Enter Secound Largest Number is ");
	 Arrays.sort(arr);
	 for(int i= len-1;i>=0;i--) {
			if(arr[i]> arr[i-1]) {
				System.out.println(arr[i-1]);
				break;
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
