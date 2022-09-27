
/**
 * This is a custom, stripped-down version of a LinkedList
 * which you will use for this problem instead of a regular
 * LinkedList.
 */
public class MyLinkedList {
    private MyLinkedListNode first = null;
    private MyLinkedListNode last = null;
    private int length = 0;
    
    /**
     * Constructs a MyLinkedList from an integer array.
     */
    public MyLinkedList(int[] numbersArray) {
        // set length
        length = numbersArray.length;
        
        // leave the first and last nodes as null if there
        // are no elements in the array
        if (numbersArray.length == 0) {
            return;
        }
        
        // set the first node to the first number
        first = new MyLinkedListNode(numbersArray[0]);
        if (numbersArray.length == 1) {
            last = first;
            return;
        }
            
        // create all the middle nodes
        MyLinkedListNode prevNode = first;
        for (int i = 1; i < numbersArray.length; i++) {
            MyLinkedListNode currentNode = new MyLinkedListNode(numbersArray[i]);
            currentNode.prev = prevNode;
            prevNode.next = currentNode;
            prevNode = currentNode;
            if(i == numbersArray.length - 1){
              last = currentNode;
            }
        }
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(length);
        
        MyLinkedListNode currentNode = first;
        for (int i = 0; i < length; i++) {
            sb.append(currentNode.toString());
            if (i < length - 1) {
                sb.append(" ");
                currentNode = currentNode.next;
            }
        }
        
        return sb.toString();
    }
    
    /**
     * Reverses this linked list.
     */
    public void reverse() {

        MyLinkedListNode current = last = first;
        MyLinkedListNode _prev = null, _next = null;

        while (current != null) {
            // assign next to temp
            _next = current.next;

            // reverse the current
            current.next = _prev;

            // Move pointer to next.
            _prev = current;
            current = _next;
        }
        first = _prev;
    }
  } 
    
