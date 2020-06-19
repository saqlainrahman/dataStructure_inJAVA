package dataStructures;

public class MergeSort {
	public void mergeSort(int[] list, int l, int h) {
		if(l<h) {
			int m = (l+h)/2;
			mergeSort(list,l,m);
			mergeSort(list,m+1,h);
			merge(list,l,m,h);
		}
	}
	private void merge(int[] list, int l, int m, int h) {
		int n1=m-l+1;
		int n2=h-m;
		int[] L=new int[n1];
		int[] R=new int[n2];
		for(int i=0;i<n1;i++) {
			L[i]=list[l+i];
		}
		for(int j=0;j<n2;j++) {
			R[j]=list[m+1+j];
		}
		int i=0, j=0, k=l;
		while(i<n1 && j<n2) {
			if(L[i]<R[j]) {
				list[k++]=L[i++];
			}
			else {
				list[k++]=R[j++];
			}
		}
		while(i<n1) {
			list[k++]=L[i++];
		}
		while(j<n2) {
			list[k++]=R[j++];
		}
	}
	public void printSort(int[] list) {
		for(int i :list) {
			System.out.print(i+" ");
		}
	}
}
