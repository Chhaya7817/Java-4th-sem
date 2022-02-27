
import java.util.Scanner;

public class StackArray {
    int arr[];
    int top;
    StackArray(int n)
    {
        arr=new int[n];
        top=-1;
    }
    void push()
    {
        if(top>=arr.length-1)
        {
            System.out.println("Overflow");
        }
        else
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element: ");
        int data=sc.nextInt();
        arr[++top]=data;
        System.out.println("Data Inserted");
        }
        
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("UnderFlow....");
        }
        else
        {
            int res=arr[top];
            top--;
            System.out.println("Deleted "+res);
        }
    }
    void peek()
    {
        if(top==-1)
        {
            System.out.println("UnderFlow....");
        }
        else
        {
        System.out.println("peek element: "+arr[top]);
        }
    }
    void traverse()
    {
        if(top==-1)
        {
            System.out.println("Stack Empty....");
        }
        else
        {
            for(int i=0;i<=top;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        StackArray obj=new StackArray(5);
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("press 1 for push ");
            System.out.println("press 2 for pop ");
            System.out.println("press 3 for traverse ");
            System.out.println("press 4 for pek Element ");
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
