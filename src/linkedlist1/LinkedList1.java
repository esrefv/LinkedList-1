
package linkedlist1;


public class LinkedList1 {

   
    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        
        for(int i=0; i<=20; i=i+3) list.addEnd(i);
        
        list.printList();
        
        list.addHead(12);
        list.printList();
        
        list.addHead(55);
        list.printList();
        
        list.addEnd(99);
        list.printList();
        
        list.addBetween(49, 4);
        list.printList();
        
        list.addBetween(210, 7);
        list.printList();
        
        list.deleteHead();
        list.printList();
        
        list.deleteEnd();
        list.printList();
        
        list.deleteNode(2);
        list.printList();
        
        list.deleteNode(210);
        list.printList();
        
        list.deleteOrder(4);
        list.printList();
    }
    
}
