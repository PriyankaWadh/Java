package basics;

public class TwoDimArray {
    public static void main(String[] args) {
        //2D array Can define in this way-int a[][]=new int[4][3];
        //Normal 2D Array
        int a[][]={
                {4,7,1,9},
                {5,12,6,8},
                {11,6,3,0}
        };
        for(int row[] : a)
        {
            for(int col: row){
                System.out.print(" " + col);
            }
            System.out.println();
        }
        int jarry[][]={
                {5,1},
                {8,3,15,7},
                {4,9,14}
        };
        for (int i=0;i< jarry.length;i++)
        {
            for(int j=0;j<jarry[i].length;j++)
            {
                System.out.print(" " + jarry[i][j]);
            }
            System.out.println();
        }
    }
}
