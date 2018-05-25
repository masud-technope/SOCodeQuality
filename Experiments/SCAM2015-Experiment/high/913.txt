Action action = new AbstractAction()
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("some action");
    }
};

JTextField textField = new JTextField(10);
textField.addActionListener( action );