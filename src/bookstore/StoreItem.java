
package bookstore;

/**
 *
 * @author luvga
 */
public abstract class StoreItem {
    protected int id;
    protected String bookname;
    protected int price;

    public StoreItem(int id, String name, int price) {
        this.id = id;
        this.bookname = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return bookname;
    }

    public int getPrice() {
        return price;
    }

}