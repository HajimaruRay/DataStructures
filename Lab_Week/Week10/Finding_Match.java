import java.util.Random;
// import java.util.Scanner;

class HashTable {
    Integer[] table;
    int size;
    int n;

    public HashTable(int size, int n) {
        this.size = size;
        this.n = n;
        table = new Integer[size];
    }

    private int hashFunction(int key) {
        return key % size;
    }

    public void insert(int key) {
        int index = hashFunction(key);
        for(;;){
            if (table[index] == null){
                table[index] = key;
                break;
            }
            index = (index+1) % size;
        }
    }

    public void display(int found) {
        System.out.println("--- Hash Table [" + (n-found) + "] ---");
        for (int i = 0; i < size; i++) {
            if (table[i] != null) {
                if (i != hashFunction(table[i]))
                {
                    System.out.print(i + ":" + table[i] + "* ");
                    continue;
                }
                System.out.print(i + ":" + table[i] + " ");
            }
        }
        System.out.println();
    }
}

public class Finding_Match
{
    public static void main(String[] args)
    {
        // Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int n = rand.nextInt(10,21);
        // int n = sc.nextInt();
        int[] randomNumbers = new int[n];
        System.out.print("--- Random Numbers [" + n + "] ---\n");

        for (int i = 0;i < n;)
        {
            boolean isfound = false;
            int num = rand.nextInt(0,101);
            // int num = sc.nextInt();
            for (int j = 0;j < randomNumbers.length;j++)
            {
                if (num == randomNumbers[j])
                {
                    isfound = true;
                    System.out.print("!" + num + " ");
                    break;
                }
            }
            if (!isfound)
            {
                randomNumbers[i] = num;
                System.out.print(num + " ");
                i++;
            }
        }
        System.out.println();


        HashTable hashTable = new HashTable(2*n, n);
        for (int i = 0;i < randomNumbers.length;i++)
        {
            hashTable.insert(randomNumbers[i]);
        }
        int found = 0;
        hashTable.display(found);
        System.out.println("--- Finding Match ---");
        for(;found < 3;)
        {
            boolean isfound2 = false;
            int number = rand.nextInt(0,101);
            // int number = sc.nextInt();
            for(int i = 0;i < hashTable.size;i++)
            {
                if (hashTable.table[i] != null)
                {
                    if (hashTable.table[i] + number == 100)
                    {
                        isfound2 = true;
                        hashTable.table[i] = null;
                        found++;
                        break;
                    }
                }
            }
            if (isfound2)
            {
                System.out.print(number + " ");
            }
            else
            {
                System.out.print("!" + number + " ");
            }
        }
        System.out.println();
        hashTable.display(found);
    }
}