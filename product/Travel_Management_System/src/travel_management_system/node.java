package travel_management_system;

public class node {
    double num;
    node next;
    
    node()
    {
        next = null;
    }
    
    node(double num, node next)
    {
        this.num = num;
        this.next = next;
    }
}
