package p1;

public class LinkedList {
	
	private Node head;
	private int listCount;

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(2);
		l.add(1);
		l.add(3);
		l.add(5);
		l.add(6);
		
		System.out.println(l);
		System.out.println(l.listCount);
		System.out.println(l.get(6));

	}

	
	LinkedList()
	{
		head = new Node(null);
		listCount = 0;
	}
	
	void add(Object data)
	{
		Node temp = new Node(data);
		
		Node cur = head;
		
		while(cur.getNext() != null)
		{
			cur = cur.getNext();
		}
		cur.setNext(temp);
		listCount++;
		
	}
	
	Object get(int index)
	{
		Node node = head.getNext();
		if(index > listCount)
			return null;
		else
		{
			int no = 1;
			while(no < index)
			{
				node = node.getNext();
				no++;
			}
			return node.getData();
		}
	}
	
/*	public String toString()
	{
		Node current = head.getNext();
		String output = "";
		while(current != null)
		{
			output += "[" + current.getData().toString() + "]";
			current = current.getNext();
		}
		return output;
	}*/
	
	public String toString()
	{
		String str = "";
		Node cur = head.getNext();
		while(cur != null)
		{
			str+="["+cur.getData()+"]";
			cur = cur.getNext();
		}
		return str;
	}
	
	class Node
	{
		Node next;
		
		Object data;
		
		Node(Object data)
		{
			this.data = data;
		}
		
		Node(Object data, Node next)
		{
			this.next = next;
			this.data = data;
		}
		
		public Node getNext(){
			return next;
		}
		
		public Object getData(){
			return data;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public void setData(Object data) {
			this.data = data;
		}	
		
		
	}
	
}
