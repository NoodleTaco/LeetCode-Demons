/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList = new ListNode();

        ListNode ptr = mergedList;

        while (list1 != null && list2 != null)
        {
            ListNode newNode = new ListNode();

            if(list1.val <= list2.val)
            {
                newNode.val = list1.val;
                ptr.next = newNode;
                ptr = ptr.next;
                list1 = list1.next;
            }
            else 
            {
                newNode.val = list2.val;
                ptr.next = newNode;
                ptr = ptr.next;     
                list2 = list2.next;    
            }
        }

        if (list1 == null && (list2 != null))
        {
            
            while (list2!= null)
            {
                ListNode newNode = new ListNode();
                newNode.val = list2.val;
                ptr.next = newNode;
                ptr = ptr.next;     
                list2 = list2.next;                  
            }
        }

        if (list2 == null && (list1 != null))
        {
            
            while (list1!= null)
            {
                ListNode newNode = new ListNode();
                newNode.val = list1.val;
                ptr.next = newNode;
                ptr = ptr.next;     
                list1 = list1.next;                  
            }
        }

    mergedList = mergedList.next;
    return mergedList;
    
    }


}