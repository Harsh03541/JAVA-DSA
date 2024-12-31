/**
 * basicll
 */
public class basicll {

    public static void insertAtEnd(Node head, int val) {
        Node temp = new Node(val);
        Node t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next = temp;

    }

    // display data of node using function: 
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;    
        }
    }

    // display data of node using recursion: 
    public static void display_recursively(Node head) {
        
        if(head == null) 
            return;
        System.out.print(head.data + " ");
        display_recursively(head.next);
    }

    // print reverse element from the linked list:
    public static void disp(Node head) {
        if(head == null) 
            return;
        disp(head.next);
        System.out.print(head.data + " ");
    }

    // length of the linked list:
    public static int length(Node head) {
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }    
        return count;
    }

    public static int sum(Node head) {
        int sum = 0;
        while (head != null) {
            sum += head.data;
            head = head.next;
        }
        return sum;
    }

    public static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        // creating node
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(100);

        System.out.println("a.next: " + a.next);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        int length = length(a);
        System.out.println("length: " + length);

        // display(a);
        // System.out.println();
        // display_recursively(a);
        // System.out.println();

        // disp(a);
        System.out.println();

        int sumAns = sum(a);
        System.out.println(" sum : " + sumAns);

        insertAtEnd(a, 87);
        display(a);


        // System.out.println(a.next.next.data);
        // System.out.println(c);

        // display the linked list : 
        // Node temp = a;
        // while (temp.next != null) {
        //     System.out.print(temp.data + " ");
        //     temp = temp.next;
            
        // }
        
        
    }
}