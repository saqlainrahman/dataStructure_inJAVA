package dataStructures;

public class InsertionSort {
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for(int i=1; i<n ; i++) {
			int key= arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]= arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
	public static void show(int[] arr) {
		for(int i: arr)
			System.out.print(i+" ");
		System.out.println("");
	}
	public static void main(String[] args) {
		int[] arr= {2,5,3,1,4,67,45,12};
		insertionSort(arr);
		show(arr);
	}

}
