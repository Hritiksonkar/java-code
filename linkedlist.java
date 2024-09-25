/**
 * linkedlist
 */
public class linkedlist {

    public static void main(String[] args) {
        Node head=new Node(1);
        Node temp = head;
        int data=2;
        int n=50;
        while (n-->0) {
            Node newBlock=new Node(data++);
            temp.next = newBlock;
            temp=temp.next;

        }
    }

    /**
     * Node
     * 
     * it data;
     * Node next;
     * Node(){
     * }
     */
    
}
class Node {
    int data;
    Node next; 

    Node() {

    }
   Node(int value ){
    this.data =value;
    this.next=null;
    System.out.println(data);
   }
}