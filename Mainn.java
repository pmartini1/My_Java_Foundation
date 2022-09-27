import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // parse the array representing the binary search tree
        int[] binaryTree;
        String input = sc.nextLine();
        if (input.equals("")) {
            binaryTree = new int[0]; 
        } else {    
            String[] binaryTreeStrings = input.split(" ");
            binaryTree = new int[binaryTreeStrings.length];
            for (int i = 0; i < binaryTreeStrings.length; i++) {
                binaryTree[i] = Integer.parseInt(binaryTreeStrings[i]);
            }
        }

        // check if this is a binary search tree; print the result
        System.out.println(isBinarySearchTree(binaryTree));
    }
    
      public static boolean isBinarySearchTree(int[] binaryTree) {
        int i = 0;

    	for(i = 0; i <= binaryTree.length/2; i++) {  	
    	 if (binaryTree.length <= 1){
    	   return true;
    	 } 
    	 if(recur(binaryTree[i], binaryTree[lesser(i)], binaryTree[bigger(i)])) {
        	 if(recur(binaryTree[lesser(i)], binaryTree[lesser(lesser(i))], binaryTree[bigger(lesser(i))]) && recur( binaryTree[bigger(i)], binaryTree[lesser(bigger(i))], binaryTree[bigger(bigger(i))]) ) {
      			 return true;
        	 }
    	 } else {
        		return false;
        	}
        } throw new UnsupportedOperationException();
    }
    
  public static int lesser(int root) {
	   return root*2+1;
   }
   public static int bigger(int root) {
	   return root*2+2;
   }
   public static boolean recur(int root, int less, int big) {
	   if (root < less || root > big) {
		   return false;
	   } else {
		   return true;
	  }
  }
}
