package basics;

public class VariableLengthArguments {
    public static void main(String[] args) {
        Calculate obj=new Calculate();
        System.out.println("Addition is : " +  obj.Addition(2,5,8,1,3,9));
    }
}
class Calculate{
    public int Addition(int ...n)
    {
        int sum=0;
        for(int i:n)
        {
            sum +=i;
        }
        return sum;
    }
}
