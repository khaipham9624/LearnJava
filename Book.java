package basic.LearnJava;

import basic.LearnJava.Product;

public final class Book extends Product implements Printable {
    private String author;

    public Book() {
        super();
        author = "";
        count++;
    }

    public Book(String code, String description, double price, String author) {
        super(code, description, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String a) {
        author = a;
    }

    @Override
    public String getDisplayText() {
        return super.toString() +
                "Author:                " + author + "\n";
    }

    public void print(){
        System.out.println("Code:\t\t\t\t" + super.getCode());
        System.out.println("Title:\t\t\t\t" + super.getDisplayText());
        System.out.println("Author:\t\t\t\t" + this.author);
        System.out.println("Price:\t\t\t\t" + super.getPrice());

    }
}
