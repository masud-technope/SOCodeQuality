TableCellRenderer tableCellRenderer = new DefaultTableCellRenderer() {

    SimpleDateFormat f = new SimpleDateFormat("MM/dd/yy");

    public Component getTableCellRendererComponent(JTable table,
            Object value, boolean isSelected, boolean hasFocus,
            int row, int column) {
        if( value instanceof Date) {
            value = f.format(value);
        }
        return super.getTableCellRendererComponent(table, value, isSelected,
                hasFocus, row, column);
    }
};

table.getColumnModel().getColumn(0).setCellRenderer(tableCellRenderer);