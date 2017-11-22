import java.util.NoSuchElementException;
 
public class DoublyLinkedListImpl<E> {
 
    private Node head;
    
    private Node tail;
    private Node current;
    private int size;
     
    public DoublyLinkedListImpl() {
        size = 0;
    }
    /**
     * this class keep node information
     * @author oka.gartria
     *
     */
    private class Node {
        E element;
        Node next;
        Node prev;
 
        public Node(E element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
    /**
     * returns the size of the linked list
     * @return
     */
    public int size() { return size; }
     
    /**
     * return whether the list is empty or not
     * @return
     */
    public boolean isEmpty() { return size == 0; }
     
    
    
    /**
     * menambah char
     * */
    public void add (E element) {
		Node tmp = new Node(element, null,null);
		if (head == null) {
			head = tmp;
			tail = tmp;
			current = head;
			head.next = null;
			head.prev = null;
			
		} else if (current == tail) {
			current.next = tmp;
			tail = tmp;
			tmp.prev = current;
			current = current.next;
		} 
		
		else {
			tmp.next = current.next;
			tmp.prev = current;
			current.next = tmp;
			current = current.next;
			
		}
		
	}
	
	
	  /**
     * geser kiri
     * */
    public void shiftl () {
		if (current.prev == null) {
			System.out.println("Paling kiri");
		} else {
			current = current.prev;
			
		}
		
		
	}
     
    public static void main(String a[]){
         
        DoublyLinkedListImpl<Character> dll = new DoublyLinkedListImpl<Character>();
    
        dll.add('B');
        dll.add('c');
        dll.shiftl();
        dll.add('S');
        dll.add('d');
        dll.iterateForward();
 
    }
}
