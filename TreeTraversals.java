import java.util.*;

class TreeTraversals{

  static class Node{
    public Node left,right;
    public int data;
    public Node(int data){
      this.data = data;
    }
  }

  Node root;

  public void inorderTraversal(Node node){
    if(node!=null){
      inorderTraversal(node.left);
      System.out.print(node.data+" ");
      inorderTraversal(node.right);
    }
  }

  public void preorderTraversal(Node node){
    if(node!=null){
      System.out.print(node.data+" ");
      preorderTraversal(node.left);
      preorderTraversal(node.right);
    }
  }

  public void postorderTraversal(Node node){
    if(node!=null){
      postorderTraversal(node.left);
      postorderTraversal(node.right);
      System.out.print(node.data+" ");
    }
  }

  public void levelOrderTraversal(Node node){
    Queue<Node> queue = new LinkedList<Node>();
    queue.add(node);
    while(!queue.isEmpty()){
      Node treeNode = queue.poll();
      System.out.print(treeNode.data+" ");
      if (treeNode.left!=null) {
        queue.add(treeNode.left);
      }
      if (treeNode.right!=null) {
        queue.add(treeNode.right);
      }
    }
  }


  public static void main(String...args){
    TreeTraversals traversal = new TreeTraversals();
    traversal.root = new Node(4);
    traversal.root.left = new Node(2);
    traversal.root.right = new Node(5);
    traversal.root.left.left = new Node(1);
    traversal.root.left.right = new Node(3);

    System.out.println("inorderTraversal:");
    traversal.inorderTraversal(traversal.root);
    System.out.println();

    System.out.println("preorderTraversal:");
    traversal.preorderTraversal(traversal.root);
    System.out.println();

    System.out.println("postorderTraversal:");
    traversal.postorderTraversal(traversal.root);
    System.out.println();

    System.out.println("LevelorderTraversal:");
    traversal.levelOrderTraversal(traversal.root);
    System.out.println();

  }

}
