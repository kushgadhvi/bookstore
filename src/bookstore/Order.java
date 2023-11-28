package bookstore;

public class Order {

    private int id;
    private String bookname;
    private int price;
    private int returnStatus;
    private String paymentDeatils;

    public Order(int id, String bookname, int price, int returnStatus,String paymentDeatils) {
        this.id = id;
        this.bookname = bookname;
        this.price = price;
        this.returnStatus = returnStatus;
        this.paymentDeatils = paymentDeatils;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(int returnStatus) {
        this.returnStatus = returnStatus;
    }
    
    public String getPaymentDeatils() {
        return paymentDeatils;
    }

    public void setPaymentDeatils(String paymentDeatils) {
        this.paymentDeatils = paymentDeatils;
    }
}
