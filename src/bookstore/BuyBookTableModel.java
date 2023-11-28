/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstore;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author luvga
 */
public class BuyBookTableModel extends AbstractTableModel {

    private final Book[] data; // List to hold MyData objects
    private final String[] columnNames = {"id", "bookname", "price", "author", "categoryname", "Select Book"};

    public BuyBookTableModel(Book[] data) {
        this.data = data;
    }

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Book myData = data[rowIndex];
        return switch (columnIndex) {
            case 0 ->
                myData.getId();
            case 1 ->
                myData.getBookname();
            case 2 ->
                myData.getPrice();
            case 3 ->
                myData.getAuthor();
            case 4 ->
                myData.getCategoryname();
            case 5 ->
               myData.isSelected();
            default ->
                null;
        };
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 5;  // Only the checkbox column is editable
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (columnIndex == 5) {
            data[rowIndex].setSelected((Boolean) aValue);
            fireTableCellUpdated(rowIndex, columnIndex);
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 5) {
            return Boolean.class;
        }
        return super.getColumnClass(columnIndex);
    }

}
