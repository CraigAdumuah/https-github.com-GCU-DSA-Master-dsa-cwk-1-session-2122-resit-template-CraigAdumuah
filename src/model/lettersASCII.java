package model;

public class lettersASCII {
       private String letter;
       private int ASCIIValueDec;
       private String ASCIIValueBin;
       private String ASCIIValueOct;



    public lettersASCII() {
        this.letter = "";
        this.ASCIIValueDec = 0;
        this.ASCIIValueBin = "";
        this.ASCIIValueOct = "";
    }

    public lettersASCII(int ASCIIValueDec, String ASCIIValueBin, String ASCIIValueOct) {

       this.ASCIIValueDec = ASCIIValueDec;
       this.ASCIIValueBin = ASCIIValueBin;
       this.ASCIIValueOct = ASCIIValueOct;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) { this.letter=letter; }

    public int getASCIIValueDec() { return ASCIIValueDec; }

    public void setASCIIValueDec(int ASCIIValueDec) { this.ASCIIValueDec= ASCIIValueDec; }

    public String getASCIIValueBin() { return ASCIIValueBin; }

    public void setASCIIValueBin(String ASCIIValueBin) { this.ASCIIValueBin=ASCIIValueBin; }

    public String getASCIIValueOct() { return ASCIIValueOct; }

    public void setASCIIValueOct(String ASCIIValueOct) { this.ASCIIValueOct=ASCIIValueOct; }

    public String CSVFormat(){
         String outputStr = this.letter + "," +  this.ASCIIValueDec + "," + this.ASCIIValueBin + "," + this.ASCIIValueOct + "," ;
        return outputStr;
    }

    @Override
    public String toString() {
        return "lettersASCII{" +
                ", decimal='" + ASCIIValueDec + '\'' +
                ", binary=" + ASCIIValueBin +
                ", octal=" + ASCIIValueOct +
                ", letter=" + letter +
                '}';
    }

}

