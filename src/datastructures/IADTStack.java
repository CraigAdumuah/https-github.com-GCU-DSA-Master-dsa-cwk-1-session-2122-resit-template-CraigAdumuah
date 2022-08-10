package datastructures;

public interface IADTStack<E> {
    /**
     * This method will be used to construct a stack
     */
    void createStack();
    /**
     * Use this method to add (push) an item/object onto the stack
     * @param e Generic object
     */
    void push(E e);
    /**
     * Use this method to remove (pop) an item off/from the stack
     * @return an item/object from the stack
     */
    listNode<E> pop();
    /**
     * Use this method to see the item/object on the top of the stack.
     * The item/object is not removed from the stack.
     * @return the item/object at the top of the stack.
     */
    listNode<E> peek();
    /**
     * Use this method to determine if the stack is empty
     * i.e. contains no items.
     * @return true or false
     */
    boolean isEmpty();
    /**
     * Use this method to determine if the stack is full.
     * i.e. has reached its maximum capacity.
     * @return true or false.
     */
    boolean isFull();
}
