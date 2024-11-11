import java.util.Scanner;

public class Adj_Matrix
{
    public int[][] Adj_Matrix;

    public Adj_Matrix(int Target)
    {
        Adj_Matrix = new int[Target+1][Target+1];
        for (int i = 1;i <= Target;i++)
        {
            for (int j = 1;j <= Target;j++)
            {
                Adj_Matrix[i][j] = -1;
            }
        }
    }

    // public void createGraphEven(int Target)
    // {
    //     for (int i = 0;i < Target-1;i++)
    //     {
    //         if (i == 0)
    //         {
    //             for (int j = 0;j <= Target-1;j++)
    //             {
    //                 Adj_Matrix[i][j] = 0;
    //             }
    //             Adj_Matrix[i][i+1] = 1;
    //             Adj_Matrix[i][i+2] = 1;
    //             continue;
    //         }


    //         for (int j = 0;j <= Target-1;j++)
    //         {
    //             if (i != j && (i % 2 != 0 && (i == j-2 || i == j+1)))
    //             {
    //                 Adj_Matrix[i][j] = 1;
    //             }
    //             else
    //             {
    //                 Adj_Matrix[i][j] = 0;
    //             }
    //         }
    //     }
    // }

    public void createGraphOdd(int Target)
    {
        for (int i = 1;i <= Target;i++)
        {
            if (i == 1)
            {
                for (int j = 1;j <= Target;j++)
                {
                    Adj_Matrix[i][j] = 0;
                }
                Adj_Matrix[i][i+1] = 1;
                Adj_Matrix[i][i+2] = 1;
                continue;
            }


            for (int j = 1;j <= Target;j++)
            {
                if (i != j && ( (i % 2 != 0) && (i == j-2 || i == j+1) ) || ( (i % 2 == 0) && (i == j-2 || i == j-1 || i == j+2) ))
                {
                    Adj_Matrix[i][j] = 1;
                }
                else
                {
                    Adj_Matrix[i][j] = 0;
                }
            }

            if (i == Target)
            {
                Adj_Matrix[Target-1][Target] = 1;
                Adj_Matrix[Target-2][Target] = 1;
                Adj_Matrix[Target][Target-1] = 1;
                Adj_Matrix[Target][Target-2] = 1;
            }
        }
    }

    public void Display()
    {
        System.out.print("    ");
        for (int i = 1;i < Adj_Matrix[1].length;i++)
        {
            System.out.print((i) + "   ");
        }
        System.out.println();

        for (int i = 1;i < Adj_Matrix.length;i++)
        {
            System.out.print((i) + ":  ");
            for (int j = 1;j < Adj_Matrix[i].length;j++)
            {
                if (Adj_Matrix[i][j] != -1)
                {
                    //System.out.print("(" + i + "," + j +")   "+ Adj_Matrix[i][j] + " | ");
                    System.out.print(Adj_Matrix[i][j] + " | ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Source Vertex: ");
        int Source = sc.nextInt();
        System.out.print("Enter Target Vertex: ");
        int Target = sc.nextInt();
        Adj_Matrix AM = new Adj_Matrix(Target);
        if (Target % 2 == 0)
        {
            //AM.createGraphEven(Target);
        }
        else
        {
            AM.createGraphOdd(Target);
        }
        AM.Display();
    }
}