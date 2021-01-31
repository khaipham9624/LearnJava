package basic.LearnJava;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductMainClass {
//    public static void displayMenu() {
//        System.out.println("COMMAND MENU");
//        System.out.println("list\t\t\t\t - List all products");
//        System.out.println("add\t\t\t\t - Add a product");
//        System.out.println("del\t\t\t\t - Delete a product");
//        System.out.println("help\t\t\t\t - Show this menu");
//        System.out.println("exit\t\t\t\t - Exit this application");
//    }
//
//    public static void displayAllProduct() {
//        System.out.println("PRODUCT LIST");
//        System.out.println(productDAO.getProductsString());
//    }
//
//    public static void addProduct() {
//        String code = Validator.getString(sc, "Enter product code:");
//        String description = Validator.getLine(sc, "Enter product description:");
//        double price = Validator.getDouble(sc, "Enter price");
//
//        Product product = new Product();
//        product.setCode(code);
//        product.setDescription(description);
//        product.setPrice(price);
//        productDAO.addProduct(product);
//        System.out.println();
//        System.out.println(description + "has been added");
//
//    }
//
//    public static void deleteProduct() {
//        String code = Validator.getString(sc, "Enter product code to delete:");
//        ArrayList<Product> product = productDAO.getProduct(code);
//        System.out.println();
//        if (product != null) {
//            productDAO.deleteProduct(product);
//            System.out.println(product.getDescription() + "has been deleted");
//        } else {
//            System.out.println("No product matches that product code\n");
//
//        }
//    }
//    private static ProductDAO productDAO = null;
//    private static Scanner sc = null;
//
//    public static void main(String[] args) {
//        System.out.println("Welcome to the Product Maintenance application\n");
//        productDAO = DAOFactory.getProductDAO();
//        sc = new Scanner(System.in);
//
//        displayMenu();
//    }
}
