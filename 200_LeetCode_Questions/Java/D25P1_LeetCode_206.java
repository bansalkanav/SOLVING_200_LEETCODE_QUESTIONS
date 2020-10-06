/**
 * leetcode link : https://leetcode.com/problems/reverse-linked-list
 * Runtime : 0ms faster than 100% submissions
 * Memory : 39MB better than 92%
 */


// Definition for singly-linked list.

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode reverseList(ListNode head) 
    {
        if(head == null || head.next == null)
            return head;
        
        ListNode nextNode = head.next;
        head.next = null;
        return reverse(head, nextNode);
    }
    
    public ListNode reverse(ListNode prev, ListNode current)
    {
        if(current != null)
        {
            ListNode nextNode = current.next;
            current.next = prev;
            return reverse(current, nextNode);   
        }   
        return prev;
    }
}