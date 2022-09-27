

import java.util.*;

public class Auto {

  public static List<String> candidates(TreeNode<Character> example, String pre) {
	  ArrayList<String> possible = new ArrayList<String>();
	  char[] bag = pre.toCharArray();
	  String str = ""; 
        if (example == null) {
            return null;
        }
        for (int i = 0; i < example.getChildren().size(); i++) {
        	int b = i++;
        	char j = example.getChildren().get(b). getValue();
        	if(i < bag.length) {
        		if(j == bag[i]) {
        			str+=j;
        		}
        	}
        	if (j != '$') {
        		str+=j;
        	}else if (j == '$') {
        		possible.add(str);
        	}
        } 
        
   return possible;
   }
  
 
 
  public static void main(String[] args) {
    TreeNode<Character> example = makeExample();
   
    System.out.println(candidates(example, "c")); // Outputs ["cat", "cow", "cut"]
    System.out.println(candidates(example, "ca")); // Outputs ["cat"]
    System.out.println(candidates(example, "an")); // Outputs ["and", "andrew"]
 
    // Outputs ["ace", "acne", "and", "andrew", "beam", "beef", "cat", "cow", "cut"]
    System.out.println(candidates(example, ""));
    System.out.println(candidates(example, "deer")); // Outputs []
    System.out.println(candidates(example, "bean")); // Outputs []
  }
 
  public static void helping(TreeNode<Character> root, List<String> lst, String can ) {
	  if (root.getValue() == '$') {
		  lst.add(can);
	  }
	  TreeNode j;
	  for (int i = 0; i < root.getChildren().size(); i++) {
		  j = root.getChildren().get(i++);
		  helping(j, lst, can + root.getValue());
	  }
  }
  public static void allWord(TreeNode<Character> root, List<String> lst) {
 helping(root, lst, "");
  }

  private static TreeNode<Character> makeExample() {
    return
      new TreeNode<Character>('*', Arrays.asList(
        new TreeNode<Character>('a', Arrays.asList(
          new TreeNode<Character>('c', Arrays.asList(
            new TreeNode<Character>('e', Arrays.asList(
              new TreeNode<Character>('$')
           )),
           new TreeNode<Character>('n', Arrays.asList(
              new TreeNode<Character>('e', Arrays.asList(
                new TreeNode<Character>('$')
              ))
           ))
         )),
          new TreeNode<Character>('n', Arrays.asList(
           new TreeNode<Character>('d', Arrays.asList(
             new TreeNode<Character>('$'),
                new TreeNode<Character>('r', Arrays.asList(
                  new TreeNode<Character>('e', Arrays.asList(
                    new TreeNode<Character>('w', Arrays.asList(
                      new TreeNode<Character>('$')
                  ))
                   ))
                 ))
               ))
             ))
            )),
        new TreeNode<Character>('b', Arrays.asList(
          new TreeNode<Character>('e', Arrays.asList(
           new TreeNode<Character>('a', Arrays.asList(
             new TreeNode<Character>('m', Arrays.asList(
               new TreeNode<Character>('$')
               ))
             )),
            new TreeNode<Character>('e', Arrays.asList(
              new TreeNode<Character>('f', Arrays.asList(
               new TreeNode<Character>('$')
             ))
           ))
         ))
        )),
        new TreeNode<Character>('c', Arrays.asList(
          new TreeNode<Character>('a', Arrays.asList(
            new TreeNode<Character>('t', Arrays.asList(
             new TreeNode<Character>('$')
           ))
         )),
          new TreeNode<Character>('o', Arrays.asList(
            new TreeNode<Character>('w', Arrays.asList(
             new TreeNode<Character>('$')
           ))
          )),
         new TreeNode<Character>('u', Arrays.asList(
            new TreeNode<Character>('t', Arrays.asList(
             new TreeNode<Character>('$')
           ))
         ))
       ))
      ));
  }  

 
}

