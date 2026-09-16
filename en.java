class enc
{
    private String name;
    private int age;
    public void set(String name)
    {
        this.name=name;
    }
    public String get()
    {
        return name;
    }
    
}
public class en
{
    public static void main(String[] args)
    {
        enc e=new enc();
        e.set("Rutuja");
         System.out.println(e.get());

    }
}