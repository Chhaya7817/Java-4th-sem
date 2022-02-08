
import java.util.Scanner;
class Node
{
    int rollno;
    Node next;
}
public class SinglyLinkedList {
    Node START;
    SinglyLinkedList()
    {
        START=null;
    } 
    void insert()
    {
       System.out.println("Entyer your Roll no.:");
       Scanner sc=new Scanner(System.in);
       int data =sc.nextInt();
       Node nn=new Node();
       nn.next=null;
       nn.rollno=data;
       if(START==null)
       {
           START=nn;
       }
       else
       {
           Node current=START;
           while(current.next!=null)
           {
               current=current.next;
           }
           current.next=nn;
       }
        System.out.println("Data Inserted...");
        
    }
   void delete()
   {
       if(START==null)
           System.out.println("List Empty ");
       else
       {
           System.out.println("Deleted :"+START.rollno);
           if(START.next==null)
               START=null;
           else
               START=START.next;
       }
      
   }
   void traverse()
   {
       if(START==null)
           System.out.println("List Empty!!!");
       else
       {
           Node current;
           for(current=START;current!=null;current=current.next)
           {
               System.out.println(" "+current.rollno);
           }
       }
   }
       
        public static void main(String[] args) {
        SinglyLinkedList obj=new SinglyLinkedList();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("press 1 for inset ");
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
