class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        next=null;
    }
}
public class Day1{

    Node head;
    void moveZeros(Node node)
    {
        if(node==null)
            return;
        Node curr=node;
        
        while(curr!=null)
        {
            if(curr.next.data==0)
            {
                Node nn=new Node(0);
                nn.next=head;
                head=nn;
                curr.next=curr.next.next;
            }
            curr=curr.next;
        }        
    }
    public static void main(String[] args)
    {
        Day1 obj=new Day1();
        obj.head=new Node(5);
        obj.head.next=new Node(0);
        obj.moveZeros(obj.head);
        System.out.println(obj.head.data);
    }

}