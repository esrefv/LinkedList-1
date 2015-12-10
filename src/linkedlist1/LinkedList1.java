
package linkedlist1;


public class LinkedList1 {

   
    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        
        for(int i=0; i<=20; i=i+3) list.AddEnd(i);
        
        list.printList();
        
        list.AddHead(12);
        list.printList();
        
        list.AddHead(55);
        list.printList();
        
        list.AddEnd(99);
        list.printList();
        
        list.AddBetween(49, 4);
        list.printList();
        
        list.AddBetween(210, 7);
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
