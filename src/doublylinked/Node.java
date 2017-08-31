package doublylinked;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Vladimir on 8/30/2017.
 */
public class Node {
    private int data;
    private Node next, prev;

    /**
     * Constructor
     */
    public Node() {
        this.data = 0;
        this.next = null;
        this.prev = null;
    }

    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    /**
     * Constructor with params:
     * @param data stands for node's data
     * @param next stands for the next node ref
     * @param prev stands for the prev node ref
     */
    public Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
