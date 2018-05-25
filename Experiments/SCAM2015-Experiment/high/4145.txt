public class BlahChildTwo extends Blah
{
    public BlahChildTwo(Blah blah)
    {
        label = blah.label;
        label.setText("Fred");
    }
}