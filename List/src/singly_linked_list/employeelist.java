package singly_linked_list;
import java.util.*;

public class employeelist
{
    employeenode head; 
    int size;
    
    public void addFront(employee emp)
    {
        employeenode node = new employeenode(emp);
        node.setNext(head);
        head = node;
        size++;
    }
   
    public employeenode removeFront()
    {
        employeenode emp = head;
        head = head.getNext();
        size--;
        emp.setNext(null);
        return emp;
    }
    
    
    public void addend(employee emp)
    {
        employeenode node = new employeenode(emp);
        employeenode temp = head;
        while(temp.getNext() != null)
        {
            temp = temp.getNext();
        }
        
        temp.setNext(node);
        node.setNext(null);
        size++;
    }
    
    public employeenode removeend()
    {
        employeenode temp = head;
        employeenode temp1;
        while(temp.getNext().getNext()  != null)
        {
            temp = temp.getNext();
        }
        temp1=temp.getNext();
        temp.setNext(null);
        temp1.setNext(null);
        return temp1;
    }
    
    public void addindex(employee emp, int index)
    {
        employeenode node = new employeenode(emp);
        employeenode temp = head;
        employeenode temp1;
        int count = 2;
        while(count < index)
        {
            //System.out.println("count: "+count);
            temp = temp.getNext();
            count++;
        }
        
        temp1 = temp.getNext();
        temp.setNext(node);
        node.setNext(temp1);
        size++;
    }
    
    public employeenode removeindex(int index)
    {
        employeenode temp = head;
        employeenode temp1;
        int count = 2;
        while(count < index)
        {
            //System.out.println("count: "+count);
            temp = temp.getNext();
            count++;
        }
        
        temp1 = temp.getNext();
        temp.setNext(temp1.getNext());
        temp1.setNext(null);
        return temp1;
    }
    
    public void printlist()
    {
        employeenode temp = head;
        if(head == null)
            System.out.println("null");
        else
        {
            System.out.print("head-> ");
            while(temp!=null)
            {
                System.out.print(temp.toString());
                System.out.print(" -> ");
                temp=temp.getNext();
            }
            System.out.print("null");
            System.out.println("");
        }
    }
    
    public static void main(String args[])
    {
        employee emp1 = new employee("Jake",1);
        employee emp2 = new employee("Amy",2);
        employee emp3 = new employee("Terry",3);
        employee emp4 = new employee("Rosa",4);
        employee emp5 = new employee("Charles",5);
        
        employeelist list = new employeelist();
        list.addFront(emp1);
        list.addFront(emp2);
        list.addFront(emp3);
        list.addFront(emp4);
        list.printlist();
        
        list.addend(emp5);
        list.printlist();
        
        list.removeFront();
        list.printlist();
        
        list.removeend();
        list.printlist();
        
        employee emp6 = new employee("Holt" , 6);
        list.addindex(emp6,3);
        list.printlist();
        
        list.removeindex(3);
        list.printlist();
    }
}
