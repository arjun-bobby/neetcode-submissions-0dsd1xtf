class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode();

        // tail pointer
        ListNode tail = dummy;

        // compare both lists
        while(list1 != null && list2 != null){

            // smaller node from list1
            if(list1.val < list2.val){

                tail.next = list1;

                list1 = list1.next;
            }

            // smaller node from list2
            else{

                tail.next = list2;

                list2 = list2.next;
            }

            // move tail forward
            tail = tail.next;
        }

        // attach remaining nodes
        if(list1 != null){
            tail.next = list1;
        }

        if(list2 != null){
            tail.next = list2;
        }

        // merged list starts after dummy
        return dummy.next;
    }
}