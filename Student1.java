class Student1
{
    String name;
    int age;
    Student1(String Name,int Age)
    {
        name = Name;
        age = Age;
    }
    void display()
    {
        System.out.println(name);
        System.out.println(age);
    }
    public class Main
    {
        public static void main(String args[])
        {
         Student1 s1 = new Student1("srushti",12);
         s1.display();   
        }

    }


}