package mianshi;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head1 = new Node(1);
		Node head2 = new Node(1);
		head1.next = new Node(2);
		head2.next = new Node(3);
		Node tmp;
		tmp = head1.next;
		for(int i = 0; i < 5; i ++) {
			tmp.next = new Node(i + 3);
			tmp = tmp.next;
		}
		tmp = head2.next;
		for(int i = 0; i < 4; i ++) {
			tmp.next = new Node(i + 4);
			tmp = tmp.next;
		}
		Node res = fun(head1, head2);
		while(res != null) {
			System.out.println(res.val);
			res = res.next;
		}
	}
	
	public static Node fun(Node head1, Node head2) {
		if(head1 == null) return head2;
		if(head2 == null) return head1;
		Node list1 = head1;
		Node list2 = head2;
		Node res;
		Node tail;
		if(list1.val < list2.val) {
			res = new Node(list1.val);
			list1 = list1.next;
		}
		else {
			res = new Node(list2.val);
			list2 = list2.next;
		}
		tail = res;
		while(list2 != null && list1 != null) {
			if(list1.val < list2.val) {
				tail.next = new Node(list1.val);
				list1 = list1.next;
			}
			else {
				tail.next = new Node(list2.val);
				list2 = list2.next;
			}
			tail = tail.next;
		}
		while(list1 != null) {
			tail.next = new Node(list1.val);
			list1 = list1.next;
		}
		while(list2 != null) {
			tail.next = new Node(list2.val);
			list2 = list2.next;
		}
		return res;
	}

}

class Node {
	public int val;
	public Node next;
	Node(int val) {
		this.val = val;
	}
}