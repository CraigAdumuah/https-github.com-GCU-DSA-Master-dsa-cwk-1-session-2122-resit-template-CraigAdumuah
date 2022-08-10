package controllers;

import daos.arrayDAOImpl;
import daos.stackDAOImpl;
import datastructures.listNode;
import helpers.InputHelper;
import helpers.OutputHelper;
import helpers.TextColours;
import model.lettersASCII;
import view.aView;


public class controller {

    private final arrayDAOImpl lettersASCII;
    private final aView listView;
    private final stackDAOImpl letterStack;
    private final InputHelper inputHelper;
    private Object arrayDAO;

    public controller() {

        this.lettersASCII = new arrayDAOImpl();
        this.listView = new aView();
        this.letterStack = new stackDAOImpl();
        this.inputHelper = new InputHelper();
    }

    /**
     * Displays the menu and uses an InputHelper object
     * to accept valid user choice.
     * An appropriate private method is called to implement the choice.
     */
    public void run() {
        boolean finished = false;

        int iChoice = 0;
        this.setup();

        System.out.println();

        do {
            this.theMenu();
            iChoice = inputHelper.readInt("Enter choice", 4,1);

            switch (iChoice) {
                // Add more cases
                case 1:
                    this.viewList();
                    System.out.println();
                    break;
                case 2:
                    this.FindLetter();
                    System.out.println();
                    break;
                case 3:
                    this.addLetter();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("All done! Bye ...");
                    finished = true;
                    break;
                default: // invalid option
                    System.out.println("Oops! Something has went wrong!");
                    break;
            }
        } while (!finished);
    }

    private void setup(){
        this.lettersASCII.loadFromFile("lettersASCII.txt");
    }
    private void theMenu() {
        // Print menu to console
        System.out.println(TextColours.TEXT_GREEN + "letters");
        System.out.println("-------------------------------------------"  + TextColours.TEXT_RESET);
        System.out.println("1: View  list");
        System.out.println("2: Add letter");
        System.out.println("3: Find letter");
        System.out.println("4: Exit");
        System.out.println();
    }

    private void viewList(){
        this.listView.displayletters(this.lettersASCII.getTheData());
    }

    private void FindLetter(){
            System.out.println("Find a letter");
            System.out.println("-----------");
            String aTerm = inputHelper.readString("Please enter the letter");
            this.arrayDAO.FindLetter(aTerm);
    }

    private void addLetter(){
        lettersASCII aLetter= new lettersASCII();
        String newLettersASCII = inputHelper.readString("Please enter a Letter");

    }

}
