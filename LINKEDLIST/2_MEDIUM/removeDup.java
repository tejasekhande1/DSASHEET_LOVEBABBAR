import java.util.*;
class Solution{
	Scanner sc = new Scanner(System.in);
	static class Node{
		int val;
		Node next;
		Node(int val){
			this.val = val;
			this.next = null;
		}
	}
	
	static Node head = null;

	public void addNode(){
		System.out.println("Enter Date : ");
		int val = sc.nextInt();
		Node newNode = new Node(val);
		if(head == null){
			head = newNode;
		}else{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public void printNode(){
		Node temp = head;
		while(temp != null){
			if(temp.next != null){
				System.out.print("|"+temp.val+"|->");
			}else{
				System.out.println("|"+temp.val+"|");
			}
			temp = temp.next;
		}
	}

	public void removeDup(){
		Node temp = head;
		Node prev = null;
		int flag = 0;
		while(temp != null){
			while(temp.next != null && temp.val == temp.next.val){
				flag = 1;
				temp.next = temp.next.next;
			}

			if(flag == 1){
				if(prev == null)
				       	head = temp.next;
				else
					prev.next = temp.next;	
				flag = 0;
			}else{
				prev = temp;
			}

			temp = temp.next;
		}
	}

	public static void main(String[]args){
	
		Solution s = new Solution();
	
		for(int i=1 ; i<=7 ; i++){
			s.addNode();
		}

		s.printNode();
		s.removeDup();
		s.printNode();
	}
}
