import java.util.Scanner;
public class fact
{
    public fact(int n)
    {
      int i,fact=1;
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System .out.println(" factorial is" + fact);
    }
    public static void main(String args[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        System .out.println("enter number to calculate factorial");
        int n=sc.nextInt();
        fact f=new fact(n);
        

       /* int fact=1;
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System .out.println(" factorial is" + fact);*/
    }

}