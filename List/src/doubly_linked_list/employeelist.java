package doubly_linked_list;

public class employeelist 
{
    employeenode head,tail;
    int size;
    
    public void addFront(employee emp)
    {
        employeenode node = new employeenode(emp);
        if(head == null)
        {
            head = tail = node;
            head.setNext(null);
            head.setPrev(null);
            tail.setNext(null);
            tail.setPrev(null);
        }
        else
        {
            node.setNext(head);
            head.setPrev(node);
            head = head.getPrev();
        }
        size++;
    }
    
    public employeenode removeFront()
    {
        if(head == null)
            return null;
        head = head.getNext();
        employeenode temp = head.getPrev();
        head.setPrev(null);
        size--;
        return temp;
    }
    
    public void addend(employee emp)
    {
        employeenode node = new employeenode(emp);
        if(head == null)
        {
            head = tail = node;
            head.setNext(null);
            head.setPrev(null);
            tail.setNext(null);
            tail.setPrev(null);
        }
        
        tail.setNext(node);
        node.setPrev(tail);
        tail = tail.getNext();
        size++;
    }
    
    public employeenode removeend()
    {
        if(head == null)
            return null;
        tail = tail.getPrev();
        employeenode temp = tail.getNext();
        tail.setNext(null);
        temp.setPrev(null);
        size--;
        return temp;
    }
    
    public void addindex(employee emp, int index)
    {
        if(index == 1)
            addFront(emp);
        else if(index == size+1)
            addend(emp);
        else
        {
            employeenode node = new employeenode(emp);
            employeenode temp = head;
            int count = 2;
            while(count < index)
            {
                //System.out.println("count: "+count);
                temp = temp.getNext();
                count++;
            }       
            node.setNext(temp.getNext());
            temp.getNext().setPrev(node);
            temp.setNext(node);
            node.setPrev(temp);
            size++;   

        }
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
        temp.getNext().setPrev(temp);
        size--;
        return temp1;
    }
    
    public void printlist()
    {
        employeenode temp = head;
        //System.out.println("tail.getNext(): "+tail.getNext());
        if(head == null)
            System.out.println("null");
        else
        {
            System.out.print("head -> ");
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
    
    public void addBefore(employee newemp,employee emp)
    {
        employeenode temp = head;
        int count = 2;
        while(!temp.getEmp().equals(emp))
        {
//            System.out.println("temp: "+temp.getEmp());
//            System.out.println("count: "+count);
            temp = temp.getNext();
            count++;
        }
        addindex(newemp, count-1);    
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
        
        employee emp7 = new employee("Mac" , 7);
        list.addBefore(emp7, emp3);   //new employee, existing employee
        list.printlist();
    }
}
