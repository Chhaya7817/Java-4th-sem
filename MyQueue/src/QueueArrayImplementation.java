
import java.util.Scanner;

public class QueueArrayImplementation {
    int arr[];
    int rear;
    int front;
   
    QueueArrayImplementation(int n)
    {
      
        arr=new int[n];
        rear=-1;
        front=-1;
    }
    
    void insert()
    {
        if( rear==arr.length-1)
        {
            System.out.println("overflow");
        }
        else{
            
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element: ");
        int data=sc.nextInt();
        if(front==-1)
            front=0;
        rear=rear+1;
        arr[rear]=data;
        System.out.println("Data inserted...");
        }
        
    }
    void delete()
    {
        if(front==-1 && rear==-1)
            System.out.println("UnderFlow");
        else 
        {
            System.out.println("Deleted "+arr[front]);
            if(rear==front)
            {
                rear=-1;
                front=-1;
            }
            else if(front<rear)
                front++;
            
           
        }
    }
    void traverse()
    {
        if(front==-1)
            System.out.println("Queeue Empty");
        else
        {
            for(int i=front;i<=rear;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        QueueArrayImplementation obj=new QueueArrayImplementation(5); 
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
