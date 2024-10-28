public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.toString()); // [10, 20, 30]

        list.add(2, 40);
        list.add(0, 5);
        list.set(2, 50);
        System.out.println(list.toString()); // [5, 10, 50, 40, 30]

        list.remove(4);
        list.remove(2);
        System.out.println(list.size()); // 3
        System.out.println(list.toString()); // [5, 10, 40]
        list.remove();
        System.out.println(list.isEmpty()); // [5, 10, 40]
        System.out.println(list.toString()); // []

        try {
            list.remove(1);
            System.out.println("Inbounds");
        } catch (IndexOutOfBoundsException E)
        {
            System.out.println("Out of Bounds");
        }
    }
}