public class linkedlist_insertion {
    public static class  Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static class linkedlist {
        Node head = null;
        Node tail = null;
        int size = 0;
    
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if(head == null) {
                head = temp;
            }
            else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }
        
        void insertAtHead(int val) {
            Node temp = new Node(val);
            if(head == null) {
                // head = tail = temp; 
                insertAtEnd(val);               // line 27 and 28 both are same
            }
            else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertAt(int index, int val) {

            Node temp = head;
            Node newnode = new Node(val);
            if(index == size) {
                insertAtEnd(val);
                return;
            }
            else if(index == 0) {
                insertAtHead(val);
                return;
            }
            else if(index < 0 || index > size) {
                System.out.println("Wrong index");
                return;
            }

            for(int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
            size++;
        }

        int getAt(int index) {
            Node temp = head;
            if(index < 0 || index > size) {
                System.out.println("Wrong index");
                return -1;
            }

            for(int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.data; 
        }

        public void deleteAt(int index) {
            if(index == 0) {
                head = head.next;
                size--;
                return;
            }
            Node temp = head;
            for(int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
            size--;
        }

            public  void display() {
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
            }
        }
        public static void main(String[] args) {
            linkedlist ll = new linkedlist();

            ll.insertAtEnd(5);  // 5
            ll.insertAtEnd(4);  // 5 -> 4
            ll.insertAtEnd(3); //    5 -> 4 -> 3
            ll.insertAtEnd(2);  //    5 -> 4 -> 3 -> 2

            // ll.display();           // 5 4 3 2
            
            // System.out.println();
            ll.insertAtHead(15);  //    15 -> 5 -> 4 -> 3 -> 2 
            // ll.display(); 
            // System.out.println();              // 15 5 4 3 2
            ll.insertAt(2, 20);      // 15 -> 5 -> 20 -> 4 -> 3 -> 2 
            // ll.display();       
            // System.out.println();                 // 15 5 20 4 3 2 
            ll.insertAt(6, 22); 

            // ll.display();
            // System.out.println();
            ll.insertAt(0, 001);
            // ll.display();

            // System.out.println();
            // int len = ll.size;
            // System.out.println("length of linkedlist  : " + len);     
            // System.out.println(ll.tail.data);       // 22
            // ll.insertAt(10, 1500);
            ll.display();
            // System.out.println();
            // System.out.println(ll.getAt(2));        // 5
            // System.out.println(ll.getAt(20));        // Wrong index -1
            // System.out.println(ll.size);
            System.out.println();
            ll.deleteAt(0);
            ll.display();
            System.out.println();
            System.out.println(ll.tail.data);
        }
}