class BinnaryTreeSize {
    Node root;

    int getSize(Node root)
    {
        if(root==null)
        return 0;
        else
        return 1+getSize(root.left)+getSize(root.right);
    }
    public static void main(String[] args) {
        BinnaryTreeSize tree=new BinnaryTreeSize();
        tree.root=new Node(10);
        tree.root.left=new Node(20);
        tree.root.right=new Node(30);
        tree.root.left.left=new Node(40);
        tree.root.left.right=new Node(50);
        tree.root.left.right.left=new Node(70);
        tree.root.left.right.right=new Node(80);
        tree.root.right.right=new Node(60);
        System.out.println("Size of tree = "+tree.getSize(tree.root));
    }
    
}
