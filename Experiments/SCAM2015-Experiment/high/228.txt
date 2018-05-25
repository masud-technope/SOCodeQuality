public class CustomTablePrintable implements Printable {

    Printable tablePrintable;

    public void setTablePrintable(Printable printable) {
        tablePrintable = printable;        
    }

    public int print(Graphics graphics, PageFormat pageFormat, 
            int pageIndex) throws PrinterException {
        if (pageIndex > 0) {
            return NO_SUCH_PAGE;
        }

        tablePrintable.print(graphics, pageFormat, pageIndex);

        Graphics2D g2d = (Graphics2D)graphics;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

        // Draw header/footer here
        graphics.drawString(header, posx, posy);

        return PAGE_EXISTS;        
    }
}