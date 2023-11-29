package bookstore;


public class BookTableModel extends CustomTableModel {

 
    public BookTableModel(Book[] data) {
       super(data,new String[]{"id", "bookname", "price", "author", "qunatity", "categoryname", "Edit", "Delete"});
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
        Book myData = (Book) data[rowIndex];
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
