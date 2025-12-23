import java.util.*;
class Node {
    int data;
    Node next;

    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CreationLinkList {
    // Node head = null;

    // void insert(int data) {
    //     Node newNode = new Node(data);

    //     if (head == null) {
    //         head = newNode;
    //         return;
    //     }

    //     Node temp = head;
    //     while (temp.next != null) {
    //         temp = temp.next;
    //     }
    //     temp.next = newNode;
    // }

    // void display() {
    //     Node temp = head;
    //     while (temp != null) {
    //         System.out.print(temp.data + " -> ");
    //         temp = temp.next;
    //     }
    //     System.out.println("null");
    // }

    // public static void main(String[] args) {

    //     CreationLinkList list = new CreationLinkList();

    //     // Passing data into linked list
    //     list.insert(10);
    //     list.insert(20);
    //     list.insert(30);

    //     // Display list
    //     list.display();
    // }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;
        Node tail = null;
        
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                tail = newNode;   
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

       
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}


