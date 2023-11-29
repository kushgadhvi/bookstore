/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstore;

/**
 *
 * @author luvga
 */
public class Book extends StoreItem {

    private String author;
    private int quantity;
    private String categoryname;
    private boolean selected;

    public Book(int id, String bookname, int price, String author, int qunatity, String categoryname) {
        super(id, bookname, price);
        this.bookname = bookname;
        this.price = price;
        this.author = author;
        this.quantity = qunatity;
        this.categoryname = categoryname;
        this.selected = false;
    }

    @Override
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

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQunatity() {
        return quantity;
    }

    public void setQunatity(int qunatity) {
        this.quantity = qunatity;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

}
