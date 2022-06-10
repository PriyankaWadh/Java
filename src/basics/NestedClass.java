package basics;

 class Outer{
    public static class Inner{
            public void show()
            {
                System.out.println("Call from inner class");
            }
    }
}
public class NestedClass {
    public static void main(String[] args) {
            Outer obj=new Outer();
            Outer.Inner obj2=new Outer.Inner();
            obj2.show();
    }
}
