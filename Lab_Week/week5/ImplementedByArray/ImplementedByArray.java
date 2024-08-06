import java.util.Scanner;

public class ImplementedByArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        System.out.printf("Input Base 10: ");
        int BaseTen = sc.nextInt();
        int Base = BaseTen;
        sc.close();

        try
        {
            while(BaseTen > 0)
            {
                stack.push(BaseTen % 2);
                BaseTen = BaseTen / 2;
            }
            System.out.print(Base + " Base 10 is ");
            while (!stack.isEmptyStack())
            {
                System.out.print(stack.pop());
            }
            System.out.println(" Base 2");

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}