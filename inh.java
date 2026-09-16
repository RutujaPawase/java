import java.util.*;
class Animal
{
    void sound()
    {
        System.out.println("animal voice");
    }
}
class cat extends Animal
{
    public void catr()
    {
        System.out.println(" cat voice");
    }
}
public class inh
{
    public static void main(String args[])
    {
       // Animal a=new Animal();
       cat a=new cat();
       a.catr();
        a.sound();
    }
}