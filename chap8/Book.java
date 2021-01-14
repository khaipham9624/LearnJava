package basic.LearnJava.chap8;

public final class Book extends Product{
    private String author;

    public Book() {
        super();
        author = "";
        count++;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String a) {
        author = a;
    }

    @Override
    public String getDisplayTex() {
        return super.toString() +
                "Author:                " + author + "\n";
    }
}
