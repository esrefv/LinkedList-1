
package linkedlist1;


class Node {
    public int data;
    public Node next; 
    
    public Node(int datavalue){ // constructive method for value taken by users
        data = datavalue;
    }
    
    public void write(){ // prints the value of the node
        System.out.print(" "+data);
    }
}


class LinkedList{ // It holds the first value of the list
    private Node head;
    
    public LinkedList(){
        head=null;
    }
    
    public Node find(int key){ // Search for the key value in the list
        Node active = head;
        
        if(head != null){
              while(active.data != key){
            if(active.next == null)
                return null;
            else
                active = active.next;
            }
        }     
        return active;
    }
    
    
    public void addHead(int newValue){ // For this method to add value to the first order of the list 
        Node value = find(newValue);
        if(value == null){
            Node newNode = new Node(newValue);
            newNode.next = head;
            head=newNode; 
        }
        else
            System.out.println("This -> "+ newValue +" value is not added to this list because there is value in the list");   
    }
    
    public void addEnd(int newValue){ // For this method to add value to the last order of the list
        Node value = find(newValue);
        if(value == null){
            Node newNode = new Node(newValue);
            Node active = head;
            
            if(active == null)
                head = newNode;
            else{
                while(active.next != null)
                    active = active.next;
                active.next = newNode;
                newNode.next = null;
            }            
        }
        else
            System.out.println("This -> "+ newValue +" value is not added to this list because there is value in the list");   
    }
    
    
    public void addBetween(int newValue, int order){ // For this method to add value to the what if we wanted to order? of the list
        Node value = find(newValue);
        if(value == null){
            Node newNode = new Node(newValue);
            Node active = head;
            Node previous = head;
            int o=1;
            while(o != order){
                previous = active;
                active = active.next;
                o++;
            }
            
            previous.next = newNode;
            newNode.next = active;
        }
        else
            System.out.println("This -> "+ newValue +" value is not added to this list because there is value in the list");             
    }
    
    public void deleteHead(){ // This method delete value to the first order of the list
        head = head.next;
    }
    
    public void deleteEnd(){ // This method delete value to the last order of the list
        Node previous = head;
        Node active = head;
        while(active.next != null){
            previous = active;
            active = active.next;
        }
        previous.next = null;
    }
    
    
    public void deleteOrder(int order){ // This method delete value that you wrote in
        Node previous = head;
        Node active = head;
        int o = 1;
        if(order == 1)
            deleteHead();
        else{
            while(o != order){
                previous = active;
                active = active.next;
                o++;
            }
            previous.next = active.next;
        }
    }
    
    
    public void deleteNode(int Key){ // This method is to delete nodes
        Node value = find(Key);
        if(value == null)
            System.out.println("There is no this -> " + Key + " key value that you want to  delete in this list");
        else{
            Node active = head;
            Node previous = head;
            while(active.data != Key){
                previous = active;
                active = active.next;
            }
            if(active == head)
                deleteHead();
            else
                previous.next = active.next;
        }
    }
    
    
    public void printList(){  // This method will print the list from start to finish
        System.out.println("");
        System.out.print("List from fist to end: ");
        Node active = head;
        while(active != null){
            active.write();
            active = active.next;
        }
        System.out.println("");
    }
      
}
    

