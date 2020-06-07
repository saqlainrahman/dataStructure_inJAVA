package linkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.insert(3);
		list.insert(6);
		list.insert(8);
		list.insertAtStart(7);
		list.insertAt(0, 10);
		list.deleteAt(2);
		list.show();
	}

}
