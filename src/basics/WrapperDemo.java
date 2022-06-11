package basics;

public class WrapperDemo {
    public static void main(String[] args) {
        int i=5;
        Integer ii=new Integer(i); //Boxing-wrapping
        int j=ii.intValue(); //unboxing-unwrapping
        Integer value=i;  //AutoBoxing
        int  k=value;  //Autounboxing
        System.out.println(" "+i +" "+ii + " "+j+" "+ value +" "+k);
        String str="12";
        int n=Integer.parseInt(str);
        System.out.println(n);
    }
}
