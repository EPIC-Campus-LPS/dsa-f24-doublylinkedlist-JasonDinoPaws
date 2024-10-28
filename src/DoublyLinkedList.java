public class DoublyLinkedList<E> implements List<E> {
    /**
     * <pre>
     * Delares Node elements First and Last
     * Inisulizes Size to be 0
     * </pre>
     */
    private Node<E> First;
    private Node<E> Last;
    private int Size = 0;

    public DoublyLinkedList(){}


    /**
     * @param val element to add to the list
     *        <pre>
     *            Creates a New Node the params of Val and Last
     *
     *            Checks if First is null
     *              sets First and Last to be Node
     *            else
     *              sets the Last Element Next to the the Nod
     *              Last is now Node
     *
     *            Adds 1 to Size
     *        </pre>
     */
    public void add(E val)
    {
        Node<E> nod = new Node<>(val,Last);

        if (First == null)
        {
            First = nod;
            Last = nod;
        }else
        {
            Last.SetNext(nod);
            Last = nod;
        }
        Size++;
    }

    /**
     * @param p index of the element
     * @param val element to add to the list
     *            <pre>
     *            Checks if P is less than Size if not throws a IndexOutOfBounds
     *
     *            Creates a Node with just Val
     *            Creates Prev with the value of First
     *            Creates i for the loop
     *
     *            Loops throw every Node until it hits p-1 and sets Prev to the next element
     *
     *            if i == 0
     *              sets First to the Node
     *              Sets the Prev Prev to the Nod
     *              Sets the Node Next to Prev
     *            else
     *              Sets the Prev Next Prev to Node
     *              Sets the Node Next to Prev Next
     *              Sets the Node Prev to Prev
     *              Sets Prev Next to Node
     *
     *            Adds 1 to Size
     *            </pre>
     */
    public void add(int p, E val) {
        if (p > Size)
            throw new IndexOutOfBoundsException("Out of Bounds");

        Node<E> nod = new Node<>(val);
        Node<E> prev = First;
        int i;

        for (i = 0; i < p - 1; i++)
            prev = prev.GetNext();

        if (i == 0)
        {
            First = nod;
            nod.SetNext(prev);
            prev.SetPrev(nod);
        }
        else
        {
            prev.GetNext().SetPrev(nod);
            nod.SetNext(prev.GetNext());
            nod.SetPrev(prev);
            prev.SetNext(nod);
        }
        Size++;
    }

    /**
     * <pre>
     *     Sets First to null
     *     Sets Last to null
     *     Sets Size to 0
     * </pre>
     */
    public void remove()
    {
        First = null;
        Last = null;
        Size = 0;
    }

    /**
     * @param p index of the element to remove
     *          <pre>
     *          Checks if p is less than size else throws IndexOutOfBounds
     *          Creates Node temp and sets it to First
     *
     *          loops threw until it gets to p while settings temp to the next node
     *
     *          if the selected node has Prev
     *              sets that next node to next
     *
     *          if the selected node has Next
     *              sets that prev node to Prev
     *
     *          minus 1 from size
     *          </pre>
     * @return The Removed Node
     */
    public Node<E> remove(int p){
        if (p > Size)
            throw new IndexOutOfBoundsException("Out of Bounds");

        Node<E> temp = First;

        for (int i = 0; i < p; i++)
            temp = temp.GetNext();

        if (temp.GetPrev() != null)
            temp.GetPrev().SetNext(temp.GetNext());

        if (temp.GetNext() != null)
            temp.GetNext().SetPrev(temp.GetPrev());

        Size--;
        return temp;
    }


    /**
     * @param p index of the element
     *          <pre>
     *          Checks if p is less than size else throws IndexOutOfBounds
     *
     *          creates Node find and sets it to first
     *          loops threw until it gets to p while settings find to the next node
     *          </pre>
     * @return slected node
     */
    public Node<E> get(int p){
        if (p > Size)
            throw new IndexOutOfBoundsException("Out of Bounds");

        Node<E> find = First;
        for (int i = 0; i < p; i++)
            find = find.GetNext();

        return find;
    }

    /**
     * @param p index of the element to set
     * @param element new value of the element
     *
     *                <pre>
     *                Checks if p is less than size else throws IndexOutOfBounds
     *
     *                creates Node temp and sets it to first
     *                loops threw until it gets to p while settings temp to the next node
     *
     *                sets the temp node value to element
     *                </pre>
     */
    public void set(int p, E element){
        if (p > Size)
            throw new IndexOutOfBoundsException("Out of Bounds");

        Node<E> temp = First;
        for (int i = 0; i < p; i++)
            temp = temp.GetNext();

        temp.SetVal(element);
    }

    /**
     * @return the size value
     */
    public int size() { return Size; }

    /**
     * @return if the size value is 0
     */
    public boolean isEmpty() { return size() == 0; }

    /**
     * <pre>
     *     creates a string called out and sets it to "["
     *     creates Node temp and sets it to first
     *
     *     loops threw the list from 0 to size
     *      if i is not 0 adds ", " to the out string
     *
     *     adds the current temp node value to the out string
     *     sets temp to the next node
     * </pre>
     * @return the out string with "]" added on the end
     */
    @Override
    public String toString() {
        String out = "[";
        Node<E> temp = First;

        for (int i = 0; i < Size; i++)
        {
            if (i != 0)
                out += ", ";
            out += temp.GetVal();
            temp = temp.GetNext();
        }

        return out+"]";
    }
}
