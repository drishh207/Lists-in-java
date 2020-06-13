package singly_linked_list;
import java.util.*;

public class employeenode 
{
    employee employee;
    employeenode next;

    public employeenode(employee employee) {
        this.employee = employee;
    }

    public employee getEmployee() {
        return employee;
    }

    public void setEmployee(employee employee) {
        this.employee = employee;
    }

    public employeenode getNext() {
        return next;
    }

    public void setNext(employeenode next) {
        this.next = next;
    }
    
    public String toSrtring()
    {
        return employee.toString();
    }
}
