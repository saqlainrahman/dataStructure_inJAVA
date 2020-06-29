package dataStructures;

public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i=0; i<n-1; i++) {         //or n
			for(int j=0;j<n-i-1;j++ ) {    //or n-1
				if(arr[j]>arr[j+1]) {
					int temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void show(int[] arr) {
		for(int i: arr)
			System.out.print(i+" ");
		System.out.println("");
	}
	public static void main(String[] args) {
		int[] arr= {3,2,4,12,43,3,5,9,4};
		bubbleSort(arr);
		show(arr);

	}

}
