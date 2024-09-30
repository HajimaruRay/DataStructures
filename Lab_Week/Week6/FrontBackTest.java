public class FrontBackTest {
    public static void main(String[] args) {
        Queue Q = new Queue();
        Q.enQueue(1);
        Q.enQueue(2);
        Q.enQueue(3);
        Q.enQueue(4);
        try
        {
            System.out.println(Q.front() + " " + Q.back());
            Q.deQueue();
            Q.enQueue(1);
            System.out.println(Q.front() + " " + Q.back());
        }
        catch (Exception e)
        {

        }
        
    }
}
