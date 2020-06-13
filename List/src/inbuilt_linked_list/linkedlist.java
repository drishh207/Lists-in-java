package inbuilt_linked_list;
import java.util.*;

public class linkedlist
{   
    public static void printlist(List<employee> list)
    {
       Iterator itr = list.iterator();
        System.out.print("head <=> ");
       while(itr.hasNext())
       {
           System.out.print(itr.next().toString());
           System.out.print(" <=> ");   
       }
        System.out.print("null");
        System.out.println("");
    }
    
    
    public static void main(String args[])
    {        
        LinkedList<employee> list = new LinkedList<>();
        employee emp1 = new employee("Jake",1);
        employee emp2 = new employee("Amy",2);
        employee emp3 = new employee("Terry",3);
        employee emp4 = new employee("Rosa",4);
        employee emp5 = new employee("Charles",5);
        
        list.addFirst(emp1);
        list.addFirst(emp2);
        printlist(list);
        
        list.addLast(emp3);
        printlist(list);
        
        Vector<employee> v = new Vector<>();
        v.addElement(emp4);
        v.addElement(emp5);
        printlist(v);
        
        list.addAll(1,v);    //index starts from 0
        printlist(list);
        
        list.remove();      //removes object from the front
        printlist(list);
        
        list.addFirst(emp5);
        printlist(list);
        list.remove(emp5);  //removes first occurence of the object
        printlist(list);
       
        
        list.retainAll(v);  //retain all the elements present in the collection from the specified collection into the list.
        printlist(list);
    }
    
    
}
