import java.util.ArrayList;

public class InorderTreeTraversal {
    static class Node{
        int data;
        Node left,right;
        Node(int data)
        {
            this.data=data;
            left=null;
            right=null;
        }
    }
  /*  static int[] getInorder(Node root)
    {
        ArrayList<Integer> ans =new ArrayList<>();

        int [] res=new int[ans.size()];
      //  inorder(root,ans);

    }    */
    //count number of nodes
    static int countNode(Node root)
    {
        if(root==null)
        return 0;
        int left=countNode(root.left);
        int right=countNode(root.right);
        return left+right+1;
    }
    //sum of all nodes
    static int sumOfNode(Node root)
    {
        if(root==null)
            return 0;
        int leftsum=sumOfNode(root.left);
        int rightsum=sumOfNode(root.right);
        return leftsum+rightsum+root.data;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.left.right=new Node(5);
        root.right.left=new Node(6);
        System.out.println("No. of Node : "+countNode(root));
        System.out.println("Sum of All Node= "+sumOfNode(root));
    }
}
