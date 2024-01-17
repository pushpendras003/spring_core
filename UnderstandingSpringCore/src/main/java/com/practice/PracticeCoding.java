package com.practice;

import java.util.HashMap;

class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }

public class PracticeCoding {
	public static  ListNode addTwoNumbers(ListNode r1, ListNode r2) {
		System.out.println("inside two");
		ListNode ans=new ListNode();
		ListNode res=ans;

		ListNode l1=reverseList(r1);
		ListNode l2=reverseList(r2);
		int carry=0;
		while(l1 !=null && l2!=null) {
			int i=l1.val;
			int j=l2.val;
			carry+=j+i;
			int t;
			if(carry>9) {
				t=carry-9;
				carry-=9;
			}
			else {
				t=carry;
				carry=0;
			}
			ans=new ListNode(t);
			ans=ans.next;
			l1=l1.next;
			l2=l2.next;
				
			
			
		}
		return res;
    }
	public static ListNode reverseList(ListNode l){
		System.out.println("inside reverse");
		ListNode prev=new ListNode(0);
		ListNode r=prev;
		while(l!=null) {
			ListNode curr=l.next;
			l.next=prev;
			prev=l;
			l=curr;
			
		}
		r=null;
		return prev;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("started");
		ListNode list1=new ListNode();
		ListNode list2=new ListNode();
		ListNode t1=list1;
		ListNode t2=list2;
		int[] arr1= {2,4,3};
		int[] arr2= {5,6,4};
		for(int i=0;i<3;i++) {
			list1=new ListNode(arr1[i]);
			list1=list1.next;
		}
		for(int i=0;i<3;i++) {
			list2=new ListNode(arr2[i]);
			list2=list2.next;
		}
		System.out.println("started");
		ListNode temp=addTwoNumbers(t1,t2);
		System.out.println("ended");
		while(temp!=null) {
			System.out.println(temp.val);
			temp=temp.next;
		}

	}

}
