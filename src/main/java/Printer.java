public class Printer {
    private int sheetsLeft;
    private int toner;

    public Printer(int sheets, int toner) {
        this.sheetsLeft = sheets;
        this.toner = toner;
    }

    public int getSheetsLeft() {
        return this.sheetsLeft;
    }

    public int getToner(){
        return this.toner;
    }

    public void print(int pages, int copies){
        int totalSheets = pages * copies;
        if (totalSheets <= this.sheetsLeft) {
            this.sheetsLeft -= totalSheets;
            this.toner -= totalSheets;
        }
    }
}
