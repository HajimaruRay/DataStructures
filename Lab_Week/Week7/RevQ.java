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
            Queue Odd = new Queue();
            Stack OddKeepForReverse = new Stack();
            Queue OddReverse = new Queue();
            while (!q.isEmptyQueue())
            {
                Object Info = q.deQueue();
                Default.enQueue(Info);
                if ((int)Info % 2 != 0)
                {
                    Odd.enQueue(Info);
                }
            }
            while (!Odd.isEmptyQueue())
            {
                Object Info = Odd.deQueue();
                OddKeepForReverse.push(Info);
            }
            while (!OddKeepForReverse.isEmptyStack()) 
            {
                OddReverse.enQueue(OddKeepForReverse.pop());
            }

            while (!Default.isEmptyQueue())
            {
                Object Info = Default.deQueue();
                if ((int)Info % 2 == 0)
                {
                    q.enQueue(Info);
                }
                else
                {
                    q.enQueue(OddReverse.deQueue());
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
