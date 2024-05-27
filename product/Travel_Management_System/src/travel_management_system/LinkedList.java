package travel_management_system;

public class LinkedList {
    node head = new node();
    
    void add(double num)
    {
        node temp = new node(num, null);
        if (head == null)
        {
            head = temp;
        }
        else
        {
           temp.next = head;
           head = temp;
        }
    }
    
    void delete()
    {
        if (head != null)
        {
            head = head.next;
        }
        else
        {
            System.out.println("The linked list is empty.");
        }
    }
    
    String print()
    {
        node temp = head;
        String list = "";
        while (temp != null)
        {
            System.out.println(temp.num);
            list = list + temp.num + ", ";
            temp = temp.next;
        }
        list = list.substring(0, list.length() - 2);
        list = "( " + list + " )";
        return list;
    }
}
