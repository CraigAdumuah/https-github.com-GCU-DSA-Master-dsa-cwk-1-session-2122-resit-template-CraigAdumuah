package datastructures;

public class ADTStackLL <E> implements IADTStack<E> {
    private listNode<E> stackTop;  // This will be null if empty or point to the top of the list
    private int stackSize;      // This will maintain the size of the stack

    /**
     * Default constructor
     */
    public ADTStackLL() {
        this.stackTop = null;
        this.stackSize = 0;
    }

    public ADTStackLL(listNode<E> stackTop, int theStackSize) {
        this.stackTop = stackTop;
        this.stackSize= theStackSize;
    }

    @Override
    public void createStack() {
        this.stackTop = null;
        this.stackSize = 0;
    }

    @Override
    public void push(E theNode) {
        if (isFull()) {
            System.out.println("Stack is full!");
        } else {
            listNode<E> tmp = new listNode<>();
            tmp.setNodeData(theNode);
            tmp.setNextNode(this.stackTop);
            this.stackTop = tmp;
            this.stackSize++;
        }
    }

    @Override
    public listNode<E> pop() {
        if (isEmpty()) {
            throw new NullPointerException("Can't pop stack its Empty!!");
        } else {
            // Move the head pointer to the next node
            listNode<E> temp = stackTop;
            stackTop = stackTop.getNextNode();
            this.stackSize--;
            return temp;
        }
    }

    @Override
    public listNode<E> peek() {
        if (isEmpty())
            throw new NullPointerException("Can't peek at top item as the stack is Empty!!");
        else
            return stackTop;
    }

    @Override
    public boolean isEmpty() { return (this.getStackSize() == 0); }

        @Override
        public boolean isFull () {
        // Technically for a linked list implementation there is
        // no limit. However, it may be possible for the heap to be
        // full which will cause a "stack overflow"
        return false;
    }

        public void displayStack () {
        System.out.println(this.outputStack());
    }

        public String outputStack () {
        StringBuilder sb = new StringBuilder("\n");
        if (isEmpty()) {
            sb.append("The stack is Empty!!");
        } else {
            listNode<E> tmp = this.stackTop;
            while (tmp != null) {
                String data = tmp.getNodeData().toString() + "\n";
                sb.append(data);
                tmp = tmp.getNextNode();
            }
        }
        return sb.toString();
    }


        public int getStackSize () { return this.stackSize; }

}
