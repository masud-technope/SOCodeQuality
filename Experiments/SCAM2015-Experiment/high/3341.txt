// Copied from Listing 29-2
public interface ModemVisitorOverload
{
    void visit(HayesModem modem);
    void visit(ZoomModem modem);
    void visit(ErnieModem modem);
}

public interface ModemVisitorNoOverload
{
    void visitHayes(HayesModem modem);
    void visitZoom(ZoomModem modem);
    void visitErnie(ErnieModem modem);
}