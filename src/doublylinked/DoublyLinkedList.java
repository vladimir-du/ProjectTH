package doublylinked;

/**
 * @author Vladimir on 8/30/2017.
 */
public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int size;


    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void pushFront(int data){

        Node nodeTmp = new Node(data);

        if(this.head == null){
            this.head = nodeTmp;
            this.tail = head;
        } else {
            head.setPrev(nodeTmp);
            nodeTmp.setNext(head);
            head = nodeTmp;
        }

        size++;
    }

    public void pushBack(int data){

        Node nodeTmp = new Node(data);

        if (head == null){
            head = nodeTmp;
            tail = head;
        } else {
            nodeTmp.setPrev(this.tail);
            tail.setNext(nodeTmp);
            tail = nodeTmp;
        }

        size++;
    }

    public boolean insert(int data, int index){

        Node ptrTmp = new Node(data);

        if (index == 1){
            pushFront(data);

            return true;

        } else if (index == size+1){
            pushBack(data);

            return true;

        } else if (index > 1 && index <= size){

            Node countPtr = head;

            for (int i = 2; i <= size ; i++) {

                if (i == index){
                    Node nodeTmp = countPtr.getNext();

                    countPtr.setNext(ptrTmp);
                    ptrTmp.setNext(nodeTmp);
                    ptrTmp.setPrev(countPtr);
                    nodeTmp.setPrev(ptrTmp);

                    size++;

                    return true;
                }

                countPtr = countPtr.getNext();
            }
        }

        return false;
    }

    public boolean remove(int index){

        if(index == 1){

            if (size == 1){
                head = null;
                tail = null;
                size = 0;

                return true;
            }

            head = head.getNext();
            head.setPrev(null);

            size--;

            return true;

        } else if(index == size){
            tail = tail.getPrev();
            tail.setNext(null);

            size--;

            return true;

        } else if (index > 1 && index < size) {
            Node ptrTmp = head.getNext();

            for (int i = 2; i <= index; i++) {
                if (i == index) {
                    Node next = ptrTmp.getNext();
                    Node prev = ptrTmp.getPrev();

                    prev.setNext(next);
                    next.setPrev(prev);

                    size--;

                    return true;
                }

                ptrTmp = ptrTmp.getNext();
            }
        }

        return  false;
    }

    public boolean clear(){
        if (head != null){
            head = null;
            tail = null;
            size = 0;

            return true;
        }

        return false;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public Node getByIndex(int index){
        Node ptrTmp = head.getNext();

        for (int i = 1; i <= size; i++) {

            if (i == index){
                return ptrTmp;
            }

            ptrTmp = ptrTmp.getNext();
        }

        return  null;
    }

    public String print(){
        String str = "DoublyLinkedList";

        if (head == null){
            return str + " is empty.\n";
        } else if (head.getNext() == null){
            return str + ":\n [" + head.getData() + "]\n";
        }

        Node tmpPtr = head.getNext();
        str += ":\n [" + head.getData() + ", ";

        while (tmpPtr.getNext() != null) {
            str = str + tmpPtr.getData() + ", ";

            tmpPtr = tmpPtr.getNext();

        }

        str += tail.getData();

        return str + "]\n";

    }

    /*
    * push(obj);
    * get(index);
    * getAll();
    * remove(index);
    * size();
    * contains(obj); - ?
    * indexOf(obj); - ?
    * isEmpty();
    * */
}
