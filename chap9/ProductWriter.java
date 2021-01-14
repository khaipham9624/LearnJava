package basic.LearnJava.chap9;

import basic.LearnJava.chap8.Product;

public interface ProductWriter {
    boolean addProduct(Product p);

    boolean updateProduct(Product p);

    boolean deleteProduct(Product p);
}
