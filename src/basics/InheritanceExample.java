package basics;
class A
{
    public A()
    {
        System.out.println("Call from class A");
    }
}
class B extends A
{
    public B()
    {
        System.out.println("Call from class B");
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
    B obj=new B();
        System.out.println();
    A obj1=new A();
        System.out.println();
    A obj2=new B();
    // not possible -B obj3=new A();

    }
}
