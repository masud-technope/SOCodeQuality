class Something
{
    int c;

    private void pushButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        JButton but1=new JButton("OK");
        but1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                c=Integer.parseInt(f.getText());
            }
        });
    }
}