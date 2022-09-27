
import java.util.*;

class TreeNode<T> {
  T value;
  private List<TreeNode<T>> children;
  private TreeNode<T> parent;

  public TreeNode(T value) {
    this.value = value;
    this.children = new ArrayList<>();
   
  }

  public TreeNode(T value, TreeNode<T> parent) {
      this.value = value;
      this.parent = parent;
  }
   
  public TreeNode(T value, List<TreeNode<T>> children) {
    this.value = value;
    this.children = children;
  }

  public T getValue() {
    return value;
  }
 
  public TreeNode<T> getParent() {
 return parent;
  }

  public List<TreeNode<T>> getChildren() {
    return children;
  }
 
  public boolean isLeaf() {
    return children == null  || children.size() == 0;
  }



}

