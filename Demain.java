class Demain {
  
  /** Testing and Effort:
  * Feel free to experiment and write examples here to test your code.
  * Leave your work here to earn extra credit under the "effort" pillar.
  * We have provided examples to help you get started.
  */
  public static void main(String[] args) {
    // Create a max heap that can take at most 10 elements
    MaxHeap example = new MaxHeap(new WrappedArray(new int[10]));
    example.add(42);
    example.add(2);
    example.add(20);
    example.add(83);
    System.out.println(example.size());       // Should output 4
    System.out.println(example.extractMax()); // Should output 83
    System.out.println(example.peek());       // Should output 42
    System.out.println(example.size());       // Should output 3
    example.add(12);
    System.out.println(example.peek());       // Still 42
    example.add(301);
    System.out.println(example.peek());       // Now 301
    System.out.println(example.size());       // Should output 5
    System.out.println(example.extractMax()); // Should output 301
    System.out.println(example.extractMax()); // Should output 42
    System.out.println(example.extractMax()); // Should output 20
    System.out.println(example.extractMax()); // Should output 12
    System.out.println(example.extractMax()); // Should output 2
    System.out.println(example.size());       // Should output 0
  }
}
