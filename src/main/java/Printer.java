public class Printer {
    private int sheetsLeft;

    public Printer(int sheets) {
        this.sheetsLeft = sheets;
    }

    public int getSheetsLeft() {
        return sheetsLeft;
    }

    public void print(int pages, int copies){
        if (pages * copies <= this.sheetsLeft) {
            this.sheetsLeft -= pages * copies;
        }
    }

}
