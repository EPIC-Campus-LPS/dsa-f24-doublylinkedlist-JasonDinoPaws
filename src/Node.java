public class Node<E>{
    private Node<E> Next;
    private Node<E> Prev;
    private E Val;


    /** Default Constructer */
    public Node() {}

    /** Sets val to the given value */
    public Node(E val) { Val = val; }

    /** Sets Val to given value and Sets Prev to given prev */
    public Node(E val, Node<E> prev) {Val = val; Prev = prev; }


    /** Sets Next Node to the given node */
    public void SetNext(Node<E> obj) { Next = obj; }


    /** Sets Prev Node to the given node */
    public void SetPrev(Node<E> obj) { Prev = obj; }

    /** Sets Val to the given value */
    public void SetVal(E val) { Val = val; }

    /** @return The current value */
    public E GetVal() { return Val; }

    /** @return The Next Node */
    public Node<E> GetNext() { return Next; }

    /** @return The Prev Node */
    public Node<E> GetPrev() { return Prev; }

    /**
     * @param obj Node
     *            <pre>
     *            Creates boolean sameValue and checks if current value is obj Value
     *            Creates boolean sameNext and checks if Next Node is Obj next Node
     *            Creates boolean sameNext and checks if Prev Node is Obj Prev Node
     *            </pre>
     * @return
     */
    public boolean equals(Node<E> obj) {
        boolean samval = Val == obj.GetVal();
        boolean samNext = Next == obj.GetNext();
        boolean samPrev = Prev == obj.GetPrev();

        return samval && samNext && samPrev;
    }

    /** returns the Value */
    public String toString() {
        return Val+"";
    }
}
