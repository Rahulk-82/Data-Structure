class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode temp=head;
        Map<Integer,Boolean> map=new HashMap<>();
        map.put(head.val,true);
        while(head.next!=null){
            if(map.containsKey(head.next.val)){
                head.next=head.next.next;
                System.out.println(head.val);
            }
            else{
                map.put(head.next.val,true);
                head=head.next;
            }
        }
        return temp;
    }
}