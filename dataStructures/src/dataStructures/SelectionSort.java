package dataStructures;

public class SelectionSort {
	public static void selectionSort(int[] arr) {
		int n= arr.length;
		for(int i=0; i<n-1; i++) {
			int min_idx=i;
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[min_idx]) {
					int temp = arr[min_idx];
					arr[min_idx]=arr[j];
					arr[j]=temp;
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
		int[] arr= {2,5,3,1,4,76,6,3};
		selectionSort(arr);
		show(arr);
	}

}


