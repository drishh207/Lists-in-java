package singly_linked_sorting;

public class nodeclass 
{
    private int item;
    nodeclass next,prev;

    public nodeclass(int item) {
        this.item = item;
    }

    public nodeclass getNext() {
        return next;
    }

    public void setNext(nodeclass next) {
        this.next = next;
    }

    public nodeclass getPrev() {
        return prev;
    }

    public void setPrev(nodeclass prev) {
        this.prev = prev;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }
    
    
}
