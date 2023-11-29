package bookstore;


public class OrderTable extends CustomTableModel {


    public OrderTable(Order[] data) {
        super(data,new String[]{"id", "bookname", "price", "paymentDeatils", "returnstatus"});
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
            case 4 ->
                "Return";
            default ->
                null;
        };
    }

}
