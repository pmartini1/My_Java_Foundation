public class MyLinkedListNode {
    public int value = 0;
    public MyLinkedListNode prev = null;
    public MyLinkedListNode next = null;
    
    public MyLinkedListNode(int value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return (new Integer(this.value)).toString();
    }
}
