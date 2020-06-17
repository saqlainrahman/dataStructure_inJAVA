package dataStructures;

import java.util.Arrays;

import java.util.Scanner;



public class BinarySearch {
	public static int binSearch(int[] input, int l, int h, int key) {
		int mid=(l+h)/2;
		if(key==input[mid])
			return key;
		
		else {
			if(key>input[mid])
				return binSearch(input, mid+1, h, key);
				
			if(key<input[mid])
				return binSearch(input,l, mid-1, key);
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int[] input= {1,3,5,6,8};
		in.close();
		
		Arrays.sort(input);
		System.out.println(binSearch(input, 0, input.length-1, n));
		
	}

}
