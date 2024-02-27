public class lcsf07 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode middleNode(ListNode head){
        ListNode n = head;
        int count = 1;
        while (n.next!=null){
            n = n.next;
            count++;
        }
        count = count/2;
        n = head;
        for (int i=0;i<count;i++){
            n = n.next;
        }
        return n;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode buf = head;
        ListNode nn = null;
        while(buf.next!=null){
            nn = buf;
            for(int i=0;i<n;i++){
                nn = nn.next;
            }
            if(nn==null) return buf.next;
            if(nn.next==null) break;
            buf = buf.next;
        }
        if(buf.next==null) return null;
        nn = buf.next.next;
        buf.next = null;
        buf.next = nn;
        return head;
    }
}
