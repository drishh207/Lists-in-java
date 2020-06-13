package singly_linked_sorting;

public class linkedlist 
{
    nodeclass head,tail;
    int size;
    
    public void add(int item)
    {
        nodeclass node = new nodeclass(item);
        nodeclass temp = head;
        int count1 = 0;
        
        if(head == null)
        {
            head = tail = node;
            head.setNext(null);
            head.setPrev(null);
            tail.setNext(null);
            tail.setPrev(null);
            size++;
        }
        
        else
        {
            //System.out.println("size: "+size+" count1: "+count1);
            while(temp!=null)
            {
                if(item > temp.getItem())
                {
                    temp = temp.getNext();
                    count1++;
                    //System.out.println("count1 for each: "+count1);
                }
                else
                    break;
            }
            //count1++;
            temp = head;
            if(count1 == 0)
                addFront(item);
            else if(count1 == size)
                addend(item);
            else
            {
                int count = 1;
                while(count < count1)
                {
                    //System.out.println("count: "+count+"temp.getNext()"+temp.getItem());
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
        
    }
    
    public void addend(int item)
    {
        nodeclass node = new nodeclass(item);
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
    
    public void addFront(int item)
    {
        nodeclass node = new nodeclass(item);
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
    
    
    public void printlist()
    {
        nodeclass temp = head;
        //System.out.println("tail.getNext(): "+tail.getNext());
        if(head == null)
            System.out.println("null");
        else
        {
            System.out.print("head -> ");
            while(temp!=null)
            {
                System.out.print(temp.getItem());
                System.out.print(" -> ");
                temp=temp.getNext();
            }
            System.out.print("null");
            System.out.println("");
        }
    }
    
    
    public static void main(String args[])
    {
        linkedlist list = new linkedlist();
        list.add(5);
        list.printlist();
        list.add(2);
        list.printlist();
        list.add(6);
        list.printlist();
        list.add(1);
        list.printlist();
        list.add(0);
        list.printlist();
        list.add(3);
        list.printlist();
        list.add(4);
        list.printlist();
        list.add(3);
        list.printlist();
        list.add(10);
        list.printlist();
    }
}
