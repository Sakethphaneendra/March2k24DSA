package Arrays;
//Given an array with all distinct elements, find the largest three elements.
import java.util.*;
public class Three_Largest_Numbers {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int big1,big2,big3;
		
		int len = 10;
		int[] arr = array_val(len); 
		
		System.out.println(Arrays.toString(arr));
		big1= big2 = big3 = Integer.MIN_VALUE;		
		for(int i=0;i<len;i++) {
			if(arr[i]>big3) {
				big1=big2;
				big2=big3;
				big3=arr[i];
			}
			else if(arr[i] > big2){
				big1=big2;
				big2=arr[i];
			}
			else if(arr[i]>big1) {
				big1=arr[i];
			}
			
		}
		
		System.out.println(big1 + ", "+ big2 + ", "+big3);
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
