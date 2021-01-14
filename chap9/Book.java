package basic.LearnJava.chap9;

import basic.LearnJava.chap8.Product;

public class Book extends Product implements Printable, Myable{
    private String author;
    @Override
    public String getDisplayTex() {
        return null;
    }

    public Book(String code, String description, double price,
    String author) {
        super(code, description, price);
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void print() {
        System.out.println("Code:\t" + super.getCode());
        System.out.println("Title:\t" + super.getDescription());
        System.out.println("Author:\t" + getAuthor());
        System.out.println("Price:\t" + super.getPrice());
    }
}
