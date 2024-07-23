//This is for Singly LinkList

class Node{
	int data;
	Node next;
	public Node(int data){
		this.data = data;
		this.next =null;
	}
	public void printData(Node head){
		if(head==null){
			System.out.println("List is Empty");
		}
		else{
			Node temp= head;
			while(temp!=null){
					System.out.print("\t====>"+temp.data);
					temp=temp.next;
			}
		}
	}
	public Node addAtStart(Node head,int d){
		Node newNode = new Node(d);
		newNode.next=head;
		head=newNode;
		return head;
	}
	public static void main(String []args){
		Node first =new Node(10);
		Node second =new Node(20);	
		Node third =new Node(30);
		Node four =new Node(40);
		Node head =first;
		head.next=second;
		head.next.next=third;
		head.next.next.next=four;
		head.printData(head);
		head=head.addAtStart(head,5);
		System.out.println("\nAfter adding new node :-");
		head.printData(head);
	}
}