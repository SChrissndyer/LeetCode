package org.example.leetcoderunner.leet21;

public class Runner {
    public static void main(String[] args){
        ListNode a= new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode b= new ListNode(1,new ListNode(3,new ListNode(4)));
        Solution solution = new Solution();
        ListNode fin= solution.mergeTwoLists(a,b);
        while (fin.next!=null){
            System.out.println(fin.val+", ");
            fin=fin.next;
        }
        System.out.println(fin.val+", ");

    }
}
