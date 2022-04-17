
import java.util.Scanner;

class Node1
{
    int data;
    Node1 next;
}
public class StackSinglyLinkedList {
    Node1 head;
    StackSinglyLinkedList()
    {
        head =null;
        
    }
    void push()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Data : ");
        int data=sc.nextInt();
        Node1 nn=new Node1();
        nn.data=data;        
        nn.next=head;
        head=nn;
    
    }
    void pop()
    {
        if(isEmpty())
            System.out.println("Stack underflow ");
        else
        {
            int res=head.data;
            head=head.next;
            System.out.println("Delleted :"+res);
        }
        
    }
    void traverse()
    {
        if(isEmpty())
            System.out.println("Stack Empty...");
        else
        {
            Node1 current;
            for(current=head;current!=null;current=current.next)
            {
                System.out.println(current.data+" ");
            }
                
        }
    }
    void peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack Empty");
        }
        else
        {
            System.out.println("peek element "+head.data);
        }
    }
    boolean isEmpty()
    {
        if(head==null)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        StackSinglyLinkedList obj=new StackSinglyLinkedList();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("press 1 for push ");
            System.out.println("press 2 for pop ");
            System.out.println("press 3 for traverse ");
            System.out.println("press 4 for peek Element ");
            System.out.println("press 5 for exit ");
            System.out.println("Enter your choice:");
            int choice =sc.nextInt();
            switch(choice)
            {
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    obj.peek();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice!!!");
            }            
        }
    }
}
