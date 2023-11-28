package bookstore;

import javax.swing.table.AbstractTableModel;

public class OrderTable extends AbstractTableModel {

    private final Order[] data; // List to hold MyData objects
    private final String[] columnNames = {"id", "bookname", "price", "paymentDeatils", "returnstatus"};

    public OrderTable(Order[] data) {
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
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Order myData = data[rowIndex];
        return switch (columnIndex) {
            case 0 ->
                myData.getId();
            case 1 ->
                myData.getBookname();
            case 2 ->
                myData.getPrice();
            case 3 ->
                myData.getPaymentDeatils();
            case 4 ->
                "Return";
            default ->
                null;
        };
    }

}
