public class Stack 
{
    private int MaxStackSize = 100;
    private int StackTop = 0;
    private Object[] list;

    public Stack()
    {
        list = new Object[MaxStackSize];
    }
    public Stack(int size)
    {
        list = new Object[size];
        MaxStackSize = size;
    }

    public void initializeStack()
    {
        for(int i = 0;i < StackTop;i++)
        {
            list[i] = null;
        }
        StackTop = 0;
    }
    public boolean isEmptyStack()
    {
        return (StackTop == 0);
    }
    public boolean isFullStack()
    {
        return (StackTop == MaxStackSize);
    }
    public void push (Object newItem) throws Exception
    {
        if (isFullStack())
        {
            throw new Exception("StackOverFlow");
        }
        list[StackTop] = newItem;
        StackTop++;
    }

    public Object pop() throws Exception
    {
        Object itemInfo;
        if (isEmptyStack())
        {
            throw new Exception("StackUnderflow");
        }
        StackTop--;
        itemInfo = list[StackTop];
        list[StackTop] = null;
        return itemInfo;
    }

    public Object peek() throws Exception
    {
        if (isEmptyStack())
        {
            throw new Exception("StackUnderflow");
        }
        return list[StackTop-1];
    }
    public int getSize()
    {
        return StackTop;
    }
    public int getMaxSize()
    {
        return MaxStackSize;
    }
}
