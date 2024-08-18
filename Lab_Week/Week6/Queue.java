public class Queue 
{
    private Node queueFront = null;
    private Node queueRear = null;
    private int count = 0;

    public void initializeQueue()
    {
        queueFront = null;
        queueRear = null;
        count = 0;
    }

    public boolean isEmptyQueue()
    {
        return (queueFront == null);
    }

    public boolean isFullQueue()
    {
        return false;
    }

    public Object front() throws Exception
    {
        if (isEmptyQueue())
        {
            throw new Exception("QueueUnderflow");
        }
        return queueFront.getInfo();
    }

    public Object back() throws Exception
    {
        if (isEmptyQueue())
        {
            throw new Exception("QueueUnderflow");
        }
        return queueRear.getInfo();
    }

    public void enQueue(Object newItem)
    {
        Node newNode = new Node(newItem);
        if (queueFront == null)
        {
            queueFront = newNode;
            queueRear = newNode;
        }
        else
        {
            queueRear.setLink(newNode);
            queueRear = queueRear.getLink();
        }
        count++;
    }

    public Object deQueue() throws Exception
    {
        Object itemInfo;
        if (isEmptyQueue())
        {
            throw new Exception("QueueUnderFlow");
        }
        itemInfo = queueFront.getInfo();
        queueFront = queueFront.getLink();
        if (queueFront == null)
        {
            queueRear = null;
        }
        count--;
        return itemInfo;
    }

    public int getSize()
    {
        return count;
    }
}