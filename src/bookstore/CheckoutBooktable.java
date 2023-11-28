package bookstore;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class CheckoutBooktable extends AbstractTableModel {

    private final ArrayList<Book> data; // List to hold MyData objects
    // List to hold MyData objects
    private final String[] columnNames = {"id", "bookname", "price", "author", "categoryname"};

    public CheckoutBooktable(ArrayList<Book> data) {

        this.data = data;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Book myData = data.get(rowIndex);
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
            default ->
                null;
        };
    }

}
