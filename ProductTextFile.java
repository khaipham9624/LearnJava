package basic.LearnJava;

import basic.LearnJava.Product;
import basic.LearnJava.ProductDAO;

public class ProductTextFile implements ProductDAO {
    public ProductTextFile() {

    }

    @Override
    public Product getProduct(String code) {
        return null;
    }

    @Override
    public String getProductsString() {
        return null;
    }

    @Override
    public boolean addProduct(Product p) {
        return false;
    }

    @Override
    public boolean updateProduct(Product p) {
        return false;
    }

    @Override
    public boolean deleteProduct(Product p) {
        return false;
    }
}
