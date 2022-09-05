package LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>(
                new Node<Integer>(1, new Node<Integer>(2, new Node<Integer>(3, null)))
        );

        System.out.println(linkedList.getIndex(0));
        System.out.println(linkedList.getIndex(1));
        System.out.println(linkedList.getIndex(2));
        System.out.println("-----------------------------");

        linkedList.removeIndex(0);

        System.out.println(linkedList.getIndex(0));
        System.out.println(linkedList.getIndex(1));
    }
}
