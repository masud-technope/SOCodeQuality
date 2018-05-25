//private TableModel dataModel;
private DefaultTableModel dataModel;


void setModel() {
  Vector data = makeData();
  Vector columns = makeColumns();
  dataModel = new DefaultTableModel(data, columns);
  table.setModel(dataModel);
}

void reset() {
  dataModel.setRowCount(0);
}