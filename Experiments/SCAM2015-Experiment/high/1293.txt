if (! table.isRowSelected(row))
{
    if(row == 2 && column == 2)
        c.setBackground(new java.awt.Color(0, 0, 255));
    else
        c.setBackground(table.getBackground());
}