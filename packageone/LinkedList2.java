package packageone;

public class LinkedList2 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    static Node tail;

    public static boolean isCycle(){ //Floyd's Cycle Finding Algorithm
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){
        Node slow = head;
        Node fast = head;

        boolean isCycle = false;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                isCycle = true;
                break;
            }
        }
        if(!isCycle){
            return;
        }
        slow = head;
        Node prev = null;
        while (slow != fast){
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }

        if(prev != null){
            prev.next = null;
        }
    }

    public static void main(String[] args){
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head.next;

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
