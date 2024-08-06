import java.util.Random;
import java.util.ArrayList;

public class OddEvenStack
{
    public static void main(String[] args) 
    {
        Random rand = new Random();
        Stack StackOdd = new Stack();
        Stack StackEven = new Stack();
        ArrayList<Integer> StackOddArrays = new ArrayList<Integer>();
        ArrayList<Integer> StackEvenArrays = new ArrayList<Integer>();

        try
        {
            //Rand + Input Phases
            int RandomCount = rand.nextInt(10,20);
            System.out.println("---Random Number [ " + RandomCount + " ]---");
            for (int i = 0;i < RandomCount;i++)
            {
                int RandomNumber = rand.nextInt(100);
                System.out.printf(RandomNumber + " ");

                if (RandomNumber%2 == 0)
                {
                    StackEven.push(RandomNumber);
                    StackEvenArrays.add(RandomNumber);
                }
                else
                {
                    StackOdd.push(RandomNumber);
                    StackOddArrays.add(RandomNumber);
                }
            }
            System.out.println();

            //PrintRand Phases
            System.out.println("---Even Stack [ " + StackEven.getSize() + " ]---");
            for(int i = 0;i < StackEvenArrays.size();i++)
            {
                System.out.printf(StackEvenArrays.get(i) + " ");
            }
            System.out.println();
            System.out.println("---Odd Stack [ " + StackOdd.getSize() + " ]---");
            for(int i = 0;i < StackOddArrays.size();i++)
            {
                System.out.printf(StackOddArrays.get(i) + " ");
            }
            System.out.println();

            //compare phase
            while (!StackEven.isEmptyStack() && !StackOdd.isEmptyStack())
            {
                int EvenPeek = (int) StackEven.peek();
                int OddPeek = (int) StackOdd.peek();

                if (EvenPeek < OddPeek)
                {
                    StackEven.pop();
                }
                else if (EvenPeek > OddPeek)
                {
                    StackOdd.pop();
                }
                else
                {
                    StackEven.pop();
                    StackOdd.pop();
                }
            }

            if (StackEven.isEmptyStack())
            {
                System.out.println("===> Odd is a Winner!");

                //Check Win debug
                // System.out.println("--------------------------------");

                // StackEven.push(0);
                // System.out.println("---Even Stack [ " + StackEven.getSize() + " ]---");
                // for(int i = 0;i < StackEvenArrays.size();i++)
                // {
                //     System.out.printf(StackEvenArrays.get(i) + " ");
                // }
                // System.out.println();
                // System.out.println("---Odd Stack [ " + StackOdd.getSize() + " ]---");
                // for(int i = 0;i < StackOddArrays.size();i++)
                // {
                //     System.out.printf(StackOddArrays.get(i) + " ");
                // }
                // System.out.println();
            }
            else
            {
                System.out.println("===> Even is a Winner!");
                
                //Check Win debug
                // System.out.println("--------------------------------");

                // System.out.println("---Even Stack [ " + StackEven.getSize() + " ]---");
                // for(int i = 0;i < StackEvenArrays.size();i++)
                // {
                //     System.out.printf(StackEvenArrays.get(i) + " ");
                // }
                // System.out.println();
                // StackOdd.push(0);
                // System.out.println("---Odd Stack [ " + StackOdd.getSize() + " ]---");
                // for(int i = 0;i < StackOddArrays.size();i++)
                // {
                //     System.out.printf(StackOddArrays.get(i) + " ");
                // }
                // System.out.println();
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}