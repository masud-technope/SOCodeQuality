public class PrinterService {

    public PrintService getCheckPrintService(String printerName) {
        PrintService ps = null;
        DocFlavor doc_flavor = DocFlavor.STRING.TEXT_PLAIN;
        PrintRequestAttributeSet attr_set =
                new HashPrintRequestAttributeSet();

        attr_set.add(new Copies(1));           
        attr_set.add(Sides.ONE_SIDED);
        PrintService[] service = PrintServiceLookup.lookupPrintServices(doc_flavor, attr_set);

        for (int i = 0; i < service.length; i++) {
            System.out.println(service[i].getName());
            if (service[i].getName().equals(printerName)) {
                ps = service[i];
            }
        }
        return ps;
    }
}