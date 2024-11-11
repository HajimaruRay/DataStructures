import java.util.Scanner;
import java.util.Random;

class Hashh {
    private Integer table[];
    private int size;

    public Hashh(int n) {
        this.size = n * 2;
        table = new Integer[this.size];
    }

    public int hashFunction(int key) {
        return key % size;
    }

    public boolean Insert(int key) {
        int index = hashFunction(key);
        for (int i = 0; i < size; i++) {
            if (table[i] != null && table[i] == key) {
                return false;
            }
        }
        if (table[index] == null) {
            table[index] = key;
            return true;
        } else {
            for (;;) {
                if (table[index] == null) {
                    table[index] = key;
                    return true;
                }
                index++;
            }
        }
    }

    public boolean Scarching(int key) {
        boolean isfound = false;
        for (int i = 0; i < size; i++) {
            if (table[i] != null && table[i] + key == 100) {
                table[i] = null;
                return !isfound;
            }
        }
        return isfound;
    }

    public void displayhash() {
        for (int i = 0; i < size; i++) {
            if (table[i] != null) {
                if (i == hashFunction(table[i])) {
                    System.out.print(i + ":" + table[i] + " ");
                } else {
                    System.out.print(i + ":" + table[i] + "* ");
                }

            }
        }
        System.out.println();
    }
}

public class Finding_Match2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        // int n = sc.nextInt();
        int n = rand.nextInt(10, 21);
        Hashh hs = new Hashh(n);

        System.out.println("--- Random Numbers [" + n + "] ---");
        for (int i = 0; i < n; i++) {
            // int input = sc.nextInt();
            int input = rand.nextInt(0, 101);
            if (hs.Insert(input)) {
                System.out.print(input + " ");
            } else {
                System.out.print("!" + input + " ");
                i--;
            }
        }

        System.out.println("\n--- Hash Table [" + n + "] ---");
        hs.displayhash();
        System.out.println("--- Finding Match ---");

        int found = 0;
        int count = 0;
        while (found < 3) {
            // int m = sc.nextInt();
            int m = rand.nextInt(0, 101);
            count++;
            boolean isfound = hs.Scarching(m);
            if (isfound) {
                System.out.print(m + " ");
                found++;
            } else {
                System.out.print("!" + m + " ");
            }
        }
        System.out.println("\nTotal Finding: " + count);
        System.out.println("--- Hash Table [" + (n - 3) + "] ---");
        hs.displayhash();
    }
}