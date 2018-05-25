buttonA.addSelectionListener(new SelectionAdapter() 
   {
       @Override
       public void widgetSelected(SelectionEvent arg0) 
        {
           boolean chkRpmFilter = buttonA.getSelection();
           buttonB.setEnabled(!buttonA.getSelection());
           System.out.println("Button A clicked state is " +chkRpmFilter);
        }
    });