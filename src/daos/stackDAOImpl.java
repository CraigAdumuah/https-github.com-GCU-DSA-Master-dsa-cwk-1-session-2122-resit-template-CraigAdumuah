package daos;

import datastructures.ADTStackLL;
import helpers.TextColours;

public class stackDAOImpl<E> {
    private final ADTStackLL<E> theLetterStack;

    public stackDAOImpl() {
        this.theLetterStack = new ADTStackLL<>();
    }

    public stackDAOImpl(ADTStackLL<E> theLetterStack) {
        this.theLetterStack = theLetterStack;
    }

    public void push(E anItem){
        if(!this.theLetterStack.isFull()){
            this.theLetterStack.push(anItem);
        }
        else {
            System.out.format(TextColours.TEXT_CYAN + "Stack Full!" + TextColours.TEXT_RESET + " unable to add.");
        }
    }
    public E pop(){
        if(!this.theLetterStack.isEmpty()){
            return this.theLetterStack.pop().getNodeData();
        }
        else {
            System.out.format(TextColours.TEXT_RED + "Stack Empty!" + TextColours.TEXT_RESET + " unable to remove.");
            return null;
        }
    }

    public String emptyStack() {
        System.out.format(TextColours.TEXT_RED + "Stack Empty!");
        return null;
    }
}
