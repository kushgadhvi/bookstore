package bookstore;

import javax.swing.table.AbstractTableModel;

public abstract class CustomTableModel<T> extends AbstractTableModel {
    protected T[] data; // Generic array to hold data items
    protected String[] columnNames; // Array to hold column names

    public CustomTableModel(T[] data, String[] columnNames) {
        this.data = data;
        this.columnNames = columnNames;
    }

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

  

}
