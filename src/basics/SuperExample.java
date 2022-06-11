package basics;
class InhA
{
    public InhA()
    {
        System.out.println("call from default A");
    }
    public InhA(int m)
    {
        System.out.println("from A: "+m);
    }
}
class InhB extends InhA
{
    public InhB()
    {
        System.out.println("Call from default B");
    }
    public InhB(int k)
    {
        super(k);
        System.out.println("from B :" + k);
    }
}
public class SuperExample {
    public static void main(String[] args) {

        InhB obj = new InhB(5);
    }
}
