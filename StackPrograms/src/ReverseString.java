
import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static String reverse(String str)
    {
        Stack<String> s=new Stack<String>();
        String resString="";
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            s.push(c+"");
        }
        while(!s.isEmpty())
        {
            String ch=s.pop();
            resString+=ch;
            
        }
        return resString;
        
    }
     public static void main(String[] args) 
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter String: ");
         String str=sc.next();
         System.out.println(reverse(str));
         
         
     }
}
