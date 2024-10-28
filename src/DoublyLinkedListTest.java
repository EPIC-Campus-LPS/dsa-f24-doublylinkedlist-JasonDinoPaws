import org.junit.jupiter.api.Test;

import java.security.PublicKey;
import java.util.stream.StreamSupport;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {
    private DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

    @Test
    void add() {
        System.out.println("Add");
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(6);
        list.add(7);
        list.add(3);
        System.out.println(list.toString());
    }

    @Test
    void testAdd() {
        add();
        System.out.println("TestAdd");
        list.add(1,2);
        list.add(2,5);
        list.add(4,65);
        list.add(2,54);

        try {
            list.add(52,5);
        }
        catch (IndexOutOfBoundsException E)
        {
            System.out.println("Passed Add Test Out of bounds");
        }
        System.out.println(list.toString());
    }

    @Test
    void remove() {
        System.out.println("Remove");
        add();
        list.remove();
        System.out.println(list.toString());
    }

    @Test
    void testRemove() {
        System.out.println("TestRemove");
        add();
        list.remove(1);
        list.remove(0);
        list.remove(4);
        list.remove(2);

        try {
            list.remove(124);
        }
        catch (IndexOutOfBoundsException E)
        {
            System.out.println("Passed Remove Test OUt of BOunds");
        }
        System.out.println(list.toString());
    }

    @Test
    void get() {
        System.out.println("Get");
        add();
        System.out.println(list.get(1));
        System.out.println(list.get(4));
        System.out.println(list.get(5));
        System.out.println(list.get(6));
        System.out.println(list.toString());
    }

    @Test
    void set() {
        System.out.println("Set");
        add();
        list.set(1,5);
        list.set(2,7);
        list.set(3,2);
        list.set(4,55);
        list.set(5,125);
        System.out.println(list.toString());
    }
}