package rincon.com.br.dataStructure.linkedList;

public class ListNode {
      public int val;
      public ListNode next;
      public ListNode() {
            this.val = 0;
            this.next = null;
      }
      public ListNode(int val) { this.val = val; }
      public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

      public int getVal() {
            return this.val;
      }
}
