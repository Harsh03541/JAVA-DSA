public class reverse_list {

    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }

    }
        // display reverse the list : with logic - 
        public static Node reverse(Node head) {
            if(head.next == null)   return head;
            Node newHead = reverse(head.next);
            head.next.next = head;
            head.next = null;
            return newHead;
        }

        public static Node reverse_itratively(Node head) {
            Node current = head;
            Node prev = null;
            Node after = null;

            while (current != null) {
                after = current.next;
                current.next = prev;
                prev = current;
                current = after;                
            }
            return prev;
        }

        // **reverse the list using recursion: 
        // public static void displayrev(Node head) {
        //     if(head == null)   return;     // base case
        //     displayrev(head.next);              // recursive call
        //     System.out.print(head.data + " ");   // work
        // }

        public static void display(Node head) {
            if(head == null) 
                return;
                System.out.print(head.data + " ");
                display(head.next);
        }
        
        public static void main(String[] args) {

            Node a = new Node(100);
            Node b = new Node(13);
            Node c = new Node(4);
            Node d = new Node(5);
            Node e = new Node(12);
            Node f = new Node(10);
            Node g = new Node(20);

            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;
            f.next = g;
            display(a);
            System.out.println();
            a = reverse(a);
            System.out.println("Reverse the linked list: ");
            display(a);
            System.out.println();
            System.out.println("Reverse the linked list: ");
            reverse_itratively(a);
            display(a);


        }
    }

