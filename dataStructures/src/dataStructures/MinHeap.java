package dataStructures;

public class MinHeap {
	private int[] heap;
	private int maxsize;
	private int size;
	public MinHeap(int maxsize) {
		this.maxsize=maxsize;
		heap=new int[this.maxsize+1];
		heap[0]=Integer.MIN_VALUE;
		this.maxsize=0;
	}
	private int parent(int pos) {
		return pos/2;
	}
	private int leftChild(int pos) {
		return 2*pos;
	}
	private int rightChild(int pos) {
		return (2*pos)+1;
	}
	private void swap(int i, int j) {
		int temp=heap[i];
		heap[i]=heap[j];
		heap[j]=temp;
	}
	private boolean isleaf(int pos) {
		if(2*pos>size) {
			return true;
		}
		return false;
	}
	public void insert(int element) {
		heap[++size]=element;
		int current= size;
		while(heap[current]<heap[parent(current)]) {
			swap(current, parent(current));
			current=parent(current);
		}
		
	}
	private void minHeapify(int pos) {
		if(isleaf(pos))
			return;
		
		if(heap[pos]>heap[leftChild(pos)] || heap[pos]>heap[rightChild(pos)]) {
			if(heap[leftChild(pos)]<heap[rightChild(pos)]) {
				swap(pos,leftChild(pos));
				minHeapify(leftChild(pos));
			}
			else {
				swap(pos,rightChild(pos));
				minHeapify(rightChild(pos));
			}
		}
	}
	public int extractMin() {
		int i =heap[1];
		heap[1]=heap[size];
		minHeapify(1);
		heap[size]=0;
		size--;
		return i;
		
	}
	public void show() {
		for(int i=1; i<=size/2;i++) {
			System.out.println("parent="+heap[i]+" leftChild="+heap[leftChild(i)]+" rightChild="+heap[rightChild(i)]);
		}
	}
}
