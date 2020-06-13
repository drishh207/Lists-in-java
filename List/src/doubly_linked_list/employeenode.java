package doubly_linked_list;

public class employeenode
{
    employee emp;

    public employee getEmp() {
        return emp;
    }

    public void setEmp(employee emp) {
        this.emp = emp;
    }
    employeenode next,prev;

    public employeenode(employee emp) {
        this.emp = emp;
    }

    public employeenode getNext() {
        return next;
    }

    public void setNext(employeenode next) {
        this.next = next;
    }

    public employeenode getPrev() {
        return prev;
    }

    public void setPrev(employeenode prev) {
        this.prev = prev;
    }
    
    public String toString()
    {
        return emp.toString();
    }
}
