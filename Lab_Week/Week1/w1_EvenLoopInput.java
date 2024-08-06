import java.util.Scanner;

class w1_EvenLoopInput
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Created by 660710075 Chonlatree Ketkorwoing");

        int loop = sc.nextInt();
        int sum = 0;

        for(int i = 0;i < loop;)
        {
            int number = sc.nextInt();

            if (number%2 != 0)
            {
                continue;
            }
            else
            {
                sum += number;
                i++;
            }
        }

        System.out.printf("%.2f",(double)sum/loop);
        sc.close();
    }
}