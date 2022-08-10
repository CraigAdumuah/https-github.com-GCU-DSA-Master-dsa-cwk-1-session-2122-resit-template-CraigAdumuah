package daos;

import app.ASCIIAlphaApp;
import datastructures.listNode;
import model.*;
import view.aView;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class arrayDAOImpl extends DAO {
    private ArrayList<lettersASCII> theData;

    private ArrayList<lettersASCII> anItem;
    private aView theView;

    public static final char DELIMITER = ',';
    public static final char EOLN = '\n';
    public static final String QUOTE = "\"";
    public static final String USERDIRECTORY = System.getProperty("user.dir");

    private String stripQuotes(String str) {
        return str.substring(1, str.length() - 1);
    }

    public arrayDAOImpl() {
        this.theData = new ArrayList<>();
    }

    public arrayDAOImpl(ArrayList<lettersASCII> alData, aView aDataView) {
        this.theData = alData;
        this.theView = new aView();
    }

    public ArrayList<lettersASCII> getTheData() {
        return this.theData;
    }

    public void setTheData(ArrayList<lettersASCII> theData) {
        this.theData = theData;
    }

    @Override
    public void loadFromFile(String filename) {
        String transactionFile = USERDIRECTORY + "\\" + filename;

        try (BufferedReader br = new BufferedReader(new FileReader(transactionFile))) {

            String theASCIIValueBin;
            String theASCIIValueOct;
            int theASCIIValueDec;
            String theLetter;

            String[] temp;
            String line = br.readLine();
            while (line != null) {
                temp = line.split(Character.toString(DELIMITER));

                theASCIIValueBin = temp[0];
                theASCIIValueOct = temp[1];
                theASCIIValueDec = Integer.parseInt(temp[2]);
                theLetter = temp[3];

                lettersASCII aLetter = new lettersASCII();
                aLetter.setASCIIValueDec(theASCIIValueDec);
                aLetter.setASCIIValueBin(theASCIIValueBin);
                aLetter.setASCIIValueOct(theASCIIValueOct);

                this.theData.add(aLetter);
                line = br.readLine();

            }
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(ASCIIAlphaApp.class.getName()).log(Level.INFO, null, ex);
        }
    }

    @Override
    public void writeToFile(String filename) {
        try {
            File myFile = new File(USERDIRECTORY + "\\" + filename);

            if (myFile.exists()) {
                myFile.delete();
                System.out.println("File deleted: " + myFile.getName());
            } else if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            File myFile = new File(USERDIRECTORY + "\\" + filename);
            FileWriter myWriter = new FileWriter(myFile.getName());
            listNode<lettersASCII> tmp = this.theData.getNodeData();
            while (tmp != null) {
                if (tmp.getNextNode() == null) {
                    myWriter.write(tmp.getNodeData().CSVFormat());
                } else {
                    myWriter.write(tmp.getNodeData().CSVFormat() + "\n");
                }
                tmp = tmp.getNextNode();
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    @Override
    public void add(lettersASCII aLetter) {
        this.theData.add(aLetter);
    }

    @Override
    public lettersASCII retrieve(String aLetter) {

        listNode<lettersASCII> aLetters = this.theData.aletter;
        lettersASCII newLettersASCII = new lettersASCII();
        newLettersASCII.getASCIIValueDec(aletter.getNodeData().getASCIIValueDec());
        newLettersASCII.getASCIIValueBin(aletter.getNodeData().getASCIIValueBin());
        newLettersASCII.getASCIIValueOct(aletter.getNodeData().getASCIIValueOct());


        return new lettersASCII();
    }

    @Override
    public lettersASCII remove(int pos) {

        listNode<lettersASCII> aletter = this.theData.remove(pos);
        lettersASCII newlettersASCII = new lettersASCII();

        newlettersASCII.setASCIIValueDec(aletter.getNodeData().getASCIIValueDec());
        newlettersASCII.setASCIIValueBin(aletter.getNodeData().getASCIIValueBin());
        newlettersASCII.setASCIIValueOct(aletter.getNodeData().getASCIIValueOct());

        return new lettersASCII();
    }


    public String convertToBase(int number, int base)
    // Java program to convert string to Binary
    {
        Scanner sc = new Scanner(System.in);
        String Letter = "";

        Letter += sc.nextLine();

        sc.close();
        byte[] bytes = Letter.getBytes();
        StringBuilder binary = new StringBuilder();
        for (byte b : bytes) {
            int val = b;
            for (int i = 0; i < 8; i++) {
                binary.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
            }
            binary.append(" ");
            System.out.println(binary);


            Letter += sc.nextLine();

            sc.close();

            {

                for (int i = 0; i < 8; i++) {
                    binary.append((val & 128) == 0 ? 0 : 1);
                    val <<= 1;
                }
                binary.append(" ");
                System.out.println(binary);

            }


            public void displayAllData() {
                this.theView.displayData(this.theData);
            }

        }
            public void displayAnItem; (ArrayList<lettersASCII> anItem){
               this.theView.displayAnItem(this.theData);
            }
        }
    }
}