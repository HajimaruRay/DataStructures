import java.util.Random;

public class OddEvenQueue
{
    public static void main(String[] args) 
    {
        Random rand = new Random();
        Queue QueueEven = new Queue();
        Queue QueueOdd = new Queue();
        Queue QueueEvenArrays = new Queue();
        Queue QueueOddArrays = new Queue();
        int RoundCount = 0;
        int EvenCount = 0;
        int OddCount = 0;

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
                    QueueEven.enQueue(RandomNumber);
                }
                else
                {
                    QueueOdd.enQueue(RandomNumber);
                }
            }
            System.out.println();

            //PrintRand Phases
            System.out.println("---Even Queue [ " + QueueEven.getSize() + " ]---");
            System.out.print("[ ");
            while (!QueueEven.isEmptyQueue())
            {
                int Info = (int)QueueEven.deQueue();
                QueueEvenArrays.enQueue(Info);
                System.out.printf(Info + " ");
            }
            System.out.print("]");
            System.out.println();
            System.out.println("---Odd Queue [ " + QueueOdd.getSize() + " ]---");
            System.out.print("[ ");
            while (!QueueOdd.isEmptyQueue())
            {
                int Info = (int)QueueOdd.deQueue();
                QueueOddArrays.enQueue(Info);
                System.out.printf(Info + " ");
            }
            System.out.print("]");
            System.out.println();

            //compare phase
            while (!QueueEvenArrays.isEmptyQueue() && !QueueOddArrays.isEmptyQueue())
            {
                int Evenfront = (int) QueueEvenArrays.front();
                int Oddfront = (int) QueueOddArrays.front();

                if (Evenfront < Oddfront)
                {
                    QueueOddArrays.deQueue();
                    Object Info = QueueEvenArrays.deQueue();
                    QueueEvenArrays.enQueue(Info);
                    OddCount++;
                }
                else if (Evenfront > Oddfront)
                { 
                    QueueEvenArrays.deQueue();
                    Object Info = QueueOddArrays.deQueue();
                    QueueOddArrays.enQueue(Info);
                    EvenCount++;
                }
                else
                {
                    Object Info1 = QueueEvenArrays.deQueue();
                    Object Info2 = QueueOddArrays.deQueue();
                    QueueEvenArrays.enQueue(Info1);
                    QueueOddArrays.enQueue(Info2);
                }
                RoundCount++;
            }

            //Check Winner
            if (QueueEvenArrays.isEmptyQueue())
            {
                System.out.println("===> Winner is Even! ");
            }
            else
            {
                System.out.println("===> Winner is Odd! ");
            }

            //Stat
            if (QueueEvenArrays.isEmptyQueue())
            {
                System.out.print("Round=" + RoundCount + ", " + "Win=(E:" + EvenCount + ", O:" + OddCount + "), Odd Left=" + QueueOddArrays.getSize());
            }
            else
            {
                System.out.print("Round=" + RoundCount + ", " + "Win=(E:" + EvenCount + ", O:" + OddCount + "), Even Left=" + QueueEvenArrays.getSize());
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}