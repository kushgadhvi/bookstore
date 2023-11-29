package bookstore;

public class OrderTableReturn extends CustomTableModel {

    public OrderTableReturn(Order[] data) {
        super((Order[]) data, new String[]{"id", "bookname", "price", "paymentDeatils"});
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
        Order myData = (Order) data[rowIndex];
        return switch (columnIndex) {
            case 0 ->
                myData.getId();
            case 1 ->
                myData.getBookname();
            case 2 ->
                myData.getPrice();
            case 3 ->
                myData.getPaymentDeatils();
            default ->
                null;
        };
    }

}
