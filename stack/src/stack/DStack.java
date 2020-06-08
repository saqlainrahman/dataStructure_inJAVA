package stack;

public class DStack {
	int capacity=2;
	int top=0;
	int stack[]= new int[capacity];
	public void push(int data) {
			if(top==capacity)
				expand();
			stack[top]=data;
			top++;
				
	}
	public void show() {
		for(int i:stack) {
			System.out.print(i+" ");
		}
		System.out.println("");
	}
	public int pop() {
		int data=0;
		
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}
		else {
			top--;
			data= stack[top];
			stack[top]=0;			
			shrink();
		}
		return data;
	}
	public boolean isEmpty() {
		return top<=0;
	}
	public int peek() {
		return stack[top-1];
	}
	public int size() {
		return top;
	}
	private void expand() {
		capacity*=2;
		int newStack[]= new int[capacity];
		for(int i=0;i<size();i++) {
			newStack[i]=stack[i];
		}
		stack=newStack;
	}
	private void shrink() {
		if(size()<=capacity/4) {
			capacity=capacity/2;
			int newStack[]= new int[capacity];
			for(int i=0; i<size();i++) {
				newStack[i]=stack[i];				
			}
			stack=newStack;
		}
	}
}

