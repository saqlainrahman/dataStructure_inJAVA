package dataStructures;

public class QuickSort {
	private void swap(int i, int j) {
		int temp=j;
		j=i;
		i=temp;
	}
	private int partition(int[] arr, int l, int h) {
		int pivot= arr[l];
		
		int i=l,j=h;
		while(i<j) {
			while(arr[i]<=pivot) {
				i++;
			}
			while(arr[j]>pivot) {
				j--;
			}
			if(i<j)
				swap(arr[i],arr[j]);
		}
		swap(pivot, arr[j]);
		return j;
	}
	public void quickSort(int[] arr, int l, int h) {
		if(l<h) {	
			int j = partition(arr,l, h);
			quickSort(arr, l, j);
			quickSort(arr,j+1,h);
			
		}	
	}
	public void show(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
