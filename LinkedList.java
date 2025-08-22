import java.util.*;

public class LinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;


    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while (i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0) {
            System.out.println("LL is empty!");
            return Integer.MIN_VALUE;
        }else if (size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        int val = temp.next.data; //tail.data
        temp.next = null;
        size--;
        return val;
    }

    public int search(int key){
        if(head == null){
            return -1;
        }
        Node temp = head;
        int i=0;

        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;
    }

    public static int searchWithRecursion(int key, Node head, int idx){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return idx;
        }
        return searchWithRecursion(key, head.next, idx+1);
    }

    public static void reverseLL(){
        if(head == null){
            return;
        }
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void removeFromEnd(int n){
        if(n == size){
            head=head.next;
            return;
        }
        int idx = size-n;

        Node temp = head;
        for(int i=1; i<idx; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
    }

    public static void printll(Node head){
        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node dummy = head;
        while (dummy != null){
            System.out.print(dummy.data + " -> ");
            dummy = dummy.next;
        }
        System.out.println("null");
    }

    //slow-fast Approach
    public static Node findMide(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //step 1 - find mid
        Node midNode = findMide(head);

        //step 2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node rightHead = prev;
        Node leftHead = head;

        //step 3 - check left half and right half
        while (rightHead != null){
            if(leftHead.data != rightHead.data){
                return false;
            }
            leftHead = leftHead.next;
            rightHead = rightHead.next;
        }
        return true;
    }

    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(1);
        //1 -> 2 -> 2 -> 1
//        ll.add(2, 5);

        printll(head);
//        System.out.println(ll.removeFirst());
//        System.out.println(ll.removeLast());
//
//        printll(head);
//        System.out.println(size);
//
//        System.out.println(ll.search(5));
//        System.out.println(searchWithRecursion(5, head, 0));

//        reverseLL();
//        printll(head);

        removeFromEnd(3);
        printll(head);
//        System.out.println(checkPalindrome());
    }
}
