package basic.LearnJava;

import basic.LearnJava.Product;

public interface ProductWriter {
    boolean addProduct(Product p);

    boolean updateProduct(Product p);

    boolean deleteProduct(Product p);
}
