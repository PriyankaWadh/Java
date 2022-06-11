package basics;
interface Writer{
    void write();
}
class Pencil implements Writer
{
    public void write()
    {
        System.out.println("Pencil writer");
    }
}
class Pen implements Writer
{
    public void write()
    {
        System.out.println("Pen writer");
    }
}
public class MultipleInheritance {

}
