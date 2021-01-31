package basic.LearnJava;

import basic.LearnJava.Product;
import basic.LearnJava.ProductDAO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ProductTextFile implements ProductDAO {
    ArrayList<Product> products = null;
    private Path productPath = null;
    private File productFile = null;
    private final String FIELD_SEP = "\t";

    public ProductTextFile() {
        productPath = Paths.get("products.txt");
        productFile = productPath.toFile();
        products = this.getProducts();
    }

    @Override
    public Product getProduct(String code) {
        for (Product p : products) {
            if (p.getCode().equalsIgnoreCase(code)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Product> getProducts() {
        if (products != null) {
            return products;
        }
        products = new ArrayList<Product>();
        if (Files.exists(productPath)) {
            try (BufferedReader in = new BufferedReader(new FileReader(productFile))){
                String line = in.readLine();
                while (line != null) {
                    String[] column = line.split(FIELD_SEP);
                    String code = column[0];
                    String description = column[1];
                    String price = column[2];
                    Product p = new Product(code, description, Double.parseDouble(price));
                    products.add(p);
                    line = in.readLine();
                }
            } catch (FileNotFoundException e) {
                System.out.println(e);
                return null;
            } catch (IOException e) {
                System.out.println(e);
                return null;
            }
        }
        return products;
    }

    public boolean saveProduct(){
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(productFile)))) {
            for (Product p : products) {
                out.print(p.getCode() + FIELD_SEP);
                out.print(p.getDescription() + FIELD_SEP);
                out.print(p.getPrice());

            }
        } catch (IOException e) {
            System.out.println(e);
            return false;
        }
        return true;
    }
        
    @Override
    public boolean addProduct(Product p) {
        products.add(p);
        return this.saveProduct();
    }

    @Override
    public boolean updateProduct(Product newProduct) {
        Product oldProduct = this.getProduct(newProduct.getCode());
        int i = products.indexOf(oldProduct);
        products.remove(i);
        products.add(i, newProduct);
        return this.saveProduct();
    }

    @Override
    public boolean deleteProduct(Product p) {
        products.remove(p);
        return this.saveProduct();
    }
}
