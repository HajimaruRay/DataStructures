public class Stack 
{
    private int StackSize = 0;
    private Node StackTop = null;

    public Stack() 
    {
        StackTop = null;
    }

    public void initializeStack()
    {
        StackTop = null;
    }

    public boolean isEmptyStack()
    {
        return (StackTop == null);
    }

    public boolean isFullStack()
    {
        return false;
    }

    public void push(Object newItem)
    {
        Node newNode = new Node(newItem);
        newNode.setLink(StackTop);
        StackTop = newNode;
        StackSize++;
    }

    public Object pop() throws Exception
    {
        Object itemInfo;
        if (isEmptyStack())
        {
            throw new Exception("StackUnderflow");
        }
        itemInfo = StackTop.getInfo();
        StackTop = StackTop.getLink();
        StackSize--;
        return itemInfo;
    }

    public Object peek() throws Exception
    {
        if (isEmptyStack())
        {
            throw new Exception("StackUnderflow");
        }
        return StackTop.getInfo();
    }

    public int getSize()
    {
        return StackSize;
    }
}
