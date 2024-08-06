public class ListNum {
    private Node head=null;

    public ListNum()
    {

    }

    // 1.)
    public int quantity()
    {
        int quantity = 0;
        Node trav = head;
        while (trav != null)
        {
            quantity++;
            trav = trav.getLink();
        }
        return quantity;
    }

    // 2.)
    public void InsertionTail(int newInfo) {
        Node trav1 = head;
        Node trav2 = head;
        Node newNode = new Node(newInfo);
        while (trav1 != null) {
            trav2 = trav1;
            trav1 = trav1.getLink();
        }
        if (trav1 != trav2) {
            trav2.setLink(newNode);
        }
    }

    // 3.)
    public void sorted(int newInfo)
    {
        Node trav1 = head;
        Node trav2 = head;
        Node newNode = new Node(newInfo);
        while((trav1 != null) && (trav1.getInfo() < newNode.getInfo()))
        {
            trav2 = trav1;
            trav1 = trav1.getLink();
        }
        newNode.setLink(trav1);
        if (trav1 != trav2)
        {
            trav2.setLink(newNode);
        }
        else
        {
            head = newNode;
        }
    }

    // 4.)
    public void DeleteHead()
    {
        if (head != null)
        {
            head = head.getLink();
        }
    }

    // 5.)
    public void DeleteTail()
    {
        Node delnode = head;
        Node trav1 = head;
        Node trav2 = head;
        while (trav1.getLink() != null)
        {
            trav2 = trav1;
            trav1 = trav1.getLink();
        }
        delnode = trav1;
        if (trav2 != null)
        {
            trav2.setLink(null);
            if (delnode == head)
            {
                head = null;
            }
        }
    }

    // 6.)
    public void serch(int newInfo)
    {
        Node trav1 = head;
        int num = 1;
        Node newNode = new Node(newInfo);
        while(trav1 != null)
        {
            if (trav1.getInfo() == newNode.getInfo())
            {
                System.out.println("Found the number: " + num);
                break;
            }
            num++;
            trav1 = trav1.getLink();
        }
    }

    // 7.)
    public void deleteChoose(int newInfo)
    {
        Node trav1 = head;
        Node trav2 = head;

        while (trav1 != null)
        {
            if (trav1.getInfo() == newInfo)
            {
                if (trav1 != head)
                {
                    trav2.setLink(trav1.getLink());
                }
                else
                {
                    head = trav1.getLink();
                }
            }

            trav2 = trav1;
            trav1 = trav1.getLink();

        }
    }

    public void addNode(int newInfo) 
    {
    	Node newNode = new Node(newInfo);
		newNode.setLink(head);	
		head = newNode;
    }

    public String toString() 
    {
        Node trav=head;
        String str="";
        while (trav!=null) 
        {			
            str=str.concat(trav.toString());
            //str=str.concat(""+trav.getInfo());
            trav=trav.getLink();
            if(trav!=null)
            {
                str=str.concat(" | ");	
            }	
        }
        return str;
    }

    public static void main(String[] args) {
        ListNum listNum1 = new ListNum();
        listNum1.addNode(40);
        listNum1.addNode(30);  
        listNum1.addNode(20);      
        listNum1.addNode(10);
        System.out.println("AddFront\n"+listNum1);
        listNum1.InsertionTail(50);
        System.out.println("AddTail\n"+listNum1);
        listNum1.sorted(35);
        System.out.println("AddSort\n"+listNum1);
        listNum1.DeleteHead();
        System.out.println("DeleteHead\n"+listNum1);
        listNum1.DeleteTail();
        System.out.println("DeleteTail\n"+listNum1);
        listNum1.serch(30);
        listNum1.deleteChoose(35);
        System.out.println("DeleteChoose\n"+listNum1);
        System.out.println("quantity all= "+listNum1.quantity());
    }
}