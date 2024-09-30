import java.util.Random;

public class SArr
{
    static int arr[];

    public SArr(int n)
    {
        arr = new int[n];
    }
    public static void randVal(int m)
    {
        Random rand = new Random();
        for (int i = 0;i < arr.length;i++)
        {
            arr[i] = rand.nextInt(-m, m);
        }
    }

    public static void  printVal()
    {
        for (int i = 0;i < arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void insertSort(int[] arr)
    {
        int i, j, tmp;
        for (i = 1; i < arr.length; i++)
        {
            tmp = arr[i];
            for (j = i; j>0 && arr[j - 1] > tmp; j--)
            {
                arr[j] = arr[j - 1];
            }
            arr[j] = tmp;
        }
        System.out.println("Insertion Sort :");
    }

    public static void selectionSort(int[] arr)
    {
        int i, j, minIndex, tmp;
        int n = arr.length;
        for (i = 0;i < n - 1;i++)
        {
            minIndex = i;
            for (j = i + 1; j < n;j++)
            {
                if (arr[j] < arr[minIndex])
                {
                    minIndex = j;
                }
            }
            if (minIndex != i)
            {
                tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
            }
        }
        System.out.println("Selection Sort :");
    }

    public static void bubbleSort(int arr[])
    {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped)
        {
            swapped = false;
            j++;
            for (int i = 0;i < arr.length - j;i++)
            {
                if (arr[i] > arr[i + 1])
                {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i +1 ] = tmp;
                    swapped = true;
                }
            }
        }
        System.out.println("Bubble Sort :");
    }

    public static void shellSort(int arr[])
    {
        int j;
        for (int gap = arr.length/2; gap > 0; gap /= 2)
        {
            for (int i = gap;i < arr.length;i++)
            {
                int tmp = arr[i];
                for (j = i;j >= gap&&tmp < arr[j - gap]; j -= gap)
                {
                    arr[j] = arr[j - gap];
                }
                arr[j] = tmp;
            }
        }
        System.out.println("Shell Sort :");
    }

    public static void main(String[] args)
    {
        Random rand = new Random();

        for (int i = 0;i < 4;i++)
        {
            int n = rand.nextInt(10, 21);
            int m = rand.nextInt(10, 51);
            new SArr(n);
            SArr.randVal(m);
            System.out.println("Random "+ n +" numbers ["+ (m* -1) +".."+ m +"] : ");
            SArr.printVal();
            if (i == 0)
            {
                SArr.insertSort(arr);
            }
            else if (i == 1)
            {
                SArr.selectionSort(arr);
            }
            else if (i == 2)
            {
                SArr.bubbleSort(arr);
            }
            else
            {
                SArr.shellSort(arr);
            }
            SArr.printVal();
            System.out.println("------------------------------");
        }
        
    }
}