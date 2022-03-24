
import java.util.Scanner;

class Node
{
    int data;
    Node next;
    
}
public class QueueLinkedList {
    Node rear;
    Node front;
    QueueLinkedList()
    {
        rear=null;
        front=null;
    }
    void insert()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element: ");;
        int data=sc.nextInt();
        Node nn=new Node();
        nn.data=data;
        nn.next=null;
        if(rear==null)
        {
            rear=nn;
            front=rear;
        }
        else
        {
            rear.next=nn;
            rear=rear.next;
        }
        System.out.println("Data inserted....");
        
    }
    void delete()
    {
        if(front==null)
            System.out.println("Queue Empty...");
        else
        {
            System.out.println("Deleted "+front.data);
            if(front==rear)
            {
                front=null;
                rear=null;
            }
            else
            {
                front=front.next;
            }
        }
        
    }
    void traverse()
    {
        if(rear==null && front==null)
            System.out.println("Queue Empty...");
        else
        {
            Node current=front;
            while(current!=null)
            {
                System.out.println(current.data+" bb");
                current=current.next;
            }
                
                
        }
    }
    public static void main(String[] args) {
        QueueLinkedList obj=new QueueLinkedList();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("press 1 for insert ");
            System.out.println("press 2 for delete ");
            System.out.println("press 3 for traverse ");
            System.out.println("press 4 for exit ");
            System.out.println("Enter your choice:");
            int choice =sc.nextInt();
            switch(choice)
            {
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice!!!");
            }
        }
    }
    
    
}
