package org.example.leetcoderunner.leet21;
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=new ListNode(0,null);
        ListNode t=head;
        while(list1!=null&&list2!=null){ // if both are not null then places them together
            if(list1.val<list2.val){
                head.next=list1;
                list1=list1.next;
                head=head.next;
            }
            else{
                head.next=list2;
                list2=list2.next;
                head=head.next;
            }
        }
        while(list1!=null){ // when one is null find which one to keep adding the remaining in or
            // if started with one null add the other that is not.
            head.next=list1;
            list1=list1.next;
            head=head.next;
        }
        while(list2!=null){
            head.next=list2;
            list2=list2.next;
            head=head.next;
        }
        return t.next;
    }
}
