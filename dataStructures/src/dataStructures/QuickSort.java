package dataStructures;

public class QuickSort {
	
	private static int partition(int[] arr, int l, int h) {
		int pivot= arr[l];
		
		int i=l,j=h;
		while(i<j) {
			while(arr[i]<=pivot) {
				i++;
			}
			while(arr[j]>pivot) {
				j--;
			}
			if(i<j) {
				int temp= arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp= arr[j];
		arr[j]=arr[l];
		arr[l]=temp;
		return j;
		
		
		//alternative- high as pivot
		
//		int pivot= arr[h];
//		int i= l-1;
//		for(int j=l; j<h;j++) {
//			if(arr[j]<pivot) {
//				i++;
//				int temp = arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//			}
//		}
//		int temp=arr[i+1];
//		arr[i+1]=arr[h];
//		arr[h]=temp;
//		return i+1;
	}
	public static void quickSort(int[] arr, int l, int h) {
		if(l<h) {	
			int j = partition(arr,l, h);
			quickSort(arr, l, j-1);
			quickSort(arr,j+1,h);
			
		}	
	}
	public static void show(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int arr[] = {2,5,3,1,4,6,56,3,58};
		quickSort(arr,0,arr.length-1);
		show(arr);
	}
}
