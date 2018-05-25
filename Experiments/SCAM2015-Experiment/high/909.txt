class TestFrame
        extends JFrame
        implements ActionListener
{
    public TestFrame()
    {
        cards = new JPanel(new CardLayout() );
        card_list = new JPanel[5];

        for (int i = 0; i < card_list.length; i++) {
            String text = "Card " + i;
            JPanel card = createCard(text);
            card_list[i] = card;
            cards.add(card, text);
        }

        add(cards);
    }

public JPanel getCurrentCard()
{
    JPanel card = null;

    for (Component comp : cards.getComponents() ) {
        if (comp.isVisible() == true) {
            card = (JPanel)comp;
            System.out.println(card.getName() );
        }
    }
    System.out.println();

    return card;
}

public void actionPerformed(ActionEvent evt)
{
    JPanel card = getCurrentCard();

    CardLayout cl = (CardLayout)(cards.getLayout() );
    cl.next(cards);
}

    public JPanel createCard(String text)
    {
        JPanel card = new JPanel();
        card.setName(text);

        JButton btn = new JButton(text);
        btn.addActionListener(this);

        card.add(btn);
        return card;
    }

    JPanel cards;
    JPanel[] card_list;
}