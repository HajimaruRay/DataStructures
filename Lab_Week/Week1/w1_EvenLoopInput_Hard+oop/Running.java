import java.util.Scanner;

public class Running
{
    Scanner sc = new Scanner(System.in);
    int loop, sum;
    public Running()
    {
        PrintName();
        this.loop = sc.nextInt();
        this.sum = 0;
    }
    int Loopinput(int loop, int sum)
    {
        for(int i = 0;i < loop;)
        {
            int number = sc.nextInt();
            if (number%2 == 0)
            {
                sum += number;
                i++;
            }
        }
        return sum;
    }

    void Print2dejitnumber(int sum, int loop)
    {
        System.out.printf("%.2f",(double)sum/loop);
    }

    void PrintName()
    {
        System.out.println("Created by 660710075 Chonlatree Ketkorwoing");
    }
}