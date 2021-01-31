package basic.LearnJava;

import basic.LearnJava.Product;

import java.util.ArrayList;

public interface ProductReader {
    Product getProduct(String code);

    ArrayList<Product> getProducts();
}
