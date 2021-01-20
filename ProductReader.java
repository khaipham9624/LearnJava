package basic.LearnJava;

import basic.LearnJava.Product;

public interface ProductReader {
    Product getProduct(String code);

    String getProductsString();
}
