import java.util.*;
class Student
{
    String name;
    int age;
    void display()
    {
        System .out.println(" name is " +   name);
        System .out.println(" age is  " +   age);
    }
}
    public class clas{
        public static void main(String[] args)
        {
            Student s=new Student();
            s.name="Rutu";
            s.age=26;
            s.display();
        }
    }
