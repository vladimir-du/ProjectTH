package doublylinked;

import java.util.Scanner;

/**
 * @author Vladimir on 8/31/2017.
 */
public class LinkedListMenu {
    public void menu(){
        Scanner scanner = new Scanner(System.in);

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        char ch;

        do {
            System.out.println("\nChoose your action:\n" +
                    "1 - Add an element at the head of the list.\n" +
                    "2 - Add an element at the tail of the list.\n" +
                    "3 - Insert an element to the chosen location.\n" +
                    "4 - Remove an element from the chosen location.\n" +
                    "5/6/7 - Get head/element by index/tail from the list.\n" +
                    "8 - Clear the list.\n" +
                    "9 - Check the list for emptiness.\n");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nEnter an integer to place into a node: ");
                    doublyLinkedList.pushFront(scanner.nextInt());
                    break;
                case 2: System.out.println("\nEnter an integer to place into a node: ");
                    doublyLinkedList.pushBack(scanner.nextInt());
                    break;
                case 3: System.out.println("\nEnter an integer to place into a node: ");
                    int data = scanner.nextInt();
                    System.out.println("\nEnter an index to place the integer you have entered: ");
                    int index = scanner.nextInt();
                    if (index < 1 || index > doublyLinkedList.getSize()){
                        System.out.println("Element index out of bounds");
                        break;
                    }
                    if (!doublyLinkedList.insert(data, index)) {
                        System.out.println("A problem has been detected.\n" +
                                "Element insertion failed");
                    }
                    break;
                case 4: System.out.println("\nEnter an index of an element you want to remove: ");
                    if(!doublyLinkedList.remove(scanner.nextInt())){
                        System.out.println("Removal operation failed.\n" +
                                "List might be already empty or the element index is out of bounds.");
                    }
                    break;
                case 5:
                    System.out.println("\nThe head of the list: " + doublyLinkedList.getHead().getData() + "]");
                    break;
                case 6: System.out.println("\nEnter an index of an element you want to get: ");
                    System.out.println("An element of the list you requested: [" +
                            doublyLinkedList.getByIndex(scanner.nextInt()).getData() + "]");
                    break;
                case 7:
                    System.out.println("\nThe tail of the list: [" + doublyLinkedList.getHead().getData() + "]");
                    break;
                case 8:
                    if (doublyLinkedList.clear()){
                        System.out.println("\nThe list is cleared.");
                    } else {
                        System.out.println("\nThe list is already empty.");
                    }
                    break;
                case  9: if (doublyLinkedList.isEmpty()){
                    System.out.println("The list is empty.");
                } else {
                    System.out.println("The list contains some data.");
                }
            }

            doublyLinkedList.print();

            System.out.println("Continue?\n" +
                    "Yes(\"y\")/No(\"n\")");
            ch = scanner.next().charAt(0);

        } while (ch == 'Y' || ch == 'y');
    }
}
