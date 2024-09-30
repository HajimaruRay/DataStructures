/*
NO: xx
ID: 660710075
GROUP: 1
CODE: xxxx
SEAT: xx
IP: N.N.N.N
*/

import java.util.Scanner;

public class RevQ {

    public static void inputQ(Queue q) {
        Scanner keyboard = new Scanner(System.in);
        int data;
        try{
            do {
                data = keyboard.nextInt();
                if(data>=0)
                    q.enQueue(data);
            } while(data>=0);
        } catch(Exception e) {}
        keyboard.close();
    } 

    public static void showQ(Queue q) {
        try{
            while (!q.isEmptyQueue())
            {
                System.out.print(q.deQueue() + " ");
            }
        } catch(Exception e) {}
    }

    public static void reverseOddQ(Queue q) {
		try{
            Queue Default = new Queue();
            Stack OddKeepForReverse = new Stack();
            // Copy Q to keep it in Default and if it odd copy only odd to keep in Odd Q
            while (!q.isEmptyQueue())
            {
                Object Info = q.deQueue();
                Default.enQueue(Info);
                if ((int)Info % 2 != 0)
                {
                    OddKeepForReverse.push(Info);
                }
            }
            // Examble all if Default is Even just put Default in q and if it odd put OddReverse in q
            while (!Default.isEmptyQueue())
            {
                Object Info = Default.deQueue();
                if ((int)Info % 2 == 0)
                {
                    q.enQueue(Info);
                }
                else
                {
                    q.enQueue(OddKeepForReverse.pop());
                }
            }
        }catch(Exception e) {}
    }
    
    public static void main(String[] args) {
        Queue q=new Queue();
        inputQ(q);
        reverseOddQ(q);
        showQ(q);
    }
}
