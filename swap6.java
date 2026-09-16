import java.util.*;
class sw
{
    public void swap(int r1,int r2)
    {
        int temp;
        temp=r1;
        r1=r2;
        r2=temp;
         System.out.println("after swap "+r1+ " "+r2);

    }
}
public class swap6
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a n1  first number");
    int n1=sc.nextInt();
    System.out.println("Enter a n2 second number");
    int n2=sc.nextInt();
     sw s=new sw();
     s.swap(n1,n2);

}
}
