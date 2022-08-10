package view;

import datastructures.listNode;
import helpers.OutputHelper;
import model.lettersASCII;

import java.util.ArrayList;

public class aView {
    public void displayAnItem(ArrayList<lettersASCII> anItem){
        System.out.println(OutputHelper.repeat("-",37));
        System.out.format("| %-15s | %-15s |\n","Letter", "ASCII Code");
        System.out.println(OutputHelper.repeat("-",37));
        System.out.format("| %-15s | %-15s |\n",anItem.getLetter(), anItem.getASCIIValueDec());
        System.out.println(OutputHelper.repeat("-",37));
    }
    public void displayWords(listNode<lettersASCII> anItem){
     System.out.println(OutputHelper.repeat("-",37));
        System.out.format("| %-15s | %-15s |\n","letter", "ASCII Code");
        System.out.println(OutputHelper.repeat("-",37));
        System.out.format("| %-15s | %-15s |\n",anItem.getNodeData().getLetter(), anItem.getNodeData().getASCIIValueDec());
        System.out.println(OutputHelper.repeat("-",37));
}

    public void displayData(ArrayList<lettersASCII> theData){
        System.out.println(OutputHelper.repeat("-",50));
        System.out.format("| %-15s | %-15s | %-15s | %-10s |\n", "Letter", "ASCII Code","Binary Value","Octal Value");
        System.out.println(OutputHelper.repeat("-",50));
        System.out.println(OutputHelper.repeat("-",50));
    }

    public void displayletters(ArrayList<lettersASCII> theData) {
    }
}
