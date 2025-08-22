package packageone;

public class DoublyLL {
    public class ListNode{
        int data;
        ListNode next;
        ListNode prev;
        public ListNode(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static ListNode head;
    public static ListNode tail;
    public static int size;

    public void addFirst(int data){
        ListNode newNode = new ListNode(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public int removeFirst(){
        if(head == null){
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev.next = null;
        head.prev = null;
        size--;
        return val;
    }

    public void print(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse(){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

//        dll.print();
//        System.out.println(dll.size);
//        System.out.println(dll.removeFirst());
//        dll.print();
//        System.out.println(dll.size);

        dll.print();
        dll.reverse();
        dll.print();
    }
}
