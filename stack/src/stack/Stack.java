package stack;

public class Stack {
	int top=0;
	int stack[]= new int[5];
	public void push(int data) {
		if(top==5) {
			System.out.println("Stack is Full");
		}
		else {
			stack[top]=data;
			top++;
		}		
	}
	public void show() {
		for(int i:stack) {
			System.out.print(i+" ");
		}
		System.out.println("");
	}
	public void pop() {
		int data;
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}
		else {
			top--;
			data= stack[top];
			stack[top]=0;			
			System.out.println(data);
		}
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
}
