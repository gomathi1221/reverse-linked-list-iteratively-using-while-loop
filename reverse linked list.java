class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode newnode;
        ListNode prev=null;
        while(curr!=null){
            newnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=newnode;
        }
        return prev;
    }
}