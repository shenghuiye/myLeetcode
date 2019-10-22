package com.syh.leetcode.simple;
/*
* 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
示例：
输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4
 */
class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int i){
        this.val = i;
    }
    public int val(){
        return val;
    }
    public ListNode add( int i){
        ListNode p = this;
        while(p.next!=null){
            p=p.next;
        }
        p.next=new ListNode(i);
        return this.next;
    }
}
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode list = new ListNode(0);
        ListNode p = list;
        while (l1!=null && l2!=null){
            if (l1.val<=l2.val){
                p.next=l1;
                p=p.next;
                l1= l1.next;
            }else {
                p.next=l2;
                p=p.next;
                l2=l2.next;
            }
        }
        if(l1==null){
            p.next=l2;
        }
        if(l2==null){
            p.next=l1;
        }
        return list.next;
    }

    public static void main(String[] args) {
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        ListNode list1 = new ListNode(0);
        list1.add(1);
        list1.add(2);
        list1=list1.add(4);

        ListNode list2 = new ListNode(0);
        list2.add(1);
        list2.add(3);
        list2=list2.add(4);

        ListNode r = mergeTwoLists.mergeTwoLists(list1,list2);
        while(r!=null){
            System.out.println(r.val);
            r=r.next;
        }
    }
}
