public class middleLinklist {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;
         
        // for even: fast.next.next != null ( return left middle )
        // for even: fast != null ( return right middle )
        // for odd: fast.next != null
        
        // while (fast != null && fast.next != null)                // right middle condition
        while (fast.next != null && fast.next.next != null)         // left middle condition
         {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public static Node deleteMiddleNode(Node head) {

        if(head.next == null) {     // single element list
            return null;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next.next != null && fast.next.next.next != null)       // remove right middle
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next; 
        return slow;

    }

    public static void display(Node head) {
        if(head.next == null) {
            System.out.print("List is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        // Node b = new Node(13);
        // Node c = new Node(4);
        // Node d = new Node(5);
        // Node e = new Node(12);
        // Node f = new Node(10);
        // Node g = new Node(20);
        
        // a.next = b;
        // b.next = c;
        // c.next = d;
        // d.next = e;
        // e.next = f;
        // f.next = g;

        display(a);
        System.out.println();
        Node ans = findMiddle(a);
        System.out.println("middle: " + ans.data);
        deleteMiddleNode(a);
        System.out.println("Removing middle node from the list: ");
        display(a);
    }
}
