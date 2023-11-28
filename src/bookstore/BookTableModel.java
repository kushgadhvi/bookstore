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
public class BookTableModel extends AbstractTableModel {

    private final Book[] data; // List to hold MyData objects
    private final String[] columnNames = {"id", "bookname", "price", "author", "qunatity", "categoryname", "Edit", "Delete"};

    public BookTableModel(Book[] data) {
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
                myData.getQunatity();
            case 5 ->
                myData.getCategoryname();
            case 6 ->
                "Edit";
            case 7 ->
                "Delete";
            default ->
                null;
        };
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

}
