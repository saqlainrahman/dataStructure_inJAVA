package queue;

public class Main {

	public static void main(String[] args) {
		Queue q=new Queue();
		q.enQueue(2);
		q.enQueue(5);
		q.enQueue(6);
		q.enQueue(1);
		q.enQueue(7);
		//.enQueue(5);
		q.deQueue();
		q.enQueue(89);
		q.show();
		System.out.println(q.getSize());
		
	}

}
