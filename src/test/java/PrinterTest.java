import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;
    
    @Before
    public void before() {
        printer = new Printer(100, 50);
    }
    
    @Test
    public void hasSheetsLeft() {
        assertEquals(100, printer.getSheetsLeft());
    }

    @Test
    public void hasToner() {
        assertEquals(50, printer.getToner());
    }

    @Test
    public void printSuccess() {
        printer.print(2, 3);
        assertEquals(94, printer.getSheetsLeft());
        assertEquals(44, printer.getToner());
    }

    @Test
    public void printFail() {
        printer.print(100, 2);
        assertEquals(100, printer.getSheetsLeft());
        assertEquals(50, printer.getToner());
    }
}
