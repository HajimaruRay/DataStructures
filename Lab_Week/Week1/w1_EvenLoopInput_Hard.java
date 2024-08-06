import java.util.Scanner;

class Running
{
    Scanner sc = new Scanner(System.in);
    int loop, sum;
    Running()
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

class w1_EvenLoopInput_Hard
{
    
    public static void main(String[] args)
    {
        Running R = new Running();

        R.sum = R.Loopinput(R.loop, R.sum);
        R.Print2dejitnumber(R.sum, R.loop);
    }
}