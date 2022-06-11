package basics;
class School
{
    public void showDetails()
    {
        System.out.println("School Details");
    }
}
class Student extends  School
{
    @Override
    public void showDetails()
    {
        super.showDetails(); //Using override key. child class method override with parent class but using super can call parent class method
        System.out.println("Student Details");
    }
}
class Teacher extends School
{
    public void showDetails()
    {
        System.out.println("Teacher Details");
    }
}
public class OverrideExample {
    public static void main(String[] args) {
        School obj=new Student();
        obj.showDetails(); //Runtime Polymorphism
        System.out.println();
        obj=new Teacher();
        obj.showDetails(); //Dynamic Dispatch
    }
}
