public class MyModel extends AbstractTableModel {
    List rows;

    public int getRowCount() {
        return rows.size();
    }

    public int getColumnCount() {
         return 4;
    }

    public Object getValueAt(int row, int column) {
        return rows.get(row).getCol(col);  //assuming your row "Object" has a getCol()
    }

    public Class<?> getColumnClass(int col) {
        return Boolean.class;
    }

    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        rows.get(rowIndex).getCol(columnIndex).setValue(aValue);
    }

}