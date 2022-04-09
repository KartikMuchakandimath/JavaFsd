package oop.arrays;

import java.util.Arrays;
import java.util.Collections;

public class Revarray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,56,7};
		System.out.println(Arrays.toString(arr));
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		
//		Collections.reverse(Arrays.asList(arr));
//		System.out.println(Arrays.asList(arr));
	}

}
