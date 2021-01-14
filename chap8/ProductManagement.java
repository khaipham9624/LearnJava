package basic.LearnJava.chap8;

public class ProductManagement {
    public static void main(String[] args) {
        Product p = new Book();
        Product p2 = new Software();
        System.out.println(ProductDB.getProduct("java").getDisplayTex());

    }
}
