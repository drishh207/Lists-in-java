//operations on arraylist
package arraylist;
import java.util.*;

public class arraylist 
{
    public static void main(String args[])
    {
        List<employee> list = new ArrayList<>();
        employee emp1 = new employee("Jake",1);
        employee emp2 = new employee("Amy",2);
        employee emp3 = new employee("Terry",3);
        employee emp4 = new employee("Rosa",4);
        employee emp5 = new employee("Charles",5);
        
        list.add(emp1);
        list.add(1, emp2);
        list.add(emp3);
        
        System.out.println(list);
        
        System.out.println(list.contains(emp5));
        
        Vector<employee> v = new Vector<>();
        v.addElement(emp4);
        v.addElement(emp5);
        
        list.addAll(3,v);
        System.out.println(list);
        
        System.out.println(list.containsAll(v));
        
        list.remove(emp1);
        System.out.println(list);
        
        System.out.println(list.indexOf(emp2));
        
        System.out.println(list.equals(v));
        
        list.removeAll(v);
        System.out.println(list);
        
        list.clear();
        System.out.println(list);
    }
}
