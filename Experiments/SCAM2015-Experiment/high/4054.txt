public class JLabelBuilder {
    private Color fColor;
    private String text;

    public void setForegroundColor(Color c) {
        fColor = c;
    }

    public void setText(String t) {
        text = t;
    }

    public JLabel build() {
        if (text != null && fColor != null) {
            JLabel label = new JLabel(text);
            label.setForeground(fColor);
            return label;
        } else {
            ...
        }
    }
}