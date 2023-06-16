package en.codegym.task.pro.task13.task1313;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node newNode = new Node();
        newNode.value = value;

        if (first.next == null && last.prev == null) {
            first.next = last;
            last.prev = first;
        }

        newNode.prev = last.prev;
        last.prev.next = newNode;
        last.prev = newNode;

    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
