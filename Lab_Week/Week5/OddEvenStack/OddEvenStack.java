import java.util.Random;

public class OddEvenStack
{
    public static void main(String[] args) 
    {
        Random rand = new Random();
        Stack StackOdd = new Stack();
        Stack StackEven = new Stack();
        Stack StackOddArrays = new Stack();
        Stack StackEvenArrays = new Stack();

        try
        {
            //Rand + Input Phases
            int RandomCount = rand.nextInt(10,21);
            System.out.println("---Random Number [ " + RandomCount + " ]---");
            for (int i = 0;i < RandomCount;i++)
            {
                int RandomNumber = rand.nextInt(101);
                System.out.printf(RandomNumber + " ");

                if (RandomNumber%2 == 0)
                {
                    StackEven.push(RandomNumber);
                }
                else
                {
                    StackOdd.push(RandomNumber);
                }
            }
            System.out.println();

            //PrintRand Phases
            System.out.println("---Even Stack [ " + StackEven.getSize() + " ]---");
            while (!StackEven.isEmptyStack())
            {
                int Info = (int)StackEven.pop();
                StackEvenArrays.push(Info);
                System.out.printf(Info + " ");

            }
            System.out.println();
            System.out.println("---Odd Stack [ " + StackOdd.getSize() + " ]---");
            while (!StackOdd.isEmptyStack())
            {
                int Info = (int)StackOdd.pop();
                StackOddArrays.push(Info);
                System.out.printf(Info + " ");
            }
            System.out.println();

            //compare phase
            while (!StackEvenArrays.isEmptyStack() && !StackOddArrays.isEmptyStack())
            {
                int EvenPeek = (int) StackEvenArrays.peek();
                int OddPeek = (int) StackOddArrays.peek();

                if (EvenPeek < OddPeek)
                {
                    StackEvenArrays.pop();
                }
                else if (EvenPeek > OddPeek)
                {
                    StackOddArrays.pop();
                }
                else
                {
                    StackEvenArrays.pop();
                    StackOddArrays.pop();
                }
            }

            //Check Winner
            if (StackEvenArrays.isEmptyStack())
            {
                System.out.println("===> Odd is a Winner!");
            }
            else
            {
                System.out.println("===> Even is a Winner!");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}